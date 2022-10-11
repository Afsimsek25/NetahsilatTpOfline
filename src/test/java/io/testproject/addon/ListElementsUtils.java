package io.testproject.addon;

import io.testproject.sdk.internal.addons.ActionProxy;
import io.testproject.sdk.internal.addons.ProxyDescriptor;

/**
 * Proxy for List Elements Utils Addon */
public class ListElementsUtils {
  /**
   * Factory method for listElementsContainsText */
  public static listElementsContainsText getlistElementsContainsText() {
    return new listElementsContainsText();
  }

  /**
   * Factory method for listElementsContainsText
   * @param SearchedText Searched Text */
  public static listElementsContainsText listElementsContainsText(String SearchedText) {
    return new listElementsContainsText(SearchedText);
  }

  /**
   * Factory method for listElementsEqualsText */
  public static listElementsEqualsText getlistElementsEqualsText() {
    return new listElementsEqualsText();
  }

  /**
   * Factory method for listElementsEqualsText
   * @param SearchedText Searched Text */
  public static listElementsEqualsText listElementsEqualsText(String SearchedText) {
    return new listElementsEqualsText(SearchedText);
  }

  /**
   * List Elements Contains Text. This action traverses all the elements of the list whose location you have given, one by one, and queries whether the text you are looking for is "Contains"... */
  public static class listElementsContainsText extends ActionProxy {
    /**
     * Searched Text (INPUT) */
    public String SearchedText;

    public listElementsContainsText() {
      this.setDescriptor(new ProxyDescriptor("z5Pg3bg2DUGOAKa-GwAPtw", "main.Addon.listElementsContainsText"));
    }

    public listElementsContainsText(String SearchedText) {
      this();
      this.SearchedText = SearchedText;
    }
  }

  /**
   * List Elements Equals Text. This action traverses all the elements of the list whose location you have given, one by one, and queries whether the text you are looking for is "Equals"... */
  public static class listElementsEqualsText extends ActionProxy {
    /**
     * Searched Text (INPUT) */
    public String SearchedText;

    public listElementsEqualsText() {
      this.setDescriptor(new ProxyDescriptor("z5Pg3bg2DUGOAKa-GwAPtw", "main.Addon.listElementsEqualsText"));
    }

    public listElementsEqualsText(String SearchedText) {
      this();
      this.SearchedText = SearchedText;
    }
  }
}
