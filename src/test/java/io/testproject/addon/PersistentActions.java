package io.testproject.addon;

import io.testproject.sdk.internal.addons.ActionProxy;
import io.testproject.sdk.internal.addons.ProxyDescriptor;

/**
 * Proxy for Persistent Actions Addon */
public class PersistentActions {
  /**
   * Factory method for ClickUntilHidden */
  public static ClickUntilHidden getClickUntilHidden() {
    return new ClickUntilHidden();
  }

  /**
   * Factory method for ClickUntilHidden
   * @param timeout Timeout in seconds (10 by default)
   * @param sleep Delay between attempts, in milliseconds (500 by default) */
  public static ClickUntilHidden clickUntilHidden(int timeout, int sleep) {
    return new ClickUntilHidden(timeout,sleep);
  }

  /**
   * Click (Until Gone).  */
  public static class ClickUntilHidden extends ActionProxy {
    /**
     * Timeout in seconds (10 by default) (INPUT) */
    public int timeout;

    /**
     * Delay between attempts, in milliseconds (500 by default) (INPUT) */
    public int sleep;

    public ClickUntilHidden() {
      this.setDescriptor(new ProxyDescriptor("lwux9WlcR02jpZ1LOdFk6g", "io.testproject.addons.element.ClickUntilHidden"));
    }

    public ClickUntilHidden(int timeout, int sleep) {
      this();
      this.timeout = timeout;
      this.sleep = sleep;
    }
  }
}
