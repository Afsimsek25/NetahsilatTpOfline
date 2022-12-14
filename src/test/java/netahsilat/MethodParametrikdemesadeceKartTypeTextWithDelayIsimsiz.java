package netahsilat;

import io.testproject.addon.JSActions;
import io.testproject.addon.TypeTextSlowly;
import io.testproject.sdk.drivers.ReportingDriver;
import io.testproject.sdk.interfaces.junit5.ExceptionsReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * This class was automatically generated by TestProject
 * Project: Quality Museum Project
 * Test: Method Parametrik Ödeme (Sadece Kart - Type text with delay)  - İsimsiz
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Fri Oct 07 07:51:01 GMT 2022.
 */
public class MethodParametrikdemesadeceKartTypeTextWithDelayIsimsiz implements Test, ExceptionsReporter {
  public static WebDriver driver;

  /**
   * kartNo test parameter
   */
  public String kartNo = "4355084355084358";

  /**
   * CVV test parameter
   */
  public String CVV = "000";

  /**
   * ayYil test parameter
   */
  public String ayYil = "12/26";

  /**
   * adSoyad test parameter
   */
  public String adSoyad = "Test Kartı";

  public void execute(WebDriver parentDriver) throws Exception {
    driver = parentDriver;
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    JSActions.ClickAction clickAction;
    TypeTextSlowly.TypeTextWithControlledSpeed typeTextWithControlledSpeed;

    // 1. Clear 'Kart Üzerindeki İsim' contents
    by = By.cssSelector("#CardHolderName");
    driver.findElement(by).clear();

    // 2. Type text to a TextField element with a delay between characters.
    typeTextWithControlledSpeed = TypeTextSlowly.typeTextWithControlledSpeed(adSoyad,0);
    by = By.cssSelector("#CardHolderName");
    typeTextWithControlledSpeed = (TypeTextSlowly.TypeTextWithControlledSpeed)((ReportingDriver)driver).addons().execute(typeTextWithControlledSpeed, by, -1);

    // 3. Clear 'Kart No' contents
    by = By.cssSelector("#CardNumber");
    driver.findElement(by).clear();

    // 4. Type text to a TextField element with a delay between characters.
    GeneratedUtils.sleep(500);
    typeTextWithControlledSpeed = TypeTextSlowly.typeTextWithControlledSpeed(kartNo,0);
    by = By.cssSelector("#CardNumber");
    typeTextWithControlledSpeed = (TypeTextSlowly.TypeTextWithControlledSpeed)((ReportingDriver)driver).addons().execute(typeTextWithControlledSpeed, by, -1);

    // 5. Clear 'Ay / Yıl' contents
    by = By.cssSelector("#CardExpireDate");
    driver.findElement(by).clear();

    // 6. Type text to a TextField element with a delay between characters.
    typeTextWithControlledSpeed = TypeTextSlowly.typeTextWithControlledSpeed(ayYil,0);
    by = By.cssSelector("#CardExpireDate");
    typeTextWithControlledSpeed = (TypeTextSlowly.TypeTextWithControlledSpeed)((ReportingDriver)driver).addons().execute(typeTextWithControlledSpeed, by, -1);

    // 7. Clear 'CVV' contents
    by = By.cssSelector("#CardCvv");
    driver.findElement(by).clear();

    // 8. Type '{{CVV}}' in 'CVV'
    by = By.cssSelector("#CardCvv");
    driver.findElement(by).sendKeys(CVV);

    // 9. Click 'genelOdemeTaksitSecenegi'
    /* Step is disabled
    clickAction = JSActions.getClickAction();
    by = By.xpath("(//td[contains(@class,'commRate-20')])[1]");
    clickAction = (JSActions.ClickAction)((ReportingDriver)driver).addons().execute(clickAction, by, -1);
    */
  }

  @Override
  public ReportingDriver getDriver() {
    return (ReportingDriver) driver;
  }
}
