package io.testproject.addon;

import io.testproject.sdk.internal.addons.ActionProxy;
import io.testproject.sdk.internal.addons.ProxyDescriptor;
import java.lang.String;

/**
 * Proxy for Visible Elements Operations Addon */
public class VisibleElementsOperations {
  /**
   * Factory method for ClearContentsIfVisibleAndroid */
  public static ClearContentsIfVisibleAndroid getClearContentsIfVisibleAndroid() {
    return new ClearContentsIfVisibleAndroid();
  }

  /**
   * Factory method for ClearContentsIfVisibleAndroid
   * @param timeout Timeout (how much to wait for the element to become visible. Default: 3 seconds) */
  public static ClearContentsIfVisibleAndroid clearContentsIfVisibleAndroid(String timeout) {
    return new ClearContentsIfVisibleAndroid(timeout);
  }

  /**
   * Factory method for ClearContentsIfVisibleiOS */
  public static ClearContentsIfVisibleiOS getClearContentsIfVisibleiOS() {
    return new ClearContentsIfVisibleiOS();
  }

  /**
   * Factory method for ClearContentsIfVisibleiOS
   * @param timeout Timeout (how much to wait for the element to become visible. Default: 3 seconds) */
  public static ClearContentsIfVisibleiOS clearContentsIfVisibleiOS(String timeout) {
    return new ClearContentsIfVisibleiOS(timeout);
  }

  /**
   * Factory method for ClearContentsIfVisibleWeb */
  public static ClearContentsIfVisibleWeb getClearContentsIfVisibleWeb() {
    return new ClearContentsIfVisibleWeb();
  }

  /**
   * Factory method for ClearContentsIfVisibleWeb
   * @param timeout Timeout (how much to wait for the element to become visible. Default: 3 seconds) */
  public static ClearContentsIfVisibleWeb clearContentsIfVisibleWeb(String timeout) {
    return new ClearContentsIfVisibleWeb(timeout);
  }

  /**
   * Factory method for ClickIfVisibleAndroid */
  public static ClickIfVisibleAndroid getClickIfVisibleAndroid() {
    return new ClickIfVisibleAndroid();
  }

  /**
   * Factory method for ClickIfVisibleAndroid
   * @param timeout Timeout (how much to wait for the element to become visible. Default: 3 seconds) */
  public static ClickIfVisibleAndroid clickIfVisibleAndroid(String timeout) {
    return new ClickIfVisibleAndroid(timeout);
  }

  /**
   * Factory method for ClickIfVisibleiOS */
  public static ClickIfVisibleiOS getClickIfVisibleiOS() {
    return new ClickIfVisibleiOS();
  }

  /**
   * Factory method for ClickIfVisibleiOS
   * @param timeout Timeout (how much to wait for the element to become visible. Default: 3 seconds) */
  public static ClickIfVisibleiOS clickIfVisibleiOS(String timeout) {
    return new ClickIfVisibleiOS(timeout);
  }

  /**
   * Factory method for ClickIfVisibleWeb */
  public static ClickIfVisibleWeb getClickIfVisibleWeb() {
    return new ClickIfVisibleWeb();
  }

  /**
   * Factory method for ClickIfVisibleWeb
   * @param timeout Timeout (how much to wait for the element to become visible. Default: 3 seconds) */
  public static ClickIfVisibleWeb clickIfVisibleWeb(String timeout) {
    return new ClickIfVisibleWeb(timeout);
  }

  /**
   * Factory method for ContainsTextIfVisibleAndroid */
  public static ContainsTextIfVisibleAndroid getContainsTextIfVisibleAndroid() {
    return new ContainsTextIfVisibleAndroid();
  }

  /**
   * Factory method for ContainsTextIfVisibleAndroid
   * @param text Text
   * @param timeout Timeout (how much to wait for the element to become visible. Default: 3 seconds) */
  public static ContainsTextIfVisibleAndroid containsTextIfVisibleAndroid(String text,
      String timeout) {
    return new ContainsTextIfVisibleAndroid(text,timeout);
  }

