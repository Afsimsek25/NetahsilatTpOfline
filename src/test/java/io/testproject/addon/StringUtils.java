package io.testproject.addon;

import io.testproject.sdk.internal.addons.ActionProxy;
import io.testproject.sdk.internal.addons.ProxyDescriptor;

/**
 * Proxy for String Utils Addon */
public class StringUtils {
  /**
   * Factory method for CompareTwoStrings */
  public static CompareTwoStrings getCompareTwoStrings() {
    return new CompareTwoStrings();
  }

  /**
   * Factory method for CompareTwoStrings
   * @param firstString First string to be compared
   * @param secondString Second string to be compared
   * @param ignoreCase Ignore case differences? (true/false)
   * @param expectedResult Expected result (0 = equal strings, -1 = the first string is greater, 1 = the second string is greater) */
  public static CompareTwoStrings compareTwoStrings(String firstString, String secondString,
      boolean ignoreCase, int expectedResult) {
    return new CompareTwoStrings(firstString,secondString,ignoreCase,expectedResult);
  }

  /**
   * Factory method for ConcatenateTwoStrings */
  public static ConcatenateTwoStrings getConcatenateTwoStrings() {
    return new ConcatenateTwoStrings();
  }

  /**
   * Factory method for ConcatenateTwoStrings
   * @param firstString Original (source) string
   * @param secondString String to be added to end of the  first string */
  public static ConcatenateTwoStrings concatenateTwoStrings(String firstString,
      String secondString) {
    return new ConcatenateTwoStrings(firstString,secondString);
  }

  /**
   * Factory method for ConvertStringToLowerCase */
  public static ConvertStringToLowerCase getConvertStringToLowerCase() {
    return new ConvertStringToLowerCase();
  }

  /**
   * Factory method for ConvertStringToLowerCase
   * @param inputString Input string to convert to lowercase */
  public static ConvertStringToLowerCase convertStringToLowerCase(String inputString) {
    return new ConvertStringToLowerCase(inputString);
  }

  /**
   * Factory method for ConvertStringToNumber */
  public static ConvertStringToNumber getConvertStringToNumber() {
    return new ConvertStringToNumber();
  }

  /**
   * Factory method for ConvertStringToNumber
   * @param input The input string to convert */
  public static ConvertStringToNumber convertStringToNumber(String input) {
    return new ConvertStringToNumber(input);
  }

  /**
   * Factory method for ConvertStringToUpperCase */
  public static ConvertStringToUpperCase getConvertStringToUpperCase() {
    return new ConvertStringToUpperCase();
  }

  /**
   * Factory method for ConvertStringToUpperCase
   * @param inputString Input string to convert to uppercase */
  public static ConvertStringToUpperCase convertStringToUpperCase(String inputString) {
    return new ConvertStringToUpperCase(inputString);
  }

  /**
   * Factory method for CountStrings */
  public static CountStrings getCountStrings() {
    return new CountStrings();
  }

  /**
   * Factory method for CountStrings
   * @param inputString The input string to count, for example: [abc, adf] will return 2
   * @param delimiter The delimiter of the strings (Default: ',') */
  public static CountStrings countStrings(String inputString, String delimiter) {
    return new CountStrings(inputString,delimiter);
  }

  /**
   * Factory method for ExtractStringUsingRegex */
  public static ExtractStringUsingRegex getExtractStringUsingRegex() {
    return new ExtractStringUsingRegex();
  }

  /**
   * Factory method for ExtractStringUsingRegex
   * @param regex The Regex to extract the string
   * @param input The input string */
  public static ExtractStringUsingRegex extractStringUsingRegex(String regex, String input) {
    return new ExtractStringUsingRegex(regex,input);
  }

  /**
   * Factory method for FindLastSubstringIndexFromIndex */
  public static FindLastSubstringIndexFromIndex getFindLastSubstringIndexFromIndex() {
    return new FindLastSubstringIndexFromIndex();
  }

  /**
   * Factory method for FindLastSubstringIndexFromIndex
   * @param sourceString Source string to search occurrences
   * @param subString Substring to search for in sourceString
   * @param fromIndex Searching backward in the source string from this index */
  public static FindLastSubstringIndexFromIndex findLastSubstringIndexFromIndex(String sourceString,
      String subString, int fromIndex) {
    return new FindLastSubstringIndexFromIndex(sourceString,subString,fromIndex);
  }

