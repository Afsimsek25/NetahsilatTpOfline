package io.testproject.addon;

import io.testproject.sdk.internal.addons.ActionProxy;
import io.testproject.sdk.internal.addons.ProxyDescriptor;

/**
 * Proxy for Grid Operations Addon */
public class GridOperations {
  /**
   * Factory method for conditionalClick */
  public static conditionalClick getconditionalClick() {
    return new conditionalClick();
  }

  /**
   * Factory method for conditionalClick
   * @param conditionsLocator Locator of the conditions
   * @param visibility Visibility of Conditional Element (true/false) default = false  */
  public static conditionalClick conditionalClick(String conditionsLocator, boolean visibility) {
    return new conditionalClick(conditionsLocator,visibility);
  }

  /**
   * Factory method for getAllDataWithList */
  public static getAllDataWithList getgetAllDataWithList() {
    return new getAllDataWithList();
  }

  /**
   * Factory method for getData */
  public static GetData getgetData() {
    return new GetData();
  }

  /**
   * Factory method for getData
   * @param searchedTitle Title Of The Searched Column
   * @param searchedData Searched Data in The Column Values
   * @param searchCriteria Contains or Equals */
  public static GetData getData(String searchedTitle, String searchedData, String searchCriteria) {
    return new GetData(searchedTitle,searchedData,searchCriteria);
  }

  /**
   * Factory method for InVısıbleElementGetText */
  public static InVısıbleElementGetText getInVısıbleElementGetText() {
    return new InVısıbleElementGetText();
  }

  /**
   * Factory method for returnGridTitleIndex */
  public static returnGridTitleIndex getreturnGridTitleIndex() {
    return new returnGridTitleIndex();
  }

  /**
   * Factory method for returnGridTitleIndex
   * @param searchedTitle Title Of The Searched Column */
  public static returnGridTitleIndex returnGridTitleIndex(String searchedTitle) {
    return new returnGridTitleIndex(searchedTitle);
  }

  /**
   * Factory method for tooltipReader */
  public static tooltipReader gettooltipReader() {
    return new tooltipReader();
  }

  /**
   * Factory method for tooltipReader
   * @param searchData All Tootips Texts */
  public static tooltipReader tooltipReader(String searchData) {
    return new tooltipReader(searchData);
  }

  /**
   * Conditional Click. Conditional Click */
  public static class conditionalClick extends ActionProxy {
    /**
     * Locator of the conditions (INPUT) */
    public String conditionsLocator;

    /**
     * Visibility of Conditional Element (true/false) default = false  (INPUT) */
    public boolean visibility;

    public conditionalClick() {
      this.setDescriptor(new ProxyDescriptor("eE1yn8-wWkqsjH181lL1zw", "main.Addon.conditionalClick"));
    }

    public conditionalClick(String conditionsLocator, boolean visibility) {
      this();
      this.conditionsLocator = conditionsLocator;
      this.visibility = visibility;
    }
  }

  /**
   * Fetch All Data as List. This action will return all the data you have given the locator as a list  */
  public static class getAllDataWithList extends ActionProxy {
    /**
     * All data is separated by "," (OUTPUT) */
    public String output;

    public getAllDataWithList() {
      this.setDescriptor(new ProxyDescriptor("eE1yn8-wWkqsjH181lL1zw", "main.Addon.getAllDataWithList"));
    }
  }

  /**
   * Get Data From Grid. Get Data From Grid */
  public static class GetData extends ActionProxy {
    /**
     * Title Of The Searched Column (INPUT) */
    public String searchedTitle;

    /**
     * Searched Data in The Column Values (INPUT) */
    public String searchedData;

    /**
     * Contains or Equals (INPUT) */
    public String searchCriteria;

    public GetData() {
      this.setDescriptor(new ProxyDescriptor("eE1yn8-wWkqsjH181lL1zw", "main.Addon.getData"));
    }

    public GetData(String searchedTitle, String searchedData, String searchCriteria) {
      this();
      this.searchedTitle = searchedTitle;
      this.searchedData = searchedData;
      this.searchCriteria = searchCriteria;
    }
  }

  /**
   * In Vısıble Element Get Text. In Vısıble Element Get Text */
  public static class InVısıbleElementGetText extends ActionProxy {
    /**
     * OUTPUT (OUTPUT) */
    public String OUTPUT;

    public InVısıbleElementGetText() {
      this.setDescriptor(new ProxyDescriptor("eE1yn8-wWkqsjH181lL1zw", "main.Addon.InVısıbleElementGetText"));
    }
  }

  /**
   * Return Grid Title Index. Return Grid Title Index */
  public static class returnGridTitleIndex extends ActionProxy {
    /**
     * Title Of The Searched Column (INPUT) */
    public String searchedTitle;

    /**
     * Title Of The Searched Column (OUTPUT) */
    public int titleIndex;

    public returnGridTitleIndex() {
      this.setDescriptor(new ProxyDescriptor("eE1yn8-wWkqsjH181lL1zw", "main.Addon.returnGridTitleIndex"));
    }

    public returnGridTitleIndex(String searchedTitle) {
      this();
      this.searchedTitle = searchedTitle;
    }
  }

  /**
   * Read All Tooltips From Grid. Read All Tooltips From Grid */
  public static class tooltipReader extends ActionProxy {
    /**
     * All Tootips Texts (INPUT) */
    public String searchData;

    public tooltipReader() {
      this.setDescriptor(new ProxyDescriptor("eE1yn8-wWkqsjH181lL1zw", "main.Addon.tooltipReader"));
    }

    public tooltipReader(String searchData) {
      this();
      this.searchData = searchData;
    }
  }
}
