package io.testproject.addon;

import io.testproject.sdk.internal.addons.ActionProxy;
import io.testproject.sdk.internal.addons.ProxyDescriptor;

/**
 * Proxy for Element Extensions Addon */
public class ElementExtensions {
  /**
   * Factory method for CountElementsFoundByAndroid */
  public static CountElementsFoundByAndroid getCountElementsFoundByAndroid() {
    return new CountElementsFoundByAndroid();
  }

  /**
   * Factory method for CountElementsFoundByAndroid
   * @param byType Type to search by (e.g. ID/NAME etc.)
   * @param byString What to search for
   * @param visibleOnly Should search for visible elements only? (Default=false) */
  public static CountElementsFoundByAndroid countElementsFoundByAndroid(String byType,
      String byString, String visibleOnly) {
    return new CountElementsFoundByAndroid(byType,byString,visibleOnly);
  }

  /**
   * Factory method for GetElementLocationAndroid */
  public static GetElementLocationAndroid getGetElementLocationAndroid() {
    return new GetElementLocationAndroid();
  }

  /**
   * Factory method for GetTagNameAndroid */
  public static GetTagNameAndroid getGetTagNameAndroid() {
    return new GetTagNameAndroid();
  }

  /**
   * Factory method for GetXPathAndroid */
  public static GetXPathAndroid getGetXPathAndroid() {
    return new GetXPathAndroid();
  }

  /**
   * Factory method for IsVisibleMultipleElementsAndroid */
  public static IsVisibleMultipleElementsAndroid getIsVisibleMultipleElementsAndroid() {
    return new IsVisibleMultipleElementsAndroid();
  }

  /**
   * Factory method for IsVisibleMultipleElementsAndroid
   * @param byType Type to search by (e.g. ID/NAME etc.)
   * @param elementsLocators Elements locators, delimit by a new line. */
  public static IsVisibleMultipleElementsAndroid isVisibleMultipleElementsAndroid(String byType,
      String elementsLocators) {
    return new IsVisibleMultipleElementsAndroid(byType,elementsLocators);
  }

  /**
   * Factory method for RelativeTapAndroid */
  public static RelativeTapAndroid getRelativeTapAndroid() {
    return new RelativeTapAndroid();
  }

  /**
   * Factory method for RelativeTapAndroid
   * @param horizontal Horizontal percentage between 1 and 100
   * @param vertical Vertical percentage between 1 and 100 */
  public static RelativeTapAndroid relativeTapAndroid(int horizontal, int vertical) {
    return new RelativeTapAndroid(horizontal,vertical);
  }

  /**
   * Factory method for CountElementsFoundByIOS */
  public static CountElementsFoundByIOS getCountElementsFoundByIOS() {
    return new CountElementsFoundByIOS();
  }

  /**
   * Factory method for CountElementsFoundByIOS
   * @param byType Type to search by (e.g. ID/NAME etc.)
   * @param byString What to search for
   * @param visibleOnly Should search for visible elements only? (Default=false) */
  public static CountElementsFoundByIOS countElementsFoundByIOS(String byType, String byString,
      String visibleOnly) {
    return new CountElementsFoundByIOS(byType,byString,visibleOnly);
  }

  /**
   * Factory method for GetElementLocationIOS */
  public static GetElementLocationIOS getGetElementLocationIOS() {
    return new GetElementLocationIOS();
  }

  /**
   * Factory method for GetTagNameIOS */
  public static GetTagNameIOS getGetTagNameIOS() {
    return new GetTagNameIOS();
  }

  /**
   * Factory method for GetXPathIOS */
  public static GetXPathIOS getGetXPathIOS() {
    return new GetXPathIOS();
  }

  /**
   * Factory method for IsVisibleMultipleElementsIOS */
  public static IsVisibleMultipleElementsIOS getIsVisibleMultipleElementsIOS() {
    return new IsVisibleMultipleElementsIOS();
  }