  /**
   * Factory method for FindSubstringIndex */
  public static FindSubstringIndex getFindSubstringIndex() {
    return new FindSubstringIndex();
  }

  /**
   * Factory method for FindSubstringIndex
   * @param sourceString Source string to search occurrences in
   * @param subString Substring to search for in sourceString
   * @param fromIndex Start search from this index */
  public static FindSubstringIndex findSubstringIndex(String sourceString, String subString,
      int fromIndex) {
    return new FindSubstringIndex(sourceString,subString,fromIndex);
  }

  /**
   * Factory method for FindSubstringLastIndex */
  public static FindSubstringLastIndex getFindSubstringLastIndex() {
    return new FindSubstringLastIndex();
  }

  /**
   * Factory method for FindSubstringLastIndex
   * @param sourceString Source string to search occurrence in
   * @param substring Substring to search for in sourceString */
  public static FindSubstringLastIndex findSubstringLastIndex(String sourceString,
      String substring) {
    return new FindSubstringLastIndex(sourceString,substring);
  }

  /**
   * Factory method for GetStringSubstring */
  public static GetStringSubstring getGetStringSubstring() {
    return new GetStringSubstring();
  }

  /**
   * Factory method for GetStringSubstring
   * @param beginIndex Begin index for substring
   * @param endIndex End index for substring
   * @param inputString input string to run substring on */
  public static GetStringSubstring getStringSubstring(int beginIndex, int endIndex,
      String inputString) {
    return new GetStringSubstring(beginIndex,endIndex,inputString);
  }

  /**
   * Factory method for InsertStringInIndex */
  public static InsertStringInIndex getInsertStringInIndex() {
    return new InsertStringInIndex();
  }

  /**
   * Factory method for InsertStringInIndex
   * @param inputString The input string
   * @param index The index where to add the string
   * @param stringToInsert The string to insert (Default: '.') */
  public static InsertStringInIndex insertStringInIndex(String inputString, int index,
      String stringToInsert) {
    return new InsertStringInIndex(inputString,index,stringToInsert);
  }

  /**
   * Factory method for IsStringEmpty */
  public static IsStringEmpty getIsStringEmpty() {
    return new IsStringEmpty();
  }

  /**
   * Factory method for IsStringEmpty
   * @param string Input string to check
   * @param expectedResult Expected result (true/false) */
  public static IsStringEmpty isStringEmpty(String string, boolean expectedResult) {
    return new IsStringEmpty(string,expectedResult);
  }

  /**
   * Factory method for ReplaceSubstringFirstOcurrence */
  public static ReplaceSubstringFirstOcurrence getReplaceSubstringFirstOcurrence() {
    return new ReplaceSubstringFirstOcurrence();
  }

  /**
   * Factory method for ReplaceSubstringFirstOcurrence
   * @param sourceString Source string
   * @param regex Regular expression to search for
   * @param replacement Replacement string (to replace first occurrence of regular expression) */
  public static ReplaceSubstringFirstOcurrence replaceSubstringFirstOcurrence(String sourceString,
      String regex, String replacement) {
    return new ReplaceSubstringFirstOcurrence(sourceString,regex,replacement);
  }

  /**
   * Factory method for ReplaceSubstrings */
  public static ReplaceSubstrings getReplaceSubstrings() {
    return new ReplaceSubstrings();
  }

  /**
   * Factory method for ReplaceSubstrings
   * @param inputString String to perform replacements
   * @param target Sequence to be replaced
   * @param replacement Substring to replace with */
  public static ReplaceSubstrings replaceSubstrings(String inputString, String target,
      String replacement) {
    return new ReplaceSubstrings(inputString,target,replacement);
  }

  /**
   * Factory method for ReplaceSubstringsWithRegex */
  public static ReplaceSubstringsWithRegex getReplaceSubstringsWithRegex() {
    return new ReplaceSubstringsWithRegex();
  }

