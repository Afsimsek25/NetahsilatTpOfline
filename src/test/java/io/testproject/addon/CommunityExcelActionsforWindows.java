package io.testproject.addon;

import io.testproject.sdk.internal.addons.ActionProxy;
import io.testproject.sdk.internal.addons.ProxyDescriptor;

/**
 * Proxy for Community Excel Actions for Windows Addon */
public class CommunityExcelActionsforWindows {
  /**
   * Factory method for deleteFile */
  public static deleteFile getdeleteFile() {
    return new deleteFile();
  }

  /**
   * Factory method for deleteFile
   * @param filePath Path to the Excel file */
  public static deleteFile deleteFile(String filePath) {
    return new deleteFile(filePath);
  }

  /**
   * Factory method for getData */
  public static getData getgetData() {
    return new getData();
  }

  /**
   * Factory method for getData
   * @param Sheet Sheet Number in Excel (starting from one), Default 1
   * @param Row Row Index in Excel (starting from one)
   * @param Col Column Index in Excel (starting from one)
   * @param filePath Path to the Excel file */
  public static getData getData(int Sheet, int Row, int Col, String filePath) {
    return new getData(Sheet,Row,Col,filePath);
  }

  /**
   * Factory method for getSumOfTheColumnValues */
  public static getSumOfTheColumnValues getgetSumOfTheColumnValues() {
    return new getSumOfTheColumnValues();
  }

  /**
   * Factory method for getSumOfTheColumnValues
   * @param filePath Path to the Excel file
   * @param Sheet Sheet Number in Excel (starting from one), Default 1
   * @param Col Column Index in Excel (starting from one) */
  public static getSumOfTheColumnValues getSumOfTheColumnValues(String filePath, int Sheet,
      int Col) {
    return new getSumOfTheColumnValues(filePath,Sheet,Col);
  }

  /**
   * Factory method for multipleMatching */
  public static multipleMatching getmultipleMatching() {
    return new multipleMatching();
  }

  /**
   * Factory method for multipleMatching
   * @param filePath Path to the Excel file
   * @param Sheet Sheet Number in Excel (starting from one), Default 1
   * @param Col Column Index in Excel (starting from one)
   * @param searchedData Multiple Searched Data ('String,String,String...String') */
  public static multipleMatching multipleMatching(String filePath, int Sheet, int Col,
      String searchedData) {
    return new multipleMatching(filePath,Sheet,Col,searchedData);
  }

  /**
   * Factory method for readColumnValue */
  public static readColumnValue getreadColumnValue() {
    return new readColumnValue();
  }

  /**
   * Factory method for readColumnValue
   * @param Sheet Sheet Number in Excel (starting from one), Default 1
   * @param Col Column Index in Excel (starting from one)
   * @param filePath Path to the Excel file */
  public static readColumnValue readColumnValue(int Sheet, int Col, String filePath) {
    return new readColumnValue(Sheet,Col,filePath);
  }

  /**
   * Factory method for readRowValue */
  public static readRowValue getreadRowValue() {
    return new readRowValue();
  }

  /**
   * Factory method for readRowValue
   * @param filePath Path to the Excel file
   * @param Sheet Sheet Number in Excel (starting from one), Default 1
   * @param Row Row Index in Excel (starting from one) */
  public static readRowValue readRowValue(String filePath, int Sheet, int Row) {
    return new readRowValue(filePath,Sheet,Row);
  }

  /**
   * Factory method for returnColumnIndex */
  public static returnColumnIndex getreturnColumnIndex() {
    return new returnColumnIndex();
  }

  /**
   * Factory method for returnColumnIndex
   * @param Sheet Sheet Number in Excel (starting from one), Default 1
   * @param filePath Path to the Excel file
   * @param textToSearch The text to search in the Columns */
  public static returnColumnIndex returnColumnIndex(int Sheet, String filePath,
      String textToSearch) {
    return new returnColumnIndex(Sheet,filePath,textToSearch);
  }

  /**
   * Factory method for searchData */
  public static searchData getsearchData() {
    return new searchData();
  }

  /**
   * Factory method for searchData
   * @param filePath Path to the Excel file
   * @param Sheet Sheet Number in Excel (starting from one), Default 1
   * @param TextToSearch Searched Text in The All Data */
  public static searchData searchData(String filePath, int Sheet, String TextToSearch) {
    return new searchData(filePath,Sheet,TextToSearch);
  }

  /**
   * Factory method for updateCell */
  public static updateCell getupdateCell() {
    return new updateCell();
  }

  /**
   * Factory method for updateCell
   * @param filePath Path to the Excel file to update
   * @param Sheet Sheet Number in Excel (starting from one), Default 1
   * @param Col Column in Excel (starting from one)
   * @param Row Row Index in Excel (starting from one)
   * @param value Value to update */
  public static updateCell updateCell(String filePath, int Sheet, int Col, int Row, String value) {
    return new updateCell(filePath,Sheet,Col,Row,value);
  }