  /**
   * Factory method for IsVisibleMultipleElementsIOS
   * @param byType Type to search by (e.g. ID/NAME etc.)
   * @param elementsLocators Elements locators, delimit by a new line. */
  public static IsVisibleMultipleElementsIOS isVisibleMultipleElementsIOS(String byType,
      String elementsLocators) {
    return new IsVisibleMultipleElementsIOS(byType,elementsLocators);
  }

  /**
   * Factory method for RelativeTapIOS */
  public static RelativeTapIOS getRelativeTapIOS() {
    return new RelativeTapIOS();
  }

  /**
   * Factory method for RelativeTapIOS
   * @param horizontal Horizontal percentage between 1 and 100
   * @param vertical Vertical percentage between 1 and 100 */
  public static RelativeTapIOS relativeTapIOS(int horizontal, int vertical) {
    return new RelativeTapIOS(horizontal,vertical);
  }

  /**
   * Factory method for CountElementsFoundByWeb */
  public static CountElementsFoundByWeb getCountElementsFoundByWeb() {
    return new CountElementsFoundByWeb();
  }

  /**
   * Factory method for CountElementsFoundByWeb
   * @param byType Type to search by (e.g. ID/NAME etc.)
   * @param byString What to search for
   * @param visibleOnly Should search for visible elements only? (Default=false) */
  public static CountElementsFoundByWeb countElementsFoundByWeb(String byType, String byString,
      String visibleOnly) {
    return new CountElementsFoundByWeb(byType,byString,visibleOnly);
  }

  /**
   * Factory method for DoubleClickNoJs */
  public static DoubleClickNoJs getDoubleClickNoJs() {
    return new DoubleClickNoJs();
  }

  /**
   * Factory method for DoubleClickWeb */
  public static DoubleClickWeb getDoubleClickWeb() {
    return new DoubleClickWeb();
  }

  /**
   * Factory method for GetElementLocationWeb */
  public static GetElementLocationWeb getGetElementLocationWeb() {
    return new GetElementLocationWeb();
  }

  /**
   * Factory method for GetTagNameWeb */
  public static GetTagNameWeb getGetTagNameWeb() {
    return new GetTagNameWeb();
  }

  /**
   * Factory method for GetXPathWeb */
  public static GetXPathWeb getGetXPathWeb() {
    return new GetXPathWeb();
  }

  /**
   * Factory method for IsVisibleMultipleElementsWeb */
  public static IsVisibleMultipleElementsWeb getIsVisibleMultipleElementsWeb() {
    return new IsVisibleMultipleElementsWeb();
  }

  /**
   * Factory method for IsVisibleMultipleElementsWeb
   * @param byType Type to search by (e.g. ID/NAME etc.)
   * @param elementsLocators Elements locators, delimit by a new line. */
  public static IsVisibleMultipleElementsWeb isVisibleMultipleElementsWeb(String byType,
      String elementsLocators) {
    return new IsVisibleMultipleElementsWeb(byType,elementsLocators);
  }

  /**
   * Factory method for SwitchToDefault */
  public static SwitchToDefault getSwitchToDefault() {
    return new SwitchToDefault();
  }

  /**
   * Factory method for SwitchToFrame */
  public static SwitchToFrame getSwitchToFrame() {
    return new SwitchToFrame();
  }

  /**
   * Factory method for SwitchToParentFrame */
  public static SwitchToParentFrame getSwitchToParentFrame() {
    return new SwitchToParentFrame();
  }

  /**
   * Count Elements. Counts the amount of elements found by provided locator */
  public static class CountElementsFoundByAndroid extends ActionProxy {
    /**
     * Type to search by (e.g. ID/NAME etc.) (INPUT) */
    public String byType;

    /**
     * What to search for (INPUT) */
    public String byString;

    /**
     * Should search for visible elements only? (Default=false) (INPUT) */
    public String visibleOnly;

    /**
     * Amount of elements found (OUTPUT) */
    public int amount;

