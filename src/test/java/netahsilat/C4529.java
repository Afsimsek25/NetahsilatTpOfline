package netahsilat;

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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * This class was automatically generated by TestProject
 * Project: Quality Museum Project
 * Test: C4529 Rol Grubu Atama - Bayi Yetkisi
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Mon Oct 10 07:14:00 GMT 2022.
 */
@DisplayName("C4529 Rol Grubu Atama - Bayi Yetkisi")
public class C4529 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C4529 Rol Grubu Atama - Bayi Yetkisi")
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

    // 1. Navigate to '{{Otomasyon3Logout}}'
    driver.navigate().to(ProjectParameters.Otomasyon3Logout);

    // 2. Run Method Login
    methodlogin = new MethodLogin();
    methodlogin.ApplicationURL = ApplicationURL;
    methodlogin.userName = "otomasyon@test.com";
    methodlogin.password = ProjectParameters.genelPassword;
    methodlogin.execute(driver);
    currentDateTime = String.valueOf(methodlogin.currentDateTime);

    // 3. Move mouse to 'moveUstUyeYonetimi'
    by = By.cssSelector("li[class='content']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 4. Click 'ustUyeYonetimi2'
    by = By.xpath("//li/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 5. Click 'altUyeYonetimi'
    by = By.xpath("//li[1]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 6. Type 'bayiyetkikontrol@test.com' in 'SearchUserName'
    by = By.cssSelector("#SearchUserName");
    driver.findElement(by).sendKeys("bayiyetkikontrol@test.com");

    // 7. Click 'resultListelenen'
    by = By.xpath("//body/ul//div");
    driver.findElement(by).click();

    // 8. Click 'Listele'
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 9. Is 'Listele' is clickable?
    by = By.xpath("//button[. = 'Listele']");
    (new WebDriverWait(driver, 15)).until(ExpectedConditions.elementToBeClickable(by));

    // 10. Click 'KullanıcılarıGörüntüleImage'
    by = By.cssSelector("img[src*='fugue/detail.png']");
    driver.findElement(by).click();

    // 11. Click 'Ye**** Ye**** Ko**** Rol Ekle/Çıkar img'
    by = By.xpath("//td[text()='Ye**** Ye**** Ko****']//..//img[contains(@src,'user-silhouette-question')]");
    driver.findElement(by).click();

    // 12. Select options in 'RoleGroupId1' with text '[NONE]'
    //    TestBayi Yetki Silmeyiniz
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("TestBayi Yetki Silmeyiniz");
    by = By.cssSelector("#roleGroupId");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 13. Click 'Tamam'
    by = By.xpath("//button[. = 'Tamam']");
    driver.findElement(by).click();

    // 14. Is 'Rol Ekle/Çıkar Section' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(6519, TimeUnit.MILLISECONDS);
    by = By.xpath("//div[@id='modal']//div[@id='partialView']");
    (new WebDriverWait(driver, 6)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 15. Navigate to '{{Otomasyon3Logout}}'
    driver.navigate().to(ProjectParameters.Otomasyon3Logout);

    // 16. Run Method Login
    //    bayiyetkikontrol@test.com
    methodlogin = new MethodLogin();
    methodlogin.ApplicationURL = ApplicationURL;
    methodlogin.userName = "bayiyetkikontrol@test.com";
    methodlogin.password = password;
    methodlogin.execute(driver);
    currentDateTime = String.valueOf(methodlogin.currentDateTime);

    // 17. Click 'YÖNETİCİ'
    by = By.xpath("//a[. = 'YÖNETİCİ']");
    driver.findElement(by).click();

    // 18. Is 'İŞLEMLER' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    by = By.cssSelector("a[title='İŞLEMLER']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 19. Move mouse to 'moveUstUyeYonetimi'
    by = By.cssSelector("li[class='content']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 20. Click 'ÜYE YÖNETİMİ'
    by = By.xpath("//li[4]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 21. Is 'ÖDEME LİNKİ' not present or invisible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    by = By.xpath("//a[. = 'ÖDEME LİNKİ']");
    (new WebDriverWait(driver, 2)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 22. Navigate to '{{Otomasyon3Logout}}'
    driver.navigate().to(ProjectParameters.Otomasyon3Logout);

    // 23. Run Method Login
    //    otomasyon@test.com
    methodlogin = new MethodLogin();
    methodlogin.ApplicationURL = ApplicationURL;
    methodlogin.userName = "otomasyon@test.com";
    methodlogin.password = password;
    methodlogin.execute(driver);
    currentDateTime = String.valueOf(methodlogin.currentDateTime);

    // 24. Move mouse to 'moveUstUyeYonetimi'
    by = By.cssSelector("li[class='content']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 25. Click 'ustUyeYonetimi2'
    by = By.xpath("//li/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 26. Click 'altUyeYonetimi'
    by = By.xpath("//li[1]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 27. Type 'bayiyetkikontrol@test.com' in 'SearchUserName'
    by = By.cssSelector("#SearchUserName");
    driver.findElement(by).sendKeys("bayiyetkikontrol@test.com");

    // 28. Click 'resultListelenen'
    by = By.xpath("//body/ul//div");
    driver.findElement(by).click();

    // 29. Click 'Listele'
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 30. Is 'Listele' is clickable?
    by = By.xpath("//button[. = 'Listele']");
    (new WebDriverWait(driver, 15)).until(ExpectedConditions.elementToBeClickable(by));

    // 31. Click 'KullanıcılarıGörüntüleImage'
    by = By.cssSelector("img[src*='fugue/detail.png']");
    driver.findElement(by).click();

    // 32. Click 'Ye**** Ye**** Ko**** Rol Ekle/Çıkar img'
    by = By.xpath("//td[text()='Ye**** Ye**** Ko****']//..//img[contains(@src,'user-silhouette-question')]");
    driver.findElement(by).click();

    // 33. Select options in 'RoleGroupId1' with text '[NONE]'
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Bayi Admin");
    by = By.cssSelector("#roleGroupId");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 34. Click 'Tamam'
    //    BtnTamam 
    by = By.xpath("//button[. = 'Tamam']");
    driver.findElement(by).click();

    // 35. Is 'Rol Ekle/Çıkar Section' not present or invisible?
    by = By.xpath("//div[@id='modal']//div[@id='partialView']");
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