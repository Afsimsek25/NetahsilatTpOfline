package netahsilat;

import io.testproject.addon.NetahsilatUtills;
import io.testproject.addon.VisibleElementsOperations;
import io.testproject.sdk.drivers.ReportingDriver;
import io.testproject.sdk.drivers.web.RemoteWebDriver;
import io.testproject.sdk.interfaces.junit5.ExceptionsReporter;
import org.junit.jupiter.api.AfterAll;
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
 * Test: C5382 Alt Bayi - Çoklu Seçim Müşteri Temsilcisi Atama (Yeni Kayıt ve Kayıt Düzenleme (NTH-14633)
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Mon Oct 10 08:36:14 GMT 2022.
 */
@DisplayName("C5382 Alt Bayi - Çoklu Seçim Müşteri Temsilcisi Atama (Yeni Kayıt ve Kayıt Düzenleme (NTH-14633)")
public class C5382 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C5382 Alt Bayi - Çoklu Seçim Müşteri Temsilcisi Atama (Yeni Kayıt ve Kayıt Düzenleme (NTH-14633)")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String password, String currentDateTime) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogin methodlogin;
    NetahsilatUtills.ClickUntilGone clickUntilGone;
    VisibleElementsOperations.ClickIfVisibleWeb clickIfVisibleWeb;

    // 1. Navigate to '{{Otomasyon2Logout}}'
    //    Navigates the specified URL (Auto-generated)
    driver.navigate().to(ProjectParameters.Otomasyon2Logout);

    // 2. Run Method Login
    //    bireyselanabayi@otomasyon.com
    methodlogin = new MethodLogin();
    methodlogin.ApplicationURL = ApplicationURL;
    methodlogin.userName = "bireyselanabayi@otomasyon.com";
    methodlogin.password = ProjectParameters.genelPassword;
    methodlogin.execute(driver);
    currentDateTime = String.valueOf(methodlogin.currentDateTime);

    // 3. Click 'YÖNETİCİ1'
    by = By.xpath("//a[. = 'YÖNETİCİ']");
    driver.findElement(by).click();

    // 4. Click 'Daha Sonra' if it's visible
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("");
    by = By.cssSelector("#btnLater");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 5. Move mouse to 'moveUstUyeYonetimi'
    by = By.cssSelector("li[class='content']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 6. Click 'ÜYE YÖNETİMİ2'
    by = By.xpath("//li[5]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 7. Click 'ÜYE YÖNETİMİ'
    by = By.xpath("//li[1]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 8. Click 'ddYeniUyeTanimi'
    by = By.xpath("//div[2]/div/img");
    driver.findElement(by).click();

    // 9. Click 'Yeni Bayi Tanımla'
    by = By.xpath("//a[. = 'Yeni Bayi Tanımla']");
    driver.findElement(by).click();

    // 10. Type 'coklumusteritemsilcisi@c5382.altbayi' in 'Yeni Bayi Tanımla E-Posta'
    by = By.cssSelector("#Masked_Email");
    driver.findElement(by).sendKeys("coklumusteritemsilcisi@c5382.altbayi");

    // 11. Type 'C5382' in 'Bayi/Kullanıcı Adı 2'
    by = By.cssSelector("#Entity_Name");
    driver.findElement(by).sendKeys("C5382");

    // 12. Type '11111111110' in 'Vergi Numarası'
    by = By.cssSelector("#Entity_TaxNumber");
    driver.findElement(by).sendKeys("11111111110");

    // 13. Type 'Şişli' in 'Yeni Bayi Tanımla Vergi Dairesi'
    by = By.cssSelector("#Entity_TaxOffice");
    driver.findElement(by).sendKeys("Şişli");

    // 14. Type 'Bireysel Ana Bayi Müşteri Temsilcisi' in 'Müşteri Temsilcisi Textbox'
    by = By.xpath("//div[@id='tab-userinfo']//input[contains(@class, 'select2-input')]");
    driver.findElement(by).sendKeys("Bireysel Ana Bayi Müşteri Temsilcisi");

    // 15. Click 'Bireysel Ana Bayi Müşteri Temsilcisi'
    by = By.xpath("//span[. = 'Bireysel Ana Bayi Müşteri Temsilcisi']");
    driver.findElement(by).click();

    // 16. Type 'Bireysel Ana Bayi Muhasebe' in 'Müşteri Temsilcisi Textbox'
    by = By.xpath("//div[@id='tab-userinfo']//input[contains(@class, 'select2-input')]");
    driver.findElement(by).sendKeys("Bireysel Ana Bayi Muhasebe");

    // 17. Click 'Bireysel Ana Bayi Muhasebe'
    by = By.xpath("//span[. = 'Bireysel Ana Bayi Muhasebe']");
    driver.findElement(by).click();

    // 18. Run Click Until Gone
    clickUntilGone = NetahsilatUtills.clickUntilGone(30);
    by = By.xpath("//button[. = 'Tamam']");
    clickUntilGone = (NetahsilatUtills.ClickUntilGone)((ReportingDriver)driver).addons().execute(clickUntilGone, by, -1);

    // 19. Type 'Oğuzhan' in 'Entity.Surname'
    by = By.cssSelector("#Entity_Surname");
    driver.findElement(by).sendKeys("Oğuzhan");

    // 20. Type '{{password}}' in 'Entity.Password'
    by = By.cssSelector("#Entity_Password");
    driver.findElement(by).sendKeys(password);

    // 21. Type '{{password}}' in 'Entity.PasswordAgain'
    by = By.cssSelector("#Entity_PasswordAgain");
    driver.findElement(by).sendKeys(password);

    // 22. Run Click Until Gone
    clickUntilGone = NetahsilatUtills.clickUntilGone(30);
    by = By.xpath("//button[. = 'Tamam']");
    clickUntilGone = (NetahsilatUtills.ClickUntilGone)((ReportingDriver)driver).addons().execute(clickUntilGone, by, -1);

    // 23. Type 'coklumusteritemsilcisi@c5382.altbayi' in 'SearchVendorName'
    by = By.cssSelector("#SearchVendorName");
    driver.findElement(by).sendKeys("coklumusteritemsilcisi@c5382.altbayi");

    // 24. Click 'resultListelenen'
    by = By.xpath("//body/ul//div");
    driver.findElement(by).click();

    // 25. Click 'Listele'
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 26. Is 'Listele' is clickable?
    by = By.xpath("//button[. = 'Listele']");
    (new WebDriverWait(driver, 15)).until(ExpectedConditions.elementToBeClickable(by));

    // 27. Click 'edit.png'
    by = By.xpath("//img[contains(@src,'edit.png')]");
    driver.findElement(by).click();

    // 28. Is 'Bireysel Ana Bayi Müşteri Temsilcisi1' visible?
    by = By.xpath("//div[. = 'Bireysel Ana Bayi Müşteri Temsilcisi']");
    driver.findElement(by).isDisplayed();

    // 29. Is 'Bireysel Ana Bayi Muhasebe1' visible?
    by = By.xpath("//li/div[. = 'Bireysel Ana Bayi Muhasebe']");
    driver.findElement(by).isDisplayed();

    // 30. Click 'Bireysel Ana Bayi Muhasebe closeBtn'
    by = By.xpath("//div[text()='Bireysel Ana Bayi Muhasebe']/../a[@class='select2-search-choice-close']");
    driver.findElement(by).click();

    // 31. Click 'Bireysel Ana Bayi Müşteri Temsilcisi CloseBtn'
    by = By.xpath("//div[text()='Bireysel Ana Bayi Müşteri Temsilcisi']/../a[@class='select2-search-choice-close']");
    driver.findElement(by).click();

    // 32. Type 'Bireysel Ana Bayi Satış' in 'Müşteri Temsilcisi Textbox'
    by = By.xpath("//div[@id='tab-userinfo']//input[contains(@class, 'select2-input')]");
    driver.findElement(by).sendKeys("Bireysel Ana Bayi Satış");

    // 33. Click 'Bireysel Ana Bayi Satış'
    by = By.xpath("//span[. = 'Bireysel Ana Bayi Satış']");
    driver.findElement(by).click();

    // 34. Type 'Bireysel Ana Bayi Insan Kaynakları' in 'Müşteri Temsilcisi Textbox'
    by = By.xpath("//div[@id='tab-userinfo']//input[contains(@class, 'select2-input')]");
    driver.findElement(by).sendKeys("Bireysel Ana Bayi Insan Kaynakları");

    // 35. Click 'Bireysel Ana Bayi Insan Kaynakları'
    by = By.xpath("//span[. = 'Bireysel Ana Bayi Insan Kaynakları']");
    driver.findElement(by).click();

    // 36. Run Click Until Gone
    clickUntilGone = NetahsilatUtills.clickUntilGone(30);
    by = By.xpath("//button[. = 'Tamam']");
    clickUntilGone = (NetahsilatUtills.ClickUntilGone)((ReportingDriver)driver).addons().execute(clickUntilGone, by, -1);

    // 37. Click 'edit.png'
    by = By.xpath("//img[contains(@src,'edit.png')]");
    driver.findElement(by).click();

    // 38. Is 'Div Bireysel Ana Bayi Satış' visible?
    by = By.xpath("//div[. = 'Bireysel Ana Bayi Satış']");
    driver.findElement(by).isDisplayed();

    // 39. Is 'Div Bireysel Ana Bayi Insan Kaynakları' visible?
    by = By.xpath("//div[. = 'Bireysel Ana Bayi Insan Kaynakları']");
    driver.findElement(by).isDisplayed();

    // 40. Run Click Until Gone
    clickUntilGone = NetahsilatUtills.clickUntilGone(30);
    by = By.xpath("//button[. = 'Vazgeç']");
    clickUntilGone = (NetahsilatUtills.ClickUntilGone)((ReportingDriver)driver).addons().execute(clickUntilGone, by, -1);

    // 41. Click 'C15382 Trash.png'
    by = By.xpath("//td[contains(text(),'C5382')]//..//img[contains(@src,'trash.png')]");
    driver.findElement(by).click();

    // 42. Run Click Until Gone
    clickUntilGone = NetahsilatUtills.clickUntilGone(30);
    by = By.xpath("//button[. = 'Tamam']");
    clickUntilGone = (NetahsilatUtills.ClickUntilGone)((ReportingDriver)driver).addons().execute(clickUntilGone, by, -1);

    // 43. Is 'Gösterilecek Kayıt Bulunamadı.2' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    by = By.xpath("//div[3]/div/table//td[. = 'Gösterilecek Kayıt Bulunamadı.']");
    driver.findElement(by).isDisplayed();
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
    return Stream.of(Arguments.of("https://otomasyon2.netahsilatdemo.com/","Kd!cyhz4",""));
  }
}
