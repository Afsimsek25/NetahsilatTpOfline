package netahsilat;

import io.testproject.addon.JSActions;
import io.testproject.addon.NetahsilatUtills;
import io.testproject.addon.WebExtensions;
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
 * Test: C2024 Sanal Pos ekleme/güncelleme/silme(parametreler dahil) - Garanti
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Tue Oct 11 07:20:14 GMT 2022.
 */
@DisplayName("C2024 Sanal Pos ekleme/güncelleme/silme(parametreler dahil) - Garanti")
public class C2024 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C2024 Sanal Pos ekleme/güncelleme/silme(parametreler dahil) - Garanti")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogoutlogin methodlogoutlogin;
    WebExtensions.SelectOptionbyVisibleText selectOptionbyVisibleText;
    NetahsilatUtills.ClickUntilGone clickUntilGone;
    JSActions.ClickAction clickAction;

    // 1. Run Method Logout&Login
    GeneratedUtils.sleep(500);
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = ProjectParameters.genelEmail;
    methodlogoutlogin.password = ProjectParameters.genelPassword;
    methodlogoutlogin.execute(driver);

    // 2. Move mouse to 'moveToSiteYönetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='config']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 3. Click 'SİTE YÖNETİMİ'
    GeneratedUtils.sleep(500);
    by = By.cssSelector(".config > a");
    driver.findElement(by).click();

    // 4. Move mouse to 'ddPosAyarlari'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[@title='POS AYARLARI']/..//img");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 5. Click 'SANAL POSLAR'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'SANAL POSLAR']");
    driver.findElement(by).click();

    // 6. Is 'Refresh' visible?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[class='t-icon t-refresh']");
    driver.findElement(by).isDisplayed();

    // 7. Click 'Sanal Pos Sayfalama Button'
    GeneratedUtils.sleep(500);
    clickAction = JSActions.getClickAction();
    by = By.cssSelector("span[class='t-icon t-arrow-down']");
    clickAction = (JSActions.ClickAction)((ReportingDriver)driver).addons().execute(clickAction, by, -1);

    // 8. Click 'Grid 500 Liste'
    GeneratedUtils.sleep(500);
    clickAction = JSActions.getClickAction();
    by = By.xpath("//div[@class = 't-animation-container' and contains(@style, 'display: block;')]//li[. = '500']");
    clickAction = (JSActions.ClickAction)((ReportingDriver)driver).addons().execute(clickAction, by, -1);

    // 9. Click 'Yeni Sanal Pos Ekle'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'Yeni Sanal Pos Ekle']");
    driver.findElement(by).click();

    // 10. Is 'Banka Posları' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[. = 'Banka Posları']");
    driver.findElement(by).isDisplayed();

    // 11. Click 'PosApiTypeSystemId'
    GeneratedUtils.sleep(500);
    by = By.xpath("//form/div[1]/div//input[1]");
    driver.findElement(by).click();

    // 12. Select options in 'VPosApiId' with text '[NONE]'
    //    Garanti
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Garanti");
    by = By.cssSelector("#VPosApiId");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 13. Type 'C2024 Otomasyon posu (Silinen)' in 'Name'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Name");
    driver.findElement(by).sendKeys("C2024 Otomasyon posu (Silinen)");

    // 14. Type 'Otomasyon tarafından oluşturulup silinen pos' in 'Explanation'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Explanation");
    driver.findElement(by).sendKeys("Otomasyon tarafından oluşturulup silinen pos");

    // 15. Type '45643565676' in 'input[id='Code']'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("input[id='Code']");
    driver.findElement(by).sendKeys("45643565676");

    // 16. Type '876758694' in 'ErpCode'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#ErpCode");
    driver.findElement(by).sendKeys("876758694");

    // 17. Select options in 'VPosApiCurrencyId' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("TL");
    by = By.cssSelector("#VPosApiCurrencyId");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 18. Click 'bonus.PNG'
    GeneratedUtils.sleep(500);
    by = By.xpath("(//img[contains(@src,'bonus.png')])[2]");
    driver.findElement(by).click();

    // 19. Click '3D aktif'
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[@for='Is3DAvailable']/..//..//img");
    driver.findElement(by).click();

    // 20. Click 'CVV Kullanılsın'
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[@for='IsCVVUse']/..//..//img");
    driver.findElement(by).click();

    // 21. Click 'Bayi Ödeme Servisinde Aktif'
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[@for='IsVendorPaymentServiceActive']/..//..//img");
    driver.findElement(by).click();

    // 22. Click 'Aktif'
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[@for='IsActive']/..//..//img");
    driver.findElement(by).click();

    // 23. Type '2834723874' in 'BranchCode'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#BranchCode");
    driver.findElement(by).sendKeys("2834723874");

    // 24. Type '2837423840' in 'BankAccountNumber'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#BankAccountNumber");
    driver.findElement(by).sendKeys("2837423840");

    // 25. Type 'NL63ABNA7864733042' in 'IBAN'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#IBAN");
    driver.findElement(by).sendKeys("NL63ABNA7864733042");

    // 26. Click 'Komisyon Oranları'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[href='#tab-comission']");
    driver.findElement(by).click();

    // 27. Type '1' in 'Installment'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("[name='Installment']");
    driver.findElement(by).sendKeys("1");

    // 28. Type '1,2' in 'CommRate6'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("[name='CommRate']");
    driver.findElement(by).sendKeys("1,2");

    // 29. Type '1,3' in 'ServiceCommRate'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("[name='ServiceCommRate']");
    driver.findElement(by).sendKeys("1,3");

    // 30. Type '1' in 'PlusInstalment'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("[name='PlusInstalment']");
    driver.findElement(by).sendKeys("1");

    // 31. Type '1' in 'PlusInstalmentLowerLimit1'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("[name='PlusInstalmentLowerLimit']");
    driver.findElement(by).sendKeys("1");

    // 32. Type '130000' in 'PlusInstalmentOverLimit'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("[name='PlusInstalmentOverLimit']");
    driver.findElement(by).sendKeys("130000");

    // 33. Type '4' in 'PaymentDeferral'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("[name='PaymentDeferral']");
    driver.findElement(by).sendKeys("4");

    // 34. Type '1' in 'PaymentDeferralLowerLimit'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("[name='PaymentDeferralLowerLimit']");
    driver.findElement(by).sendKeys("1");

    // 35. Type '130000' in 'PaymentDeferralOverLimit'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("[name='PaymentDeferralOverLimit']");
    driver.findElement(by).sendKeys("130000");

    // 36. Type '100' in 'MinInstallmentLimit'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("[name='MinInstallmentLimit']");
    driver.findElement(by).sendKeys("100");

    // 37. Type '130000' in 'MaxInstallmentLimit'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("[name='MaxInstallmentLimit']");
    driver.findElement(by).sendKeys("130000");

    // 38. Type '30' in 'BankPaymentOn'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("[name='BankPaymentOn']");
    driver.findElement(by).sendKeys("30");

    // 39. Type 'taksit1' in 'Code'
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[15]/input");
    driver.findElement(by).sendKeys("taksit1");

    // 40. Click 'Kampanya sorgulama aktif mi?'
    //    Kampanya sorgulama aktif mi?
    GeneratedUtils.sleep(500);
    by = By.xpath("//input[@class='IsActiveCampaignInquiry']/..//img");
    driver.findElement(by).click();

    // 41. Click 'TaksitEKle'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("input[value='Ekle']");
    driver.findElement(by).click();

    // 42. Run Click Until Gone
    GeneratedUtils.sleep(500);
    clickUntilGone = NetahsilatUtills.clickUntilGone(30);
    by = By.xpath("//button[. = 'Tamam']");
    clickUntilGone = (NetahsilatUtills.ClickUntilGone)((ReportingDriver)driver).addons().execute(clickUntilGone, by, -1);

    // 43. Is '//td[text()='C2024 Otomasyon posu (Silinen)']' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[text()='C2024 Otomasyon posu (Silinen)']");
    driver.findElement(by).isDisplayed();

    // 44. Click 'C2024 Otomasyon posu (Silinen)  "Düzenle"'
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[text()='C2024 Otomasyon posu (Silinen)']/..//a[@title='Sanal Pos Güncelle']//img");
    driver.findElement(by).click();

    // 45. Does 'Name' contain 'C2024 Otomasyon posu (Silinen)'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Name");
    Assertions.assertTrue(driver.findElement(by).getText().contains("C2024 Otomasyon posu (Silinen)"));

    // 46. Does 'Explanation' contain 'Otomasyon tarafından oluşturulup silinen pos'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Explanation");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Otomasyon tarafından oluşturulup silinen pos"));

    // 47. Does 'input[id='Code']' contain '45643565676'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("input[id='Code']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("45643565676"));

    // 48. Does 'ErpCode' contain '876758694'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#ErpCode");
    Assertions.assertTrue(driver.findElement(by).getText().contains("876758694"));

    // 49. Does 'VPosApiCurrencyId' contain 'TL'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#VPosApiCurrencyId");
    Assertions.assertTrue(driver.findElement(by).getText().contains("TL"));

    // 50. Does 'BranchCode' contain '2834723874'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#BranchCode");
    Assertions.assertTrue(driver.findElement(by).getText().contains("2834723874"));

    // 51. Does 'BankAccountNumber' contain '2837423840'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#BankAccountNumber");
    Assertions.assertTrue(driver.findElement(by).getText().contains("2837423840"));

    // 52. Does 'IBAN' contain 'NL63ABNA7864733042'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#IBAN");
    Assertions.assertTrue(driver.findElement(by).getText().contains("NL63ABNA7864733042"));

    // 53. Click 'Komisyon Oranları'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[href='#tab-comission']");
    driver.findElement(by).click();

    // 54. Does 'Installment1' contain '1'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//div/div/div[3]/input");
    Assertions.assertTrue(driver.findElement(by).getText().contains("1"));

    // 55. Does 'CommRate7' contain '1,20'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//div/div/div[4]/input");
    Assertions.assertTrue(driver.findElement(by).getText().contains("1,20"));

    // 56. Does 'ServiceCommRate1' contain '1,30'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//div/div/div[5]/input");
    Assertions.assertTrue(driver.findElement(by).getText().contains("1,30"));

    // 57. Does 'PlusInstalment1' contain '1'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//div/div/div[6]/input");
    Assertions.assertTrue(driver.findElement(by).getText().contains("1"));

    // 58. Does 'PlusInstalmentLowerLimit' contain '1,00'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//div/div/div[7]/input");
    Assertions.assertTrue(driver.findElement(by).getText().contains("1,00"));

    // 59. Does 'PlusInstalmentOverLimit1' contain '130000,00'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//div/div/div[8]/input");
    Assertions.assertTrue(driver.findElement(by).getText().contains("130000,00"));

    // 60. Does 'PaymentDeferral1' contain '4'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//div/div/div[9]/input");
    Assertions.assertTrue(driver.findElement(by).getText().contains("4"));

    // 61. Does 'PaymentDeferralLowerLimit1' contain '1,00'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//div/div/div[10]/input");
    Assertions.assertTrue(driver.findElement(by).getText().contains("1,00"));

    // 62. Does 'PaymentDeferralOverLimit1' contain '130000,00'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//div/div/div[11]/input");
    Assertions.assertTrue(driver.findElement(by).getText().contains("130000,00"));

    // 63. Does 'MinInstallment' contain '100,00'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("[name='MinInstallment']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("100,00"));

    // 64. Does 'MaxInstallment' contain '130000,00'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("[name='MaxInstallment']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("130000,00"));

    // 65. Does 'BankPaymentOn1' contain '30'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//div/div/div[14]/input");
    Assertions.assertTrue(driver.findElement(by).getText().contains("30"));

    // 66. Is 'Kampanya sorgulama aktif mi? checked' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//input[@class='IsActiveCampaignInquiry']/..//span[contains(@class,'checked')]");
    driver.findElement(by).isDisplayed();

    // 67. Click 'Vazgeç'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Vazgeç']");
    driver.findElement(by).click();

    // 68. Is '//td[text()='C2024 Otomasyon posu (Silinen)']' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[text()='C2024 Otomasyon posu (Silinen)']");
    driver.findElement(by).isDisplayed();

    // 69. Click 'C2024 Otomasyon posu (Silinen) "Parametreler"'
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[text()='C2024 Otomasyon posu (Silinen)']/..//a[@title='Parametreler']//img");
    driver.findElement(by).click();

    // 70. Does 'Host3D' contain 'https://sanalposprov.garanti.com.tr/servlet/gt3dengine'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[text()='Host3D ']/..//following-sibling::td//input[@type='text']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("https://sanalposprov.garanti.com.tr/servlet/gt3dengine"));

    // 71. Does 'Host' contain 'https://sanalposprov.garanti.com.tr/VPServlet'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[text()='Host ']/..//following-sibling::td//input[@type='text']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("https://sanalposprov.garanti.com.tr/VPServlet"));

    // 72. Type '374637482734' in 'SecuryLev (Security Level)'
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[text()='SecuryLev ']/..//following-sibling::td//input[@type='text']");
    driver.findElement(by).sendKeys("374637482734");

    // 73. Clear 'CalculateCurreny ' contents
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[text()='CalculateCurreny ']/..//following-sibling::td//input[@type='text']");
    driver.findElement(by).clear();

    // 74. Type '84237503482' in 'CalculateCurreny '
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[text()='CalculateCurreny ']/..//following-sibling::td//input[@type='text']");
    driver.findElement(by).sendKeys("84237503482");

    // 75. Type '734236542374' in 'MerchantID'
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[text()='MerchantID ']/..//following-sibling::td//input[@type='text']");
    driver.findElement(by).sendKeys("734236542374");

    // 76. Type '736423746' in 'IdentityVerification'
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[text()='IdentityVerification ']/..//following-sibling::td//input[@type='text']");
    driver.findElement(by).sendKeys("736423746");

    // 77. Type '34532465' in 'ProvUserID'
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[text()='ProvUserID ']/..//following-sibling::td//input[@type='text']");
    driver.findElement(by).sendKeys("34532465");

    // 78. Type '37463564' in 'CompanyCode'
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[text()='CompanyCode ']/..//following-sibling::td//input[@type='text']");
    driver.findElement(by).sendKeys("37463564");

    // 79. Type '9876567' in 'TerminalId'
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[text()='TerminalId ']/..//following-sibling::td//input[@type='text']");
    driver.findElement(by).sendKeys("9876567");

    // 80. Type '648203' in 'SinglePaymentParameter'
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[text()='SinglePaymentParameter ']/..//following-sibling::td//input[@type='text']");
    driver.findElement(by).sendKeys("648203");

    // 81. Run Click Until Gone
    GeneratedUtils.sleep(500);
    clickUntilGone = NetahsilatUtills.clickUntilGone(30);
    by = By.xpath("//button[. = 'Tamam']");
    clickUntilGone = (NetahsilatUtills.ClickUntilGone)((ReportingDriver)driver).addons().execute(clickUntilGone, by, -1);

    // 82. Is '//td[text()='C2024 Otomasyon posu (Silinen)']' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[text()='C2024 Otomasyon posu (Silinen)']");
    driver.findElement(by).isDisplayed();

    // 83. Click 'C2024 Otomasyon posu (Silinen) "Parametreler"'
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[text()='C2024 Otomasyon posu (Silinen)']/..//a[@title='Parametreler']//img");
    driver.findElement(by).click();

    // 84. Does 'SecuryLev (Security Level)' contain '374637482734'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[text()='SecuryLev ']/..//following-sibling::td//input[@type='text']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("374637482734"));

    // 85. Does 'CalculateCurreny ' contain '84237503482'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[text()='CalculateCurreny ']/..//following-sibling::td//input[@type='text']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("84237503482"));

    // 86. Does 'MerchantID' contain '734236542374'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[text()='MerchantID ']/..//following-sibling::td//input[@type='text']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("734236542374"));

    // 87. Does 'IdentityVerification' contain '736423746'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[text()='IdentityVerification ']/..//following-sibling::td//input[@type='text']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("736423746"));

    // 88. Does 'ProvUserID' contain '34532465'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[text()='ProvUserID ']/..//following-sibling::td//input[@type='text']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("34532465"));

    // 89. Does 'CompanyCode' contain '37463564'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[text()='CompanyCode ']/..//following-sibling::td//input[@type='text']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("37463564"));

    // 90. Does 'TerminalId' contain '9876567'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[text()='TerminalId ']/..//following-sibling::td//input[@type='text']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("9876567"));

    // 91. Does 'SinglePaymentParameter' contain '648203'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//label[text()='SinglePaymentParameter ']/..//following-sibling::td//input[@type='text']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("648203"));

    // 92. Click 'Vazgeç'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Vazgeç']");
    driver.findElement(by).click();

    // 93. Is '//td[text()='C2024 Otomasyon posu (Silinen)']' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[text()='C2024 Otomasyon posu (Silinen)']");
    driver.findElement(by).isDisplayed();

    // 94. Click 'C2024 Otomasyon posu (Silinen) "Sil"'
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[text()='C2024 Otomasyon posu (Silinen)']/..//a[@title='Sil']//img");
    driver.findElement(by).click();

    // 95. Run Click Until Gone
    GeneratedUtils.sleep(500);
    clickUntilGone = NetahsilatUtills.clickUntilGone(30);
    by = By.xpath("//button[. = 'Tamam']");
    clickUntilGone = (NetahsilatUtills.ClickUntilGone)((ReportingDriver)driver).addons().execute(clickUntilGone, by, -1);

    // 96. Is '//td[text()='C2024 Otomasyon posu (Silinen)']' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[text()='C2024 Otomasyon posu (Silinen)']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

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
    return Stream.of(Arguments.of("https://otomasyon.netahsilatdemo.com/Account/LogOff","otomasyon@test.com","Kd!cyhz4"));
  }
}