    public CountElementsFoundByAndroid() {
      this.setDescriptor(new ProxyDescriptor("Ow3LGSkBqUyGjzyAibUJig", "io.testproject.addons.element.android.CountElementsFoundByAndroid"));
    }

    public CountElementsFoundByAndroid(String byType, String byString, String visibleOnly) {
      this();
      this.byType = byType;
      this.byString = byString;
      this.visibleOnly = visibleOnly;
    }
  }

  /**
   * Get location. Retrieves the location (x,y) of an element */
  public static class GetElementLocationAndroid extends ActionProxy {
    /**
     *  (OUTPUT) */
    public int x;

    /**
     *  (OUTPUT) */
    public int y;

    public GetElementLocationAndroid() {
      this.setDescriptor(new ProxyDescriptor("Ow3LGSkBqUyGjzyAibUJig", "io.testproject.addons.element.android.GetElementLocationAndroid"));
    }
  }

  /**
   * Get Tag Name. Retrieves a tag name of an element */
  public static class GetTagNameAndroid extends ActionProxy {
    /**
     * The name of the tag (OUTPUT) */
    public String tagName;

    public GetTagNameAndroid() {
      this.setDescriptor(new ProxyDescriptor("Ow3LGSkBqUyGjzyAibUJig", "io.testproject.addons.element.android.GetTagNameAndroid"));
    }
  }

  /**
   * Get XPath. Retrieves the xpath of an element */
  public static class GetXPathAndroid extends ActionProxy {
    /**
     * The XPATH of the element (OUTPUT) */
    public String xpath;

    public GetXPathAndroid() {
      this.setDescriptor(new ProxyDescriptor("Ow3LGSkBqUyGjzyAibUJig", "io.testproject.addons.element.android.GetXPathAndroid"));
    }
  }

  /**
   * Are elements visible?. check if provided elements are visible */
  public static class IsVisibleMultipleElementsAndroid extends ActionProxy {
    /**
     * Type to search by (e.g. ID/NAME etc.) (INPUT) */
    public String byType;

    /**
     * Elements locators, delimit by a new line. (INPUT) */
    public String elementsLocators;

    /**
     * A list of elements who are visible and not visible. (OUTPUT) */
    public String results;

    public IsVisibleMultipleElementsAndroid() {
      this.setDescriptor(new ProxyDescriptor("Ow3LGSkBqUyGjzyAibUJig", "io.testproject.addons.element.android.IsVisibleMultipleElementsAndroid"));
    }

    public IsVisibleMultipleElementsAndroid(String byType, String elementsLocators) {
      this();
      this.byType = byType;
      this.elementsLocators = elementsLocators;
    }
  }

  /**
   * Tap element at relative point. Tap element at point relative to it's top-left corner */
  public static class RelativeTapAndroid extends ActionProxy {
    /**
     * Horizontal percentage between 1 and 100 (INPUT) */
    public int horizontal;

    /**
     * Vertical percentage between 1 and 100 (INPUT) */
    public int vertical;

    public RelativeTapAndroid() {
      this.setDescriptor(new ProxyDescriptor("Ow3LGSkBqUyGjzyAibUJig", "io.testproject.addons.element.android.RelativeTapAndroid"));
    }

    public RelativeTapAndroid(int horizontal, int vertical) {
      this();
      this.horizontal = horizontal;
      this.vertical = vertical;
    }
  }

  /**
   * Count Elements. Counts the amount of elements found by provided locator */
  public static class CountElementsFoundByIOS extends ActionProxy {
    /**
     * Type to search by (e.g. ID/NAME etc.) (INPUT) */
    public String byType;

    /**
     * What to search for (INPUT) */
    public String byString;

    /**
     * Should search for visible elements only? (Default=false) (INPUT) */
    public String visibleOnly;

    /**
     * Amount of elements found (OUTPUT) */
    public int amount;

    public CountElementsFoundByIOS() {
      this.setDescriptor(new ProxyDescriptor("Ow3LGSkBqUyGjzyAibUJig", "io.testproject.addons.element.ios.CountElementsFoundByIOS"));
    }