  /**
   * Factory method for ReplaceSubstringsWithRegex
   * @param sourceString Source string
   * @param regex Regular expression to search for
   * @param replacement Replacement string (to replace all occurrences of regular expression results) */
  public static ReplaceSubstringsWithRegex replaceSubstringsWithRegex(String sourceString,
      String regex, String replacement) {
    return new ReplaceSubstringsWithRegex(sourceString,regex,replacement);
  }

  /**
   * Factory method for SplitStringWithRegex */
  public static SplitStringWithRegex getSplitStringWithRegex() {
    return new SplitStringWithRegex();
  }

  /**
   * Factory method for SplitStringWithRegex
   * @param sourceString Source string to split
   * @param regex Regex to split around
   * @param limit Limit of strings to get
   * @param indexOfElement Index of element in the array to extract, starts from 0 (Optional) */
  public static SplitStringWithRegex splitStringWithRegex(String sourceString, String regex,
      int limit, String indexOfElement) {
    return new SplitStringWithRegex(sourceString,regex,limit,indexOfElement);
  }

  /**
   * Factory method for StringContains */
  public static StringContains getStringContains() {
    return new StringContains();
  }

  /**
   * Factory method for StringContains
   * @param inputString String to search the substring in
   * @param substring Substring to search for
   * @param caseSensitive Does the substring case-sensitive?
   * @param expectedResult Expected result (true/false - Default: true) */
  public static StringContains stringContains(String inputString, String substring,
      boolean caseSensitive, String expectedResult) {
    return new StringContains(inputString,substring,caseSensitive,expectedResult);
  }

  /**
   * Factory method for StringLength */
  public static StringLength getStringLength() {
    return new StringLength();
  }

  /**
   * Factory method for StringLength
   * @param inputString The string you want to get the length of */
  public static StringLength stringLength(String inputString) {
    return new StringLength(inputString);
  }

  /**
   * Factory method for StringStartsWith */
  public static StringStartsWith getStringStartsWith() {
    return new StringStartsWith();
  }

  /**
   * Factory method for StringStartsWith
   * @param sourceString Source string to check if it starts with given prefix
   * @param prefix Prefix to check
   * @param offset Offset to start searching from
   * @param expectedResult Expected result (true/false) */
  public static StringStartsWith stringStartsWith(String sourceString, String prefix, int offset,
      boolean expectedResult) {
    return new StringStartsWith(sourceString,prefix,offset,expectedResult);
  }

  /**
   * Factory method for TransformCharacterAtIndex */
  public static TransformCharacterAtIndex getTransformCharacterAtIndex() {
    return new TransformCharacterAtIndex();
  }

  /**
   * Factory method for TransformCharacterAtIndex
   * @param input The input string
   * @param lowerOrUpperCase Insert upper or lower to decide the case (Default: lower)
   * @param index The index of the character to transform (Default: 0) */
  public static TransformCharacterAtIndex transformCharacterAtIndex(String input,
      String lowerOrUpperCase, String index) {
    return new TransformCharacterAtIndex(input,lowerOrUpperCase,index);
  }

  /**
   * Factory method for TrimString */
  public static TrimString getTrimString() {
    return new TrimString();
  }

  /**
   * Factory method for TrimString
   * @param sourceString Source string */
  public static TrimString trimString(String sourceString) {
    return new TrimString(sourceString);
  }

  /**
   * Compare two strings. Compares two given strings lexicographically. Each character of both the strings is converted into a Unicode value for comparison. */
  public static class CompareTwoStrings extends ActionProxy {
    /**
     * First string to be compared (INPUT) */
    public String firstString;

    /**
     * Second string to be compared (INPUT) */
    public String secondString;

    /**
     * Ignore case differences? (true/false) (INPUT) */
    public boolean ignoreCase;

    /**
     * Expected result (0 = equal strings, -1 = the first string is greater, 1 = the second string is greater) (INPUT) */
    public int expectedResult;

    /**
     * Comparison result (OUTPUT) */
    public int result;

    public CompareTwoStrings() {
      this.setDescriptor(new ProxyDescriptor("D5P7e9ZMO0aPwXNrWJE9iA", "CompareTwoStrings"));
    }

