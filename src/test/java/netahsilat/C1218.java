package netahsilat;

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
 * Test: C1218 ErpCode mükerrer olmamalı kontrol edilmeli
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Fri Oct 07 11:06:44 GMT 2022.
 */
@DisplayName("C1218 ErpCode mükerrer olmamalı kontrol edilmeli")
public class C1218 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C1218 ErpCode mükerrer olmamalı kontrol edilmeli")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password, String currentDate,
      String faturaErpKodu, String faturaNumarasi, String dokumanKodu, String odemeLinki) throws
      Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogoutlogin methodlogoutlogin;
    FileUpload.UploadFileElementAction uploadFileElementAction;

    // 1. Run Method Logout&Login
    GeneratedUtils.sleep(500);
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = ProjectParameters.genelEmail;
    methodlogoutlogin.password = ProjectParameters.genelPassword;
    methodlogoutlogin.execute(driver);

    // 2. Move mouse to 'moveCariHesapYonetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector(".accountmanagement");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 3. Click 'moveCariHesapYonetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector(".accountmanagement");
    driver.findElement(by).click();

    // 4. Click 'CARİ HESAP AKTARIMI'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'CARİ HESAP AKTARIMI']");
    driver.findElement(by).click();

    // 5. Uploads a file to a given element with the 'file' type
    //    "C:\TestProject\C1218_Cari_Hesap_Aktarım.xlsx"
    GeneratedUtils.sleep(500);
    uploadFileElementAction = FileUpload.uploadFileElementAction("C:\\TestProject\\C1218_Cari_Hesap_Aktarım.xlsx");
    by = By.cssSelector("#import");
    uploadFileElementAction = (FileUpload.UploadFileElementAction)((ReportingDriver)driver).addons().execute(uploadFileElementAction, by, -1);

    // 6. Click 'Tamam1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Tamam']");
    driver.findElement(by).click();

    // 7. Click 'Aktarımı Başlat'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Aktarımı Başlat']");
    driver.findElement(by).click();

    // 8. Does 'ErpCode boş geçilemez veya Bu ERP Kod...' contain 'ErpCode boş geçilemez veya Bu ERP Kodu'na birden fazla kayıt bulunmaktadır.: 1, Sütun : 5, Değer : sartlibbayi'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//p[. = concat('ErpCode boş geçilemez veya Bu ERP Kodu', \"'\", 'na birden fazla kayıt bulunmaktadır.: 1, Sütun : 5, Değer : sartlibbayi')]");
    Assertions.assertTrue(driver.findElement(by).getText().contains("ErpCode boş geçilemez veya Bu ERP Kodu'na birden fazla kayıt bulunmaktadır.: 1, Sütun : 5, Değer : sartlibbayi"));

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
    return Stream.of(Arguments.of("https://otomasyon.netahsilatdemo.com/Account/LogOff","otomasyon@test.com","Kd!cyhz4","","","","",""));
  }
}