    public CountElementsFoundByIOS(String byType, String byString, String visibleOnly) {
      this();
      this.byType = byType;
      this.byString = byString;
      this.visibleOnly = visibleOnly;
    }
  }

  /**
   * Get location. Retrieves the location (x,y) of an element */
  public static class GetElementLocationIOS extends ActionProxy {
    /**
     *  (OUTPUT) */
    public int x;

    /**
     *  (OUTPUT) */
    public int y;

    public GetElementLocationIOS() {
      this.setDescriptor(new ProxyDescriptor("Ow3LGSkBqUyGjzyAibUJig", "io.testproject.addons.element.ios.GetElementLocationIOS"));
    }
  }

  /**
   * Get Tag Name. Retrieves a tag name of an element */
  public static class GetTagNameIOS extends ActionProxy {
    /**
     * The name of the tag (OUTPUT) */
    public String tagName;

    public GetTagNameIOS() {
      this.setDescriptor(new ProxyDescriptor("Ow3LGSkBqUyGjzyAibUJig", "io.testproject.addons.element.ios.GetTagNameIOS"));
    }
  }

  /**
   * Get XPath. Retrieves the xpath of an element */
  public static class GetXPathIOS extends ActionProxy {
    /**
     * The XPATH of the element (OUTPUT) */
    public String xpath;

    public GetXPathIOS() {
      this.setDescriptor(new ProxyDescriptor("Ow3LGSkBqUyGjzyAibUJig", "io.testproject.addons.element.ios.GetXPathIOS"));
    }
  }

  /**
   * Are elements visible?. check if provided elements are visible */
  public static class IsVisibleMultipleElementsIOS extends ActionProxy {
    /**
     * Type to search by (e.g. ID/NAME etc.) (INPUT) */
    public String byType;

    /**
     * Elements locators, delimit by a new line. (INPUT) */
    public String elementsLocators;

    /**
     * A list of elements who are visible and not visible. (OUTPUT) */
    public String results;

    public IsVisibleMultipleElementsIOS() {
      this.setDescriptor(new ProxyDescriptor("Ow3LGSkBqUyGjzyAibUJig", "io.testproject.addons.element.ios.IsVisibleMultipleElementsIOS"));
    }

    public IsVisibleMultipleElementsIOS(String byType, String elementsLocators) {
      this();
      this.byType = byType;
      this.elementsLocators = elementsLocators;
    }
  }

  /**
   * Tap element at relative point. Tap element at point relative to it's top-left corner */
  public static class RelativeTapIOS extends ActionProxy {
    /**
     * Horizontal percentage between 1 and 100 (INPUT) */
    public int horizontal;

    /**
     * Vertical percentage between 1 and 100 (INPUT) */
    public int vertical;

    public RelativeTapIOS() {
      this.setDescriptor(new ProxyDescriptor("Ow3LGSkBqUyGjzyAibUJig", "io.testproject.addons.element.ios.RelativeTapIOS"));
    }

    public RelativeTapIOS(int horizontal, int vertical) {
      this();
      this.horizontal = horizontal;
      this.vertical = vertical;
    }
  }

  /**
   * Count Elements. Counts the amount of elements found by provided locator */
  public static class CountElementsFoundByWeb extends ActionProxy {
    /**
     * Type to search by (e.g. ID/NAME etc.) (INPUT) */
    public String byType;

    /**
     * What to search for (INPUT) */
    public String byString;

    /**
     * Should search for visible elements only? (Default=false) (INPUT) */
    public String visibleOnly;

    /**
     * Amount of elements found (OUTPUT) */
    public int amount;

    public CountElementsFoundByWeb() {
      this.setDescriptor(new ProxyDescriptor("Ow3LGSkBqUyGjzyAibUJig", "io.testproject.addons.element.web.CountElementsFoundByWeb"));
    }

