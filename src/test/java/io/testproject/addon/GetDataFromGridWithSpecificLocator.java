package io.testproject.addon;

import io.testproject.sdk.internal.addons.ActionProxy;
import io.testproject.sdk.internal.addons.ProxyDescriptor;

/**
 * Proxy for Get Data From Grid With Specific Locator Addon */
public class GetDataFromGridWithSpecificLocator {
  /**
   * Factory method for getData */
  public static GetData getgetData() {
    return new GetData();
  }

  /**
   * Factory method for getData
   * @param gridLocator Locator of Grid
   * @param searchedTitle Title Of The Searched Column
   * @param searchedData Searched Data in The Column Values
   * @param searchCriteria Contains or Equals */
  public static GetData getData(String gridLocator, String searchedTitle, String searchedData,
                                String searchCriteria) {
    return new GetData(gridLocator,searchedTitle,searchedData,searchCriteria);
  }

  /**
   * Factory method for kartKaydi */
  public static kartKaydi getkartKaydi() {
    return new kartKaydi();
  }

  /**
   * Factory method for kartKaydi
   * @param gridLocator Locator of Grid
   * @param searchedTitle Title Of The Searched Column
   * @param BeginIndex Begin index for substring
   * @param EndIndex End index for substring
   * @param Criteria > Int or < Int or == Int */
  public static kartKaydi kartKaydi(String gridLocator, String searchedTitle, int BeginIndex,
      int EndIndex, String Criteria) {
    return new kartKaydi(gridLocator,searchedTitle,BeginIndex,EndIndex,Criteria);
  }

  /**
   * Get Data From Grid With Specific Locator. Get Data From Grid With Specific Locator */
  public static class GetData extends ActionProxy {
    /**
     * Locator of Grid (INPUT) */
    public String gridLocator;

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
      this.setDescriptor(new ProxyDescriptor("c0DGQHe2LUi8hljvB1TeXw", "main.Addon.getData"));
    }

    public GetData(String gridLocator, String searchedTitle, String searchedData,
                   String searchCriteria) {
      this();
      this.gridLocator = gridLocator;
      this.searchedTitle = searchedTitle;
      this.searchedData = searchedData;
      this.searchCriteria = searchCriteria;
    }
  }

  /**
   * Comparison Operators. This plugin allows you to perform operations on the Integer whose limits you have given. ("> Int" or "< Int" or "== Int") */
  public static class kartKaydi extends ActionProxy {
    /**
     * Locator of Grid (INPUT) */
    public String gridLocator;

    /**
     * Title Of The Searched Column (INPUT) */
    public String searchedTitle;

    /**
     * Begin index for substring (INPUT) */
    public int BeginIndex;

    /**
     * End index for substring (INPUT) */
    public int EndIndex;

    /**
     * > Int or < Int or == Int (INPUT) */
    public String Criteria;

    public kartKaydi() {
      this.setDescriptor(new ProxyDescriptor("c0DGQHe2LUi8hljvB1TeXw", "main.Addon.kartKaydi"));
    }

    public kartKaydi(String gridLocator, String searchedTitle, int BeginIndex, int EndIndex,
        String Criteria) {
      this();
      this.gridLocator = gridLocator;
      this.searchedTitle = searchedTitle;
      this.BeginIndex = BeginIndex;
      this.EndIndex = EndIndex;
      this.Criteria = Criteria;
    }
  }
}
