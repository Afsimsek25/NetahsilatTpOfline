package netahsilat;

import io.testproject.addon.DateTimeOperations;
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
 * Test: C3250
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Sun Oct 09 19:32:09 GMT 2022.
 */
@DisplayName("C3250")
public class C3250 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C3250")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password, String currentDate,
      String afterDate, String gridTime, String currentDate2, String afterDate2) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogin methodlogin;
    String string;
    DateTimeOperations.SetDays setDays;
    DateTimeOperations.CurrentDate cdata;

    // 1. Navigate to '{{Otomasyon3Logout}}'
    GeneratedUtils.sleep(500);
    driver.navigate().to(ProjectParameters.Otomasyon3Logout);

    // 2. Run Method Login
    GeneratedUtils.sleep(500);
    methodlogin = new MethodLogin();
    methodlogin.ApplicationURL = "https://otomasyon3.netahsilatdemo.com/";
    methodlogin.userName = ProjectParameters.genelEmail;
    methodlogin.password = ProjectParameters.genelPassword;
    methodlogin.execute(driver);

    // 3. Move mouse to 'moveUstUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='content']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 4. Click 'ustUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[4]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 5. Click 'altUyeYonetimi'
    GeneratedUtils.sleep(500);
    by = By.xpath("//li[1]/a[. = 'ÜYE YÖNETİMİ']");
    driver.findElement(by).click();

    // 6. Click 'btnListele'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 7. Type 'netahsilatotomasyon@yandex.com' in 'SearchVendorNameVN'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#SearchVendorName");
    driver.findElement(by).sendKeys("netahsilatotomasyon@yandex.com");

    // 8. Click 'SearchVendorNameVN'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#SearchVendorName");
    driver.findElement(by).click();

    // 9. Click 'resultListelenen'
    GeneratedUtils.sleep(500);
    by = By.xpath("//body/ul//div");
    driver.findElement(by).click();

    // 10. Click 'btnListele'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 11. Is 'btnListele' is clickable?
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    (new WebDriverWait(driver, 15)).until(ExpectedConditions.elementToBeClickable(by));

    // 12. Click 'Refresh'
    GeneratedUtils.sleep(500);
    by = By.xpath("//*[text()='Displaying items 1 - 1 of 1']/..//*[text()='Refresh']");
    driver.findElement(by).click();

    // 13. Click 'Ödeme1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'Ödeme']");
    driver.findElement(by).click();

    // 14. Switch to window '1'
    GeneratedUtils.sleep(500);
    driver.switchTo().window(driver.getWindowHandles().toArray(new String[0])[1]);

    // 15. Click 'KART KAYDI LİNKİ'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'KART KAYDI LİNKİ']");
    driver.findElement(by).click();

    // 16. Click 'EmailTypeSelection'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#EmailTypeSelection");
    driver.findElement(by).click();

    // 17. Click 'Gönder2'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Gönder']");
    driver.findElement(by).click();

    // 18. Get current date
    GeneratedUtils.sleep(500);
    cdata = DateTimeOperations.currentDate("dd.MM.yyyy HH:mm");
    cdata = (DateTimeOperations.CurrentDate)((ReportingDriver)driver).addons().execute(cdata);


    // 19. Switch to window '0'
    GeneratedUtils.sleep(500);
    driver.switchTo().window(driver.getWindowHandles().toArray(new String[0])[0]);

    // 20. Set '59' days to '{{currentDate}}'
    GeneratedUtils.sleep(500);
    setDays = DateTimeOperations.setDays("59",currentDate,"dd.MM.yyyy H:mm","dd.MM.yyyy H:mm");
    setDays = (DateTimeOperations.SetDays)((ReportingDriver)driver).addons().execute(setDays);
    afterDate = String.valueOf(setDays.result);

    // 21. Move mouse to 'moveToIslemler'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='tag']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 22. Click 'İŞLEMLER1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'İŞLEMLER']");
    driver.findElement(by).click();

    // 23. Click 'KART KAYDETME LINKI LISTELEME1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'Kart Kaydetme Linki Listeleme']");
    driver.findElement(by).click();

    // 24. Get text from 'currentDateTime'
    GeneratedUtils.sleep(500);
    by = By.xpath("//colgroup//following-sibling::thead//following-sibling::tbody//tr[1]//td[3]");
    string = driver.findElement(by).getAttribute("value");
    Assertions.assertTrue(string.startsWith(currentDate));

    // 25. Get text from 'afterDateTime'
    GeneratedUtils.sleep(500);
    by = By.xpath("//colgroup//following-sibling::thead//following-sibling::tbody//tr[1]//td[7]");
    string = driver.findElement(by).getAttribute("value");
    afterDate = String.valueOf(string);

    // 26. Click 'SonIstekGonderildiYenidenButton'
    GeneratedUtils.sleep(500);
    by = By.xpath("//colgroup//following-sibling::thead//following-sibling::tbody//tr[1]//td//a[@title='Yeniden']");
    driver.findElement(by).click();

    // 27. Get current date
    GeneratedUtils.sleep(500);
    cdata = DateTimeOperations.currentDate("dd.MM.yyyy HH:mm");
    cdata = (DateTimeOperations.CurrentDate)((ReportingDriver)driver).addons().execute(cdata);

    // 28. Click 'Tamam1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Tamam']");
    driver.findElement(by).click();

    // 29. Set '59' days to '{{currentDate2}}'
    GeneratedUtils.sleep(500);
    setDays = DateTimeOperations.setDays("59",currentDate2,"dd.MM.yyyy H:mm","dd.MM.yyyy H:mm");
    setDays = (DateTimeOperations.SetDays)((ReportingDriver)driver).addons().execute(setDays);
    afterDate2 = String.valueOf(setDays.result);

    // 30. Get text from 'currentDateTime'
    //    Bu stepte hata aldıysan eğer dakika farkından dolayıdır.
    GeneratedUtils.sleep(500);
    by = By.xpath("//colgroup//following-sibling::thead//following-sibling::tbody//tr[1]//td[3]");
    string = driver.findElement(by).getAttribute("value");
    Assertions.assertTrue(string.startsWith(currentDate2));

    // 31. Get text from 'afterDateTime'
    GeneratedUtils.sleep(500);
    by = By.xpath("//colgroup//following-sibling::thead//following-sibling::tbody//tr[1]//td[7]");
    string = driver.findElement(by).getAttribute("value");
    afterDate2 = String.valueOf(string);

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
    return Stream.of(Arguments.of("https://otomasyon3.netahsilatdemo.com/","otomasyon@test.com","Kd!cyhz4","","","","",""));
  }
}
