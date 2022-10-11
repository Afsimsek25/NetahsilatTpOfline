package io.testproject.addon;

import io.testproject.sdk.internal.addons.ActionProxy;
import io.testproject.sdk.internal.addons.ProxyDescriptor;

/**
 * Proxy for Type Text Slowly Addon */
public class TypeTextSlowly {
  /**
   * Factory method for TypeTextWithControlledSpeed */
  public static TypeTextWithControlledSpeed getTypeTextWithControlledSpeed() {
    return new TypeTextWithControlledSpeed();
  }

  /**
   * Factory method for TypeTextWithControlledSpeed
   * @param text The text to type
   * @param delay The delay between each letter input in milliseconds */
  public static TypeTextWithControlledSpeed typeTextWithControlledSpeed(String text, int delay) {
    return new TypeTextWithControlledSpeed(text,delay);
  }

  /**
   * Type text with delay.  */
  public static class TypeTextWithControlledSpeed extends ActionProxy {
    /**
     * The text to type (INPUT) */
    public String text;

    /**
     * The delay between each letter input in milliseconds (INPUT) */
    public int delay;

    public TypeTextWithControlledSpeed() {
      this.setDescriptor(new ProxyDescriptor("F7SbDaVgEUmpjQJG6Bi4Dw", "TypeTextWithControlledSpeed"));
    }

    public TypeTextWithControlledSpeed(String text, int delay) {
      this();
      this.text = text;
      this.delay = delay;
    }
  }
}