    public CompareTwoStrings(String firstString, String secondString, boolean ignoreCase,
        int expectedResult) {
      this();
      this.firstString = firstString;
      this.secondString = secondString;
      this.ignoreCase = ignoreCase;
      this.expectedResult = expectedResult;
    }
  }

  /**
   * Concatenate two strings. Concatenates the second string to the end of the original string */
  public static class ConcatenateTwoStrings extends ActionProxy {
    /**
     * Original (source) string (INPUT) */
    public String firstString;

    /**
     * String to be added to end of the  first string (INPUT) */
    public String secondString;

    /**
     * Result string comprised of concatenation (OUTPUT) */
    public String result;

    public ConcatenateTwoStrings() {
      this.setDescriptor(new ProxyDescriptor("D5P7e9ZMO0aPwXNrWJE9iA", "ConcatenateTwoStrings"));
    }

    public ConcatenateTwoStrings(String firstString, String secondString) {
      this();
      this.firstString = firstString;
      this.secondString = secondString;
    }
  }

  /**
   * Convert string to lowercase. Converts a given string to lowercase */
  public static class ConvertStringToLowerCase extends ActionProxy {
    /**
     * Input string to convert to lowercase (INPUT) */
    public String inputString;

    /**
     * Result (OUTPUT) */
    public String result;

    public ConvertStringToLowerCase() {
      this.setDescriptor(new ProxyDescriptor("D5P7e9ZMO0aPwXNrWJE9iA", "ConvertStringToLowerCase"));
    }

    public ConvertStringToLowerCase(String inputString) {
      this();
      this.inputString = inputString;
    }
  }

  /**
   * Convert String To Number.  */
  public static class ConvertStringToNumber extends ActionProxy {
    /**
     * The input string to convert (INPUT) */
    public String input;

    /**
     * Numeric values only (OUTPUT) */
    public String output;

    public ConvertStringToNumber() {
      this.setDescriptor(new ProxyDescriptor("D5P7e9ZMO0aPwXNrWJE9iA", "ConvertStringToNumber"));
    }

    public ConvertStringToNumber(String input) {
      this();
      this.input = input;
    }
  }

  /**
   * Convert string to uppercase. Converts a given string to uppercase */
  public static class ConvertStringToUpperCase extends ActionProxy {
    /**
     * Input string to convert to uppercase (INPUT) */
    public String inputString;

    /**
     * Result (OUTPUT) */
    public String result;

    public ConvertStringToUpperCase() {
      this.setDescriptor(new ProxyDescriptor("D5P7e9ZMO0aPwXNrWJE9iA", "ConvertStringToUpperCase"));
    }

    public ConvertStringToUpperCase(String inputString) {
      this();
      this.inputString = inputString;
    }
  }

  /**
   * Count Strings. Count how many strings are present in '{{inputString}}' with a given delimiter '{{delimiter}}' */
  public static class CountStrings extends ActionProxy {
    /**
     * The input string to count, for example: [abc, adf] will return 2 (INPUT) */
    public String inputString;

    /**
     * The delimiter of the strings (Default: ',') (INPUT) */
    public String delimiter;

    /**
     * The result of the count (OUTPUT) */
    public int count;

    public CountStrings() {
      this.setDescriptor(new ProxyDescriptor("D5P7e9ZMO0aPwXNrWJE9iA", "CountStrings"));
    }

    public CountStrings(String inputString, String delimiter) {
      this();
      this.inputString = inputString;
      this.delimiter = delimiter;
    }
  }

  /**
   * Extract String using RegEx.  */
  public static class ExtractStringUsingRegex extends ActionProxy {
    /**
     * Extracted string (OUTPUT) */
    public String output;

    /**
     * The Regex to extract the string (INPUT) */
    public String regex;

    /**
     * The input string (INPUT) */
    public String input;

    public ExtractStringUsingRegex() {
      this.setDescriptor(new ProxyDescriptor("D5P7e9ZMO0aPwXNrWJE9iA", "ExtractStringUsingRegex"));
    }

    public ExtractStringUsingRegex(String regex, String input) {
      this();
      this.regex = regex;
      this.input = input;
    }
  }