  /**
   * Factory method for ContainsTextIfVisibleiOS */
  public static ContainsTextIfVisibleiOS getContainsTextIfVisibleiOS() {
    return new ContainsTextIfVisibleiOS();
  }

  /**
   * Factory method for ContainsTextIfVisibleiOS
   * @param text Text
   * @param timeout Timeout (how much to wait for the element to become visible. Default: 3 seconds) */
  public static ContainsTextIfVisibleiOS containsTextIfVisibleiOS(String text, String timeout) {
    return new ContainsTextIfVisibleiOS(text,timeout);
  }

  /**
   * Factory method for ContainsTextIfVisibleWeb */
  public static ContainsTextIfVisibleWeb getContainsTextIfVisibleWeb() {
    return new ContainsTextIfVisibleWeb();
  }

  /**
   * Factory method for ContainsTextIfVisibleWeb
   * @param text Text
   * @param timeout Timeout (how much to wait for the element to become visible. Default: 3 seconds) */
  public static ContainsTextIfVisibleWeb containsTextIfVisibleWeb(String text, String timeout) {
    return new ContainsTextIfVisibleWeb(text,timeout);
  }

  /**
   * Factory method for GetTextIfVisibleAndroid */
  public static GetTextIfVisibleAndroid getGetTextIfVisibleAndroid() {
    return new GetTextIfVisibleAndroid();
  }

  /**
   * Factory method for GetTextIfVisibleAndroid
   * @param timeout Timeout (how much to wait for the element to become visible. Default: 3 seconds) */
  public static GetTextIfVisibleAndroid getTextIfVisibleAndroid(String timeout) {
    return new GetTextIfVisibleAndroid(timeout);
  }

  /**
   * Factory method for GetTextIfVisibleiOS */
  public static GetTextIfVisibleiOS getGetTextIfVisibleiOS() {
    return new GetTextIfVisibleiOS();
  }

  /**
   * Factory method for GetTextIfVisibleiOS
   * @param timeout Timeout (how much to wait for the element to become visible. Default: 3 seconds) */
  public static GetTextIfVisibleiOS getTextIfVisibleiOS(String timeout) {
    return new GetTextIfVisibleiOS(timeout);
  }

  /**
   * Factory method for GetTextIfVisibleWeb */
  public static GetTextIfVisibleWeb getGetTextIfVisibleWeb() {
    return new GetTextIfVisibleWeb();
  }

  /**
   * Factory method for GetTextIfVisibleWeb
   * @param timeout Timeout (how much to wait for the element to become visible. Default: 3 seconds) */
  public static GetTextIfVisibleWeb getTextIfVisibleWeb(String timeout) {
    return new GetTextIfVisibleWeb(timeout);
  }

  /**
   * Factory method for IsClickableAndroid */
  public static IsClickableAndroid getIsClickableAndroid() {
    return new IsClickableAndroid();
  }

  /**
   * Factory method for IsClickableAndroid
   * @param timeout Timeout (how much to wait for the element to become visible. Default: 3 seconds) */
  public static IsClickableAndroid isClickableAndroid(String timeout) {
    return new IsClickableAndroid(timeout);
  }

  /**
   * Factory method for IsClickableIOS */
  public static IsClickableIOS getIsClickableIOS() {
    return new IsClickableIOS();
  }

  /**
   * Factory method for IsClickableIOS
   * @param timeout Timeout (how much to wait for the element to become visible. Default: 3 seconds) */
  public static IsClickableIOS isClickableIOS(String timeout) {
    return new IsClickableIOS(timeout);
  }

  /**
   * Factory method for IsClickableWeb */
  public static IsClickableWeb getIsClickableWeb() {
    return new IsClickableWeb();
  }

  /**
   * Factory method for IsClickableWeb
   * @param timeout Timeout (how much to wait for the element to become visible. Default: 3 seconds) */
  public static IsClickableWeb isClickableWeb(String timeout) {
    return new IsClickableWeb(timeout);
  }

