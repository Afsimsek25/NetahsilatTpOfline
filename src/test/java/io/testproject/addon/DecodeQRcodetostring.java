package io.testproject.addon;

import io.testproject.sdk.internal.addons.ActionProxy;
import io.testproject.sdk.internal.addons.ProxyDescriptor;

/**
 * Proxy for Decode QR code to string Addon */
public class DecodeQRcodetostring {
  /**
   * Factory method for ReadQRFromDropbox */
  public static ReadQRFromDropbox getReadQRFromDropbox() {
    return new ReadQRFromDropbox();
  }

  /**
   * Factory method for ReadQRFromDropbox
   * @param authToken Dropbox authentication token
   * @param path QR image file (For root: "/QR.jpg", for subfolder: "/subfolder/QR.jpg") */
  public static ReadQRFromDropbox readQRFromDropbox(String authToken, String path) {
    return new ReadQRFromDropbox(authToken,path);
  }

  /**
   * Factory method for ReadQRGeneric */
  public static ReadQRGeneric getReadQRGeneric() {
    return new ReadQRGeneric();
  }

  /**
   * Factory method for ReadQRGeneric
   * @param path Full path to image  */
  public static ReadQRGeneric readQRGeneric(String path) {
    return new ReadQRGeneric(path);
  }

  /**
   * Factory method for ReadQRAndroid */
  public static ReadQRAndroid getReadQRAndroid() {
    return new ReadQRAndroid();
  }

  /**
   * Factory method for ReadQRIOS */
  public static ReadQRIOS getReadQRIOS() {
    return new ReadQRIOS();
  }

  /**
   * Factory method for ReadQRWebElement */
  public static ReadQRWebElement getReadQRWebElement() {
    return new ReadQRWebElement();
  }

  /**
   * Read QR code from Dropbox image. Reads QR code from image in Dropbox */
  public static class ReadQRFromDropbox extends ActionProxy {
    /**
     * Dropbox authentication token (INPUT) */
    public String authToken;

    /**
     * QR image file (For root: "/QR.jpg", for subfolder: "/subfolder/QR.jpg") (INPUT) */
    public String path;

    /**
     * Contents of QR code (OUTPUT) */
    public String output;

    public ReadQRFromDropbox() {
      this.setDescriptor(new ProxyDescriptor("RKOzILol9EqWSallSFikEg", "Actions.ReadQRFromDropbox"));
    }

    public ReadQRFromDropbox(String authToken, String path) {
      this();
      this.authToken = authToken;
      this.path = path;
    }
  }

  /**
   * Read QR code from image. Reads QR code from image */
  public static class ReadQRGeneric extends ActionProxy {
    /**
     * Full path to image */
    public String path;

    /**
     * Contents of QR code (OUTPUT) */
    public String output;

    public ReadQRGeneric() {
      this.setDescriptor(new ProxyDescriptor("RKOzILol9EqWSallSFikEg", "Actions.ReadQRGeneric"));
    }

    public ReadQRGeneric(String path) {
      this();
      this.path = path;
    }
  }

  /**
   * Read QR code from Android element. Reads QR code from Android element */
  public static class ReadQRAndroid extends ActionProxy {
    /**
     * Contents of QR code (OUTPUT) */
    public String output;

    public ReadQRAndroid() {
      this.setDescriptor(new ProxyDescriptor("RKOzILol9EqWSallSFikEg", "ElementActions.ReadQRAndroid"));
    }
  }

  /**
   * Read QR code from iOS element. Reads QR code from iOS element */
  public static class ReadQRIOS extends ActionProxy {
    /**
     * Contents of QR code (OUTPUT) */
    public String output;

    public ReadQRIOS() {
      this.setDescriptor(new ProxyDescriptor("RKOzILol9EqWSallSFikEg", "ElementActions.ReadQRIOS"));
    }
  }

  /**
   * Read QR code from web element. Reads QR code from web element */
  public static class ReadQRWebElement extends ActionProxy {
    /**
     * Contents of QR code (OUTPUT) */
    public String output;

    public ReadQRWebElement() {
      this.setDescriptor(new ProxyDescriptor("RKOzILol9EqWSallSFikEg", "ElementActions.ReadQRWebElement"));
    }
  }
}