  /**
   * Factory method for waitUntilFileDownloaded */
  public static waitUntilFileDownloaded getwaitUntilFileDownloaded() {
    return new waitUntilFileDownloaded();
  }

  /**
   * Factory method for waitUntilFileDownloaded
   * @param filePath Path to the file
   * @param Timeout timeout in seconds */
  public static waitUntilFileDownloaded waitUntilFileDownloaded(String filePath, int Timeout) {
    return new waitUntilFileDownloaded(filePath,Timeout);
  }

  /**
   * Delete File (if exist). This Action Deletes the File if it exists and returns True/False */
  public static class deleteFile extends ActionProxy {
    /**
     * Path to the Excel file (INPUT) */
    public String filePath;

    /**
     * Process result (true/false) (OUTPUT) */
    public boolean result;

    public deleteFile() {
      this.setDescriptor(new ProxyDescriptor("aLtKPVo1RE6GxhAWedNDEQ", "main.addon.deleteFile"));
    }

    public deleteFile(String filePath) {
      this();
      this.filePath = filePath;
    }
  }

  /**
   * Get Data From Excel. This action takes index number (row, column) and returns the cell contents. */
  public static class getData extends ActionProxy {
    /**
     * Sheet Number in Excel (starting from one), Default 1 (INPUT) */
    public int Sheet;

    /**
     * Row Index in Excel (starting from one) (INPUT) */
    public int Row;

    /**
     * Column Index in Excel (starting from one) (INPUT) */
    public int Col;

    /**
     * Path to the Excel file (INPUT) */
    public String filePath;

    /**
     * The value inside the column cells (OUTPUT) */
    public String Value;

    public getData() {
      this.setDescriptor(new ProxyDescriptor("aLtKPVo1RE6GxhAWedNDEQ", "main.addon.getData"));
    }

    public getData(int Sheet, int Row, int Col, String filePath) {
      this();
      this.Sheet = Sheet;
      this.Row = Row;
      this.Col = Col;
      this.filePath = filePath;
    }
  }

  /**
   * Get Sum Of The Column Values. This Action Return The Sum Of The Column Values */
  public static class getSumOfTheColumnValues extends ActionProxy {
    /**
     * Path to the Excel file (INPUT) */
    public String filePath;

    /**
     * Sheet Number in Excel (starting from one), Default 1 (INPUT) */
    public int Sheet;

    /**
     * Column Index in Excel (starting from one) (INPUT) */
    public int Col;

    /**
     * The value inside the column cells (OUTPUT) */
    public double columnValue;

    public getSumOfTheColumnValues() {
      this.setDescriptor(new ProxyDescriptor("aLtKPVo1RE6GxhAWedNDEQ", "main.addon.getSumOfTheColumnValues"));
    }

    public getSumOfTheColumnValues(String filePath, int Sheet, int Col) {
      this();
      this.filePath = filePath;
      this.Sheet = Sheet;
      this.Col = Col;
    }
  }

  /**
   * Search multiple matching in Excel Column. Search multiple matching in Exel Column */
  public static class multipleMatching extends ActionProxy {
    /**
     * Path to the Excel file (INPUT) */
    public String filePath;

    /**
     * Sheet Number in Excel (starting from one), Default 1 (INPUT) */
    public int Sheet;

    /**
     * Column Index in Excel (starting from one) (INPUT) */
    public int Col;

    /**
     * Multiple Searched Data ('String,String,String...String') (INPUT) */
    public String searchedData;

    /**
     * value of the processed column (OUTPUT) */
    public String columnValue;

    public multipleMatching() {
      this.setDescriptor(new ProxyDescriptor("aLtKPVo1RE6GxhAWedNDEQ", "main.addon.multipleMatching"));
    }

    public multipleMatching(String filePath, int Sheet, int Col, String searchedData) {
      this();
      this.filePath = filePath;
      this.Sheet = Sheet;
      this.Col = Col;
      this.searchedData = searchedData;
    }
  }

  /**
   * Read Column Values From Excel. This action combines and returns all values in the index-given column. */
  public static class readColumnValue extends ActionProxy {
    /**
     * Sheet Number in Excel (starting from one), Default 1 (INPUT) */
    public int Sheet;

    /**
     * Column Index in Excel (starting from one) (INPUT) */
    public int Col;

    /**
     * Path to the Excel file (INPUT) */
    public String filePath;

    /**
     * The value inside the column cells (OUTPUT) */
    public String columnValue;

    public readColumnValue() {
      this.setDescriptor(new ProxyDescriptor("aLtKPVo1RE6GxhAWedNDEQ", "main.addon.readColumnValue"));
    }

