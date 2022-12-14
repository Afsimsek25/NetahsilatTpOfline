package netahsilat;

import io.testproject.addon.JSActions;
import io.testproject.addon.VisibleElementsOperations;
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
 * Test: C2098 Ödeme Talimat Formu - Üyeliksiz
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Fri Oct 07 11:13:35 GMT 2022.
 */
@DisplayName("C2098 Ödeme Talimat Formu - Üyeliksiz")
public class C2098 implements ExceptionsReporter {
  public static WebDriver driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new RemoteWebDriver("wThDxIHw4zNaCydjAhcfe81WrQPYlMBFI7FPwUwV8M41", new ChromeOptions(), "Ahmet Furkan SIMSEK");
  }

  /**
   * In order to upload the test to TestProject need to un-comment @ArgumentsSource and set in comment the @MethodSource
   * @org.junit.jupiter.params.provider.ArgumentsSource(io.testproject.sdk.interfaces.parameterization.TestProjectParameterizer.class) */
  @DisplayName("C2098 Ödeme Talimat Formu - Üyeliksiz")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL, String userName, String password, String kartNo, String CVV,
      String ayYil) throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    MethodLogoutlogin methodlogoutlogin;
    MethodParametrikdemesadeceKartTypeTextWithDelay methodparametrikdemesadecekarttypetextwithdelay;
    WebExtensions.SelectOptionbyVisibleText selectOptionbyVisibleText;
    JSActions.ClickAction clickAction;
    VisibleElementsOperations.ClearContentsIfVisibleWeb clearContentsIfVisibleWeb;
    VisibleElementsOperations.ClickIfVisibleWeb clickIfVisibleWeb;
    WebExtensions.SetElementAttribute setElementAttribute;

    // 1. Run Method Logout&Login
    GeneratedUtils.sleep(500);
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = ProjectParameters.genelEmail;
    methodlogoutlogin.password = ProjectParameters.genelPassword;
    methodlogoutlogin.execute(driver);

    // 2. Move mouse to 'moveToSiteYönetimi'
    by = By.cssSelector("li[class='config']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 3. Click 'moveToSiteYönetimi'
    by = By.cssSelector("li[class='config']");
    driver.findElement(by).click();

    // 4. Click 'btnParametreler'
    by = By.cssSelector("a[title='PARAMETRELER']");
    driver.findElement(by).click();

    // 5. Click 'li > a > Ödeme Talimat Formu'
    by = By.xpath("//a[normalize-space()='Ödeme Talimat Formu']");
    driver.findElement(by).click();

    // 6. Is 'editorToolbar' visible?
    by = By.xpath("//div[contains(@id,'toolbargroup') and not(contains(@id,'Locales' ))]");
    driver.findElement(by).isDisplayed();

    // 7. Select options in 'ShowPaymentInstructionFormMode' with text '[NONE]'
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    selectOptionbyVisibleText = WebExtensions.selectOptionbyVisibleText("Ödeme öncesinde gösterilsin");
    by = By.cssSelector("#ShowPaymentInstructionFormMode");
    selectOptionbyVisibleText = (WebExtensions.SelectOptionbyVisibleText)((ReportingDriver)driver).addons().execute(selectOptionbyVisibleText, by, -1);
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 8. Click 'Üyeliksiz (Unchecked) -Ödeme Talimat Formu' if it's visible
    // set step-specific timeout (will undo this at the end)
    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("");
    by = By.xpath("//label[normalize-space()='Üyeliksiz']/../..//following-sibling::div//span[@class='jquery-safari-checkbox jquery-safari-checkbox-checked']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 9. Click 'Kaydet1'
    by = By.cssSelector("#kaydet");
    driver.findElement(by).click();

    // 10. Is 'Ödeme Talimat Formu Başarıyla kaydedi...' visible?
    by = By.xpath("//li[. = 'Ödeme Talimat Formu Başarıyla kaydedildi.']");
    driver.findElement(by).isDisplayed();

    // 11. Navigate to '{{ApplicationURL}}'
    driver.navigate().to(ApplicationURL);

    // 12. Navigate to '{{UyeliksizOdemeURL}}'
    driver.navigate().to(ProjectParameters.UyeliksizOdemeURL);

    // 13. Is 'Ödeme Talimatı Oluştur Button' not present or invisible?
    by = By.xpath("//input[@type='button' and @value='ÖDEME TALİMATI OLUŞTUR']");
    (new WebDriverWait(driver, 15)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));

    // 14. Is 'payment-instruction-form' not present or invisible?
    by = By.cssSelector("#payment-instruction-form");
    (new WebDriverWait(driver, 15)).until(ExpectedConditions.invisibilityOf(driver.findElement(by)));

    // 15. Is 'btnNormalPayment' visible?
    by = By.cssSelector("#btnNormalPayment");
    driver.findElement(by).isDisplayed();

    // 16. Run Method Logout&Login
    methodlogoutlogin = new MethodLogoutlogin();
    methodlogoutlogin.ApplicationURL = ApplicationURL;
    methodlogoutlogin.userName = userName;
    methodlogoutlogin.password = password;
    methodlogoutlogin.execute(driver);

    // 17. Move mouse to 'moveToSiteYönetimi'
    by = By.cssSelector("li[class='config']");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 18. Click 'moveToSiteYönetimi'
    by = By.cssSelector("li[class='config']");
    driver.findElement(by).click();

    // 19. Click 'btnParametreler'
    by = By.cssSelector("a[title='PARAMETRELER']");
    driver.findElement(by).click();

    // 20. Click 'li > a > Ödeme Talimat Formu'
    by = By.xpath("//a[normalize-space()='Ödeme Talimat Formu']");
    driver.findElement(by).click();

    // 21. Click 'Üyeliksiz (Checked) -Ödeme Talimat Formu'
    by = By.xpath("//label[normalize-space()='Üyeliksiz']/../..//following-sibling::div//span[@class='jquery-safari-checkbox']");
    driver.findElement(by).click();

    // 22. Is 'editorToolbar' visible?
    by = By.xpath("//div[contains(@id,'toolbargroup') and not(contains(@id,'Locales' ))]");
    driver.findElement(by).isDisplayed();

    // 23. Click 'Kaydet1'
    by = By.cssSelector("#kaydet");
    driver.findElement(by).click();

    // 24. Is 'Ödeme Talimat Formu Başarıyla kaydedi...' visible?
    by = By.xpath("//li[. = 'Ödeme Talimat Formu Başarıyla kaydedildi.']");
    driver.findElement(by).isDisplayed();

    // 25. Navigate to '{{ApplicationURL}}'
    driver.navigate().to(ApplicationURL);

    // 26. Navigate to '{{UyeliksizOdemeURL}}'
    driver.navigate().to(ProjectParameters.UyeliksizOdemeURL);

    // 27. Clear the contents of 'PureAmount' if it's visible
    clearContentsIfVisibleWeb = VisibleElementsOperations.clearContentsIfVisibleWeb("");
    by = By.cssSelector("#PureAmount");
    clearContentsIfVisibleWeb = (VisibleElementsOperations.ClearContentsIfVisibleWeb)((ReportingDriver)driver).addons().execute(clearContentsIfVisibleWeb, by, -1);

    // 28. Type '100' in 'PureAmount'
    by = By.cssSelector("#PureAmount");
    driver.findElement(by).sendKeys("100");

    // 29. Run Method Parametrik Ödeme (Sadece Kart - Type text with delay)
    methodparametrikdemesadecekarttypetextwithdelay = new MethodParametrikdemesadeceKartTypeTextWithDelay();
    methodparametrikdemesadecekarttypetextwithdelay.kartNo = ProjectParameters.genelKartNo;
    methodparametrikdemesadecekarttypetextwithdelay.CVV = ProjectParameters.genelKartCVV;
    methodparametrikdemesadecekarttypetextwithdelay.ayYil = ProjectParameters.genelKartAyYil;
    methodparametrikdemesadecekarttypetextwithdelay.isim = "Odeme User";
    methodparametrikdemesadecekarttypetextwithdelay.execute(driver);

    // 30. Move mouse to 'genelOdemeTaksitSecenegi'
    by = By.xpath("(//td[contains(@class,'commRate-20')])[1]");
    (new Actions(driver)).moveToElement(driver.findElement(by)).perform();

    // 31. Click 'genelOdemeTaksitSecenegi'
    clickAction = JSActions.getClickAction();
    by = By.xpath("(//td[contains(@class,'commRate-20')])[1]");
    clickAction = (JSActions.ClickAction)((ReportingDriver)driver).addons().execute(clickAction, by, -1);

    // 32. Click 'Ödeme Talimatı Oluştur Button'
    by = By.xpath("//input[@type='button' and @value='ÖDEME TALİMATI OLUŞTUR']");
    driver.findElement(by).click();

    // 33. Is 'payment-instruction-form' visible?
    by = By.cssSelector("#payment-instruction-form");
    driver.findElement(by).isDisplayed();

    // 34. Set 'style' attribute value on 'slimScrollDiv'
    setElementAttribute = WebExtensions.setElementAttribute("style","position: relative; overflow: hidden; width: auto; height: 999px; display: block;");
    by = By.cssSelector(".slimScrollDiv");
    setElementAttribute = (WebExtensions.SetElementAttribute)((ReportingDriver)driver).addons().execute(setElementAttribute, by, -1);

    // 35. Set 'style' attribute value on 'slimScrollDiv>div'
    setElementAttribute = WebExtensions.setElementAttribute("style","padding: 15px; overflow: hidden; width: auto; height: 999px !important;");
    by = By.cssSelector(".slimScrollDiv>div");
    setElementAttribute = (WebExtensions.SetElementAttribute)((ReportingDriver)driver).addons().execute(setElementAttribute, by, -1);

    // 36. Does ': Odeme User' contain ': Odeme User'?
    by = By.xpath("//td[. = ': Odeme User']");
    Assertions.assertTrue(driver.findElement(by).getText().contains(": Odeme User"));

    // 37. Does ': 435508******4358' contain ': 435508******4358'?
    by = By.xpath("//td[. = ': 435508******4358']");
    Assertions.assertTrue(driver.findElement(by).getText().contains(": 435508******4358"));

    // 38. Does ': 100 ₺' contain ': 100 ₺'?
    by = By.xpath("//td[. = ': 100 ₺']");
    Assertions.assertTrue(driver.findElement(by).getText().contains(": 100 ₺"));

    // 39. Does ': 1' contain ': 1'?
    by = By.xpath("//td[. = ': 1']");
    Assertions.assertTrue(driver.findElement(by).getText().contains(": 1"));

    // 40. Does 'Talimat Formu - Provizyon Tutarı XPath' contain ': 100 ₺ .'?
    by = By.xpath("//td[normalize-space()='Provizyon Tutarı']//following-sibling::td[1]");
    Assertions.assertTrue(driver.findElement(by).getText().contains(": 100 ₺ ."));

    // 41. Does 'Üyeliksiz Ödeme1' contain 'Üyeliksiz Ödeme'?
    by = By.xpath("//strong[. = 'Üyeliksiz Ödeme']");
    Assertions.assertTrue(driver.findElement(by).getText().contains("Üyeliksiz Ödeme"));

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
    return Stream.of(Arguments.of("https://otomasyon.netahsilatdemo.com/Account/LogOff","otomasyon@test.com","Kd!cyhz4","","",""));
  }
}
