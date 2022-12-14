package netahsilat;

import io.testproject.addon.CombinedActions;
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
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * This class was automatically generated by TestProject
 * Project: Quality Museum Project
 * Test: C5234 Müşteri olarak giriş yapılıp kendi bilgileri güncelleniyor mu ?
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Mon Oct 10 06:56:05 GMT 2022.
 */
@DisplayName("C5234 Müşteri olarak giriş yapılıp kendi bilgileri güncelleniyor mu ?")
public class C5234 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C5234 Müşteri olarak giriş yapılıp kendi bilgileri güncelleniyor mu ?")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String password) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogin methodlogin;
    MethodLogoutlogin methodlogoutlogin;
    WebExtensions.SelectOptionbyVisibleText selectOptionbyVisibleText;
    CombinedActions.ClearAndTypeAction clearAndTypeAction;

    // 1. Run Method Logout&Login
    GeneratedUtils.sleep(500);
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ProjectParameters.Otomasyon2Logout;
    methodlogoutlogin.userName = "musteriguncellenecek@test.com  ";
    methodlogoutlogin.password = ProjectParameters.genelPassword;
    methodlogoutlogin.execute(driver);

    // 2. Is 'Bilgi Güncelle' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'Bilgi Güncelle']");
    driver.findElement(by).isDisplayed();

    // 3. Click 'Bilgi Güncelle'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'Bilgi Güncelle']");
    driver.findElement(by).click();

    // 4. Run Clear 'Name' contents and type 'C5234 Müşteri1'
    GeneratedUtils.sleep(500);
    clearAndTypeAction = CombinedActions.clearAndTypeAction("C5234 Müşteri1");
    by = By.cssSelector("#Name");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 5. Run Clear 'Surname' contents and type 'güncellendi'
    GeneratedUtils.sleep(500);
    clearAndTypeAction = CombinedActions.clearAndTypeAction("güncellendi");
    by = By.cssSelector("#Surname");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 6. Run Clear 'ContactModel_Phone1Number' contents and type '5000000001'
    GeneratedUtils.sleep(500);
    clearAndTypeAction = CombinedActions.clearAndTypeAction("5000000001");
    by = By.cssSelector("#ContactModel_Phone1Number");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 7. Run Clear 'ContactModel_Phone2Number' contents and type '5400000001'
    GeneratedUtils.sleep(500);
    clearAndTypeAction = CombinedActions.clearAndTypeAction("5400000001");
    by = By.cssSelector("#ContactModel_Phone2Number");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 8. Run Clear 'ContactModel_Fax1Number' contents and type '5111111112'
    GeneratedUtils.sleep(500);
    clearAndTypeAction = CombinedActions.clearAndTypeAction("5111111112");
    by = By.cssSelector("#ContactModel_Fax1Number");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 9. Run Clear 'ContactModel_GsmNumber' contents and type '5222222223'
    GeneratedUtils.sleep(500);
    clearAndTypeAction = CombinedActions.clearAndTypeAction("5222222223");
    by = By.cssSelector("#ContactModel_GsmNumber");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 10. Click 'Kurumsal'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#lblIsCompanyCompany");
    driver.findElement(by).click();

    // 11. Type 'C5234 Müşteri1' in 'CompanyName'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#CompanyName");
    driver.findElement(by).sendKeys("C5234 Müşteri1");

    // 12. Type 'Kartal' in 'TaxOffice'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#TaxOffice");
    driver.findElement(by).sendKeys("Kartal");

    // 13. Type '2829127518' in 'TaxNumber'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#TaxNumber");
    driver.findElement(by).sendKeys("2829127518");

    // 14. Run Clear 'Email1' contents and type 'musteriguncellendi@test.com'
    GeneratedUtils.sleep(500);
    clearAndTypeAction = CombinedActions.clearAndTypeAction("musteriguncellendi@test.com");
    by = By.cssSelector("#Email");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 15. Run Clear 'AddressModel_Address' contents and type 'meram/konya'
    GeneratedUtils.sleep(500);
    clearAndTypeAction = CombinedActions.clearAndTypeAction("meram/konya");
    by = By.cssSelector("#AddressModel_Address");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 16. Select the '42' option in 'AddressModel_CityId'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#AddressModel_CityId");
    (new Select(driver.findElement(by))).selectByValue("42");

    // 17. Select the '868' option in 'AddressModel_DistrictId'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#AddressModel_DistrictId");
    (new Select(driver.findElement(by))).selectByValue("868");

    // 18. Select options in 'AddressModel_NeighborhoodId' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Meram");
    by = By.cssSelector("#AddressModel_NeighborhoodId");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 19. Type 'Kd!cyhz4' in 'OldPassword'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#OldPassword");
    driver.findElement(by).sendKeys("Kd!cyhz4");

    // 20. Type 'Kd!cyhz41' in 'Password1'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Password");
    driver.findElement(by).sendKeys("Kd!cyhz41");

    // 21. Type 'Kd!cyhz41' in 'RePassword'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#RePassword");
    driver.findElement(by).sendKeys("Kd!cyhz41");

    // 22. Click 'KaydetMusteri'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("input[value='KAYDET']");
    driver.findElement(by).click();

    // 23. Run Method Login
    GeneratedUtils.sleep(500);
    methodlogin = new MethodLogin();
    methodlogin.ApplicationURL = ApplicationURL;
    methodlogin.userName = "musteriguncellendi@test.com";
    methodlogin.password = String.format("%s1",password);
    methodlogin.execute(driver);

    // 24. Click 'Bilgi Güncelle'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'Bilgi Güncelle']");
    driver.findElement(by).click();

    // 25. Does 'Name' contain 'C5234 Müşteri1'?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(35000, TimeUnit.MILLISECONDS);
    by = By.cssSelector("#Name");
    Assertions.assertTrue(driver.findElement(by).getText().contains("C5234 Müşteri1"));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 26. Does 'ContactModel_Phone1Number' contain '(500)0000001'?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    by = By.cssSelector("#ContactModel_Phone1Number");
    Assertions.assertTrue(driver.findElement(by).getText().contains("(500)0000001"));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 27. Does 'Surname' contain 'güncellendi'?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    by = By.cssSelector("#Surname");
    Assertions.assertTrue(driver.findElement(by).getText().contains("güncellendi"));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 28. Does 'ContactModel_Phone2Number' contain '(540)0000001'?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    by = By.cssSelector("#ContactModel_Phone2Number");
    Assertions.assertTrue(driver.findElement(by).getText().contains("(540)0000001"));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 29. Click 'Kurumsal'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    by = By.cssSelector("#lblIsCompanyCompany");
    driver.findElement(by).click();
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 30. Does 'ContactModel_Fax1Number' contain '(511)1111112'?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    by = By.cssSelector("#ContactModel_Fax1Number");
    Assertions.assertTrue(driver.findElement(by).getText().contains("(511)1111112"));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 31. Does 'CompanyName' contain 'C5234 Müşteri1'?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    by = By.cssSelector("#CompanyName");
    Assertions.assertTrue(driver.findElement(by).getText().contains("C5234 Müşteri1"));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 32. Does 'ContactModel_GsmNumber' contain '(522)2222223'?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    by = By.cssSelector("#ContactModel_GsmNumber");
    Assertions.assertTrue(driver.findElement(by).getText().contains("(522)2222223"));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 33. Does 'TaxOffice' contain 'Kartal'?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    by = By.cssSelector("#TaxOffice");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Kartal"));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 34. Does 'AddressModel_Address' contain 'meram/konya'?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    by = By.cssSelector("#AddressModel_Address");
    Assertions.assertTrue(driver.findElement(by).getText().contains("meram/konya"));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 35. Does 'TaxNumber' contain '2829127518'?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    by = By.cssSelector("#TaxNumber");
    Assertions.assertTrue(driver.findElement(by).getText().contains("2829127518"));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 36. Does 'AddressModel_CityId' contain 'Konya'?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    by = By.cssSelector("#AddressModel_CityId");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Konya"));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 37. Does 'Email1' contain 'musteriguncellendi@test.com'?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    by = By.cssSelector("#Email");
    Assertions.assertTrue(driver.findElement(by).getText().contains("musteriguncellendi@test.com"));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 38. Does 'AddressModel_DistrictId' contain 'Meram'?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    by = By.cssSelector("#AddressModel_DistrictId");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Meram"));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 39. Does 'AddressModel_NeighborhoodId' contain 'Meram'?
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(25000, TimeUnit.MILLISECONDS);
    by = By.cssSelector("#AddressModel_NeighborhoodId");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Meram"));
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 40. Run Clear 'Name' contents and type 'C5234 Müşteri'
    GeneratedUtils.sleep(500);
    clearAndTypeAction = CombinedActions.clearAndTypeAction("C5234 Müşteri");
    by = By.cssSelector("#Name");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 41. Run Clear 'Surname' contents and type 'güncellenecek'
    GeneratedUtils.sleep(500);
    clearAndTypeAction = CombinedActions.clearAndTypeAction("güncellenecek");
    by = By.cssSelector("#Surname");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 42. Run Clear 'ContactModel_Phone1Number' contents and type '5000000000'
    GeneratedUtils.sleep(500);
    clearAndTypeAction = CombinedActions.clearAndTypeAction("5000000000");
    by = By.cssSelector("#ContactModel_Phone1Number");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 43. Run Clear 'ContactModel_Phone2Number' contents and type '5400000000'
    GeneratedUtils.sleep(500);
    clearAndTypeAction = CombinedActions.clearAndTypeAction("5400000000");
    by = By.cssSelector("#ContactModel_Phone2Number");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 44. Run Clear 'ContactModel_Fax1Number' contents and type '5111111111'
    GeneratedUtils.sleep(500);
    clearAndTypeAction = CombinedActions.clearAndTypeAction("5111111111");
    by = By.cssSelector("#ContactModel_Fax1Number");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 45. Run Clear 'ContactModel_GsmNumber' contents and type '5222222222'
    GeneratedUtils.sleep(500);
    clearAndTypeAction = CombinedActions.clearAndTypeAction("5222222222");
    by = By.cssSelector("#ContactModel_GsmNumber");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 46. Click 'Bireysel'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#lblIsCompanyIndividual");
    driver.findElement(by).click();

    // 47. Run Clear 'Tckn' contents and type '81565940222'
    GeneratedUtils.sleep(500);
    clearAndTypeAction = CombinedActions.clearAndTypeAction("81565940222");
    by = By.cssSelector("#Tckn");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 48. Run Clear 'Email1' contents and type 'musteriguncellenecek@test.com'
    GeneratedUtils.sleep(500);
    clearAndTypeAction = CombinedActions.clearAndTypeAction("musteriguncellenecek@test.com");
    by = By.cssSelector("#Email");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 49. Run Clear 'AddressModel_Address' contents and type 'kartal/İstanbul'
    GeneratedUtils.sleep(500);
    clearAndTypeAction = CombinedActions.clearAndTypeAction("kartal/İstanbul");
    by = By.cssSelector("#AddressModel_Address");
    clearAndTypeAction = (CombinedActions.ClearAndTypeAction)((ReportingDriver)driver).addons().execute(clearAndTypeAction, by, -1);

    // 50. Select the '34' option in 'AddressModel_CityId'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#AddressModel_CityId");
    (new Select(driver.findElement(by))).selectByValue("34");

    // 51. Select the '118' option in 'AddressModel_DistrictId'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#AddressModel_DistrictId");
    (new Select(driver.findElement(by))).selectByValue("118");

    // 52. Select options in 'AddressModel_NeighborhoodId' with text '[NONE]'
    GeneratedUtils.sleep(500);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Kartal");
    by = By.cssSelector("#AddressModel_NeighborhoodId");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);

    // 53. Type 'Kd!cyhz41' in 'OldPassword'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#OldPassword");
    driver.findElement(by).sendKeys("Kd!cyhz41");

    // 54. Type 'Kd!cyhz4' in 'Password1'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Password");
    driver.findElement(by).sendKeys("Kd!cyhz4");

    // 55. Type 'Kd!cyhz4' in 'RePassword'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#RePassword");
    driver.findElement(by).sendKeys("Kd!cyhz4");

    // 56. Click 'KaydetMusteri'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("input[value='KAYDET']");
    driver.findElement(by).click();

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
    return Stream.of(Arguments.of("https://otomasyon2.netahsilatdemo.com/","Kd!cyhz4"));
  }
}