    public readColumnValue(int Sheet, int Col, String filePath) {
      this();
      this.Sheet = Sheet;
      this.Col = Col;
      this.filePath = filePath;
    }
  }

  /**
   * Read Row Values From Excel. This action combines and returns all values in the index-given row. */
  public static class readRowValue extends ActionProxy {
    /**
     * Path to the Excel file (INPUT) */
    public String filePath;

    /**
     * Sheet Number in Excel (starting from one), Default 1 (INPUT) */
    public int Sheet;

    /**
     * Row Index in Excel (starting from one) (INPUT) */
    public int Row;

    /**
     * The values inside the cells in the row (OUTPUT) */
    public String rowValue;

    public readRowValue() {
      this.setDescriptor(new ProxyDescriptor("aLtKPVo1RE6GxhAWedNDEQ", "main.addon.readRowValue"));
    }

    public readRowValue(String filePath, int Sheet, int Row) {
      this();
      this.filePath = filePath;
      this.Sheet = Sheet;
      this.Row = Row;
    }
  }

  /**
   * Get Column Index From Excel. This action takes a text as input (header) and returns the index number (column) containing the input text. */
  public static class returnColumnIndex extends ActionProxy {
    /**
     * Sheet Number in Excel (starting from one), Default 1 (INPUT) */
    public int Sheet;

    /**
     * Path to the Excel file (INPUT) */
    public String filePath;

    /**
     * The text to search in the Columns (INPUT) */
    public String textToSearch;

    /**
     * Column Index in Excel (starting from one) (OUTPUT) */
    public int Col;

    public returnColumnIndex() {
      this.setDescriptor(new ProxyDescriptor("aLtKPVo1RE6GxhAWedNDEQ", "main.addon.returnColumnIndex"));
    }

    public returnColumnIndex(int Sheet, String filePath, String textToSearch) {
      this();
      this.Sheet = Sheet;
      this.filePath = filePath;
      this.textToSearch = textToSearch;
    }
  }

  /**
   * Search Data From Excel. This action returns the index (row and column) of input text. */
  public static class searchData extends ActionProxy {
    /**
     * Path to the Excel file (INPUT) */
    public String filePath;

    /**
     * Sheet Number in Excel (starting from one), Default 1 (INPUT) */
    public int Sheet;

    /**
     * Searched Text in The All Data (INPUT) */
    public String TextToSearch;

    /**
     * Row Index in Excel (starting from one) (OUTPUT) */
    public int Row;

    /**
     * Column Index in Excel (starting from one) (OUTPUT) */
    public int Col;

    public searchData() {
      this.setDescriptor(new ProxyDescriptor("aLtKPVo1RE6GxhAWedNDEQ", "main.addon.searchData"));
    }

    public searchData(String filePath, int Sheet, String TextToSearch) {
      this();
      this.filePath = filePath;
      this.Sheet = Sheet;
      this.TextToSearch = TextToSearch;
    }
  }

  /**
   * Update a specific cell in the Excel file. Updates a Excel file at specified row and column */
  public static class updateCell extends ActionProxy {
    /**
     * Path to the Excel file to update (INPUT) */
    public String filePath;

    /**
     * Sheet Number in Excel (starting from one), Default 1 (INPUT) */
    public int Sheet;

    /**
     * Column in Excel (starting from one) (INPUT) */
    public int Col;

    /**
     * Row Index in Excel (starting from one) (INPUT) */
    public int Row;

    /**
     * Value to update (INPUT) */
    public String value;

    public updateCell() {
      this.setDescriptor(new ProxyDescriptor("aLtKPVo1RE6GxhAWedNDEQ", "main.addon.updateCell"));
    }

    public updateCell(String filePath, int Sheet, int Col, int Row, String value) {
      this();
      this.filePath = filePath;
      this.Sheet = Sheet;
      this.Col = Col;
      this.Row = Row;
      this.value = value;
    }
  }

  /**
   * Wait Until The File is Downloaded. This Action Waits Until The Downloaded File Appears In The System */
  public static class waitUntilFileDownloaded extends ActionProxy {
    /**
     * Path to the file (INPUT) */
    public String filePath;

    /**
     * timeout in seconds (INPUT) */
    public int Timeout;

    /**
     * Process result (true/false) (OUTPUT) */
    public boolean result;

    public waitUntilFileDownloaded() {
      this.setDescriptor(new ProxyDescriptor("aLtKPVo1RE6GxhAWedNDEQ", "main.addon.waitUntilFileDownloaded"));
    }

    public waitUntilFileDownloaded(String filePath, int Timeout) {
      this();
      this.filePath = filePath;
      this.Timeout = Timeout;
    }
  }
}
