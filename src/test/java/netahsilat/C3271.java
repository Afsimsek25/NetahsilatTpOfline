package netahsilat;

import io.testproject.addon.NetahsilatUtills;
import io.testproject.addon.TabActions;
import io.testproject.addon.VisibleElementsOperations;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This class was automatically generated by TestProject
 * Project: Quality Museum Project
 * Test: C3271
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Sun Oct 09 20:55:13 GMT 2022.
 */
@DisplayName("C3271")
public class C3271 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C3271")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password, String CurrentDate,
      String TwoMounthsLater) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogin methodlogin;
    String string;
    NetahsilatUtills.ClickUntilGone clickUntilGone;
    TabActions.CloseLastTab closeLastTab;
    VisibleElementsOperations.ClickIfVisibleWeb clickIfVisibleWeb;

    // 1. Navigate to '{{Otomasyon2Logout}}'
    GeneratedUtils.sleep(500);
    driver.navigate().to(ProjectParameters.Otomasyon2Logout);

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

    // 6. Type 'netahsilatotomasyon@yandex.com' in 'SearchVendorNameVN'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#SearchVendorName");
    driver.findElement(by).sendKeys("netahsilatotomasyon@yandex.com");

    // 7. Click 'resultListelenen'
    GeneratedUtils.sleep(500);
    by = By.xpath("//body/ul//div");
    driver.findElement(by).click();

    // 8. Click 'btnListele'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Listele']");
    driver.findElement(by).click();

    // 9. Is 'Refresh' visible?
    GeneratedUtils.sleep(500);
    by = By.cssSelector("a[class='t-icon t-refresh']");
    driver.findElement(by).isDisplayed();

    // 10. Click 'Ödeme1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'Ödeme']");
    driver.findElement(by).click();

    // 11. Switch to window '1'
    GeneratedUtils.sleep(500);
    driver.switchTo().window(driver.getWindowHandles().toArray(new String[0])[1]);

    // 12. Click 'Masterpass Close button' if it's visible
    GeneratedUtils.sleep(500);
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("");
    by = By.xpath("//div[@data-bind=\"visible: masterPassStep() == 'mp-update-identity'\"]//button[@type='button'][normalize-space()='×']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);

    // 13. Is 'Bireysel türk7' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//strong[. = 'Bireysel türk']");
    driver.findElement(by).isDisplayed();

    // 14. Click 'KART KAYDI LİNKİ'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'KART KAYDI LİNKİ']");
    driver.findElement(by).click();

    // 15. Click 'EmailTypeSelection (Unchecked)'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#EmailTypeSelection:not(:checked)");
    driver.findElement(by).click();

    // 16. Click 'Gönder2'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Gönder']");
    driver.findElement(by).click();

    // 17. Is 'İşleminiz başarıyla tamamlanmıştır' visible?
    GeneratedUtils.sleep(500);
    by = By.xpath("//h4[. = 'İşleminiz başarıyla tamamlanmıştır']");
    driver.findElement(by).isDisplayed();

    // 18. Switch to window '0'
    GeneratedUtils.sleep(500);
    driver.switchTo().window(driver.getWindowHandles().toArray(new String[0])[0]);

    // 19. Close the last tab opened in the browser
    GeneratedUtils.sleep(500);
    closeLastTab = TabActions.getCloseLastTab();
    closeLastTab = (TabActions.CloseLastTab)((ReportingDriver)driver).addons().execute(closeLastTab);

    // 20. Move mouse to 'moveToIslemler'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("li[class='tag']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 21. Click 'İŞLEMLER1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'İŞLEMLER']");
    driver.findElement(by).click();

    // 22. Click 'KART KAYDETME LINKI LISTELEME1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//a[. = 'Kart Kaydetme Linki Listeleme']");
    driver.findElement(by).click();

    // 23. Click 'İptal'
    GeneratedUtils.sleep(500);
    by = By.xpath("//img[contains(@src,'cross-circle.png')]");
    driver.findElement(by).click();

    // 24. Get text from 'columnIslemDurumu'
    GeneratedUtils.sleep(500);
    by = By.xpath("//div[2]//td[2]");
    string = driver.findElement(by).getAttribute("value");
    Assertions.assertTrue(string.startsWith("Bi"));

    // 25. Run Click Until Gone
    GeneratedUtils.sleep(500);
    clickUntilGone = NetahsilatUtills.clickUntilGone(30);
    by = By.xpath("//button[. = 'Tamam']");
    clickUntilGone = (NetahsilatUtills.ClickUntilGone)((ReportingDriver)driver).addons().execute(clickUntilGone, by, -1);

    // 26. Does 'İşlem İptal Edildi' contain 'İşlem İptal Edildi'?
    GeneratedUtils.sleep(500);
    by = By.xpath("(//thead[@class]//following::tbody//td[text()='İşlem İptal Edildi'])[1]");
    Assertions.assertTrue(driver.findElement(by).getText().contains("İşlem İptal Edildi"));

    // 27. Is 'islemİptalEdildiYenidenButton' not present or invisible?
    GeneratedUtils.sleep(500);
    by = By.xpath("(//td[text()='İşlem İptal Edildi']/..//td//img[@src='/NetahsilatGoldAdmin/Content/images/icons/fugue/arrow-circle.png'])[1]");
    (new WebDriverWait(driver, 15)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));

    // 28. Is 'islemİptalEdildiİptalButton' not present or invisible?
    GeneratedUtils.sleep(500);
    by = By.xpath("(//td[text()='İşlem İptal Edildi']/..//td//img[@src='/NetahsilatGoldAdmin/Content/images/icons/fugue/cross-circle.png'])");
    (new WebDriverWait(driver, 15)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));

    // 29. Click 'islemİptalEdildiİslemButonu'
    GeneratedUtils.sleep(500);
    by = By.xpath("(//td[text()='İşlem İptal Edildi']/..//td//img)[1]");
    driver.findElement(by).click();

    // 30. Is 'Gönderim Tipi' present?
    GeneratedUtils.sleep(500);
    by = By.xpath("//strong[. = 'Gönderim Tipi ']");
    driver.findElement(by);

    // 31. Is 'İstek Yapan' present?
    GeneratedUtils.sleep(500);
    by = By.xpath("//strong[. = 'İstek Yapan']");
    driver.findElement(by);

    // 32. Is 'Geçerlilik Tarihi' present?
    GeneratedUtils.sleep(500);
    by = By.xpath("//strong[. = 'Geçerlilik Tarihi']");
    driver.findElement(by);

    // 33. Is '1. Alıcı' present?
    GeneratedUtils.sleep(500);
    by = By.xpath("//strong[. = '1. Alıcı ']");
    driver.findElement(by);

    // 34. Is 'Kaydedilen Kart Sayısı' present?
    GeneratedUtils.sleep(500);
    by = By.xpath("//strong[. = 'Kaydedilen Kart Sayısı']");
    driver.findElement(by);

    // 35. Is ':EmailOrder' present?
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[. = '\n                                :EmailOrder\n                            ']");
    driver.findElement(by);

    // 36. Is ':otomasyon' present?
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[. = '\n                                :otomasyon\n                            ']");
    driver.findElement(by);

    // 37. Is 'Tarih Validate' present?
    GeneratedUtils.sleep(500);
    by = By.xpath("(//strong[text()='Geçerlilik Tarihi']/..//following::td)[1]");
    driver.findElement(by);

    // 38. Is ':Bireysel türk | netahsilatotomasyon@...' present?
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[. = ':Bireysel türk | netahsilatotomasyon@yandex.com | (555)5555555']");
    driver.findElement(by);

    // 39. Is ':0' present?
    GeneratedUtils.sleep(500);
    by = By.xpath("//td[. = '\n                                :0\n                            ']");
    driver.findElement(by);

    // 40. Click 'Kapat'
    GeneratedUtils.sleep(500);
    by = By.xpath("//button[. = 'Kapat']");
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
    return Stream.of(Arguments.of("https://otomasyon2.netahsilatdemo.com/","otomasyon@test.com","Kd!cyhz4","",""));
  }
}
