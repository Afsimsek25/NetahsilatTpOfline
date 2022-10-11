package netahsilat;

import io.testproject.addon.StringUtils;
import io.testproject.addon.WebExtensions;
import io.testproject.sdk.drivers.ReportingDriver;
import io.testproject.sdk.interfaces.junit5.ExceptionsReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * This class was automatically generated by TestProject
 * Project: Quality Museum Project
 * Test: Method JS Get Data From Grid
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Mon Oct 10 08:40:08 GMT 2022.
 */
public class MethodJsGetDataFromGrid implements Test{
  public static WebDriver driver;

  /**
   * element test parameter
   */
  public String element = "";

  /**
   * ReplaceData test parameter
   */
  public String ReplaceData = "";

  /**
   * ColumnName test parameter
   */
  public String ColumnName = "Bayi ERP Kodu";

  /**
   * SearchData test parameter
   */
  public String SearchData = "IadeCokluFatura";

  public void execute(WebDriver parentDriver) throws Exception {
    driver = parentDriver;
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;
    StringUtils.TrimString trimString;
    WebExtensions.ExecuteJavascript executeJavascript;
    StringUtils.ReplaceSubstrings replaceSubstrings;

    // 1. Execute JavaScript '$("table th").each(function(index){\n if ($(this).text() == '{{ColumnName}}')\n{\nreturn x = index;\n}});\nreturn x+1;' with arguments '[NONE]'
    //    tablo başlık adı
    executeJavascript = WebExtensions.executeJavascript(String.format("$(\"table th\").each(function(index){ if ($(this).text() == '%s') { return x = index;}}); return x+1;",ColumnName),"");
    executeJavascript = (WebExtensions.ExecuteJavascript)((ReportingDriver)driver).addons().execute(executeJavascript);
    element = String.valueOf(executeJavascript.output);

    // 2. Execute JavaScript 'res = "{XXPATTERNXX}";\n$("div[class='t-grid-content'] tr td:nth-child({{element}})").each(function() {\n    res = res + ($(this).text());\n});\n\nreturn res;' with arguments '[NONE]'
    executeJavascript = WebExtensions.executeJavascript(String.format("res = \"{XXPATTERNXX}\"; $(\"div[class='t-grid-content'] tr td:nth-child(%s)\").each(function() { res = res + ($(this).text());}); return res;",element),"");
    executeJavascript = (WebExtensions.ExecuteJavascript)((ReportingDriver)driver).addons().execute(executeJavascript);
    ReplaceData = String.valueOf(executeJavascript.output);

    // 3. Replace all occurrences of '{{SearchData}}' with '[NONE]' in '{{ReplaceData}}'
    replaceSubstrings = StringUtils.replaceSubstrings(ReplaceData,SearchData,"");
    replaceSubstrings = (StringUtils.ReplaceSubstrings)((ReportingDriver)driver).addons().execute(replaceSubstrings);
    ReplaceData = String.valueOf(replaceSubstrings.result);

    // 4. Trim '{{ReplaceData}}'
    trimString = StringUtils.trimString(ReplaceData);
    trimString = (StringUtils.TrimString)((ReportingDriver)driver).addons().execute(trimString);
    ReplaceData = String.valueOf(trimString.resultString);

    // 5. Type '{{ReplaceData}}' in 'ErpCode'
    /* Step is disabled
    by = By.cssSelector("#ErpCode");
    driver.findElement(by).sendKeys(ReplaceData);
    */
    // 6. Type '{{ReplaceData}}' in 'CustomerId'
    /* Step is disabled
    by = By.cssSelector("#CustomerId");
    driver.findElement(by).sendKeys(ReplaceData);
    */
    // 7. Execute JavaScript '$(".t-header").each(function(index){\n if ($(this).text() == '{{ColumnName}}')\n{\n//$(".diff-button").html(index) \nreturn x = index;\n}});\nreturn x+1;' with arguments '[NONE]'
    //    Kolon adı
    /* Step is disabled
    executeJavascript = WebExtensions.executeJavascript(String.format("$(\".t-header\").each(function(index){
         if ($(this).text() == '%s')
        {
        //$(\".diff-button\").html(index) 
        return x = index;
        }});
        return x+1;",ColumnName),"");
    executeJavascript = (WebExtensions.ExecuteJavascript)((ReportingDriver)driver).addons().execute(executeJavascript);
    element = String.valueOf(executeJavascript.output);
    */
  }


  public ReportingDriver getDriver() {
    return (ReportingDriver) driver;
  }
}