  /**
   * Factory method for IsSelectedAndroid */
  public static IsSelectedAndroid getIsSelectedAndroid() {
    return new IsSelectedAndroid();
  }

  /**
   * Factory method for IsSelectedAndroid
   * @param timeout Timeout (how much to wait for the element to become visible. Default: 3 seconds) */
  public static IsSelectedAndroid isSelectedAndroid(String timeout) {
    return new IsSelectedAndroid(timeout);
  }

  /**
   * Factory method for IsSelectediOS */
  public static IsSelectediOS getIsSelectediOS() {
    return new IsSelectediOS();
  }

  /**
   * Factory method for IsSelectediOS
   * @param timeout Timeout (how much to wait for the element to become visible. Default: 3 seconds) */
  public static IsSelectediOS isSelectediOS(String timeout) {
    return new IsSelectediOS(timeout);
  }

  /**
   * Factory method for IsSelectedWeb */
  public static IsSelectedWeb getIsSelectedWeb() {
    return new IsSelectedWeb();
  }

  /**
   * Factory method for IsSelectedWeb
   * @param timeout Timeout (how much to wait for the element to become visible. Default: 3 seconds) */
  public static IsSelectedWeb isSelectedWeb(String timeout) {
    return new IsSelectedWeb(timeout);
  }

  /**
   * Factory method for LongPressIfVisibleAndroid */
  public static LongPressIfVisibleAndroid getLongPressIfVisibleAndroid() {
    return new LongPressIfVisibleAndroid();
  }

  /**
   * Factory method for LongPressIfVisibleAndroid
   * @param duration Duration (in milliseconds)
   * @param timeout Timeout (how much to wait for the element to become visible. Default: 3 seconds) */
  public static LongPressIfVisibleAndroid longPressIfVisibleAndroid(String duration,
      String timeout) {
    return new LongPressIfVisibleAndroid(duration,timeout);
  }

  /**
   * Factory method for LongPressIfVisibleiOS */
  public static LongPressIfVisibleiOS getLongPressIfVisibleiOS() {
    return new LongPressIfVisibleiOS();
  }

  /**
   * Factory method for LongPressIfVisibleiOS
   * @param duration Duration (in milliseconds)
   * @param timeout Timeout (how much to wait for the element to become visible. Default: 3 seconds) */
  public static LongPressIfVisibleiOS longPressIfVisibleiOS(String duration, String timeout) {
    return new LongPressIfVisibleiOS(duration,timeout);
  }

  /**
   * Factory method for SwipeAndroid */
  public static SwipeAndroid getSwipeAndroid() {
    return new SwipeAndroid();
  }

  /**
   * Factory method for SwipeAndroid
   * @param direction The direction to wipe
   * @param swipeDistance How much to swipe ( Pixels )
   * @param swipeDuration How long the swipe will be (in milliseconds) */
  public static SwipeAndroid swipeAndroid(String direction, int swipeDistance, int swipeDuration) {
    return new SwipeAndroid(direction,swipeDistance,swipeDuration);
  }

  /**
   * Factory method for SwipeIOS */
  public static SwipeIOS getSwipeIOS() {
    return new SwipeIOS();
  }

  /**
   * Factory method for SwipeIOS
   * @param direction The direction to wipe
   * @param swipeDistance How much to swipe ( Pixels )
   * @param swipeDuration How long the swipe will be (in milliseconds) */
  public static SwipeIOS swipeIOS(String direction, int swipeDistance, int swipeDuration) {
    return new SwipeIOS(direction,swipeDistance,swipeDuration);
  }

  /**
   * Factory method for TapIfVisibleAndroid */
  public static TapIfVisibleAndroid getTapIfVisibleAndroid() {
    return new TapIfVisibleAndroid();
  }

  /**
   * Factory method for TapIfVisibleAndroid
   * @param timeout Timeout (how much to wait for the element to become visible. Default: 3 seconds) */
  public static TapIfVisibleAndroid tapIfVisibleAndroid(String timeout) {
    return new TapIfVisibleAndroid(timeout);
  }

