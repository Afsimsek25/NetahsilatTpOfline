package netahsilat;

import io.testproject.addon.VisibleElementsOperations;
import io.testproject.sdk.drivers.ReportingDriver;
import io.testproject.sdk.drivers.web.RemoteWebDriver;
import io.testproject.sdk.interfaces.junit5.ExceptionsReporter;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
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

/**
 * This class was automatically generated by TestProject
 * Project: Quality Museum Project
 * Test: C3259
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Sun Oct 09 20:56:20 GMT 2022.
 */
@DisplayName("C3259")
public class C3259 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C3259")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogin methodlogin;
    VisibleElementsOperations.ClickIfVisibleWeb clickIfVisibleWeb;

    // 1. Navigate to '{{Otomasyon2Logout}}'
    driver.navigate().to(ProjectParameters.Otomasyon2Logout);

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
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("3");
    by = By.xpath("//label[normalize-space()='Zaman Aşımı']//..//following-sibling::div//span[@class='jquery-safari-checkbox']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 8. Click 'Email Teması Gösterilsin mi? (Checked)' if it's visible
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("3");
    by = By.xpath("//input[@id='CardStorageLinkGenerationSettings_IsShowEmailTemplate']//.. //span[@class='jquery-safari-checkbox']//img");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 9. Click 'Sms Teması Gösterilsin mi? (Checked)' if it's visible
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("3");
    by = By.xpath("//input[@id='CardStorageLinkGenerationSettings_IsShowSmsTemplate']//.. //span[@class='jquery-safari-checkbox']//img");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 10. Click 'Gönderim Tipi E-Posta Görünsünmü? (Checked)' if it's visible
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("3");
    by = By.xpath("//label[normalize-space()='E-Posta']/../..//..//span[@class='jquery-safari-checkbox']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 11. Click 'Gonderim Tipi Sms (Checked)' if it's visible
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("3");
    by = By.xpath("//input[@id='CardStorageLinkGenerationSettings_IsSmsSendTypeActive']//.. //span[@class='jquery-safari-checkbox']//img");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 12. Click 'Gönderim Tipi QR Görünsünmü? (Checked)' if it's visible
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("3");
    by = By.xpath("//label[normalize-space()='QR']/../..//..//span[@class='jquery-safari-checkbox']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 13. Click 'Kaydet2'
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
    GeneratedUtils.sleep(500);
    by = By.xpath("//body/ul//div");
    driver.findElement(by).click();

    // 20. Click 'Listele'
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 21. Is 'Refresh' visible?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[class='t-icon t-refresh']");
    driver.findElement(by).isDisplayed();

    // 22. Click 'Ödeme'
    by = By.xpath("//a[. = 'Ödeme']");
    driver.findElement(by).click();

    // 23. Switch to window '1'
    driver.switchTo().window(driver.getWindowHandles().toArray(new String[0])[1]);

    // 24. Click 'Masterpass Close button' if it's visible
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("3");
    by = By.xpath("//div[@data-bind=\"visible: masterPassStep() == 'mp-update-identity'\"]//button[@type='button'][normalize-space()='×']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 25. Is 'Bireysel türk' visible?
    by = By.xpath("//strong[. = 'Bireysel türk']");
    driver.findElement(by).isDisplayed();

    // 26. Click 'KART KAYDI LİNKİ'
    by = By.xpath("//a[. = 'KART KAYDI LİNKİ']");
    driver.findElement(by).click();

    // 27. Is 'Gönderim Tipi*' visible?
    by = By.xpath("//label[. = 'Gönderim Tipi*']");
    driver.findElement(by).isDisplayed();

    // 28. Is 'Email' visible?
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

    // 33. Does 'SELECT' contain 'Ay'?
    by = By.xpath("//select[@data-bind=\"options: availableFrequencyTypes, optionsText: 'text', value: selectedFrequencyType\"]");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Ay"));

    // 34. Is 'İsim' visible?
    by = By.xpath("//label[. = 'İsim']");
    driver.findElement(by).isDisplayed();

    // 35. Is 'NewUserFullName' visible?
    by = By.cssSelector("#NewUserFullName");
    driver.findElement(by).isDisplayed();

    // 36. Is 'E-Posta' visible?
    by = By.xpath("//label[. = 'E-Posta']");
    driver.findElement(by).isDisplayed();

    // 37. Is 'NewUserEmail' visible?
    by = By.cssSelector("#NewUserEmail");
    driver.findElement(by).isDisplayed();

    // 38. Is 'Telefon' visible?
    by = By.xpath("//label[. = 'Telefon']");
    driver.findElement(by).isDisplayed();

    // 39. Is 'NewUserPhone' visible?
    by = By.cssSelector("#NewUserPhone");
    driver.findElement(by).isDisplayed();

    // 40. Is 'Ekle' visible?
    by = By.xpath("//button[. = 'Ekle']");
    driver.findElement(by).isDisplayed();

    // 41. Is 'İsim1' visible?
    by = By.xpath("//th[. = 'İsim']");
    driver.findElement(by).isDisplayed();

    // 42. Is 'E-Posta1' visible?
    by = By.xpath("//th[. = 'E-Posta']");
    driver.findElement(by).isDisplayed();

    // 43. Is 'Telefon1' visible?
    by = By.xpath("//th[. = 'Telefon']");
    driver.findElement(by).isDisplayed();

    // 44. Is 'INPUT' visible and selected?
    by = By.xpath("//input[@data-bind='checked: selected, visible: !$$root.isQrTypeSelected()']");
    (new WebDriverWait(driver, 15)).until(ExpectedConditions.elementSelectionStateToBe(by, true));

    // 45. Is 'Bireysel türk1' visible?
    by = By.xpath("//td[. = 'Bireysel türk']");
    driver.findElement(by).isDisplayed();

    // 46. Is 'E-Posta Netahsilatotomasyon@yandex.com	' visible?
    by = By.xpath("//td[text()='Bireysel türk']/..//td[text()='netahsilatotomasyon@yandex.com']");
    driver.findElement(by).isDisplayed();

    // 47. Is 'Telefon netahsilatotomasyon@yandex.com' visible?
    by = By.xpath("//td[text()='Bireysel türk']/..//td[text()='(555)5555555']");
    driver.findElement(by).isDisplayed();

    // 48. Is 'netahsilatotomasyon@yandex.com	 Sil Button' visible?
    by = By.xpath("//td[text()='netahsilatotomasyon@yandex.com']/..//a");
    driver.findElement(by).isDisplayed();

    // 49. Is 'Gönder' visible?
    by = By.xpath("//button[. = 'Gönder']");
    driver.findElement(by).isDisplayed();

    // 50. Click 'EmailTypeSelection (Unchecked)'
    by = By.cssSelector("#EmailTypeSelection:not(:checked)");
    driver.findElement(by).click();

    // 51. Is 'Email Teması Seçiniz*' visible?
    by = By.xpath("//label[. = 'Email Teması Seçiniz*']");
    driver.findElement(by).isDisplayed();

    // 52. Does 'Kart kaydı için link' contain 'Kart kaydı için link'?
    by = By.xpath("//div[2]/select[. = 'Kart kaydı için link']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Kart kaydı için link"));

    // 53. Click 'EmailTypeSelection (Checked)'
    by = By.cssSelector("#EmailTypeSelection:checked");
    driver.findElement(by).click();

    // 54. Click 'SmsTypeSelection (Unchecked)'
    by = By.cssSelector("#SmsTypeSelection:not(:checked)");
    driver.findElement(by).click();

    // 55. Is 'SMS Teması Seçiniz*' visible?
    by = By.xpath("//div[. = '\n                                    SMS Teması Seçiniz*\n                                ']");
    driver.findElement(by).isDisplayed();

    // 56. Does 'Kart kaydı için link1' contain 'Kart kaydı için link'?
    by = By.xpath("//div[4]/select[. = 'Kart kaydı için link']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Kart kaydı için link"));

    // 57. Click 'YÖNETİCİ1'
    by = By.xpath("//a[. = 'YÖNETİCİ']");
    driver.findElement(by).click();

    // 58. Move mouse to 'moveToSiteYönetimi'
    by = By.cssSelector("li[class='config']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 59. Click 'btnSiteYönetimi'
    by = By.cssSelector("a[title='SİTE YÖNETİMİ']");
    driver.findElement(by).click();

    // 60. Click 'PARAMETRELER'
    by = By.xpath("//a[. = 'PARAMETRELER']");
    driver.findElement(by).click();

    // 61. Click 'Kart Kayıt Linki Parametreleri'
    by = By.xpath("//a[. = '\n            Kart Kayıt Linki Parametreleri\n        ']");
    driver.findElement(by).click();

    // 62. Click 'Zaman Aşımı Görünsün (Unchecked)' if it's visible
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("3");
    by = By.xpath("//label[normalize-space()='Zaman Aşımı']//..//following-sibling::div//span[@class='jquery-safari-checkbox jquery-safari-checkbox-checked']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 63. Click 'Email teması Gösterilsin mi? (Unchecked)' if it's visible
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("3");
    by = By.xpath("//input[@id='CardStorageLinkGenerationSettings_IsShowEmailTemplate']//.. //span[@class='jquery-safari-checkbox jquery-safari-checkbox-checked']//img");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 64. Click 'Sms Teması Gösterilsin mi? (Unchecked)' if it's visible
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("3");
    by = By.xpath("//input[@id='CardStorageLinkGenerationSettings_IsShowSmsTemplate']//.. //span[@class='jquery-safari-checkbox jquery-safari-checkbox-checked']//img");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 65. Click 'Gönderim Tipi Sms (Unchecked)' if it's visible
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("3");
    by = By.xpath("//input[@id='CardStorageLinkGenerationSettings_IsSmsSendTypeActive']//.. //span[@class='jquery-safari-checkbox jquery-safari-checkbox-checked']//img");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 66. Click 'Gönderim Tipi QR (Unchecked)' if it's visible
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("3");
    by = By.xpath("//input[@id='CardStorageLinkGenerationSettings_IsQrSendTypeActive']//.. //span[@class='jquery-safari-checkbox jquery-safari-checkbox-checked']//img");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 67. Click 'Kaydet2'
    by = By.cssSelector("#kaydet");
    driver.findElement(by).click();

    // 68. Is 'Kart Kayıt Linki Parametreleri Başarı...' visible?
    by = By.xpath("//li[. = 'Kart Kayıt Linki Parametreleri Başarıyla kaydedildi.']");
    driver.findElement(by).isDisplayed();

    // 69. Move mouse to 'moveUstUyeYonetimi'
    by = By.cssSelector("li[class='content']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 70. Click 'ustUyeYonetimi'
    by = By.xpath("//li[4]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 71. Click 'altUyeYonetimi'
    by = By.xpath("//li[1]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 72. Type 'netahsilatotomasyon@yandex.com' in 'SearchVendorName'
    by = By.cssSelector("#SearchVendorName");
    driver.findElement(by).sendKeys("netahsilatotomasyon@yandex.com");

    // 73. Click 'resultListelenen'
    GeneratedUtils.sleep(500);
    by = By.xpath("//body/ul//div");
    driver.findElement(by).click();

    // 74. Click 'Listele'
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 75. Is 'Refresh' visible?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[class='t-icon t-refresh']");
    driver.findElement(by).isDisplayed();

    // 76. Click 'Ödeme'
    by = By.xpath("//a[. = 'Ödeme']");
    driver.findElement(by).click();

    // 77. Switch to window '2'
    driver.switchTo().window(driver.getWindowHandles().toArray(new String[0])[2]);

    // 78. Click 'Masterpass Close button' if it's visible
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("3");
    by = By.xpath("//div[@data-bind=\"visible: masterPassStep() == 'mp-update-identity'\"]//button[@type='button'][normalize-space()='×']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 79. Is 'Bireysel türk' visible?
    by = By.xpath("//strong[. = 'Bireysel türk']");
    driver.findElement(by).isDisplayed();

    // 80. Click 'KART KAYDI LİNKİ'
    by = By.xpath("//a[. = 'KART KAYDI LİNKİ']");
    driver.findElement(by).click();

    // 81. Is 'Sms' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    by = By.xpath("//label[. = '\n                                 Sms\n                            ']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 82. Is 'QR' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    by = By.xpath("//label[. = '\n                                 QR\n                            ']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 83. Click 'EmailTypeSelection (Unchecked)'
    by = By.cssSelector("#EmailTypeSelection:not(:checked)");
    driver.findElement(by).click();

    // 84. Is 'Email Teması Seçiniz*' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    by = By.xpath("//label[. = 'Email Teması Seçiniz*']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 85. Is 'Kart kaydı için link' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    by = By.xpath("//div[2]/select[. = 'Kart kaydı için link']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 86. Is 'İsim' visible?
    by = By.xpath("//label[. = 'İsim']");
    driver.findElement(by).isDisplayed();

    // 87. Is 'NewUserFullName' visible?
    by = By.cssSelector("#NewUserFullName");
    driver.findElement(by).isDisplayed();

    // 88. Is 'E-Posta' visible?
    by = By.xpath("//label[. = 'E-Posta']");
    driver.findElement(by).isDisplayed();

    // 89. Is 'NewUserEmail' visible?
    by = By.cssSelector("#NewUserEmail");
    driver.findElement(by).isDisplayed();

    // 90. Is 'Telefon' visible?
    by = By.xpath("//label[. = 'Telefon']");
    driver.findElement(by).isDisplayed();

    // 91. Is 'NewUserPhone' visible?
    by = By.cssSelector("#NewUserPhone");
    driver.findElement(by).isDisplayed();

    // 92. Is 'Ekle' visible?
    by = By.xpath("//button[. = 'Ekle']");
    driver.findElement(by).isDisplayed();

    // 93. Is 'İsim1' visible?
    by = By.xpath("//th[. = 'İsim']");
    driver.findElement(by).isDisplayed();

    // 94. Is 'E-Posta1' visible?
    by = By.xpath("//th[. = 'E-Posta']");
    driver.findElement(by).isDisplayed();

    // 95. Is 'Telefon1' visible?
    by = By.xpath("//th[. = 'Telefon']");
    driver.findElement(by).isDisplayed();

    // 96. Is 'INPUT' visible and selected?
    by = By.xpath("//input[@data-bind='checked: selected, visible: !$$root.isQrTypeSelected()']");
    (new WebDriverWait(driver, 15)).until(ExpectedConditions.elementSelectionStateToBe(by, true));

    // 97. Is 'Bireysel türk1' visible?
    by = By.xpath("//td[. = 'Bireysel türk']");
    driver.findElement(by).isDisplayed();

    // 98. Is 'E-Posta Netahsilatotomasyon@yandex.com	' visible?
    by = By.xpath("//td[text()='Bireysel türk']/..//td[text()='netahsilatotomasyon@yandex.com']");
    driver.findElement(by).isDisplayed();

    // 99. Is 'netahsilatotomasyon@yandex.com	 Sil Button' visible?
    by = By.xpath("//td[text()='netahsilatotomasyon@yandex.com']/..//a");
    driver.findElement(by).isDisplayed();

    // 100. Is 'Gönder' visible?
    by = By.xpath("//button[. = 'Gönder']");
    driver.findElement(by).isDisplayed();

    // 101. Click 'YÖNETİCİ1'
    by = By.xpath("//a[. = 'YÖNETİCİ']");
    driver.findElement(by).click();

    // 102. Move mouse to 'moveToSiteYönetimi'
    by = By.cssSelector("li[class='config']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 103. Click 'btnSiteYönetimi'
    by = By.cssSelector("a[title='SİTE YÖNETİMİ']");
    driver.findElement(by).click();

    // 104. Click 'PARAMETRELER'
    by = By.xpath("//a[. = 'PARAMETRELER']");
    driver.findElement(by).click();

    // 105. Click 'Kart Kayıt Linki Parametreleri'
    by = By.xpath("//a[. = '\n            Kart Kayıt Linki Parametreleri\n        ']");
    driver.findElement(by).click();

    // 106. Click 'Zaman Aşımı Görünsün (Checked)' if it's visible
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("3");
    by = By.xpath("//label[normalize-space()='Zaman Aşımı']//..//following-sibling::div//span[@class='jquery-safari-checkbox']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 107. Click 'Email Teması Gösterilsin mi? (Checked)' if it's visible
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("3");
    by = By.xpath("//input[@id='CardStorageLinkGenerationSettings_IsShowEmailTemplate']//.. //span[@class='jquery-safari-checkbox']//img");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 108. Click 'Sms Teması Gösterilsin mi? (Checked)' if it's visible
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("3");
    by = By.xpath("//input[@id='CardStorageLinkGenerationSettings_IsShowSmsTemplate']//.. //span[@class='jquery-safari-checkbox']//img");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 109. Click 'Gönderim Tipi SMS Görünsünmü? (Checked)' if it's visible
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("3");
    by = By.xpath("//label[normalize-space()='SMS']/../..//..//span[@class='jquery-safari-checkbox']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 110. Click 'Gönderim Tipi QR Görünsünmü? (Checked)' if it's visible
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("3");
    by = By.xpath("//label[normalize-space()='QR']/../..//..//span[@class='jquery-safari-checkbox']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 111. Click 'Kaydet2'
    by = By.cssSelector("#kaydet");
    driver.findElement(by).click();

    // 112. Is 'Kart Kayıt Linki Parametreleri Başarı...' visible?
    GeneratedUtils.sleep(500);
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
    return Stream.of(Arguments.of("https://otomasyon2.netahsilatdemo.com/","otomasyon@test.com","Kd!cyhz4"));
  }
}
