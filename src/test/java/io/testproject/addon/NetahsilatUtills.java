package io.testproject.addon;

import io.testproject.sdk.internal.addons.ActionProxy;
import io.testproject.sdk.internal.addons.ProxyDescriptor;

/**
 * Proxy for NetahsilatUtills Addon */
public class NetahsilatUtills {
  /**
   * Factory method for ClickUntilGone */
  public static ClickUntilGone getClickUntilGone() {
    return new ClickUntilGone();
  }

  /**
   * Factory method for ClickUntilGone
   * @param Timeout timeout in seconds (Default = 30) */
  public static ClickUntilGone clickUntilGone(int Timeout) {
    return new ClickUntilGone(Timeout);
  }

  /**
   * Factory method for DeleteFolder */
  public static DeleteFolder getDeleteFolder() {
    return new DeleteFolder();
  }

  /**
   * Factory method for DeleteFolder
   * @param filePath Path to the Folder */
  public static DeleteFolder deleteFolder(String filePath) {
    return new DeleteFolder(filePath);
  }

  /**
   * Factory method for GetSystemEnv */
  public static GetSystemEnv getGetSystemEnv() {
    return new GetSystemEnv();
  }

  /**
   * Factory method for GetSystemEnv
   * @param Environment Name of system environment */
  public static GetSystemEnv getSystemEnv(String Environment) {
    return new GetSystemEnv(Environment);
  }

  /**
   * Factory method for IframeSendKeys */
  public static IframeSendKeys getIframeSendKeys() {
    return new IframeSendKeys();
  }

  /**
   * Factory method for IframeSendKeys
   * @param iframeID Iframe Begining ID (int) 
   * @param locator The locator of the imput field in the iframe (CssSelector / XPATH)
   * @param inputValue Input Value */
  public static IframeSendKeys iframeSendKeys(int iframeID, String locator, String inputValue) {
    return new IframeSendKeys(iframeID,locator,inputValue);
  }

  /**
   * Factory method for MathRound */
  public static MathRound getMathRound() {
    return new MathRound();
  }

  /**
   * Factory method for MathRound
   * @param inputValue Input Value
   * @param roundType Round Type (round - ceil - floor) */
  public static MathRound mathRound(double inputValue, String roundType) {
    return new MathRound(inputValue,roundType);
  }

  /**
   * Factory method for WaitElementInVisible */
  public static WaitElementInVisible getWaitElementInVisible() {
    return new WaitElementInVisible();
  }

  /**
   * Factory method for WaitElementInVisible
   * @param timeOut Time Out (Second) */
  public static WaitElementInVisible waitElementInVisible(int timeOut) {
    return new WaitElementInVisible(timeOut);
  }

  /**
   * Click Until Gone. Click Until Gone */
  public static class ClickUntilGone extends ActionProxy {
    /**
     * timeout in seconds (Default = 30) (INPUT) */
    public int Timeout;

    public ClickUntilGone() {
      this.setDescriptor(new ProxyDescriptor("EhbJIKhU3Eq1g8QqGVIcng", "main.addon.ClickUntilGone"));
    }

    public ClickUntilGone(int Timeout) {
      this();
      this.Timeout = Timeout;
    }
  }

  /**
   * Delete Folder. Delete Folder */
  public static class DeleteFolder extends ActionProxy {
    /**
     * Path to the Folder (INPUT) */
    public String filePath;

    public DeleteFolder() {
      this.setDescriptor(new ProxyDescriptor("EhbJIKhU3Eq1g8QqGVIcng", "main.addon.DeleteFolder"));
    }

    public DeleteFolder(String filePath) {
      this();
      this.filePath = filePath;
    }
  }

  /**
   * Get System Environment. Get System Environment */
  public static class GetSystemEnv extends ActionProxy {
    /**
     * Name of system environment (INPUT) */
    public String Environment;

    /**
     * Path of system environment (OUTPUT) */
    public String Path;

    public GetSystemEnv() {
      this.setDescriptor(new ProxyDescriptor("EhbJIKhU3Eq1g8QqGVIcng", "main.addon.GetSystemEnv"));
    }

    public GetSystemEnv(String Environment) {
      this();
      this.Environment = Environment;
    }
  }

  /**
   * Iframe Send Keys. This addon allows you to send Keys to input fields in iframes. */
  public static class IframeSendKeys extends ActionProxy {
    /**
     * Iframe Begining ID (int)  (INPUT) */
    public int iframeID;

    /**
     * The locator of the imput field in the iframe (CssSelector / XPATH) (INPUT) */
    public String locator;

    /**
     * Input Value (INPUT) */
    public String inputValue;

    public IframeSendKeys() {
      this.setDescriptor(new ProxyDescriptor("EhbJIKhU3Eq1g8QqGVIcng", "main.addon.IframeSendKeys"));
    }

    public IframeSendKeys(int iframeID, String locator, String inputValue) {
      this();
      this.iframeID = iframeID;
      this.locator = locator;
      this.inputValue = inputValue;
    }
  }

  /**
   * Math.round. Math.round */
  public static class MathRound extends ActionProxy {
    /**
     * Input Value (INPUT) */
    public double inputValue;

    /**
     * Round Type (round - ceil - floor) (INPUT) */
    public String roundType;

    /**
     * Output Value (OUTPUT) */
    public int outputValue;

    public MathRound() {
      this.setDescriptor(new ProxyDescriptor("EhbJIKhU3Eq1g8QqGVIcng", "main.addon.MathRound"));
    }

    public MathRound(double inputValue, String roundType) {
      this();
      this.inputValue = inputValue;
      this.roundType = roundType;
    }
  }

  /**
   * Wait Until Element In Visible. Wait Until Element In Visible */
  public static class WaitElementInVisible extends ActionProxy {
    /**
     * Time Out (Second) (INPUT) */
    public int timeOut;

    public WaitElementInVisible() {
      this.setDescriptor(new ProxyDescriptor("EhbJIKhU3Eq1g8QqGVIcng", "main.addon.WaitElementInVisible"));
    }

    public WaitElementInVisible(int timeOut) {
      this();
      this.timeOut = timeOut;
    }
  }
}