  /**
   * Factory method for TapIfVisibleiOS */
  public static TapIfVisibleiOS getTapIfVisibleiOS() {
    return new TapIfVisibleiOS();
  }

  /**
   * Factory method for TapIfVisibleiOS
   * @param timeout Timeout (how much to wait for the element to become visible. Default: 3 seconds) */
  public static TapIfVisibleiOS tapIfVisibleiOS(String timeout) {
    return new TapIfVisibleiOS(timeout);
  }

  /**
   * Factory method for TypeTextIfVisibleAndroid */
  public static TypeTextIfVisibleAndroid getTypeTextIfVisibleAndroid() {
    return new TypeTextIfVisibleAndroid();
  }

  /**
   * Factory method for TypeTextIfVisibleAndroid
   * @param text The text to be typed into the element
   * @param timeout Timeout (how much to wait for the element to become visible. Default: 3 seconds) */
  public static TypeTextIfVisibleAndroid typeTextIfVisibleAndroid(String text, String timeout) {
    return new TypeTextIfVisibleAndroid(text,timeout);
  }

  /**
   * Factory method for TypeTextIfVisibleiOS */
  public static TypeTextIfVisibleiOS getTypeTextIfVisibleiOS() {
    return new TypeTextIfVisibleiOS();
  }

  /**
   * Factory method for TypeTextIfVisibleiOS
   * @param text The text to be typed into the element
   * @param timeout Timeout (how much to wait for the element to become visible. Default: 3 seconds) */
  public static TypeTextIfVisibleiOS typeTextIfVisibleiOS(String text, String timeout) {
    return new TypeTextIfVisibleiOS(text,timeout);
  }

  /**
   * Factory method for TypeTextIfVisibleWeb */
  public static TypeTextIfVisibleWeb getTypeTextIfVisibleWeb() {
    return new TypeTextIfVisibleWeb();
  }

  /**
   * Factory method for TypeTextIfVisibleWeb
   * @param text The text to be typed into the element
   * @param timeout Timeout (how much to wait for the element to become visible. Default: 3 seconds) */
  public static TypeTextIfVisibleWeb typeTextIfVisibleWeb(String text, String timeout) {
    return new TypeTextIfVisibleWeb(text,timeout);
  }

  /**
   * Clear contents (if visible). null */
  public static class ClearContentsIfVisibleAndroid extends ActionProxy {
    /**
     * Timeout (how much to wait for the element to become visible. Default: 3 seconds) (INPUT) */
    public String timeout;

    public ClearContentsIfVisibleAndroid() {
      this.setDescriptor(new ProxyDescriptor("inW2AJJ04ku45E9-RN2zqA", "io.testproject.addon.ClearContentsActions.ClearContentsIfVisibleAndroid"));
    }

    public ClearContentsIfVisibleAndroid(String timeout) {
      this();
      this.timeout = timeout;
    }
  }

  /**
   * Clear contents (if visible). null */
  public static class ClearContentsIfVisibleiOS extends ActionProxy {
    /**
     * Timeout (how much to wait for the element to become visible. Default: 3 seconds) (INPUT) */
    public String timeout;

    public ClearContentsIfVisibleiOS() {
      this.setDescriptor(new ProxyDescriptor("inW2AJJ04ku45E9-RN2zqA", "io.testproject.addon.ClearContentsActions.ClearContentsIfVisibleiOS"));
    }

    public ClearContentsIfVisibleiOS(String timeout) {
      this();
      this.timeout = timeout;
    }
  }

  /**
   * Clear contents (if visible). null */
  public static class ClearContentsIfVisibleWeb extends ActionProxy {
    /**
     * Timeout (how much to wait for the element to become visible. Default: 3 seconds) (INPUT) */
    public String timeout;

