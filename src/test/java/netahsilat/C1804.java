package netahsilat;

import io.testproject.addon.GridOperations;
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
 * Test: C1804 Bayi kullanıcıları tarafından açılan Alt bayi gruplarına alt bayi kullanıcılarının müdahale edememesi
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Tue Oct 11 07:21:30 GMT 2022.
 */
@DisplayName("C1804 Bayi kullanıcıları tarafından açılan Alt bayi gruplarına alt bayi kullanıcılarının müdahale edememesi")
public class C1804 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C1804 Bayi kullanıcıları tarafından açılan Alt bayi gruplarına alt bayi kullanıcılarının müdahale edememesi")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password, String currentDateTime,
      String RolName) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogin methodlogin;
    WebExtensions.SelectOptionbyVisibleText selectOptionbyVisibleText;
    WebExtensions.GetElementAttribute getElementAttribute;
    GridOperations.GetData getData;

    // 1. Navigate to '{{Otomasyon3Logout}}'
    GeneratedUtils.sleep(500);
    driver.navigate().to(ProjectParameters.Otomasyon3Logout);

    // 2. Run Method Login
    //    bireyselaltbayi@otomasyon.com
    GeneratedUtils.sleep(500);
    methodlogin = new MethodLogin();
    methodlogin.ApplicationURL = ApplicationURL;
    methodlogin.userName = "bireyselaltbayi@otomasyon.com";
    methodlogin.password = ProjectParameters.genelPassword;
    methodlogin.execute(driver);
    currentDateTime = String.valueOf(methodlogin.currentDateTime);

    // 3. Click 'YÖNETİCİ'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'YÖNETİCİ']");
    driver.findElement(by).click();

    // 4. Click 'moveToKullaniciYönetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='user']");
    driver.findElement(by).click();

    // 5. Click 'KULLANICI YÖNETİMİ1'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[title='KULLANICI YÖNETİMİ']");
    driver.findElement(by).click();

    // 6. Click 'ROL YÖNETİMİ'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'ROL YÖNETİMİ']");
    driver.findElement(by).click();

    // 7. Select options in 'InsertedUserTypeId' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Site Yetkisi");
    by = By.cssSelector("#InsertedUserTypeId");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 8. Is 'Listele' is clickable?
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    (new WebDriverWait(driver, 15)).until(ExpectedConditions.elementToBeClickable(by));

    // 9. Run Get Data From Grid
    GeneratedUtils.sleep(500);
    getData = GridOperations.getData("Ekleyen Kullanıcı Tipi","Site","Equals");
    getData = (GridOperations.GetData)((ReportingDriver)driver).addons().execute(getData);

    // 10. Get 'style' attribute value on 'edit.png'
    //    Disabled olduğunun validate edilmesi
    GeneratedUtils.sleep(500);
    getElementAttribute = WebExtensions.getElementAttribute("style");
    by = By.xpath("//img[contains(@src,'edit.png')]");
    getElementAttribute = (WebExtensions.GetElementAttribute)((ReportingDriver)driver).addons().execute(getElementAttribute, by, -1);

    // 11. Get 'style' attribute value on 'Trash.png'
    //    Disabled olduğunun validate edilmesi
    GeneratedUtils.sleep(500);
    getElementAttribute = WebExtensions.getElementAttribute("style");
    by = By.xpath("//img[contains(@src,'trash.png')]");
    getElementAttribute = (WebExtensions.GetElementAttribute)((ReportingDriver)driver).addons().execute(getElementAttribute, by, -1);

    // 12. Select options in 'InsertedUserTypeId' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Bayi Yetkisi");
    by = By.cssSelector("#InsertedUserTypeId");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 13. Run Get Data From Grid
    GeneratedUtils.sleep(500);
    getData = GridOperations.getData("Ekleyen Kullanıcı Tipi","Bayi","Equals");
    getData = (GridOperations.GetData)((ReportingDriver)driver).addons().execute(getData);

    // 14. Get 'style' attribute value on 'edit.png'
    //    Disabled olduğunun validate edilmesi
    GeneratedUtils.sleep(500);
    getElementAttribute = WebExtensions.getElementAttribute("style");
    by = By.xpath("//img[contains(@src,'edit.png')]");
    getElementAttribute = (WebExtensions.GetElementAttribute)((ReportingDriver)driver).addons().execute(getElementAttribute, by, -1);

    // 15. Get 'style' attribute value on 'Trash.png'
    //    Disabled olduğunun validate edilmesi
    GeneratedUtils.sleep(500);
    getElementAttribute = WebExtensions.getElementAttribute("style");
    by = By.xpath("//img[contains(@src,'trash.png')]");
    getElementAttribute = (WebExtensions.GetElementAttribute)((ReportingDriver)driver).addons().execute(getElementAttribute, by, -1);

    // 16. Select options in 'InsertedUserTypeId' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Hepsi");
    by = By.cssSelector("#InsertedUserTypeId");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 17. Select options in 'RoleGroupId' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Alt Bayi Admin");
    by = By.cssSelector("#RoleGroupId");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 18. Run Get Data From Grid
    GeneratedUtils.sleep(500);
    getData = GridOperations.getData("Ekleyen Kullanıcı Tipi","Default","Equals");
    getData = (GridOperations.GetData)((ReportingDriver)driver).addons().execute(getData);

    // 19. Get 'style' attribute value on 'edit.png'
    //    Disabled olduğunun validate edilmesi
    GeneratedUtils.sleep(500);
    getElementAttribute = WebExtensions.getElementAttribute("style");
    by = By.xpath("//img[contains(@src,'edit.png')]");
    getElementAttribute = (WebExtensions.GetElementAttribute)((ReportingDriver)driver).addons().execute(getElementAttribute, by, -1);

    // 20. Get 'style' attribute value on 'Trash.png'
    //    Disabled olduğunun validate edilmesi
    GeneratedUtils.sleep(500);
    getElementAttribute = WebExtensions.getElementAttribute("style");
    by = By.xpath("//img[contains(@src,'trash.png')]");
    getElementAttribute = (WebExtensions.GetElementAttribute)((ReportingDriver)driver).addons().execute(getElementAttribute, by, -1);

    // 21. Select options in 'RoleGroupId' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Hepsi");
    by = By.cssSelector("#RoleGroupId");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 22. Select options in 'InsertedUserTypeId' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Alt Bayi Yetkisi");
    by = By.cssSelector("#InsertedUserTypeId");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 23. Run Get Data From Grid
    GeneratedUtils.sleep(500);
    getData = GridOperations.getData("Ekleyen Kullanıcı Tipi","AltBayi","Equals");
    getData = (GridOperations.GetData)((ReportingDriver)driver).addons().execute(getData);

    // 24. Run Get Data From Grid
    GeneratedUtils.sleep(500);
    getData = GridOperations.getData("Bayi/Kullanıcı Adı","Bireysel Ana Bayi (Silmeyiniz-Değiştirmeyiniz)","Equals");
    getData = (GridOperations.GetData)((ReportingDriver)driver).addons().execute(getData);

    // 25. Run Get Data From Grid
    GeneratedUtils.sleep(500);
    getData = GridOperations.getData("Alt bayi","Bireysel Alt Bayi (Silmeyiniz-Değiştirmeyiniz)","Equals");
    getData = (GridOperations.GetData)((ReportingDriver)driver).addons().execute(getData);

    // 26. Get 'style' attribute value on 'Trash.png'
    //    enable olduğunun validate edilmesi
    GeneratedUtils.sleep(500);
    getElementAttribute = WebExtensions.getElementAttribute("style");
    by = By.xpath("//img[contains(@src,'trash.png')]");
    getElementAttribute = (WebExtensions.GetElementAttribute)((ReportingDriver)driver).addons().execute(getElementAttribute, by, -1);

    // 27. Get 'style' attribute value on 'edit.png'
    //    enable olduğunun validate edilmesi
    GeneratedUtils.sleep(500);
    getElementAttribute = WebExtensions.getElementAttribute("style");
    by = By.xpath("//img[contains(@src,'edit.png')]");
    getElementAttribute = (WebExtensions.GetElementAttribute)((ReportingDriver)driver).addons().execute(getElementAttribute, by, -1);

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
    return Stream.of(Arguments.of("https://otomasyon3.netahsilatdemo.com/","otomasyon@test.com","Kd!cyhz4","",""));
  }
}
