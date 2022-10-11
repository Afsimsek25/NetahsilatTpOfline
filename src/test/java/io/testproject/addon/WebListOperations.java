package io.testproject.addon;

import io.testproject.sdk.internal.addons.ActionProxy;
import io.testproject.sdk.internal.addons.ProxyDescriptor;

/**
 * Proxy for Web List Operations Addon */
public class WebListOperations {
  /**
   * Factory method for AllItemsContainText */
  public static AllItemsContainText getAllItemsContainText() {
    return new AllItemsContainText();
  }

  /**
   * Factory method for AllItemsContainText
   * @param text Text
   * @param expectedResult Expected result (true/false) */
  public static AllItemsContainText allItemsContainText(String text, boolean expectedResult) {
    return new AllItemsContainText(text,expectedResult);
  }

  /**
   * Factory method for ClickOnListItemWhichContainsText */
  public static ClickOnListItemWhichContainsText getClickOnListItemWhichContainsText() {
    return new ClickOnListItemWhichContainsText();
  }

  /**
   * Factory method for ClickOnListItemWhichContainsText
   * @param text The text of the item */
  public static ClickOnListItemWhichContainsText clickOnListItemWhichContainsText(String text) {
    return new ClickOnListItemWhichContainsText(text);
  }

  /**
   * Factory method for ClickOnNthItem */
  public static ClickOnNthItem getClickOnNthItem() {
    return new ClickOnNthItem();
  }

  /**
   * Factory method for ClickOnNthItem
   * @param index Index of the item to click on */
  public static ClickOnNthItem clickOnNthItem(int index) {
    return new ClickOnNthItem(index);
  }

  /**
   * Factory method for ClickOnRandomItem */
  public static ClickOnRandomItem getClickOnRandomItem() {
    return new ClickOnRandomItem();
  }

  /**
   * Factory method for CountItems */
  public static CountItems getCountItems() {
    return new CountItems();
  }

  /**
   * Factory method for GetTextFromSelectedItem */
  public static GetTextFromSelectedItem getGetTextFromSelectedItem() {
    return new GetTextFromSelectedItem();
  }

  /**
   * Factory method for GetTextOfNthElement */
  public static GetTextOfNthElement getGetTextOfNthElement() {
    return new GetTextOfNthElement();
  }

  /**
   * Factory method for GetTextOfNthElement
   * @param index Index of the inner element */
  public static GetTextOfNthElement getTextOfNthElement(int index) {
    return new GetTextOfNthElement(index);
  }

  /**
   * Check if all items in a web list element contain text. null */
  public static class AllItemsContainText extends ActionProxy {
    /**
     * Text (INPUT) */
    public String text;

    /**
     * Expected result (true/false) (INPUT) */
    public boolean expectedResult;

    public AllItemsContainText() {
      this.setDescriptor(new ProxyDescriptor("Mav6joc0AkWwIDSskHVzTQ", "Actions.AllItemsContainText"));
    }

    public AllItemsContainText(String text, boolean expectedResult) {
      this();
      this.text = text;
      this.expectedResult = expectedResult;
    }
  }

  /**
   * Click On an list item with a specific text.  */
  public static class ClickOnListItemWhichContainsText extends ActionProxy {
    /**
     * The text of the item (INPUT) */
    public String text;

    public ClickOnListItemWhichContainsText() {
      this.setDescriptor(new ProxyDescriptor("Mav6joc0AkWwIDSskHVzTQ", "Actions.ClickOnListItemWhichContainsText"));
    }

    public ClickOnListItemWhichContainsText(String text) {
      this();
      this.text = text;
    }
  }

  /**
   * Click on the Nth item in a web element. null */
  public static class ClickOnNthItem extends ActionProxy {
    /**
     * Index of the item to click on (INPUT) */
    public int index;

    public ClickOnNthItem() {
      this.setDescriptor(new ProxyDescriptor("Mav6joc0AkWwIDSskHVzTQ", "Actions.ClickOnNthItem"));
    }

    public ClickOnNthItem(int index) {
      this();
      this.index = index;
    }
  }

  /**
   * Click a random item on the list.  */
  public static class ClickOnRandomItem extends ActionProxy {
    public ClickOnRandomItem() {
      this.setDescriptor(new ProxyDescriptor("Mav6joc0AkWwIDSskHVzTQ", "Actions.ClickOnRandomItem"));
    }
  }

  /**
   * Count items in a web list element. null */
  public static class CountItems extends ActionProxy {
    /**
     * Number of elements inside the web list element (OUTPUT) */
    public int numOfElements;

    public CountItems() {
      this.setDescriptor(new ProxyDescriptor("Mav6joc0AkWwIDSskHVzTQ", "Actions.CountItems"));
    }
  }

  /**
   * Get Text from Currently Selected Option.  */
  public static class GetTextFromSelectedItem extends ActionProxy {
    /**
     * Text of the first selected option (OUTPUT) */
    public String result;

    public GetTextFromSelectedItem() {
      this.setDescriptor(new ProxyDescriptor("Mav6joc0AkWwIDSskHVzTQ", "Actions.GetTextFromSelectedItem"));
    }
  }

  /**
   * Get text from the Nth child in a web list element. null */
  public static class GetTextOfNthElement extends ActionProxy {
    /**
     * Index of the inner element (INPUT) */
    public int index;

    /**
     * Text of Nth element (OUTPUT) */
    public String text;

    public GetTextOfNthElement() {
      this.setDescriptor(new ProxyDescriptor("Mav6joc0AkWwIDSskHVzTQ", "Actions.GetTextOfNthElement"));
    }

    public GetTextOfNthElement(int index) {
      this();
      this.index = index;
    }
  }
}