    public ClearContentsIfVisibleWeb() {
      this.setDescriptor(new ProxyDescriptor("inW2AJJ04ku45E9-RN2zqA", "io.testproject.addon.ClearContentsActions.ClearContentsIfVisibleWeb"));
    }

    public ClearContentsIfVisibleWeb(String timeout) {
      this();
      this.timeout = timeout;
    }
  }

  /**
   * Click if visible. null */
  public static class ClickIfVisibleAndroid extends ActionProxy {
    /**
     * Timeout (how much to wait for the element to become visible. Default: 3 seconds) (INPUT) */
    public String timeout;

    public ClickIfVisibleAndroid() {
      this.setDescriptor(new ProxyDescriptor("inW2AJJ04ku45E9-RN2zqA", "io.testproject.addon.ClickActions.ClickIfVisibleAndroid"));
    }

    public ClickIfVisibleAndroid(String timeout) {
      this();
      this.timeout = timeout;
    }
  }

  /**
   * Click if visible. null */
  public static class ClickIfVisibleiOS extends ActionProxy {
    /**
     * Timeout (how much to wait for the element to become visible. Default: 3 seconds) (INPUT) */
    public String timeout;

    public ClickIfVisibleiOS() {
      this.setDescriptor(new ProxyDescriptor("inW2AJJ04ku45E9-RN2zqA", "io.testproject.addon.ClickActions.ClickIfVisibleiOS"));
    }

    public ClickIfVisibleiOS(String timeout) {
      this();
      this.timeout = timeout;
    }
  }

  /**
   * Click if visible. null */
  public static class ClickIfVisibleWeb extends ActionProxy {
    /**
     * Timeout (how much to wait for the element to become visible. Default: 3 seconds) (INPUT) */
    public String timeout;

    public ClickIfVisibleWeb() {
      this.setDescriptor(new ProxyDescriptor("inW2AJJ04ku45E9-RN2zqA", "io.testproject.addon.ClickActions.ClickIfVisibleWeb"));
    }

    public ClickIfVisibleWeb(String timeout) {
      this();
      this.timeout = timeout;
    }
  }

  /**
   * Contains text? (if visible). null */
  public static class ContainsTextIfVisibleAndroid extends ActionProxy {
    /**
     * Text (INPUT) */
    public String text;

    /**
     * Timeout (how much to wait for the element to become visible. Default: 3 seconds) (INPUT) */
    public String timeout;

    public ContainsTextIfVisibleAndroid() {
      this.setDescriptor(new ProxyDescriptor("inW2AJJ04ku45E9-RN2zqA", "io.testproject.addon.ContainsTextActions.ContainsTextIfVisibleAndroid"));
    }

    public ContainsTextIfVisibleAndroid(String text, String timeout) {
      this();
      this.text = text;
      this.timeout = timeout;
    }
  }

  /**
   * Contains text? (if visible). null */
  public static class ContainsTextIfVisibleiOS extends ActionProxy {
    /**
     * Text (INPUT) */
    public String text;

    /**
     * Timeout (how much to wait for the element to become visible. Default: 3 seconds) (INPUT) */
    public String timeout;

    public ContainsTextIfVisibleiOS() {
      this.setDescriptor(new ProxyDescriptor("inW2AJJ04ku45E9-RN2zqA", "io.testproject.addon.ContainsTextActions.ContainsTextIfVisibleiOS"));
    }

    public ContainsTextIfVisibleiOS(String text, String timeout) {
      this();
      this.text = text;
      this.timeout = timeout;
    }
  }

  /**
   * Contains text? (if visible). null */
  public static class ContainsTextIfVisibleWeb extends ActionProxy {
    /**
     * Text (INPUT) */
    public String text;

    /**
     * Timeout (how much to wait for the element to become visible. Default: 3 seconds) (INPUT) */
    public String timeout;

    public ContainsTextIfVisibleWeb() {
      this.setDescriptor(new ProxyDescriptor("inW2AJJ04ku45E9-RN2zqA", "io.testproject.addon.ContainsTextActions.ContainsTextIfVisibleWeb"));
    }

