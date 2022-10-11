package io.testproject.addon;

import io.testproject.sdk.internal.addons.ActionProxy;
import io.testproject.sdk.internal.addons.ProxyDescriptor;
import java.lang.String;

/**
 * Proxy for Imap Mail Operations Addon */
public class ImapMailOperations {
  /**
   * Factory method for DeleteAllMails */
  public static DeleteAllMails getDeleteAllMails() {
    return new DeleteAllMails();
  }

  /**
   * Factory method for DeleteAllMails
   * @param userName User Name
   * @param password Password */
  public static DeleteAllMails deleteAllMails(String userName, String password) {
    return new DeleteAllMails(userName,password);
  }

  /**
   * Factory method for ReadSpecificsMail */
  public static ReadSpecificsMail getReadSpecificsMail() {
    return new ReadSpecificsMail();
  }

  /**
   * Factory method for ReadSpecificsMail
   * @param userName User Name
   * @param password Password
   * @param searchedWord Searched Word
   * @param filePath Path to the Excel file */
  public static ReadSpecificsMail readSpecificsMail(String userName, String password,
      String searchedWord, String filePath) {
    return new ReadSpecificsMail(userName,password,searchedWord,filePath);
  }

  /**
   * Delete All Mails. This Action Deletes the All Mails in your Mail Account */
  public static class DeleteAllMails extends ActionProxy {
    /**
     * User Name (INPUT) */
    public String userName;

    /**
     * Password (INPUT) */
    public String password;

    public DeleteAllMails() {
      this.setDescriptor(new ProxyDescriptor("pn6KMUUfnE-BFQB1gbOTCw", "main.addon.DeleteAllMails"));
    }

    public DeleteAllMails(String userName, String password) {
      this();
      this.userName = userName;
      this.password = password;
    }
  }

  /**
   * Output searched string in specific mail. This Action Exports searched string in specific mail */
  public static class ReadSpecificsMail extends ActionProxy {
    /**
     * User Name (INPUT) */
    public String userName;

    /**
     * Password (INPUT) */
    public String password;

    /**
     * Searched Word (INPUT) */
    public String searchedWord;

    /**
     * Path to the Excel file (INPUT) */
    public String filePath;

    public ReadSpecificsMail() {
      this.setDescriptor(new ProxyDescriptor("pn6KMUUfnE-BFQB1gbOTCw", "main.addon.ReadSpecificsMail"));
    }

    public ReadSpecificsMail(String userName, String password, String searchedWord,
        String filePath) {
      this();
      this.userName = userName;
      this.password = password;
      this.searchedWord = searchedWord;
      this.filePath = filePath;
    }
  }
}
