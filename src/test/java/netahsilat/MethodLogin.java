package netahsilat;

import io.testproject.addon.DateTimeOperations;
import io.testproject.addon.VisibleElementsOperations;
import io.testproject.sdk.drivers.ReportingDriver;
import io.testproject.sdk.interfaces.junit5.ExceptionsReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * This class was automatically generated by TestProject
 * Project: Quality Museum Project
 * Test: Method Login
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Sun Oct 09 15:13:22 GMT 2022.
 */
public class MethodLogin implements Test, ExceptionsReporter {
  public static WebDriver driver;

  /**
   * ApplicationURL test parameter
   */
  public String ApplicationURL = "https://otomasyon.netahsilatdemo.com/Account/LogOff";

  /**
   * userName test parameter
   */
  public String userName = "otomasyon@test.com";

  /**
   * password test parameter
   */
  public String password = "Kd!cyhz4";

  /**
   * currentDateTime test parameter
   */
  public String currentDateTime = "";

  public void execute(WebDriver parentDriver) throws Exception {
    driver = parentDriver;
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    VisibleElementsOperations.ClickIfVisibleWeb clickIfVisibleWeb;
    DateTimeOperations.CurrentDate currentDate;

    // 1. Get current date
    currentDate = DateTimeOperations.currentDate("dd.MM.yyyy HH:mm:ss");
    currentDate = (DateTimeOperations.CurrentDate)((ReportingDriver)driver).addons().execute(currentDate);
    currentDateTime = String.valueOf(currentDate.result);

    // 2. Type '{{userName}}' in 'UserName'
    by = By.cssSelector("#UserName");
    driver.findElement(by).sendKeys(userName);

    // 3. Type '{{password}}' in 'Password'
    by = By.cssSelector("#Password");
    driver.findElement(by).sendKeys(password);

    // 4. Click 'GİRİŞ'
    by = By.cssSelector("#form-submit");
    driver.findElement(by).click();

    // 5. Click 'btnKapat' if it's visible
    /* Step is disabled
    clickIfVisibleWeb = VisibleElementsOperations.clickIfVisibleWeb("");
    by = By.xpath("//button[. = 'Kapat']");
    clickIfVisibleWeb = (VisibleElementsOperations.ClickIfVisibleWeb)((ReportingDriver)driver).addons().execute(clickIfVisibleWeb, by, -1);
    */
  }

  @Override
  public ReportingDriver getDriver() {
    return (ReportingDriver) driver;
  }
}
