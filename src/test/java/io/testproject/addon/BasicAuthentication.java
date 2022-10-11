package io.testproject.addon;

import io.testproject.sdk.internal.addons.ActionProxy;
import io.testproject.sdk.internal.addons.ProxyDescriptor;

/**
 * Proxy for Basic Authentication Addon */
public class BasicAuthentication {
  /**
   * Factory method for NavigateToBasicAuth */
  public static NavigateToBasicAuth getNavigateToBasicAuth() {
    return new NavigateToBasicAuth();
  }

  /**
   * Factory method for NavigateToBasicAuth
   * @param url Navigation url
   * @param username Username
   * @param password Password */
  public static NavigateToBasicAuth navigateToBasicAuth(String url, String username,
      String password) {
    return new NavigateToBasicAuth(url,username,password);
  }

  /**
   * Navigate to URL with Basic Authentication. Navigate to URL with basic auth */
  public static class NavigateToBasicAuth extends ActionProxy {
    /**
     * Navigation url (INPUT) */
    public String url;

    /**
     * Username (INPUT) */
    public String username;

    /**
     * Password (INPUT) */
    public String password;

    public NavigateToBasicAuth() {
      this.setDescriptor(new ProxyDescriptor("fmkPgCG_u02qGoUNZqOrJQ", "NavigateToBasicAuth"));
    }

    public NavigateToBasicAuth(String url, String username, String password) {
      this();
      this.url = url;
      this.username = username;
      this.password = password;
    }
  }
}