  /**
   * Find last index of substring from index. Returns the index within source string of the last occurrence of specified substring, searching backward starting at the specified index */
  public static class FindLastSubstringIndexFromIndex extends ActionProxy {
    /**
     * Source string to search occurrences (INPUT) */
    public String sourceString;

    /**
     * Substring to search for in sourceString (INPUT) */
    public String subString;

    /**
     * Searching backward in the source string from this index (INPUT) */
    public int fromIndex;

    /**
     * Index of last occurrence of specified substring in provided string (OUTPUT) */
    public int index;

    public FindLastSubstringIndexFromIndex() {
      this.setDescriptor(new ProxyDescriptor("D5P7e9ZMO0aPwXNrWJE9iA", "FindLastSubstringIndexFromIndex"));
    }

    public FindLastSubstringIndexFromIndex(String sourceString, String subString, int fromIndex) {
      this();
      this.sourceString = sourceString;
      this.subString = subString;
      this.fromIndex = fromIndex;
    }
  }

  /**
   * Find substring index. Returns the index within source string of the first occurrence of specified substring */
  public static class FindSubstringIndex extends ActionProxy {
    /**
     * Source string to search occurrences in (INPUT) */
    public String sourceString;

    /**
     * Substring to search for in sourceString (INPUT) */
    public String subString;

    /**
     * Start search from this index (INPUT) */
    public int fromIndex;

    /**
     * Index of first occurrence of specified substring (OUTPUT) */
    public int index;

    public FindSubstringIndex() {
      this.setDescriptor(new ProxyDescriptor("D5P7e9ZMO0aPwXNrWJE9iA", "FindSubstringIndex"));
    }

    public FindSubstringIndex(String sourceString, String subString, int fromIndex) {
      this();
      this.sourceString = sourceString;
      this.subString = subString;
      this.fromIndex = fromIndex;
    }
  }

  /**
   * Find substring last index. Returns the index within source string of the last occurrence of specified substring */
  public static class FindSubstringLastIndex extends ActionProxy {
    /**
     * Source string to search occurrence in (INPUT) */
    public String sourceString;

    /**
     * Substring to search for in sourceString (INPUT) */
    public String substring;

    /**
     * Index of last occurrence of specified substring (OUTPUT) */
    public int index;

    public FindSubstringLastIndex() {
      this.setDescriptor(new ProxyDescriptor("D5P7e9ZMO0aPwXNrWJE9iA", "FindSubstringLastIndex"));
    }

    public FindSubstringLastIndex(String sourceString, String substring) {
      this();
      this.sourceString = sourceString;
      this.substring = substring;
    }
  }

  /**
   * Get substring in range. Gets the substring from a string between start and end indexes */
  public static class GetStringSubstring extends ActionProxy {
    /**
     * Begin index for substring (INPUT) */
    public int beginIndex;

    /**
     * End index for substring (INPUT) */
    public int endIndex;

    /**
     * input string to run substring on (INPUT) */
    public String inputString;

    /**
     * Result of substring operation (OUTPUT) */
    public String result;

    public GetStringSubstring() {
      this.setDescriptor(new ProxyDescriptor("D5P7e9ZMO0aPwXNrWJE9iA", "GetStringSubstring"));
    }

    public GetStringSubstring(int beginIndex, int endIndex, String inputString) {
      this();
      this.beginIndex = beginIndex;
      this.endIndex = endIndex;
      this.inputString = inputString;
    }
  }

  /**
   * Insert substring into string in a given index. Insert {{stringToInsert}} into {{inputString}} at {{index}} */
  public static class InsertStringInIndex extends ActionProxy {
    /**
     * The input string (INPUT) */
    public String inputString;

    /**
     * The index where to add the string (INPUT) */
    public int index;

    /**
     * The string to insert (Default: '.') (INPUT) */
    public String stringToInsert;

    /**
     * The result string (OUTPUT) */
    public String convertedString;

    public InsertStringInIndex() {
      this.setDescriptor(new ProxyDescriptor("D5P7e9ZMO0aPwXNrWJE9iA", "InsertStringInIndex"));
    }

    public InsertStringInIndex(String inputString, int index, String stringToInsert) {
      this();
      this.inputString = inputString;
      this.index = index;
      this.stringToInsert = stringToInsert;
    }
  }

