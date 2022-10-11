package netahsilat;

import io.testproject.addon.VisibleElementsOperations;
import io.testproject.addon.WebExtensions;
import io.testproject.addon.WebListOperations;
import io.testproject.sdk.drivers.ReportingDriver;
import io.testproject.sdk.drivers.web.RemoteWebDriver;
import io.testproject.sdk.interfaces.junit5.ExceptionsReporter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * This class was automatically generated by TestProject
 * Project: Quality Museum Project
 * Test: C3238
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Sun Oct 09 19:36:17 GMT 2022.
 */
@DisplayName("C3238")
public class C3238 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C3238")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogin methodlogin;
    WebExtensions.GetElementAttribute getElementAttribute;
    VisibleElementsOperations.ClickIfVisibleWeb clickIfVisibleWeb;
    WebListOperations.GetTextFromSelectedItem getTextFromSelectedItem;

    // 1. Navigate to 'https://otomasyon3.netahsilatdemo.com/Admin/Account/Logout'
    //    Navigates the specified URL (Auto-generated)
    driver.navigate().to("https://otomasyon3.netahsilatdemo.com/Admin/Account/Logout");

    // 2. Run Method Login
    methodlogin = new MethodLogin();
    methodlogin.ApplicationURL = ApplicationURL;
    methodlogin.userName = ProjectParameters.genelEmail;
    methodlogin.password = ProjectParameters.genelPassword;
    methodlogin.execute(driver);

    // 3. Move mouse to 'moveToSiteYönetimi'
    by = By.cssSelector("li[class='config']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 4. Click 'btnSiteYönetimi'
    by = By.cssSelector("a[title='SİTE YÖNETİMİ']");
    driver.findElement(by).click();

    // 5. Click 'PARAMETRELER'
    by = By.xpath("//a[. = 'PARAMETRELER']");
    driver.findElement(by).click();

    // 6. Click 'Kart Kayıt Linki Parametreleri'
    by = By.xpath("//a[. = '\n            Kart Kayıt Linki Parametreleri\n        ']");
    driver.findElement(by).click();

    // 7. Click 'Zaman Aşımı Görünsün (Checked)' if it's visible
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("1");
    by = By.xpath("//label[normalize-space()='Zaman Aşımı']//..//following-sibling::div//span[@class='jquery-safari-checkbox']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 8. Click 'Email Teması Gösterilsin mi? (Checked)' if it's visible
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("1");
    by = By.xpath("//input[@id='CardStorageLinkGenerationSettings_IsShowEmailTemplate']//.. //span[@class='jquery-safari-checkbox']//img");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 9. Click 'Sms Teması Gösterilsin mi? (Checked)' if it's visible
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("1");
    by = By.xpath("//input[@id='CardStorageLinkGenerationSettings_IsShowSmsTemplate']//.. //span[@class='jquery-safari-checkbox']//img");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 10. Click 'Gönderim Tipi E-Posta Görünsünmü? (Checked)' if it's visible
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("1");
    by = By.xpath("//label[normalize-space()='E-Posta']/../..//..//span[@class='jquery-safari-checkbox']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 11. Click 'Gonderim Tipi Sms (Checked)' if it's visible
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("1");
    by = By.xpath("//input[@id='CardStorageLinkGenerationSettings_IsSmsSendTypeActive']//.. //span[@class='jquery-safari-checkbox']//img");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 12. Click 'Gönderim Tipi QR Görünsünmü? (Checked)' if it's visible
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("1");
    by = By.xpath("//label[normalize-space()='QR']/../..//..//span[@class='jquery-safari-checkbox']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 13. Click 'Kaydet1'
    by = By.cssSelector("#kaydet");
    driver.findElement(by).click();

    // 14. Is 'Kart Kayıt Linki Parametreleri Başarı...' visible?
    by = By.xpath("//li[. = 'Kart Kayıt Linki Parametreleri Başarıyla kaydedildi.']");
    driver.findElement(by).isDisplayed();

    // 15. Move mouse to 'moveUstUyeYonetimi'
    by = By.cssSelector("li[class='content']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 16. Click 'ustUyeYonetimi'
    by = By.xpath("//li[4]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 17. Click 'altUyeYonetimi'
    by = By.xpath("//li[1]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 18. Type 'netahsilatotomasyon@yandex.com' in 'SearchVendorName'
    by = By.cssSelector("#SearchVendorName");
    driver.findElement(by).sendKeys("netahsilatotomasyon@yandex.com");

    // 19. Click 'resultListelenen'
    by = By.xpath("//body/ul//div");
    driver.findElement(by).click();

    // 20. Click 'Listele'
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 21. Is 'Refresh' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[class='t-icon t-refresh']");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);

    // 22. Is 'Bi**** tü****' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[. = 'Bi**** tü****  ']");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);

    // 23. Click 'Ödeme'
    by = By.xpath("//a[. = 'Ödeme']");
    driver.findElement(by).click();

    // 24. Switch to window '1'
    driver.switchTo().window(driver.getWindowHandles().toArray(new String[0])[1]);

    // 25. Is 'Bireysel türk7' visible?
    by = By.xpath("//strong[. = 'Bireysel türk']");
    driver.findElement(by).isDisplayed();

    // 26. Click 'KART KAYDI LİNKİ'
    by = By.xpath("//a[. = 'KART KAYDI LİNKİ']");
    driver.findElement(by).click();

    // 27. Is 'Gönderim Tipi*' visible?
    by = By.xpath("//label[. = 'Gönderim Tipi*']");
    driver.findElement(by).isDisplayed();

    // 28. Is 'Email1' visible?
    by = By.xpath("//label[. = '\n                                 Email\n                            ']");
    driver.findElement(by).isDisplayed();

    // 29. Is 'Sms' visible?
    by = By.xpath("//label[. = '\n                                 Sms\n                            ']");
    driver.findElement(by).isDisplayed();

    // 30. Is 'QR' visible?
    by = By.xpath("//label[. = '\n                                 QR\n                            ']");
    driver.findElement(by).isDisplayed();

    // 31. Is 'Zaman Aşımı*' visible?
    by = By.xpath("//label[. = 'Zaman Aşımı*']");
    driver.findElement(by).isDisplayed();

    // 32. Does 'LinkExpiration' contain '2'?
    by = By.cssSelector("#LinkExpiration");
    Assertions.assertTrue(driver.findElement(by).getText().contains("2"));

    // 33. Retrieves the text of the currently selected option of a select element
    getTextFromSelectedItem = WebListOperations.getGetTextFromSelectedItem();
    by = By.xpath("//div[3]/select");
    getTextFromSelectedItem = (WebListOperations.GetTextFromSelectedItem)((ReportingDriver)driver).addons().execute(getTextFromSelectedItem, by, -1);

    // 34. Is 'İsim1' visible?
    by = By.xpath("//label[. = 'İsim']");
    driver.findElement(by).isDisplayed();

    // 35. Is 'NewUserFullName' visible?
    by = By.cssSelector("#NewUserFullName");
    driver.findElement(by).isDisplayed();

    // 36. Is 'E-Posta1' visible?
    by = By.xpath("//label[. = 'E-Posta']");
    driver.findElement(by).isDisplayed();

    // 37. Is 'NewUserEmail' visible?
    by = By.cssSelector("#NewUserEmail");
    driver.findElement(by).isDisplayed();

    // 38. Is 'Telefon1' visible?
    by = By.xpath("//label[. = 'Telefon']");
    driver.findElement(by).isDisplayed();

    // 39. Is 'NewUserPhone' visible?
    by = By.cssSelector("#NewUserPhone");
    driver.findElement(by).isDisplayed();

    // 40. Is 'Ekle' visible?
    by = By.xpath("//button[. = 'Ekle']");
    driver.findElement(by).isDisplayed();

    // 41. Is 'İsim2' visible?
    by = By.xpath("//th[. = 'İsim']");
    driver.findElement(by).isDisplayed();

    // 42. Is 'E-Posta2' visible?
    by = By.xpath("//th[. = 'E-Posta']");
    driver.findElement(by).isDisplayed();

    // 43. Is 'Telefon2' visible?
    by = By.xpath("//th[. = 'Telefon']");
    driver.findElement(by).isDisplayed();

    // 44. Is 'INPUT' visible and selected?
    by = By.xpath("//td/input[1]");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.elementSelectionStateToBe(by, true));

    // 45. Is 'Bireysel türk2' visible?
    by = By.xpath("//td[. = 'Bireysel türk']");
    driver.findElement(by).isDisplayed();

    // 46. Is 'E-Posta Netahsilatotomasyon@yandex.com	' visible?
    by = By.xpath("//td[text()='Bireysel türk']/..//td[text()='netahsilatotomasyon@yandex.com']");
    driver.findElement(by).isDisplayed();

    // 47. Get 'href' attribute value on 'Sil10'
    getElementAttribute = WebExtensions.getElementAttribute("href");
    by = By.xpath("//a[. = 'Sil']");
    getElementAttribute = (WebExtensions.GetElementAttribute)((ReportingDriver)driver).addons().execute(getElementAttribute, by, -1);

    // 48. Is 'Gönder' visible?
    by = By.xpath("//button[. = 'Gönder']");
    driver.findElement(by).isDisplayed();

    // 49. Click 'EmailTypeSelection (Unchecked)'
    by = By.cssSelector("#EmailTypeSelection:not(:checked)");
    driver.findElement(by).click();

    // 50. Is 'Email Teması Seçiniz*' visible?
    by = By.xpath("//label[. = 'Email Teması Seçiniz*']");
    driver.findElement(by).isDisplayed();

    // 51. Does 'Kart kaydı için link' contain 'Kart kaydı için link'?
    by = By.xpath("//div[2]/select[. = 'Kart kaydı için link']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Kart kaydı için link"));

    // 52. Click 'EmailTypeSelection (Checked)'
    by = By.cssSelector("#EmailTypeSelection:checked");
    driver.findElement(by).click();

    // 53. Click 'SmsTypeSelection (Unchecked)'
    by = By.cssSelector("#SmsTypeSelection:not(:checked)");
    driver.findElement(by).click();

    // 54. Is 'SMS Teması Seçiniz*' visible?
    by = By.xpath("//label[. = 'SMS Teması Seçiniz*']");
    driver.findElement(by).isDisplayed();

    // 55. Does 'Kart kaydı için link1' contain 'Kart kaydı için link'?
    by = By.xpath("//div[4]/select[. = 'Kart kaydı için link']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Kart kaydı için link"));

    // 56. Click 'YÖNETİCİ1'
    by = By.xpath("//a[. = 'YÖNETİCİ']");
    driver.findElement(by).click();

    // 57. Move mouse to 'moveToSiteYönetimi'
    by = By.cssSelector("li[class='config']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 58. Click 'btnSiteYönetimi'
    by = By.cssSelector("a[title='SİTE YÖNETİMİ']");
    driver.findElement(by).click();

    // 59. Click 'PARAMETRELER'
    by = By.xpath("//a[. = 'PARAMETRELER']");
    driver.findElement(by).click();

    // 60. Click 'Kart Kayıt Linki Parametreleri'
    by = By.xpath("//a[. = '\n            Kart Kayıt Linki Parametreleri\n        ']");
    driver.findElement(by).click();

    // 61. Click 'Zaman Aşımı Görünsün (Unchecked)'
    by = By.xpath("//label[normalize-space()='Zaman Aşımı']//..//following-sibling::div//span[@class='jquery-safari-checkbox jquery-safari-checkbox-checked']");
    driver.findElement(by).click();

    // 62. Click 'Email teması Gösterilsin mi? (Unchecked)'
    by = By.xpath("//input[@id='CardStorageLinkGenerationSettings_IsShowEmailTemplate']//.. //span[@class='jquery-safari-checkbox jquery-safari-checkbox-checked']//img");
    driver.findElement(by).click();

    // 63. Click 'Sms Teması Gösterilsin mi? (Unchecked)'
    by = By.xpath("//input[@id='CardStorageLinkGenerationSettings_IsShowSmsTemplate']//.. //span[@class='jquery-safari-checkbox jquery-safari-checkbox-checked']//img");
    driver.findElement(by).click();

    // 64. Click 'Gönderim Tipi Sms (Unchecked)'
    by = By.xpath("//input[@id='CardStorageLinkGenerationSettings_IsSmsSendTypeActive']//.. //span[@class='jquery-safari-checkbox jquery-safari-checkbox-checked']//img");
    driver.findElement(by).click();

    // 65. Click 'Gönderim Tipi QR (Unchecked)'
    by = By.xpath("//input[@id='CardStorageLinkGenerationSettings_IsQrSendTypeActive']//.. //span[@class='jquery-safari-checkbox jquery-safari-checkbox-checked']//img");
    driver.findElement(by).click();

    // 66. Click 'Kaydet1'
    by = By.cssSelector("#kaydet");
    driver.findElement(by).click();

    // 67. Is 'Kart Kayıt Linki Parametreleri Başarı...' visible?
    by = By.xpath("//li[. = 'Kart Kayıt Linki Parametreleri Başarıyla kaydedildi.']");
    driver.findElement(by).isDisplayed();

    // 68. Move mouse to 'moveUstUyeYonetimi'
    by = By.cssSelector("li[class='content']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 69. Click 'ustUyeYonetimi'
    by = By.xpath("//li[4]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 70. Click 'altUyeYonetimi'
    by = By.xpath("//li[1]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 71. Type 'netahsilatotomasyon@yandex.com' in 'SearchVendorName'
    by = By.cssSelector("#SearchVendorName");
    driver.findElement(by).sendKeys("netahsilatotomasyon@yandex.com");

    // 72. Click 'resultListelenen'
    by = By.xpath("//body/ul//div");
    driver.findElement(by).click();

    // 73. Click 'Listele'
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 74. Is 'Refresh' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[class='t-icon t-refresh']");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);

    // 75. Click 'Ödeme'
    by = By.xpath("//a[. = 'Ödeme']");
    driver.findElement(by).click();

    // 76. Switch to window '2'
    driver.switchTo().window(driver.getWindowHandles().toArray(new String[0])[2]);

    // 77. Is 'Bireysel türk1' visible?
    by = By.xpath("//strong[. = 'Bireysel türk']");
    driver.findElement(by).isDisplayed();

    // 78. Click 'KART KAYDI LİNKİ'
    by = By.xpath("//a[. = 'KART KAYDI LİNKİ']");
    driver.findElement(by).click();

    // 79. Is 'Sms' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    by = By.xpath("//label[. = '\n                                 Sms\n                            ']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);

    // 80. Is 'QR' not present or invisible?
    by = By.xpath("//label[. = '\n                                 QR\n                            ']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));

    // 81. Click 'EmailTypeSelection (Unchecked)'
    by = By.cssSelector("#EmailTypeSelection:not(:checked)");
    driver.findElement(by).click();

    // 82. Is 'Zaman Aşımı*' not present or invisible?
    by = By.xpath("//label[. = 'Zaman Aşımı*']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));

    // 83. Is 'İsim1' visible?
    by = By.xpath("//label[. = 'İsim']");
    driver.findElement(by).isDisplayed();

    // 84. Is 'NewUserFullName' visible?
    by = By.cssSelector("#NewUserFullName");
    driver.findElement(by).isDisplayed();

    // 85. Is 'E-Posta1' visible?
    by = By.xpath("//label[. = 'E-Posta']");
    driver.findElement(by).isDisplayed();

    // 86. Is 'NewUserEmail' visible?
    by = By.cssSelector("#NewUserEmail");
    driver.findElement(by).isDisplayed();

    // 87. Is 'Telefon1' visible?
    by = By.xpath("//label[. = 'Telefon']");
    driver.findElement(by).isDisplayed();

    // 88. Is 'NewUserPhone' visible?
    by = By.cssSelector("#NewUserPhone");
    driver.findElement(by).isDisplayed();

    // 89. Is 'Ekle' visible?
    by = By.xpath("//button[. = 'Ekle']");
    driver.findElement(by).isDisplayed();

    // 90. Is 'İsim2' visible?
    by = By.xpath("//th[. = 'İsim']");
    driver.findElement(by).isDisplayed();

    // 91. Is 'E-Posta2' visible?
    by = By.xpath("//th[. = 'E-Posta']");
    driver.findElement(by).isDisplayed();

    // 92. Is 'Telefon2' visible?
    by = By.xpath("//th[. = 'Telefon']");
    driver.findElement(by).isDisplayed();

    // 93. Is 'INPUT' visible and selected?
    by = By.xpath("//td/input[1]");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.elementSelectionStateToBe(by, true));

    // 94. Is 'Bireysel türk2' visible?
    by = By.xpath("//td[. = 'Bireysel türk']");
    driver.findElement(by).isDisplayed();

    // 95. Is 'E-Posta Netahsilatotomasyon@yandex.com	' visible?
    by = By.xpath("//td[text()='Bireysel türk']/..//td[text()='netahsilatotomasyon@yandex.com']");
    driver.findElement(by).isDisplayed();

    // 96. Get 'href' attribute value on 'Sil10'
    getElementAttribute = WebExtensions.getElementAttribute("href");
    by = By.xpath("//a[. = 'Sil']");
    getElementAttribute = (WebExtensions.GetElementAttribute)((ReportingDriver)driver).addons().execute(getElementAttribute, by, -1);

    // 97. Is 'Gönder' visible?
    by = By.xpath("//button[. = 'Gönder']");
    driver.findElement(by).isDisplayed();

    // 98. Click 'YÖNETİCİ1'
    by = By.xpath("//a[. = 'YÖNETİCİ']");
    driver.findElement(by).click();

    // 99. Move mouse to 'moveToSiteYönetimi'
    by = By.cssSelector("li[class='config']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 100. Click 'btnSiteYönetimi'
    by = By.cssSelector("a[title='SİTE YÖNETİMİ']");
    driver.findElement(by).click();

    // 101. Click 'PARAMETRELER'
    by = By.xpath("//a[. = 'PARAMETRELER']");
    driver.findElement(by).click();

    // 102. Click 'Kart Kayıt Linki Parametreleri'
    by = By.xpath("//a[. = '\n            Kart Kayıt Linki Parametreleri\n        ']");
    driver.findElement(by).click();

    // 103. Click 'Zaman Aşımı Görünsün (Checked)'
    by = By.xpath("//label[normalize-space()='Zaman Aşımı']//..//following-sibling::div//span[@class='jquery-safari-checkbox']");
    driver.findElement(by).click();

    // 104. Click 'Email Teması Gösterilsin mi? (Checked)'
    by = By.xpath("//input[@id='CardStorageLinkGenerationSettings_IsShowEmailTemplate']//.. //span[@class='jquery-safari-checkbox']//img");
    driver.findElement(by).click();

    // 105. Click 'Sms Teması Gösterilsin mi? (Checked)'
    by = By.xpath("//input[@id='CardStorageLinkGenerationSettings_IsShowSmsTemplate']//.. //span[@class='jquery-safari-checkbox']//img");
    driver.findElement(by).click();

    // 106. Click 'Gonderim Tipi Sms (Checked)'
    by = By.xpath("//input[@id='CardStorageLinkGenerationSettings_IsSmsSendTypeActive']//.. //span[@class='jquery-safari-checkbox']//img");
    driver.findElement(by).click();

    // 107. Click 'Gönderim Tipi QR Görünsünmü? (Checked)'
    by = By.xpath("//label[normalize-space()='QR']/../..//..//span[@class='jquery-safari-checkbox']");
    driver.findElement(by).click();

    // 108. Click 'Kaydet1'
    by = By.cssSelector("#kaydet");
    driver.findElement(by).click();

    // 109. Is 'Kart Kayıt Linki Parametreleri Başarı...' visible?
    by = By.xpath("//li[. = 'Kart Kayıt Linki Parametreleri Başarıyla kaydedildi.']");
    driver.findElement(by).isDisplayed();

  }

  @Override
  public ReportingDriver getDriver() {
    return (ReportingDriver) driver;
  }

  @AfterAll
  static void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  }

  private static Stream provideParameters() throws Exception {
    return Stream.of(Arguments.of("https://otomasyon3.netahsilatdemo.com/","otomasyon@test.com","Kd!cyhz4"));
  }
}
