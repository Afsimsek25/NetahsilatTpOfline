package io.testproject.addon;

import io.testproject.sdk.internal.addons.ActionProxy;
import io.testproject.sdk.internal.addons.ProxyDescriptor;

/**
 * Proxy for Excel Operations Addon */
public class ExcelOperations {
  /**
   * Factory method for CompareXLSFiles */
  public static CompareXLSFiles getCompareXLSFiles() {
    return new CompareXLSFiles();
  }

  /**
   * Factory method for CompareXLSFiles
   * @param pathToFirstFile Path to first XLSX file (e.g. C:\Temp\excel.xlsx)
   * @param pathToSecondFile Path to second XLSX file (e.g. C:\Temp\excel2.xlsx) */
  public static CompareXLSFiles compareXLSFiles(String pathToFirstFile, String pathToSecondFile) {
    return new CompareXLSFiles(pathToFirstFile,pathToSecondFile);
  }

  /**
   * Factory method for DeleteFile */
  public static DeleteFile getDeleteFile() {
    return new DeleteFile();
  }

  /**
   * Factory method for DeleteFile
   * @param pathToFile Path to XLSX file (e.g. C:\Temp\excel.xlsx) */
  public static DeleteFile deleteFile(String pathToFile) {
    return new DeleteFile(pathToFile);
  }

  /**
   * Factory method for GetCellValue */
  public static GetCellValue getGetCellValue() {
    return new GetCellValue();
  }

  /**
   * Factory method for GetCellValue
   * @param pathToFile Path to XLSX file (e.g. C:\Temp\excel.xlsx)
   * @param sheetName Sheet name, default=first sheet
   * @param columnNumber Column number
   * @param rowNumber Row number */
  public static GetCellValue getCellValue(String pathToFile, String sheetName, String columnNumber,
      String rowNumber) {
    return new GetCellValue(pathToFile,sheetName,columnNumber,rowNumber);
  }

  /**
   * Factory method for GetColumnSum */
  public static GetColumnSum getGetColumnSum() {
    return new GetColumnSum();
  }

  /**
   * Factory method for GetColumnSum
   * @param pathToFile Path to XLSX file (e.g. C:\Temp\excel.xlsx)
   * @param sheetName Sheet name, default=first sheet
   * @param columnNumber Column number */
  public static GetColumnSum getColumnSum(String pathToFile, String sheetName,
      String columnNumber) {
    return new GetColumnSum(pathToFile,sheetName,columnNumber);
  }

  /**
   * Factory method for GetColumnValue */
  public static GetColumnValue getGetColumnValue() {
    return new GetColumnValue();
  }

  /**
   * Factory method for GetColumnValue
   * @param pathToFile Path to XLSX file (e.g. C:\Temp\excel.xlsx)
   * @param sheetName Sheet name, default=first sheet
   * @param columnNumber Column number */
  public static GetColumnValue getColumnValue(String pathToFile, String sheetName,
      String columnNumber) {
    return new GetColumnValue(pathToFile,sheetName,columnNumber);
  }

  /**
   * Factory method for GetRowValue */
  public static GetRowValue getGetRowValue() {
    return new GetRowValue();
  }

  /**
   * Factory method for GetRowValue
   * @param pathToFile Path to XLSX file (e.g. C:\Temp\excel.xlsx)
   * @param sheetName Sheet name, default=first sheet
   * @param rowNumber Row number */
  public static GetRowValue getRowValue(String pathToFile, String sheetName, String rowNumber) {
    return new GetRowValue(pathToFile,sheetName,rowNumber);
  }

  /**
   * Factory method for ReplaceByValue */
  public static ReplaceByValue getReplaceByValue() {
    return new ReplaceByValue();
  }

  /**
   * Factory method for ReplaceByValue
   * @param pathToFile Path to XLSX file (e.g. C:\Temp\excel.xlsx)
   * @param searchValue Search value
   * @param newValue Replace value default=empty string */
  public static ReplaceByValue replaceByValue(String pathToFile, String searchValue,
      String newValue) {
    return new ReplaceByValue(pathToFile,searchValue,newValue);
  }