  /**
   * String is empty?. Checks if a given string is empty */
  public static class IsStringEmpty extends ActionProxy {
    /**
     * Input string to check (INPUT) */
    public String string;

    /**
     * Expected result (true/false) (INPUT) */
    public boolean expectedResult;

    /**
     * Result (OUTPUT) */
    public boolean result;

    public IsStringEmpty() {
      this.setDescriptor(new ProxyDescriptor("D5P7e9ZMO0aPwXNrWJE9iA", "IsStringEmpty"));
    }

    public IsStringEmpty(String string, boolean expectedResult) {
      this();
      this.string = string;
      this.expectedResult = expectedResult;
    }
  }

  /**
   * Replace first substring. Replaces the first substring of source string that match the given regular expression with the given replacement */
  public static class ReplaceSubstringFirstOcurrence extends ActionProxy {
    /**
     * Source string (INPUT) */
    public String sourceString;

    /**
     * Regular expression to search for (INPUT) */
    public String regex;

    /**
     * Replacement string (to replace first occurrence of regular expression) (INPUT) */
    public String replacement;

    /**
     * Result string of ReplaceFirst operation (OUTPUT) */
    public String resultString;

    public ReplaceSubstringFirstOcurrence() {
      this.setDescriptor(new ProxyDescriptor("D5P7e9ZMO0aPwXNrWJE9iA", "ReplaceSubstringFirstOcurrence"));
    }

    public ReplaceSubstringFirstOcurrence(String sourceString, String regex, String replacement) {
      this();
      this.sourceString = sourceString;
      this.regex = regex;
      this.replacement = replacement;
    }
  }

  /**
   * Replace substrings. Replaces all substrings in the input string */
  public static class ReplaceSubstrings extends ActionProxy {
    /**
     * String to perform replacements (INPUT) */
    public String inputString;

    /**
     * Sequence to be replaced (INPUT) */
    public String target;

    /**
     * Substring to replace with (INPUT) */
    public String replacement;

    /**
     * Modified string after replacements (OUTPUT) */
    public String result;

    public ReplaceSubstrings() {
      this.setDescriptor(new ProxyDescriptor("D5P7e9ZMO0aPwXNrWJE9iA", "ReplaceSubstrings"));
    }

    public ReplaceSubstrings(String inputString, String target, String replacement) {
      this();
      this.inputString = inputString;
      this.target = target;
      this.replacement = replacement;
    }
  }

  /**
   * Replace substrings with regex. Replaces all substrings of source string that match the given regular expression with the given replacement */
  public static class ReplaceSubstringsWithRegex extends ActionProxy {
    /**
     * Source string (INPUT) */
    public String sourceString;

    /**
     * Regular expression to search for (INPUT) */
    public String regex;

    /**
     * Replacement string (to replace all occurrences of regular expression results) (INPUT) */
    public String replacement;

    /**
     * Result string (OUTPUT) */
    public String resultString;

    public ReplaceSubstringsWithRegex() {
      this.setDescriptor(new ProxyDescriptor("D5P7e9ZMO0aPwXNrWJE9iA", "ReplaceSubstringsWithRegex"));
    }

    public ReplaceSubstringsWithRegex(String sourceString, String regex, String replacement) {
      this();
      this.sourceString = sourceString;
      this.regex = regex;
      this.replacement = replacement;
    }
  }

  /**
   * Split string with regex. Splits string around matches of given regular expression */
  public static class SplitStringWithRegex extends ActionProxy {
    /**
     * Source string to split (INPUT) */
    public String sourceString;

    /**
     * Regex to split around (INPUT) */
    public String regex;

    /**
     * Limit of strings to get (INPUT) */
    public int limit;

    /**
     * Index of element in the array to extract, starts from 0 (Optional) (INPUT) */
    public String indexOfElement;

    /**
     * String array of items result from split (OUTPUT) */
    public String result;

    /**
     * Value of extracted element from the array (if applicable) (OUTPUT) */
    public String valueOfElement;

    /**
     * Number of elements (OUTPUT) */
    public int numberOfElements;

    public SplitStringWithRegex() {
      this.setDescriptor(new ProxyDescriptor("D5P7e9ZMO0aPwXNrWJE9iA", "SplitStringWithRegex"));
    }

