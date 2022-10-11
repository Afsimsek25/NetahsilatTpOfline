package netahsilat;

import io.testproject.addon.NetahsilatUtills;
import io.testproject.addon.WebExtensions;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * This class was automatically generated by TestProject
 * Project: Quality Museum Project
 * Test: C1801 Toplu Rol Atamasının sadece site kullanıcılarında gözükmesi
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Mon Oct 10 07:15:17 GMT 2022.
 */
@DisplayName("C1801 Toplu Rol Atamasının sadece site kullanıcılarında gözükmesi")
public class C1801 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C1801 Toplu Rol Atamasının sadece site kullanıcılarında gözükmesi")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password, String currentDateTime)
      throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogin methodlogin;
    WebExtensions.SelectOptionbyVisibleText selectOptionbyVisibleText;
    NetahsilatUtills.ClickUntilGone clickUntilGone;

    // 1. Navigate to '{{Otomasyon3Logout}}'
    driver.navigate().to(ProjectParameters.Otomasyon3Logout);

    // 2. Run Method Login
    //    otomasyon@test.com
    methodlogin = new MethodLogin();
    methodlogin.ApplicationURL = ApplicationURL;
    methodlogin.userName = "otomasyon@test.com";
    methodlogin.password = ProjectParameters.genelPassword;
    methodlogin.execute(driver);
    currentDateTime = String.valueOf(methodlogin.currentDateTime);

    // 3. Click 'moveToKullaniciYönetimi'
    by = By.cssSelector("li[class='user']");
    driver.findElement(by).click();

    // 4. Click 'KULLANICI YÖNETİMİ1'
    by = By.cssSelector("a[title='KULLANICI YÖNETİMİ']");
    driver.findElement(by).click();

    // 5. Click 'KULLANICI LİSTESİ'
    by = By.xpath("//a[. = 'KULLANICI LİSTESİ']");
    driver.findElement(by).click();

    // 6. Click 'Toplu Rol Gurubu Atama'
    by = By.cssSelector("#RoleGroupId");
    driver.findElement(by).click();

    // 7. Is 'En az bir kullanıcı seçmelisiniz.' visible?
    by = By.xpath("//div[. = 'En az bir kullanıcı seçmelisiniz.']");
    driver.findElement(by).isDisplayed();

    // 8. Run Click Until Gone
    clickUntilGone = NetahsilatUtills.clickUntilGone(30);
    by = By.xpath("//button[. = 'Kapat']");
    clickUntilGone = (NetahsilatUtills.ClickUntilGone)((ReportingDriver)driver).addons().execute(clickUntilGone, by, -1);

    // 9. Click 'IsSelected'
    //    her zaman ilk Checkbox'ı seç
    by = By.cssSelector("[name='IsSelected']");
    driver.findElement(by).click();

    // 10. Click 'Toplu Rol Gurubu Atama'
    by = By.cssSelector("#RoleGroupId");
    driver.findElement(by).click();

    // 11. Select options in 'RoleGroupId2' with text '[NONE]'
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Site Muhasebe");
    by = By.cssSelector("[name='RoleGroupId']");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 12. Run Click Until Gone
    clickUntilGone = NetahsilatUtills.clickUntilGone(30);
    by = By.xpath("//button[. = 'Tamam']");
    clickUntilGone = (NetahsilatUtills.ClickUntilGone)((ReportingDriver)driver).addons().execute(clickUntilGone, by, -1);

    // 13. Click 'Rol Ekle/Çıkar'
    by = By.xpath("//img[contains(@src,'user-silhouette-question.png')]");
    driver.findElement(by).click();

    // 14. Select options in 'RoleGroupId2' with text '[NONE]'
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Site Admin");
    by = By.cssSelector("[name='RoleGroupId']");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 15. Click 'Tamam'
    by = By.xpath("//button[. = 'Tamam']");
    driver.findElement(by).click();

    // 16. Navigate to '{{Otomasyon3Logout}}'
    driver.navigate().to(ProjectParameters.Otomasyon3Logout);

    // 17. Run Method Login
    //    bireyselaltbayi@otomasyon.com
    methodlogin = new MethodLogin();
    methodlogin.ApplicationURL = ApplicationURL;
    methodlogin.userName = "bireyselaltbayi@otomasyon.com";
    methodlogin.password = password;
    methodlogin.execute(driver);
    currentDateTime = String.valueOf(methodlogin.currentDateTime);

    // 18. Click 'YÖNETİCİ'
    by = By.xpath("//a[. = 'YÖNETİCİ']");
    driver.findElement(by).click();

    // 19. Click 'moveToKullaniciYönetimi'
    by = By.cssSelector("li[class='user']");
    driver.findElement(by).click();

    // 20. Click 'KULLANICI YÖNETİMİ1'
    by = By.cssSelector("a[title='KULLANICI YÖNETİMİ']");
    driver.findElement(by).click();

    // 21. Click 'KULLANICI LİSTESİ'
    by = By.xpath("//a[. = 'KULLANICI LİSTESİ']");
    driver.findElement(by).click();

    // 22. Is 'Toplu Rol Gurubu Atama' not present or invisible?
    by = By.cssSelector("#RoleGroupId");
    (new WebDriverWait(driver, 15)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));

    // 23. Navigate to '{{Otomasyon3Logout}}'
    driver.navigate().to(ProjectParameters.Otomasyon3Logout);

    // 24. Run Method Login
    //    bireyselaltbayi@otomasyon.com
    methodlogin = new MethodLogin();
    methodlogin.ApplicationURL = ApplicationURL;
    methodlogin.userName = "bireyselaltbayi@otomasyon.com";
    methodlogin.password = password;
    methodlogin.execute(driver);
    currentDateTime = String.valueOf(methodlogin.currentDateTime);

    // 25. Click 'YÖNETİCİ'
    by = By.xpath("//a[. = 'YÖNETİCİ']");
    driver.findElement(by).click();

    // 26. Click 'moveToKullaniciYönetimi'
    by = By.cssSelector("li[class='user']");
    driver.findElement(by).click();

    // 27. Click 'KULLANICI YÖNETİMİ1'
    by = By.cssSelector("a[title='KULLANICI YÖNETİMİ']");
    driver.findElement(by).click();

    // 28. Click 'KULLANICI LİSTESİ'
    by = By.xpath("//a[. = 'KULLANICI LİSTESİ']");
    driver.findElement(by).click();

    // 29. Is 'Toplu Rol Gurubu Atama' not present or invisible?
    by = By.cssSelector("#RoleGroupId");
    (new WebDriverWait(driver, 15)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));

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
    return Stream.of(Arguments.of("https://otomasyon3.netahsilatdemo.com/","otomasyon@test.com","Kd!cyhz4",""));
  }
}