  /**
   * Factory method for SearchByValue */
  public static SearchByValue getSearchByValue() {
    return new SearchByValue();
  }

  /**
   * Factory method for SearchByValue
   * @param pathToFile Path to the first locally stored XLSX file (e.g. C:\Temp\excel.xlsx)
   * @param searchValue Search value */
  public static SearchByValue searchByValue(String pathToFile, String searchValue) {
    return new SearchByValue(pathToFile,searchValue);
  }

  /**
   * Factory method for SearchHeaderIndex */
  public static SearchHeaderIndex getSearchHeaderIndex() {
    return new SearchHeaderIndex();
  }

  /**
   * Factory method for SearchHeaderIndex
   * @param pathToFile Path to XLSX file (e.g. C:\Temp\excel.xlsx)
   * @param sheetName Sheet name, default=first sheet
   * @param headerValue Header value */
  public static SearchHeaderIndex searchHeaderIndex(String pathToFile, String sheetName,
      String headerValue) {
    return new SearchHeaderIndex(pathToFile,sheetName,headerValue);
  }

  /**
   * Factory method for SetCellValue */
  public static SetCellValue getSetCellValue() {
    return new SetCellValue();
  }

  /**
   * Factory method for SetCellValue
   * @param pathToFile Path to XLSX file (e.g. C:\Temp\excel.xlsx)
   * @param sheetName Sheet name, default=first sheet
   * @param columnNumber Column number
   * @param rowNumber Row number
   * @param newValue New value, default=empty string */
  public static SetCellValue setCellValue(String pathToFile, String sheetName, String columnNumber,
      String rowNumber, String newValue) {
    return new SetCellValue(pathToFile,sheetName,columnNumber,rowNumber,newValue);
  }

  /**
   * Factory method for WaitForDownloadedFile */
  public static WaitForDownloadedFile getWaitForDownloadedFile() {
    return new WaitForDownloadedFile();
  }

  /**
   * Factory method for WaitForDownloadedFile
   * @param pathToFile Path to file (e.g. C:\Temp\excel.xlsx)
   * @param timeOut Timeout in seconds, default=30 seconds */
  public static WaitForDownloadedFile waitForDownloadedFile(String pathToFile, String timeOut) {
    return new WaitForDownloadedFile(pathToFile,timeOut);
  }

  /**
   * Compare two XLSX files. Compare two XLSX files and returns a result */
  public static class CompareXLSFiles extends ActionProxy {
    /**
     * Path to first XLSX file (e.g. C:\Temp\excel.xlsx) (INPUT) */
    public String pathToFirstFile;

    /**
     * Path to second XLSX file (e.g. C:\Temp\excel2.xlsx) (INPUT) */
    public String pathToSecondFile;

    public CompareXLSFiles() {
      this.setDescriptor(new ProxyDescriptor("lmy9pdG0xEO8aLqirvzb0Q", "Actions.CompareXLSFiles"));
    }

    public CompareXLSFiles(String pathToFirstFile, String pathToSecondFile) {
      this();
      this.pathToFirstFile = pathToFirstFile;
      this.pathToSecondFile = pathToSecondFile;
    }
  }

  /**
   * Delete file (if exists). Delete the file from provided path if it exists */
  public static class DeleteFile extends ActionProxy {
    /**
     * Path to XLSX file (e.g. C:\Temp\excel.xlsx) (INPUT) */
    public String pathToFile;

    /**
     * Result (true/false) (OUTPUT) */
    public String fileFound;

    public DeleteFile() {
      this.setDescriptor(new ProxyDescriptor("lmy9pdG0xEO8aLqirvzb0Q", "Actions.DeleteFile"));
    }

    public DeleteFile(String pathToFile) {
      this();
      this.pathToFile = pathToFile;
    }
  }

  /**
   * Get cell value. Extract the cell value from provided parameters */
  public static class GetCellValue extends ActionProxy {
    /**
     * Path to XLSX file (e.g. C:\Temp\excel.xlsx) (INPUT) */
    public String pathToFile;

