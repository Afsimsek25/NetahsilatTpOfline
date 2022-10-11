package netahsilat;

import io.testproject.addon.JSActions;
import io.testproject.addon.VisibleElementsOperations;
import io.testproject.sdk.drivers.ReportingDriver;
import io.testproject.sdk.interfaces.junit5.ExceptionsReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

/**
 * This class was automatically generated by TestProject
 * Project: Quality Museum Project
 * Test: Method Genel Ödeme
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Thu Sep 29 17:38:09 GMT 2022.
 */
public class MethodGeneldeme implements Test, ExceptionsReporter {
  public static WebDriver driver;

  /**
   * ApplicationURL test parameter
   */
  public String ApplicationURL = "https://otomasyon.netahsilatdemo.com/Account/LogOff";

  public void execute(WebDriver parentDriver) throws Exception {
    driver = parentDriver;
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    VisibleElementsOperations.TypeTextIfVisibleWeb typeTextIfVisibleWeb;
    JSActions.ClickAction clickAction;
    JSActions.TypeTextAction typeTextAction;

    // 1. Clear 'Kart No' contents
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#CardNumber");
    driver.findElement(by).clear();

    // 2. Type '{{AkBankKartNo}}' in 'Kart No'
    GeneratedUtils.sleep(500);
    typeTextAction = JSActions.typeTextAction(ProjectParameters.AkBankKartNo);
    by = By.cssSelector("#CardNumber");
    typeTextAction = (JSActions.TypeTextAction)((ReportingDriver)driver).addons().execute(typeTextAction, by, -1);

    // 3. Click 'Kart No'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#CardNumber");
    driver.findElement(by).click();

    // 4. Send 'ENTER' key(s)
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#CardNumber");
    (new Actions(driver)).sendKeys(GeneratedUtils.getKeys("ENTER")).build().perform();

    // 5. Clear 'Ay / Yıl' contents
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#CardExpireDate");
    driver.findElement(by).clear();

    // 6. Type '{{genelKartAyYil}}' in 'Ay / Yıl'
    GeneratedUtils.sleep(500);
    typeTextAction = JSActions.typeTextAction(ProjectParameters.genelKartAyYil);
    by = By.cssSelector("#CardExpireDate");
    typeTextAction = (JSActions.TypeTextAction)((ReportingDriver)driver).addons().execute(typeTextAction, by, -1);

    // 7. Click 'Ay / Yıl'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#CardExpireDate");
    driver.findElement(by).click();

    // 8. Click 'Ay / Yıl'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#CardExpireDate");
    driver.findElement(by).click();

    // 9. Send 'ENTER' key(s)
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#CardExpireDate");
    (new Actions(driver)).sendKeys(GeneratedUtils.getKeys("ENTER")).build().perform();

    // 10. Clear 'CVV' contents
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#CardCvv");
    driver.findElement(by).clear();

    // 11. Type '{{genelKartCVV}}' in 'CVV'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#CardCvv");
    driver.findElement(by).sendKeys(ProjectParameters.genelKartCVV);

    // 12. Type 'Quality Museum' in 'Kart Üzerindeki İsim'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#CardHolderName");
    driver.findElement(by).sendKeys("Quality Museum");

    // 13. Type '51422941570' in 'TKC' if visible
    GeneratedUtils.sleep(500);
    typeTextIfVisibleWeb = VisibleElementsOperations.typeTextIfVisibleWeb("51422941570","3");
    by = By.cssSelector("#TKC");
    typeTextIfVisibleWeb = (VisibleElementsOperations.TypeTextIfVisibleWeb)((ReportingDriver)driver).addons().execute(typeTextIfVisibleWeb, by, -1);

    // 14. Clear 'Telefon Numarası' contents
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Phone");
    driver.findElement(by).clear();

    // 15. Type '5555555123' in 'Telefon Numarası'
    GeneratedUtils.sleep(500);
    typeTextAction = JSActions.typeTextAction("5555555123");
    by = By.cssSelector("#Phone");
    typeTextAction = (JSActions.TypeTextAction)((ReportingDriver)driver).addons().execute(typeTextAction, by, -1);

    // 16. Clear 'inputEmailPricinPage' contents
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Email");
    driver.findElement(by).clear();

    // 17. Type '{{odemeEmail}}' in 'inputEmailPricinPage'
    GeneratedUtils.sleep(500);
    by = By.cssSelector("#Email");
    driver.findElement(by).sendKeys(ProjectParameters.odemeEmail);

    // 18. Type 'Quality Museum Tests' in 'TransactionDescription'
    GeneratedUtils.sleep(500);
    by = By.xpath("//*[@id=\"TransactionDescription\"]");
    driver.findElement(by).sendKeys("Quality Museum Tests");

    // 19. Click 'genelOdemeTaksitSecenegi'
    GeneratedUtils.sleep(500);
    clickAction = JSActions.getClickAction();
    by = By.xpath("(//td[contains(@class,'commRate-20')])[1]");
    clickAction = (JSActions.ClickAction)((ReportingDriver)driver).addons().execute(clickAction, by, -1);

  }

  @Override
  public ReportingDriver getDriver() {
    return (ReportingDriver) driver;
  }
}