    public ContainsTextIfVisibleWeb(String text, String timeout) {
      this();
      this.text = text;
      this.timeout = timeout;
    }
  }

  /**
   * Get text (if visible). null */
  public static class GetTextIfVisibleAndroid extends ActionProxy {
    /**
     * Text (OUTPUT) */
    public String text;

    /**
     * Timeout (how much to wait for the element to become visible. Default: 3 seconds) (INPUT) */
    public String timeout;

    public GetTextIfVisibleAndroid() {
      this.setDescriptor(new ProxyDescriptor("inW2AJJ04ku45E9-RN2zqA", "io.testproject.addon.GetTextActions.GetTextIfVisibleAndroid"));
    }

    public GetTextIfVisibleAndroid(String timeout) {
      this();
      this.timeout = timeout;
    }
  }

  /**
   * Get text (if visible). null */
  public static class GetTextIfVisibleiOS extends ActionProxy {
    /**
     * Text (OUTPUT) */
    public String text;

    /**
     * Timeout (how much to wait for the element to become visible. Default: 3 seconds) (INPUT) */
    public String timeout;

    public GetTextIfVisibleiOS() {
      this.setDescriptor(new ProxyDescriptor("inW2AJJ04ku45E9-RN2zqA", "io.testproject.addon.GetTextActions.GetTextIfVisibleiOS"));
    }

    public GetTextIfVisibleiOS(String timeout) {
      this();
      this.timeout = timeout;
    }
  }

  /**
   * Get text (if visible). null */
  public static class GetTextIfVisibleWeb extends ActionProxy {
    /**
     * Text (OUTPUT) */
    public String text;

    /**
     * Timeout (how much to wait for the element to become visible. Default: 3 seconds) (INPUT) */
    public String timeout;

    public GetTextIfVisibleWeb() {
      this.setDescriptor(new ProxyDescriptor("inW2AJJ04ku45E9-RN2zqA", "io.testproject.addon.GetTextActions.GetTextIfVisibleWeb"));
    }

    public GetTextIfVisibleWeb(String timeout) {
      this();
      this.timeout = timeout;
    }
  }

  /**
   * Is clickable? (if visible). null */
  public static class IsClickableAndroid extends ActionProxy {
    /**
     * Timeout (how much to wait for the element to become visible. Default: 3 seconds) (INPUT) */
    public String timeout;

    public IsClickableAndroid() {
      this.setDescriptor(new ProxyDescriptor("inW2AJJ04ku45E9-RN2zqA", "io.testproject.addon.IsClickableActions.IsClickableAndroid"));
    }

    public IsClickableAndroid(String timeout) {
      this();
      this.timeout = timeout;
    }
  }

  /**
   * Is clickable? (if visible). null */
  public static class IsClickableIOS extends ActionProxy {
    /**
     * Timeout (how much to wait for the element to become visible. Default: 3 seconds) (INPUT) */
    public String timeout;

    public IsClickableIOS() {
      this.setDescriptor(new ProxyDescriptor("inW2AJJ04ku45E9-RN2zqA", "io.testproject.addon.IsClickableActions.IsClickableIOS"));
    }

    public IsClickableIOS(String timeout) {
      this();
      this.timeout = timeout;
    }
  }

  /**
   * Is clickable? (if visible). null */
  public static class IsClickableWeb extends ActionProxy {
    /**
     * Timeout (how much to wait for the element to become visible. Default: 3 seconds) (INPUT) */
    public String timeout;

    public IsClickableWeb() {
      this.setDescriptor(new ProxyDescriptor("inW2AJJ04ku45E9-RN2zqA", "io.testproject.addon.IsClickableActions.IsClickableWeb"));
    }

    public IsClickableWeb(String timeout) {
      this();
      this.timeout = timeout;
    }
  }

  /**
   * Is selected? (if visible). null */
  public static class IsSelectedAndroid extends ActionProxy {
    /**
     * Timeout (how much to wait for the element to become visible. Default: 3 seconds) (INPUT) */
    public String timeout;

