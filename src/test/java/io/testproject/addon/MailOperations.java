package io.testproject.addon;

import javax.mail.*;
import javax.mail.Flags.Flag;
import javax.mail.search.FlagTerm;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class MailOperations {
    Properties properties = null;
    private Session session = null;
    private Store store = null;
    private Folder inbox = null;
    private Message messages[];
    private Message searched[];
    private String filePath;

    /**
     * This Method Takes the userName, password and searchedWord of requested mail.
     * Writes the searched mail to the html file in the given path
     *
     * @param userName
     * @param password = IMAP Passwords
     * @param searchedWord
     * @param filePath
     * @author furkan.simsek
     */
    public void getMails(String userName, String password, String searchedWord, String filePath) {
        Thread.currentThread().setContextClassLoader(this.getClass().getClassLoader()); // important
        this.filePath = filePath;
        getConnection(userName, password);
        getFolders();
        readMails(searchedWord);
        closeSession();
    }

    /**
     * This Method Takes the name and password of the mailbox to be emptied and empty all mail in this mailbox.
     *
     * @param userName
     * @param password
     * @author furkan.simsek
     * @Attention ! Deletes All Read and Unread Emails
     */
    public void deleteAllMail(String userName, String password) {
        Thread.currentThread().setContextClassLoader(this.getClass().getClassLoader()); // important
        this.filePath = filePath;
        getConnection(userName, password);
        getFolders();
        try {
            if (inbox != null) {
                messages = inbox.search(new FlagTerm(new Flags(Flags.Flag.DELETED), false));
                System.out.println("Number of mails = " + messages.length);
                for (int i = 0; i < messages.length; i++) {
                    messages[i].setFlag(Flags.Flag.DELETED, true);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        closeSession();
    }

    void getConnection(String userName, String password) {
        properties = new Properties();
        properties.setProperty("mail.host", "imap.yandex.com");
        properties.setProperty("mail.port", "995");
        properties.setProperty("mail.transport.protocol", "imaps");
        session = Session.getInstance(properties,
                new Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(userName, password);
                    }
                });
        try {
            store = session.getStore("imaps");
            store.connect();
            inbox = store.getFolder("INBOX");
            inbox.open(Folder.READ_WRITE);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    void getFolders() {
        try {
            Folder[] folders = store.getDefaultFolder().list("*");
            for (Folder folder : folders) {
                if ((folder.getType() & Folder.HOLDS_MESSAGES) != 0) {
                    System.out.println(folder.getFullName() + ": " + folder.getMessageCount());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void readMails(String searchedWord) {
        for (int i = 0; i < 60; i++) {
            try {
                messages = inbox.getMessages();
                if (messages.length > 0) {
                    for (Message m : messages) {
                        if (m.getSubject().toLowerCase().contains(searchedWord)||m.getContent().toString().contains(searchedWord)) {
                            processMessageBody(m);
                            i = 60;
                        } else {
                            try {
                                Thread.sleep(1);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Aranan mesaj bulunamadı " + i);
                        }
                    }
                } else {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } catch (MessagingException | IOException e) {
                e.printStackTrace();
            }
        }
    }

    void processMessageBody(Message message) {
        try {
            Object content = message.getContent();
            if (content instanceof String) {
                File myObj = new File(filePath);
                String line = content.toString();
                FileWriter myWriter = new FileWriter(filePath);
                myWriter.write(line);
                myWriter.close();
            } else if (content instanceof Multipart) {
                Multipart multiPart = (Multipart) content;
                procesMultiPart(multiPart);
            } else if (content instanceof InputStream) {
                InputStream inStream = (InputStream) content;
                int ch;
                while ((ch = inStream.read()) != -1) {
                    FileWriter myWriter = new FileWriter(filePath);
                    myWriter.write(ch);
                    myWriter.close();
                }
            }
        } catch (IOException | MessagingException e) {
            e.printStackTrace();
        }
    }

    void procesMultiPart(Multipart content) {
        try {
            int multiPartCount = content.getCount();
            for (int i = 0; i < multiPartCount; i++) {
                BodyPart bodyPart = content.getBodyPart(i);
                Object o;
                o = bodyPart.getContent();
                if (o instanceof String) {
                    File myObj = new File(filePath);
                    String line = o.toString();
                    FileWriter myWriter = new FileWriter(filePath);
                    myWriter.write(line);
                    myWriter.close();
                } else if (o instanceof Multipart) {
                    procesMultiPart((Multipart) o);
                }
            }
        } catch (IOException | MessagingException e) {
            e.printStackTrace();
        }
    }

    void closeSession() {
        if (null != inbox && null != store) {
            try {
                inbox.close(true);
                store.close();
            } catch (MessagingException e) {
                e.printStackTrace();
            }
        }
    }

    void deleteMessage(Message message) {
        try {
            message.setFlag(Flag.SEEN, true);
            message.setFlag(Flag.DELETED, true);
            System.out.println("deleted mail");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}