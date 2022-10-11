package io.testproject.addon;

import io.testproject.sdk.internal.addons.ActionProxy;
import io.testproject.sdk.internal.addons.ProxyDescriptor;
import java.lang.String;

/**
 * Proxy for JS Actions Addon */
public class JSActions {
  /**
   * Factory method for ClickAction */
  public static ClickAction getClickAction() {
    return new ClickAction();
  }

  /**
   * Factory method for ContextClick */
  public static ContextClick getContextClick() {
    return new ContextClick();
  }

  /**
   * Factory method for ScrollToElementAction */
  public static ScrollToElementAction getScrollToElementAction() {
    return new ScrollToElementAction();
  }

  /**
   * Factory method for ScrollToElementAction
   * @param numberOfScrolls Number of scrolls to perform (default is 20) */
  public static ScrollToElementAction scrollToElementAction(int numberOfScrolls) {
    return new ScrollToElementAction(numberOfScrolls);
  }

  /**
   * Factory method for TypeTextAction */
  public static TypeTextAction getTypeTextAction() {
    return new TypeTextAction();
  }

  /**
   * Factory method for TypeTextAction
   * @param text  */
  public static TypeTextAction typeTextAction(String text) {
    return new TypeTextAction(text);
  }

  /**
   * Click (using JavaScript).  */
  public static class ClickAction extends ActionProxy {
    public ClickAction() {
      this.setDescriptor(new ProxyDescriptor("9G7qW0nEqU60ObO6IXJshg", "io.testproject.addon.jsactions.ClickAction"));
    }
  }

  /**
   * Context click (using JavaScript).  */
  public static class ContextClick extends ActionProxy {
    public ContextClick() {
      this.setDescriptor(new ProxyDescriptor("9G7qW0nEqU60ObO6IXJshg", "io.testproject.addon.jsactions.ContextClick"));
    }
  }

  /**
   * Scroll To Element With Javascript. Scroll to a given element using Javascript */
  public static class ScrollToElementAction extends ActionProxy {
    /**
     * Number of scrolls to perform (default is 20) (INPUT) */
    public int numberOfScrolls;

    public ScrollToElementAction() {
      this.setDescriptor(new ProxyDescriptor("9G7qW0nEqU60ObO6IXJshg", "io.testproject.addon.jsactions.ScrollToElementAction"));
    }

    public ScrollToElementAction(int numberOfScrolls) {
      this();
      this.numberOfScrolls = numberOfScrolls;
    }
  }

  /**
   * Type text (using JavaScript).  */
  public static class TypeTextAction extends ActionProxy {
    /**
     *  (INPUT) */
    public String text;

    public TypeTextAction() {
      this.setDescriptor(new ProxyDescriptor("9G7qW0nEqU60ObO6IXJshg", "io.testproject.addon.jsactions.TypeTextAction"));
    }

    public TypeTextAction(String text) {
      this();
      this.text = text;
    }
  }
}
