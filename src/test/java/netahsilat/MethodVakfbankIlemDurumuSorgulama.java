package netahsilat;

import io.testproject.addon.RESTfulAPIClient;
import io.testproject.sdk.drivers.ReportingDriver;
import io.testproject.sdk.interfaces.junit5.ExceptionsReporter;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * This class was automatically generated by TestProject
 * Project: Quality Museum Project
 * Test: Method Vakıfbank İşlem Durumu Sorgulama
 * Generated by: Ahmet Furkan SIMSEK (furkan.simsek@qualitymuseum.com)
 * Generated on Mon Oct 10 07:19:16 GMT 2022.
 */
public class MethodVakfbankIlemDurumuSorgulama implements Test, ExceptionsReporter {
  public static WebDriver driver;

  /**
   * responseAmount test parameter
   */
  public String responseAmount = "";

  /**
   * HostSubMerchantId test parameter
   */
  public String HostSubMerchantId = "";

  /**
   * OrderId test parameter
   */
  public String OrderId = "";

  public void execute(WebDriver parentDriver) throws Exception {
    driver = parentDriver;
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    RESTfulAPIClient.PostAction postAction;
    // 1. POST 'https://onlineodemetest.vakifbank.com.tr:4443/UIService/TransactionSearchOperations.asmx'?'[NONE]'
    GeneratedUtils.sleep(500);
    postAction = RESTfulAPIClient.postAction(String.format("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:pay=\"PayFlexVPosUIServerWebService\"> <soapenv:Header/> <soapenv:Body> <pay:Search> <pay:request> <pay:MerchantCriteria> <pay:HostMerchantId>%s</pay:HostMerchantId> <pay:MerchantPassword>Ab123456</pay:MerchantPassword> </pay:MerchantCriteria> <pay:TransactionCriteria> <pay:OrderId>%s</pay:OrderId> </pay:TransactionCriteria> </pay:request> </pay:Search></soapenv:Body> </soapenv:Envelope>",HostSubMerchantId,OrderId),"text/xml","","https://onlineodemetest.vakifbank.com.tr:4443/UIService/TransactionSearchOperations.asmx","","","","",false,"",false,"","");
    postAction = (RESTfulAPIClient.PostAction)((ReportingDriver)driver).addons().execute(postAction);
    responseAmount = String.valueOf(postAction.response);
  }

  @Override
  public ReportingDriver getDriver() {
    return (ReportingDriver) driver;
  }
}