    /**
     * Sheet name, default=first sheet (INPUT) */
    public String sheetName;

    /**
     * Column number (INPUT) */
    public String columnNumber;

    /**
     * Row number (INPUT) */
    public String rowNumber;

    /**
     * CellValue (OUTPUT) */
    public String cellValue;

    public GetCellValue() {
      this.setDescriptor(new ProxyDescriptor("lmy9pdG0xEO8aLqirvzb0Q", "Actions.GetCellValue"));
    }

    public GetCellValue(String pathToFile, String sheetName, String columnNumber,
        String rowNumber) {
      this();
      this.pathToFile = pathToFile;
      this.sheetName = sheetName;
      this.columnNumber = columnNumber;
      this.rowNumber = rowNumber;
    }
  }

  /**
   * Get column sum. Get the sum of all numbers in a given column ignoring any string */
  public static class GetColumnSum extends ActionProxy {
    /**
     * Path to XLSX file (e.g. C:\Temp\excel.xlsx) (INPUT) */
    public String pathToFile;

    /**
     * Sheet name, default=first sheet (INPUT) */
    public String sheetName;

    /**
     * Column number (INPUT) */
    public String columnNumber;

    /**
     * Sum of the column (OUTPUT) */
    public String columnSum;

    public GetColumnSum() {
      this.setDescriptor(new ProxyDescriptor("lmy9pdG0xEO8aLqirvzb0Q", "Actions.GetColumnSum"));
    }

    public GetColumnSum(String pathToFile, String sheetName, String columnNumber) {
      this();
      this.pathToFile = pathToFile;
      this.sheetName = sheetName;
      this.columnNumber = columnNumber;
    }
  }

  /**
   * Get column values. Get the value of all cells in a given column */
  public static class GetColumnValue extends ActionProxy {
    /**
     * Path to XLSX file (e.g. C:\Temp\excel.xlsx) (INPUT) */
    public String pathToFile;

    /**
     * Sheet name, default=first sheet (INPUT) */
    public String sheetName;

    /**
     * Column number (INPUT) */
    public String columnNumber;

    /**
     * Value of the column (OUTPUT) */
    public String columnValue;

    public GetColumnValue() {
      this.setDescriptor(new ProxyDescriptor("lmy9pdG0xEO8aLqirvzb0Q", "Actions.GetColumnValue"));
    }

    public GetColumnValue(String pathToFile, String sheetName, String columnNumber) {
      this();
      this.pathToFile = pathToFile;
      this.sheetName = sheetName;
      this.columnNumber = columnNumber;
    }
  }

  /**
   * Get row values. Extract the row value from provided parameters */
  public static class GetRowValue extends ActionProxy {
    /**
     * Path to XLSX file (e.g. C:\Temp\excel.xlsx) (INPUT) */
    public String pathToFile;

    /**
     * Sheet name, default=first sheet (INPUT) */
    public String sheetName;

    /**
     * Row number (INPUT) */
    public String rowNumber;

    /**
     * RowValue (OUTPUT) */
    public String rowValue;

    public GetRowValue() {
      this.setDescriptor(new ProxyDescriptor("lmy9pdG0xEO8aLqirvzb0Q", "Actions.GetRowValue"));
    }

    public GetRowValue(String pathToFile, String sheetName, String rowNumber) {
      this();
      this.pathToFile = pathToFile;
      this.sheetName = sheetName;
      this.rowNumber = rowNumber;
    }
  }

  /**
   * Search and replace by value. Search the value from provided parameters and replace it */
  public static class ReplaceByValue extends ActionProxy {
    /**
     * Path to XLSX file (e.g. C:\Temp\excel.xlsx) (INPUT) */
    public String pathToFile;

    /**
     * Search value (INPUT) */
    public String searchValue;

    /**
     * Replace value default=empty string (INPUT) */
    public String newValue;

    /**
     * Replace result (OUTPUT) */
    public String replaceResult;