    public SplitStringWithRegex(String sourceString, String regex, int limit,
        String indexOfElement) {
      this();
      this.sourceString = sourceString;
      this.regex = regex;
      this.limit = limit;
      this.indexOfElement = indexOfElement;
    }
  }

  /**
   * String contains?. Checks if the input string contains the given sequence */
  public static class StringContains extends ActionProxy {
    /**
     * String to search the substring in (INPUT) */
    public String inputString;

    /**
     * Substring to search for (INPUT) */
    public String substring;

    /**
     * Does the substring case-sensitive? (INPUT) */
    public boolean caseSensitive;

    /**
     * Expected result (true/false - Default: true) (INPUT) */
    public String expectedResult;

    /**
     * Does the input string contains the substring? (true/false) (OUTPUT) */
    public boolean result;

    public StringContains() {
      this.setDescriptor(new ProxyDescriptor("D5P7e9ZMO0aPwXNrWJE9iA", "StringContains"));
    }

    public StringContains(String inputString, String substring, boolean caseSensitive,
        String expectedResult) {
      this();
      this.inputString = inputString;
      this.substring = substring;
      this.caseSensitive = caseSensitive;
      this.expectedResult = expectedResult;
    }
  }

  /**
   * Get the string length. Returns the length of a given string */
  public static class StringLength extends ActionProxy {
    /**
     * The string you want to get the length of (INPUT) */
    public String inputString;

    /**
     * The length of the given string (OUTPUT) */
    public int length;

    public StringLength() {
      this.setDescriptor(new ProxyDescriptor("D5P7e9ZMO0aPwXNrWJE9iA", "StringLength"));
    }

    public StringLength(String inputString) {
      this();
      this.inputString = inputString;
    }
  }

  /**
   * String starts with?. Checks if string starts with given prefix */
  public static class StringStartsWith extends ActionProxy {
    /**
     * Source string to check if it starts with given prefix (INPUT) */
    public String sourceString;

    /**
     * Prefix to check (INPUT) */
    public String prefix;

    /**
     * Offset to start searching from (INPUT) */
    public int offset;

    /**
     * Expected result (true/false) (INPUT) */
    public boolean expectedResult;

    /**
     * Result (OUTPUT) */
    public boolean result;

    public StringStartsWith() {
      this.setDescriptor(new ProxyDescriptor("D5P7e9ZMO0aPwXNrWJE9iA", "StringStartsWith"));
    }

    public StringStartsWith(String sourceString, String prefix, int offset,
        boolean expectedResult) {
      this();
      this.sourceString = sourceString;
      this.prefix = prefix;
      this.offset = offset;
      this.expectedResult = expectedResult;
    }
  }

  /**
   * Transform character casing at index.  */
  public static class TransformCharacterAtIndex extends ActionProxy {
    /**
     * The input string (INPUT) */
    public String input;

    /**
     * Insert upper or lower to decide the case (Default: lower) (INPUT) */
    public String lowerOrUpperCase;

    /**
     * The index of the character to transform (Default: 0) (INPUT) */
    public String index;

    /**
     * The output string with the transformed character (OUTPUT) */
    public String output;

    public TransformCharacterAtIndex() {
      this.setDescriptor(new ProxyDescriptor("D5P7e9ZMO0aPwXNrWJE9iA", "TransformCharacterAtIndex"));
    }

    public TransformCharacterAtIndex(String input, String lowerOrUpperCase, String index) {
      this();
      this.input = input;
      this.lowerOrUpperCase = lowerOrUpperCase;
      this.index = index;
    }
  }

  /**
   * Trim string. Returns new string after removing any leading and trailing whitespace */
  public static class TrimString extends ActionProxy {
    /**
     * Source string (INPUT) */
    public String sourceString;

    /**
     * Trimmed string (OUTPUT) */
    public String resultString;

    public TrimString() {
      this.setDescriptor(new ProxyDescriptor("D5P7e9ZMO0aPwXNrWJE9iA", "TrimString"));
    }

    public TrimString(String sourceString) {
      this();
      this.sourceString = sourceString;
    }
  }
}