    public IsSelectedAndroid() {
      this.setDescriptor(new ProxyDescriptor("inW2AJJ04ku45E9-RN2zqA", "io.testproject.addon.IsSelectedActions.IsSelectedAndroid"));
    }

    public IsSelectedAndroid(String timeout) {
      this();
      this.timeout = timeout;
    }
  }

  /**
   * Is selected? (if visible). null */
  public static class IsSelectediOS extends ActionProxy {
    /**
     * Timeout (how much to wait for the element to become visible. Default: 3 seconds) (INPUT) */
    public String timeout;

    public IsSelectediOS() {
      this.setDescriptor(new ProxyDescriptor("inW2AJJ04ku45E9-RN2zqA", "io.testproject.addon.IsSelectedActions.IsSelectediOS"));
    }

    public IsSelectediOS(String timeout) {
      this();
      this.timeout = timeout;
    }
  }

  /**
   * Is selected? (if visible). null */
  public static class IsSelectedWeb extends ActionProxy {
    /**
     * Timeout (how much to wait for the element to become visible. Default: 3 seconds) (INPUT) */
    public String timeout;

    public IsSelectedWeb() {
      this.setDescriptor(new ProxyDescriptor("inW2AJJ04ku45E9-RN2zqA", "io.testproject.addon.IsSelectedActions.IsSelectedWeb"));
    }

    public IsSelectedWeb(String timeout) {
      this();
      this.timeout = timeout;
    }
  }

  /**
   * Long press gesture (if visible). null */
  public static class LongPressIfVisibleAndroid extends ActionProxy {
    /**
     * Duration (in milliseconds) (INPUT) */
    public String duration;

    /**
     * Timeout (how much to wait for the element to become visible. Default: 3 seconds) (INPUT) */
    public String timeout;

    public LongPressIfVisibleAndroid() {
      this.setDescriptor(new ProxyDescriptor("inW2AJJ04ku45E9-RN2zqA", "io.testproject.addon.LongPressActions.LongPressIfVisibleAndroid"));
    }

    public LongPressIfVisibleAndroid(String duration, String timeout) {
      this();
      this.duration = duration;
      this.timeout = timeout;
    }
  }

  /**
   * Long press gesture (if visible). null */
  public static class LongPressIfVisibleiOS extends ActionProxy {
    /**
     * Duration (in milliseconds) (INPUT) */
    public String duration;

    /**
     * Timeout (how much to wait for the element to become visible. Default: 3 seconds) (INPUT) */
    public String timeout;

    public LongPressIfVisibleiOS() {
      this.setDescriptor(new ProxyDescriptor("inW2AJJ04ku45E9-RN2zqA", "io.testproject.addon.LongPressActions.LongPressIfVisibleiOS"));
    }

    public LongPressIfVisibleiOS(String duration, String timeout) {
      this();
      this.duration = duration;
      this.timeout = timeout;
    }
  }

  /**
   * Swipe on element if visible (Android). Swipes in a given direction on an Android Element if he is visible */
  public static class SwipeAndroid extends ActionProxy {
    /**
     * The direction to wipe (INPUT) */
    public String direction;

    /**
     * How much to swipe ( Pixels ) (INPUT) */
    public int swipeDistance;

    /**
     * How long the swipe will be (in milliseconds) (INPUT) */
    public int swipeDuration;

    public SwipeAndroid() {
      this.setDescriptor(new ProxyDescriptor("inW2AJJ04ku45E9-RN2zqA", "io.testproject.addon.SwipeActions.SwipeAndroid"));
    }

    public SwipeAndroid(String direction, int swipeDistance, int swipeDuration) {
      this();
      this.direction = direction;
      this.swipeDistance = swipeDistance;
      this.swipeDuration = swipeDuration;
    }
  }

  /**
   * Swipe on element if visible (IOS). Swipes in a given direction on an IOS Element if he is visible */
  public static class SwipeIOS extends ActionProxy {
    /**
     * The direction to wipe (INPUT) */
    public String direction;