    public CountElementsFoundByWeb(String byType, String byString, String visibleOnly) {
      this();
      this.byType = byType;
      this.byString = byString;
      this.visibleOnly = visibleOnly;
    }
  }

  /**
   * Double Click.  */
  public static class DoubleClickNoJs extends ActionProxy {
    public DoubleClickNoJs() {
      this.setDescriptor(new ProxyDescriptor("Ow3LGSkBqUyGjzyAibUJig", "io.testproject.addons.element.web.DoubleClickNoJs"));
    }
  }

  /**
   * Double Click (using JavaScript).  */
  public static class DoubleClickWeb extends ActionProxy {
    public DoubleClickWeb() {
      this.setDescriptor(new ProxyDescriptor("Ow3LGSkBqUyGjzyAibUJig", "io.testproject.addons.element.web.DoubleClickWeb"));
    }
  }

  /**
   * Get location. Retrieves the location (x,y) of an element */
  public static class GetElementLocationWeb extends ActionProxy {
    /**
     *  (OUTPUT) */
    public int x;

    /**
     *  (OUTPUT) */
    public int y;

    public GetElementLocationWeb() {
      this.setDescriptor(new ProxyDescriptor("Ow3LGSkBqUyGjzyAibUJig", "io.testproject.addons.element.web.GetElementLocationWeb"));
    }
  }

  /**
   * Get Tag Name. Retrieves a tag name of an element */
  public static class GetTagNameWeb extends ActionProxy {
    /**
     * The name of the tag (OUTPUT) */
    public String tagName;

    public GetTagNameWeb() {
      this.setDescriptor(new ProxyDescriptor("Ow3LGSkBqUyGjzyAibUJig", "io.testproject.addons.element.web.GetTagNameWeb"));
    }
  }

  /**
   * Get xpath.  */
  public static class GetXPathWeb extends ActionProxy {
    /**
     * The XPATH of the element (OUTPUT) */
    public String xpath;

    public GetXPathWeb() {
      this.setDescriptor(new ProxyDescriptor("Ow3LGSkBqUyGjzyAibUJig", "io.testproject.addons.element.web.GetXPathWeb"));
    }
  }

  /**
   * Are elements visible?. check if provided elements are visible */
  public static class IsVisibleMultipleElementsWeb extends ActionProxy {
    /**
     * Type to search by (e.g. ID/NAME etc.) (INPUT) */
    public String byType;

    /**
     * Elements locators, delimit by a new line. (INPUT) */
    public String elementsLocators;

    /**
     * A list of elements who are visible and not visible. (OUTPUT) */
    public String results;

    public IsVisibleMultipleElementsWeb() {
      this.setDescriptor(new ProxyDescriptor("Ow3LGSkBqUyGjzyAibUJig", "io.testproject.addons.element.web.IsVisibleMultipleElementsWeb"));
    }

    public IsVisibleMultipleElementsWeb(String byType, String elementsLocators) {
      this();
      this.byType = byType;
      this.elementsLocators = elementsLocators;
    }
  }

  /**
   * Switch to default content.  */
  public static class SwitchToDefault extends ActionProxy {
    public SwitchToDefault() {
      this.setDescriptor(new ProxyDescriptor("Ow3LGSkBqUyGjzyAibUJig", "io.testproject.addons.element.web.SwitchToDefault"));
    }
  }

  /**
   * Switch to iFrame.  */
  public static class SwitchToFrame extends ActionProxy {
    public SwitchToFrame() {
      this.setDescriptor(new ProxyDescriptor("Ow3LGSkBqUyGjzyAibUJig", "io.testproject.addons.element.web.SwitchToFrame"));
    }
  }

  /**
   * Switch to parent frame.  */
  public static class SwitchToParentFrame extends ActionProxy {
    public SwitchToParentFrame() {
      this.setDescriptor(new ProxyDescriptor("Ow3LGSkBqUyGjzyAibUJig", "SwitchToParentFrame"));
    }
  }
}
