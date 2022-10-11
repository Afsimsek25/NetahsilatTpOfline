package netahsilat;

import io.testproject.addon.ImapMailOperations;
import io.testproject.addon.RandomDataGenerator;
import io.testproject.addon.VisibleElementsOperations;
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

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * This class was automatically generated by TestProject
 * Project: Quality Museum Project
 * Test: C785 Email orderın tarihini tutarını değiştirerek ödeme kontrol edilmeli
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Wed Oct 05 07:55:54 GMT 2022.
 */
@DisplayName("C785 Email orderın tarihini tutarını değiştirerek ödeme kontrol edilmeli")
public class C785 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C785 Email orderın tarihini tutarını değiştirerek ödeme kontrol edilmeli")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password, String email,
      String emailPassword, String islemNo, String customerID, String referansNo) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogoutlogin methodlogoutlogin;
    String string;
    ImapMailOperations.ReadSpecificsMail readSpecificsMail;
    RandomDataGenerator.GenerateNumberInRange generateNumberInRange;
    VisibleElementsOperations.ClickIfVisibleWeb clickIfVisibleWeb;

    // 1. Run Method Logout&Login
    GeneratedUtils.sleep(500);
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = ProjectParameters.genelEmail;
    methodlogoutlogin.password = ProjectParameters.genelPassword;
    methodlogoutlogin.execute(driver);

    // 2. Move mouse to 'moveUstUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='content']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 3. Click 'ustUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[4]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 4. Move mouse to 'dropDownOdemeLinki'
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[2]/div/img");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 5. Click 'ÜYELİKSİZ ÖDEME LİNKİ'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'ÜYELİKSİZ ÖDEME LİNKİ']");
    driver.findElement(by).click();

    // 6. Click 'SendSMS' if it's visible
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("");
    by = By.cssSelector("input[type='checkbox'][name='SendSMS']:checked");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 7. Clear 'PureAmount' contents
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#PureAmount");
    driver.findElement(by).clear();

    // 8. Type '75,00' in 'PureAmount'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#PureAmount");
    driver.findElement(by).sendKeys("75,00");

    // 9. Generate random number between '[NONE]' and '999999999'
    GeneratedUtils.sleep(500);
    generateNumberInRange = RandomDataGenerator.generateNumberInRange("","999999999");
    generateNumberInRange = (RandomDataGenerator.GenerateNumberInRange)((ReportingDriver)driver).addons().execute(generateNumberInRange);
    islemNo = String.valueOf(generateNumberInRange.result);

    // 10. Type '{{islemNo}}' in 'ReferenceNumber'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#ReferenceNumber");
    driver.findElement(by).sendKeys(islemNo);

    // 11. Generate random number between '[NONE]' and '999999999'
    GeneratedUtils.sleep(500);
    generateNumberInRange = RandomDataGenerator.generateNumberInRange("","999999999");
    generateNumberInRange = (RandomDataGenerator.GenerateNumberInRange)((ReportingDriver)driver).addons().execute(generateNumberInRange);
    customerID = String.valueOf(generateNumberInRange.result);

    // 12. Type '{{customerID}}' in 'CustomerId'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#CustomerId");
    driver.findElement(by).sendKeys(customerID);

    // 13. Click 'btnDevamEt'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("input[type='button'][value='Devam Et']");
    driver.findElement(by).click();

    // 14. Type 'qa' in 'inputUnvan'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#DisplayName");
    driver.findElement(by).sendKeys("qa");

    // 15. Type 'furkan' in 'FullName'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#FullName");
    driver.findElement(by).sendKeys("furkan");

    // 16. Type '{{odemeEmail}}' in 'EMail'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#EMail");
    driver.findElement(by).sendKeys(ProjectParameters.odemeEmail);

    // 17. Type '5555555555' in 'Phone'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Phone");
    driver.findElement(by).sendKeys("5555555555");

    // 18. Click 'Ekle'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Ekle']");
    driver.findElement(by).click();

    // 19. Click 'UnvanEkleCheckbox'
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[text()='netahsilatotomasyon@yandex.com']//../td/input[@type='checkbox']");
    driver.findElement(by).click();

    // 20. Type 'e-mail order deneme' in 'Description'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Description");
    driver.findElement(by).sendKeys("e-mail order deneme");

    // 21. Click 'emailGonder'
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[5]/div[1]/input");
    driver.findElement(by).click();

    // 22. Is 'Ödeme linki gönderilmiştir' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//p[. = 'Ödeme linki gönderilmiştir']");
    driver.findElement(by).isDisplayed();

    // 23. Move mouse to 'moveToIslemler'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='tag']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 24. Click 'İŞLEMLER1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'İŞLEMLER']");
    driver.findElement(by).click();

    // 25. Click 'ÖDEME LİNKİ LİSTESİ'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'ÖDEME LİNKİ LİSTESİ']");
    driver.findElement(by).click();

    // 26. Click 'imgGuncelleOdemeLinki'
    GeneratedUtils.sleep(500);
    by = By.xpath("(//img[contains(@src,'edit.png')])[1]");
    driver.findElement(by).click();

    // 27. Clear 'PureAmountDecimal' contents
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#PureAmountDecimal");
    driver.findElement(by).clear();

    // 28. Type '153,15' in 'PureAmountDecimal'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#PureAmountDecimal");
    driver.findElement(by).sendKeys("153,15");

    // 29. Click 'buttonKaydiTamamla'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Tamam']");
    driver.findElement(by).click();

    // 30. Output searched string in specific mail
    GeneratedUtils.sleep(500);
    readSpecificsMail = ImapMailOperations.readSpecificsMail(ProjectParameters.odemeEmail,ProjectParameters.yandexMailKey,islemNo,"C:/TestProject/mail/C785.html");
    readSpecificsMail = (ImapMailOperations.ReadSpecificsMail)((ReportingDriver)driver).addons().execute(readSpecificsMail);

    // 31. Navigate to 'file:///C:/TestProject/mail/C785.html'
    GeneratedUtils.sleep(500);
    driver.navigate().to("file:///C:/TestProject/mail/C785.html");

    // 32. Click 'dogrulamaLinki'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a");
    driver.findElement(by).click();

    // 33. Get text from 'DummyPureAmount'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#DummyPureAmount");
    string = driver.findElement(by).getAttribute("value");
    Assertions.assertEquals("153,15", string);

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
    return Stream.of(Arguments.of("https://otomasyon.netahsilatdemo.com/Account/LogOff","otomasyon@test.com","","otomasyon@e-cozum.com","kY2*m5J","","",""));
  }
}