    /**
     * How much to swipe ( Pixels ) (INPUT) */
    public int swipeDistance;

    /**
     * How long the swipe will be (in milliseconds) (INPUT) */
    public int swipeDuration;

    public SwipeIOS() {
      this.setDescriptor(new ProxyDescriptor("inW2AJJ04ku45E9-RN2zqA", "io.testproject.addon.SwipeActions.SwipeIOS"));
    }

    public SwipeIOS(String direction, int swipeDistance, int swipeDuration) {
      this();
      this.direction = direction;
      this.swipeDistance = swipeDistance;
      this.swipeDuration = swipeDuration;
    }
  }

  /**
   * Tap (if visible). null */
  public static class TapIfVisibleAndroid extends ActionProxy {
    /**
     * Timeout (how much to wait for the element to become visible. Default: 3 seconds) (INPUT) */
    public String timeout;

    public TapIfVisibleAndroid() {
      this.setDescriptor(new ProxyDescriptor("inW2AJJ04ku45E9-RN2zqA", "io.testproject.addon.TapActions.TapIfVisibleAndroid"));
    }

    public TapIfVisibleAndroid(String timeout) {
      this();
      this.timeout = timeout;
    }
  }

  /**
   * Tap (if visible). null */
  public static class TapIfVisibleiOS extends ActionProxy {
    /**
     * Timeout (how much to wait for the element to become visible. Default: 3 seconds) (INPUT) */
    public String timeout;

    public TapIfVisibleiOS() {
      this.setDescriptor(new ProxyDescriptor("inW2AJJ04ku45E9-RN2zqA", "io.testproject.addon.TapActions.TapIfVisibleiOS"));
    }

    public TapIfVisibleiOS(String timeout) {
      this();
      this.timeout = timeout;
    }
  }

  /**
   * Type text (if visible). null */
  public static class TypeTextIfVisibleAndroid extends ActionProxy {
    /**
     * The text to be typed into the element (INPUT) */
    public String text;

    /**
     * Timeout (how much to wait for the element to become visible. Default: 3 seconds) (INPUT) */
    public String timeout;

    public TypeTextIfVisibleAndroid() {
      this.setDescriptor(new ProxyDescriptor("inW2AJJ04ku45E9-RN2zqA", "io.testproject.addon.TypeActions.TypeTextIfVisibleAndroid"));
    }

    public TypeTextIfVisibleAndroid(String text, String timeout) {
      this();
      this.text = text;
      this.timeout = timeout;
    }
  }

  /**
   * Type text (if visible). null */
  public static class TypeTextIfVisibleiOS extends ActionProxy {
    /**
     * The text to be typed into the element (INPUT) */
    public String text;

    /**
     * Timeout (how much to wait for the element to become visible. Default: 3 seconds) (INPUT) */
    public String timeout;

    public TypeTextIfVisibleiOS() {
      this.setDescriptor(new ProxyDescriptor("inW2AJJ04ku45E9-RN2zqA", "io.testproject.addon.TypeActions.TypeTextIfVisibleiOS"));
    }

    public TypeTextIfVisibleiOS(String text, String timeout) {
      this();
      this.text = text;
      this.timeout = timeout;
    }
  }

  /**
   * Type text (if visible). null */
  public static class TypeTextIfVisibleWeb extends ActionProxy {
    /**
     * The text to be typed into the element (INPUT) */
    public String text;

    /**
     * Timeout (how much to wait for the element to become visible. Default: 3 seconds) (INPUT) */
    public String timeout;

    public TypeTextIfVisibleWeb() {
      this.setDescriptor(new ProxyDescriptor("inW2AJJ04ku45E9-RN2zqA", "io.testproject.addon.TypeActions.TypeTextIfVisibleWeb"));
    }

    public TypeTextIfVisibleWeb(String text, String timeout) {
      this();
      this.text = text;
      this.timeout = timeout;
    }
  }
}
