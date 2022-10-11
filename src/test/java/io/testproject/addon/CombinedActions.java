package io.testproject.addon;

import io.testproject.sdk.internal.addons.ActionProxy;
import io.testproject.sdk.internal.addons.ProxyDescriptor;

/**
 * Proxy for Combined Actions Addon */
public class CombinedActions {
  /**
   * Factory method for ClearAndTypeAction */
  public static ClearAndTypeAction getClearAndTypeAction() {
    return new ClearAndTypeAction();
  }

  /**
   * Factory method for ClearAndTypeAction
   * @param keys Value to type */
  public static ClearAndTypeAction clearAndTypeAction(String keys) {
    return new ClearAndTypeAction(keys);
  }

  /**
   * Clear {{element}} contents and type {{keys}}.  */
  public static class ClearAndTypeAction extends ActionProxy {
    /**
     * Value to type (INPUT) */
    public String keys;

    public ClearAndTypeAction() {
      this.setDescriptor(new ProxyDescriptor("LFtMVbTf9EW7YK8qK4xzlQ", "io.testproject.addon.combined.actions.ClearAndTypeAction"));
    }

    public ClearAndTypeAction(String keys) {
      this();
      this.keys = keys;
    }
  }
}
