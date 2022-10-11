package io.testproject.addon;

import io.testproject.sdk.internal.addons.ActionProxy;
import io.testproject.sdk.internal.addons.ProxyDescriptor;

/**
 * Proxy for Tab Actions Addon */
public class TabActions {
  /**
   * Factory method for CloseAllTabs */
  public static CloseAllTabs getCloseAllTabs() {
    return new CloseAllTabs();
  }

  /**
   * Factory method for CloseLastTab */
  public static CloseLastTab getCloseLastTab() {
    return new CloseLastTab();
  }

  /**
   * Factory method for CloseTabWithIndex */
  public static CloseTabWithIndex getCloseTabWithIndex() {
    return new CloseTabWithIndex();
  }

  /**
   * Factory method for CloseTabWithIndex
   * @param TabIndex Index of tab to close (Starts from 1) */
  public static CloseTabWithIndex closeTabWithIndex(int TabIndex) {
    return new CloseTabWithIndex(TabIndex);
  }

  /**
   * Factory method for CountAllTabs */
  public static CountAllTabs getCountAllTabs() {
    return new CountAllTabs();
  }

  /**
   * Factory method for NewTabAtURL */
  public static NewTabAtURL getNewTabAtURL() {
    return new NewTabAtURL();
  }

  /**
   * Factory method for NewTabAtURL
   * @param URL Full URL to open (Example: https://testproject.io/) */
  public static NewTabAtURL newTabAtURL(String URL) {
    return new NewTabAtURL(URL);
  }

  /**
   * Factory method for OpenMostRecentTab */
  public static OpenMostRecentTab getOpenMostRecentTab() {
    return new OpenMostRecentTab();
  }

  /**
   * Close all tabs.  */
  public static class CloseAllTabs extends ActionProxy {
    public CloseAllTabs() {
      this.setDescriptor(new ProxyDescriptor("775wVW80X0u_jcJi9jfJxw", "CloseAllTabs"));
    }
  }

  /**
   * Close last tab.  */
  public static class CloseLastTab extends ActionProxy {
    public CloseLastTab() {
      this.setDescriptor(new ProxyDescriptor("775wVW80X0u_jcJi9jfJxw", "CloseLastTab"));
    }
  }

  /**
   * Close tab at index.  */
  public static class CloseTabWithIndex extends ActionProxy {
    /**
     * Index of tab to close (Starts from 1) (INPUT) */
    public int TabIndex;

    public CloseTabWithIndex() {
      this.setDescriptor(new ProxyDescriptor("775wVW80X0u_jcJi9jfJxw", "CloseTabWithIndex"));
    }

    public CloseTabWithIndex(int TabIndex) {
      this();
      this.TabIndex = TabIndex;
    }
  }

  /**
   * Count all open tabs.  */
  public static class CountAllTabs extends ActionProxy {
    /**
     * The number of tabs (OUTPUT) */
    public int numOfTabs;

    public CountAllTabs() {
      this.setDescriptor(new ProxyDescriptor("775wVW80X0u_jcJi9jfJxw", "CountAllTabs"));
    }
  }

  /**
   * Open URL in New Tab.  */
  public static class NewTabAtURL extends ActionProxy {
    /**
     * Full URL to open (Example: https://testproject.io/) (INPUT) */
    public String URL;

    public NewTabAtURL() {
      this.setDescriptor(new ProxyDescriptor("775wVW80X0u_jcJi9jfJxw", "NewTabAtURL"));
    }

    public NewTabAtURL(String URL) {
      this();
      this.URL = URL;
    }
  }

  /**
   * Switch to most recent tab opened.  */
  public static class OpenMostRecentTab extends ActionProxy {
    public OpenMostRecentTab() {
      this.setDescriptor(new ProxyDescriptor("775wVW80X0u_jcJi9jfJxw", "OpenMostRecentTab"));
    }
  }
}
