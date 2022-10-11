package netahsilat;

import io.testproject.addon.RandomDataGenerator;
import io.testproject.addon.VisibleElementsOperations;
import io.testproject.addon.WebExtensions;
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

/**
 * This class was automatically generated by TestProject
 * Project: Quality Museum Project
 * Test: C890 Responsive ekranlarda bayi ve alt bayi yerine ödeme yapma ve sonrasında bayilere tekrar ulaşabilme
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Mon Oct 10 06:58:18 GMT 2022.
 */
@DisplayName("C890 Responsive ekranlarda bayi ve alt bayi yerine ödeme yapma ve sonrasında bayilere tekrar ulaşabilme")
public class C890 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C890 Responsive ekranlarda bayi ve alt bayi yerine ödeme yapma ve sonrasında bayilere tekrar ulaşabilme")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String butonlar, String password, String tutar1,
      String kartNo, String CVV, String ayYil, String tutar2) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogoutlogin methodlogoutlogin;
    MethodParametrikdemesadeceKartBilgisi methodparametrikdemesadecekartbilgisi;
    WebExtensions.SetWindowSize setWindowSize;
    RandomDataGenerator.GenerateNumberInRange generateNumberInRange;
    VisibleElementsOperations.ClickIfVisibleWeb clickIfVisibleWeb;

    // 1. Run Method Logout&Login
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ProjectParameters.Otomasyon2Logout;
    methodlogoutlogin.userName = "siteadm.otomasyon2@yandex.com";
    methodlogoutlogin.password = ProjectParameters.genelPassword;
    methodlogoutlogin.execute(driver);
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 2. Click 'Ödeme Ekranına Git1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[@href='/Payment/AddAuthenticatedSession']");
    driver.findElement(by).click();

    // 3. Set window size to ('400','800')
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    setWindowSize = WebExtensions.setWindowSize("400","800");
    setWindowSize = (WebExtensions.SetWindowSize)((ReportingDriver)driver).addons().execute(setWindowSize);
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 4. Click 'Masterpass Close button' if it's visible
    GeneratedUtils.sleep(500);
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("3");
    by = By.xpath("//div[@data-bind=\"visible: masterPassStep() == 'mp-update-identity'\"]//button[@type='button'][normalize-space()='×']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 5. Click 'İŞLEMLER1'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#mobile-menu");
    driver.findElement(by).click();

    // 6. Click 'BAYİLER4'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = '\n                \n                BAYİLER\n            ']");
    driver.findElement(by).click();

    // 7. Type 'BayiCode01' in 'VendorCode'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#VendorCode");
    driver.findElement(by).sendKeys("BayiCode01");

    // 8. Click 'Responsive Gonder Button'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("input[value='Gönder']");
    driver.findElement(by).click();

    // 9. Does 'Kod : BayiCode01' contain 'Kod : BayiCode01'?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    by = By.xpath("//strong[. = 'Kod : BayiCode01']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Kod : BayiCode01"));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 10. Click '4'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("i[class='icon-chevron-down text-muted downandup pull-right']");
    driver.findElement(by).click();

    // 11. Click 'Yerine ödeme yap'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'Yerine ödeme yap']");
    driver.findElement(by).click();

    // 12. Generate random number between '10' and '99'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    generateNumberInRange = RandomDataGenerator.generateNumberInRange("10","99");
    generateNumberInRange = (RandomDataGenerator.GenerateNumberInRange)((ReportingDriver)driver).addons().execute(generateNumberInRange);
    tutar1 = String.valueOf(generateNumberInRange.result);
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 13. Generate random number between '10' and '99'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    generateNumberInRange = RandomDataGenerator.generateNumberInRange("10","99");
    generateNumberInRange = (RandomDataGenerator.GenerateNumberInRange)((ReportingDriver)driver).addons().execute(generateNumberInRange);
    tutar2 = String.valueOf(generateNumberInRange.result);
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 14. Clear 'PureAmount' contents
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    by = By.cssSelector("#PureAmount");
    driver.findElement(by).clear();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 15. Type '{{tutar1}},{{tutar2}}' in 'PureAmount'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#PureAmount");
    driver.findElement(by).sendKeys(String.format("%s,%s",tutar1,tutar2));

    // 16. Run Method Parametrik Ödeme (Sadece Kart Bilgisi)
    GeneratedUtils.sleep(500);
    methodparametrikdemesadecekartbilgisi = new MethodParametrikdemesadeceKartBilgisi();
    methodparametrikdemesadecekartbilgisi.kartNo = ProjectParameters.AkBankKartNo;
    methodparametrikdemesadecekartbilgisi.CVV = ProjectParameters.genelKartCVV;
    methodparametrikdemesadecekartbilgisi.ayYil = ProjectParameters.genelKartAyYil;
    methodparametrikdemesadecekartbilgisi.execute(driver);

    // 17. Move mouse to 'Akbank Tek Çekim Posu'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    by = By.xpath("(//td[contains(@class,'commRate-20')])[1]");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 18. Click 'Akbank Tek Çekim Posu'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    by = By.xpath("(//td[contains(@class,'commRate-20')])[1]");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 19. Click 'btnNormalPayment'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#btnNormalPayment");
    driver.findElement(by).click();

    // 20. Does 'İşleminiz Tamamlandı. Referans Numara...' contain 'İşleminiz Tamamlandı. Referans Numarası : NT'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("p[data-bind='text: messageText']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("İşleminiz Tamamlandı. Referans Numarası : NT"));

    // 21. Click 'İŞLEMLER1'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#mobile-menu");
    driver.findElement(by).click();

    // 22. Is 'BAYİLER3' present?
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[7]/a");
    driver.findElement(by);

    // 23. Click 'BAYİLER4'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = '\n                \n                BAYİLER\n            ']");
    driver.findElement(by).click();

    // 24. Type 'MusteriCode01' in 'VendorCode'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#VendorCode");
    driver.findElement(by).sendKeys("MusteriCode01");

    // 25. Click 'INPUT3'
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[3]/input");
    driver.findElement(by).click();

    // 26. Does 'Kod : MusteriCode01' contain 'Kod : MusteriCode01'?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    by = By.xpath("//strong[. = 'Kod : MusteriCode01']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Kod : MusteriCode01"));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 27. Click 'MusteriCode01-Responsive-DropDown'
    GeneratedUtils.sleep(500);
    by = By.xpath("//i[@class='icon-chevron-down text-muted downandup pull-right']");
    driver.findElement(by).click();

    // 28. Click 'Yerine ödeme yap'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    by = By.xpath("//a[. = 'Yerine ödeme yap']");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 29. Generate random number between '10' and '99'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    generateNumberInRange = RandomDataGenerator.generateNumberInRange("10","99");
    generateNumberInRange = (RandomDataGenerator.GenerateNumberInRange)((ReportingDriver)driver).addons().execute(generateNumberInRange);
    tutar1 = String.valueOf(generateNumberInRange.result);
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 30. Generate random number between '10' and '99'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    generateNumberInRange = RandomDataGenerator.generateNumberInRange("10","99");
    generateNumberInRange = (RandomDataGenerator.GenerateNumberInRange)((ReportingDriver)driver).addons().execute(generateNumberInRange);
    tutar2 = String.valueOf(generateNumberInRange.result);
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 31. Clear 'PureAmount' contents
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    by = By.cssSelector("#PureAmount");
    driver.findElement(by).clear();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 32. Type '{{tutar1}},{{tutar2}}' in 'PureAmount'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#PureAmount");
    driver.findElement(by).sendKeys(String.format("%s,%s",tutar1,tutar2));

    // 33. Run Method Parametrik Ödeme (Sadece Kart Bilgisi)
    GeneratedUtils.sleep(500);
    methodparametrikdemesadecekartbilgisi = new MethodParametrikdemesadeceKartBilgisi();
    methodparametrikdemesadecekartbilgisi.kartNo = ProjectParameters.AkBankKartNo;
    methodparametrikdemesadecekartbilgisi.CVV = ProjectParameters.genelKartCVV;
    methodparametrikdemesadecekartbilgisi.ayYil = ProjectParameters.genelKartAyYil;
    methodparametrikdemesadecekartbilgisi.execute(driver);

    // 34. Move mouse to 'Akbank Tek Çekim Posu'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    by = By.xpath("(//td[contains(@class,'commRate-20')])[1]");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 35. Click 'Akbank Tek Çekim Posu'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    by = By.xpath("(//td[contains(@class,'commRate-20')])[1]");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 36. Click 'btnNormalPayment'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#btnNormalPayment");
    driver.findElement(by).click();

    // 37. Does 'İşleminiz Tamamlandı. Referans Numara...' contain 'İşleminiz Tamamlandı. Referans Numarası : NT'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("p[data-bind='text: messageText']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("İşleminiz Tamamlandı. Referans Numarası : NT"));

    // 38. Click 'İŞLEMLER1'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#mobile-menu");
    driver.findElement(by).click();

    // 39. Is 'BAYİLER3' present?
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[7]/a");
    driver.findElement(by);

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
    return Stream.of(Arguments.of("https://otomasyon2.netahsilatdemo.com/","","Kd!cyhz4","","","","",""));
  }
}