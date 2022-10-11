package netahsilat;

import io.testproject.addon.CombinedActions;
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
 * Test: C644 Adres Bilgileri Sekmesi
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Thu Oct 06 12:40:55 GMT 2022.
 */
@DisplayName("C644 Adres Bilgileri Sekmesi")
public class C644 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C644 Adres Bilgileri Sekmesi")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogoutlogin methodlogoutlogin;
    WebExtensions.SelectOptionbyVisibleText selectOptionbyVisibleText;
    CombinedActions.ClearAndTypeAction clearAndTypeAction;
    NetahsilatUtills.ClickUntilGone clickUntilGone;
    JSActions.TypeTextAction typeTextAction;

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

    // 3. Click 'moveUstUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='content']");
    driver.findElement(by).click();

    // 4. Click 'altUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[1]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 5. Run Clear 'SearchVendorName' contents and type '22185081940'
    GeneratedUtils.sleep(500);
    clearAndTypeAction = CombinedActions.clearAndTypeAction("22185081940");
    by = By.cssSelector("#SearchVendorName");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 6. Click 'Contains 22185081940'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[contains(text(),'22185081940')] ");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 7. Click 'btnListele'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 8. Is 'quality@museum.com' visible?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[. = 'quality@museum.com']");
    driver.findElement(by).isDisplayed();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 9. Click 'EditButton'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("img[src*='fugue/edit.png']");
    driver.findElement(by).click();

    // 10. Click 'AdresBilgileriButton'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("img[src*='contact.png']");
    driver.findElement(by).click();

    // 11. Run Clear 'Entity.AddressModel.Address' contents and type 'çiçek sk daire 5'
    GeneratedUtils.sleep(500);
    clearAndTypeAction = CombinedActions.clearAndTypeAction("çiçek sk daire 5");
    by = By.cssSelector("#Entity_AddressModel_Address");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 12. Select options in 'Entity.AddressModel.CityId' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Ankara");
    by = By.cssSelector("#Entity_AddressModel_CityId");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 13. Select options in 'Entity.AddressModel.DistrictId' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Çankaya");
    by = By.cssSelector("#Entity_AddressModel_DistrictId");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 14. Select options in 'Entity.AddressModel.NeighborhoodId' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Kızılay");
    by = By.cssSelector("#Entity_AddressModel_NeighborhoodId");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 15. Run Clear 'Entity.AddressModel.PostCode' contents and type '34000'
    GeneratedUtils.sleep(500);
    clearAndTypeAction = CombinedActions.clearAndTypeAction("34000");
    by = By.cssSelector("#Entity_AddressModel_PostCode");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 16. Type '5551234567' in 'Entity.ContactModel.Phone1Number'
    GeneratedUtils.sleep(500);
    typeTextAction = JSActions.typeTextAction("5551234567");
    by = By.cssSelector("#Entity_ContactModel_Phone1Number");
    typeTextAction = (JSActions.TypeTextAction)((ReportingDriver)driver).addons().execute(typeTextAction, by, -1);

    // 17. Type '5561234567' in 'Entity.ContactModel.Phone2Number'
    GeneratedUtils.sleep(500);
    typeTextAction = JSActions.typeTextAction("5561234567");
    by = By.cssSelector("#Entity_ContactModel_Phone2Number");
    typeTextAction = (JSActions.TypeTextAction)((ReportingDriver)driver).addons().execute(typeTextAction, by, -1);

    // 18. Type '5571234567' in 'Entity.ContactModel.Fax1Number'
    GeneratedUtils.sleep(500);
    typeTextAction = JSActions.typeTextAction("5571234567");
    by = By.cssSelector("#Entity_ContactModel_Fax1Number");
    typeTextAction = (JSActions.TypeTextAction)((ReportingDriver)driver).addons().execute(typeTextAction, by, -1);

    // 19. Type '5581234567' in 'Entity.VendorUser.MobilePhone'
    GeneratedUtils.sleep(500);
    typeTextAction = JSActions.typeTextAction("5581234567");
    by = By.cssSelector("#Entity_VendorUser_MobilePhone");
    typeTextAction = (JSActions.TypeTextAction)((ReportingDriver)driver).addons().execute(typeTextAction, by, -1);

    // 20. Type 'http://ecozum.com' in 'Entity.ContactModel.WebAddress'
    GeneratedUtils.sleep(500);
    typeTextAction = JSActions.typeTextAction("http://ecozum.com");
    by = By.cssSelector("#Entity_ContactModel_WebAddress");
    typeTextAction = (JSActions.TypeTextAction)((ReportingDriver)driver).addons().execute(typeTextAction, by, -1);

    // 21. Run Click Until Gone
    GeneratedUtils.sleep(500);
    clickUntilGone = NetahsilatUtills.clickUntilGone(30);
    by = By.xpath("//button[. = 'Tamam']");
    clickUntilGone = (NetahsilatUtills.ClickUntilGone)((ReportingDriver)driver).addons().execute(clickUntilGone, by, -1);

    // 22. Click 'EditButton'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("img[src*='fugue/edit.png']");
    driver.findElement(by).click();

    // 23. Click 'AdresBilgileriButton'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("img[src*='contact.png']");
    driver.findElement(by).click();

    // 24. Does 'Entity.AddressModel.Address' contain 'çiçek sk daire 5'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Entity_AddressModel_Address");
    Assertions.assertTrue(driver.findElement(by).getText().contains("çiçek sk daire 5"));

    // 25. Is 'Entity_AddressModel_CityId = Ankara' visible and selected?
    GeneratedUtils.sleep(500);
    by = By.xpath("//*[@id=\"Entity_AddressModel_CityId\"]/option[normalize-space()='Ankara']");
    (new WebDriverWait(driver, 15)).until(ExpectedConditions.elementSelectionStateToBe(by, true));

    // 26. Is 'Entity_AddressModel_DistrictId = Çankaya' visible and selected?
    GeneratedUtils.sleep(500);
    by = By.xpath("//*[@id=\"Entity_AddressModel_DistrictId\"]/option[normalize-space()='Çankaya']");
    (new WebDriverWait(driver, 15)).until(ExpectedConditions.elementSelectionStateToBe(by, true));

    // 27. Is 'Entity_AddressModel_NeighborhoodId = Kızılay' visible and selected?
    GeneratedUtils.sleep(500);
    by = By.xpath("//*[@id=\"Entity_AddressModel_NeighborhoodId\"]/option[normalize-space()='Kızılay']");
    (new WebDriverWait(driver, 15)).until(ExpectedConditions.elementSelectionStateToBe(by, true));

    // 28. Does 'Entity.AddressModel.PostCode' contain '34000'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Entity_AddressModel_PostCode");
    Assertions.assertTrue(driver.findElement(by).getText().contains("34000"));

    // 29. Does 'Entity.ContactModel.Phone1Number' contain '(555)1234567'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Entity_ContactModel_Phone1Number");
    Assertions.assertTrue(driver.findElement(by).getText().contains("(555)1234567"));

    // 30. Does 'Entity.ContactModel.Phone2Number' contain '(556)1234567'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Entity_ContactModel_Phone2Number");
    Assertions.assertTrue(driver.findElement(by).getText().contains("(556)1234567"));

    // 31. Does 'Entity.ContactModel.Fax1Number' contain '(557)1234567'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Entity_ContactModel_Fax1Number");
    Assertions.assertTrue(driver.findElement(by).getText().contains("(557)1234567"));

    // 32. Does 'Entity.VendorUser.MobilePhone' contain '(558)1234567'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Entity_VendorUser_MobilePhone");
    Assertions.assertTrue(driver.findElement(by).getText().contains("(558)1234567"));

    // 33. Does 'Entity.ContactModel.WebAddress' contain 'http://ecozum.com'?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Entity_ContactModel_WebAddress");
    Assertions.assertTrue(driver.findElement(by).getText().contains("http://ecozum.com"));

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