    public ReplaceByValue() {
      this.setDescriptor(new ProxyDescriptor("lmy9pdG0xEO8aLqirvzb0Q", "Actions.ReplaceByValue"));
    }

    public ReplaceByValue(String pathToFile, String searchValue, String newValue) {
      this();
      this.pathToFile = pathToFile;
      this.searchValue = searchValue;
      this.newValue = newValue;
    }
  }

  /**
   * Search value. Search the value from provided parameters and return result if found */
  public static class SearchByValue extends ActionProxy {
    /**
     * Path to the first locally stored XLSX file (e.g. C:\Temp\excel.xlsx) (INPUT) */
    public String pathToFile;

    /**
     * Search value (INPUT) */
    public String searchValue;

    /**
     * Search result (OUTPUT) */
    public String searchResult;

    public SearchByValue() {
      this.setDescriptor(new ProxyDescriptor("lmy9pdG0xEO8aLqirvzb0Q", "Actions.SearchByValue"));
    }

    public SearchByValue(String pathToFile, String searchValue) {
      this();
      this.pathToFile = pathToFile;
      this.searchValue = searchValue;
    }
  }

  /**
   * Search header index by value. Search the header value from provided parameters and return the header index if found */
  public static class SearchHeaderIndex extends ActionProxy {
    /**
     * Path to XLSX file (e.g. C:\Temp\excel.xlsx) (INPUT) */
    public String pathToFile;

    /**
     * Sheet name, default=first sheet (INPUT) */
    public String sheetName;

    /**
     * Header value (INPUT) */
    public String headerValue;

    /**
     * Header index (OUTPUT) */
    public String headerIndex;

    public SearchHeaderIndex() {
      this.setDescriptor(new ProxyDescriptor("lmy9pdG0xEO8aLqirvzb0Q", "Actions.SearchHeaderIndex"));
    }

    public SearchHeaderIndex(String pathToFile, String sheetName, String headerValue) {
      this();
      this.pathToFile = pathToFile;
      this.sheetName = sheetName;
      this.headerValue = headerValue;
    }
  }

  /**
   * Set cell value. Set the value to a cell from provided parameters */
  public static class SetCellValue extends ActionProxy {
    /**
     * Path to XLSX file (e.g. C:\Temp\excel.xlsx) (INPUT) */
    public String pathToFile;

    /**
     * Sheet name, default=first sheet (INPUT) */
    public String sheetName;

    /**
     * Column number (INPUT) */
    public String columnNumber;

    /**
     * Row number (INPUT) */
    public String rowNumber;

    /**
     * New value, default=empty string (INPUT) */
    public String newValue;

    /**
     * Old value returned from the cell (OUTPUT) */
    public String oldValue;

    public SetCellValue() {
      this.setDescriptor(new ProxyDescriptor("lmy9pdG0xEO8aLqirvzb0Q", "Actions.SetCellValue"));
    }

    public SetCellValue(String pathToFile, String sheetName, String columnNumber, String rowNumber,
        String newValue) {
      this();
      this.pathToFile = pathToFile;
      this.sheetName = sheetName;
      this.columnNumber = columnNumber;
      this.rowNumber = rowNumber;
      this.newValue = newValue;
    }
  }

  /**
   * Wait for file to download. Wait for the file to be downloaded or until the defined timeout */
  public static class WaitForDownloadedFile extends ActionProxy {
    /**
     * Path to file (e.g. C:\Temp\excel.xlsx) (INPUT) */
    public String pathToFile;

    /**
     * Timeout in seconds, default=30 seconds (INPUT) */
    public String timeOut;

    public WaitForDownloadedFile() {
      this.setDescriptor(new ProxyDescriptor("lmy9pdG0xEO8aLqirvzb0Q", "Actions.WaitForDownloadedFile"));
    }

    public WaitForDownloadedFile(String pathToFile, String timeOut) {
      this();
      this.pathToFile = pathToFile;
      this.timeOut = timeOut;
    }
  }
}
