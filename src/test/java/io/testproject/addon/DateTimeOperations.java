package io.testproject.addon;

import io.testproject.sdk.internal.addons.ActionProxy;
import io.testproject.sdk.internal.addons.ProxyDescriptor;
import java.lang.String;

/**
 * Proxy for Date-Time Operations Addon */
public class DateTimeOperations {
  /**
   * Factory method for CurrentDate */
  public static CurrentDate getCurrentDate() {
    return new CurrentDate();
  }

  /**
   * Factory method for CurrentDate
   * @param format Expected DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) */
  public static CurrentDate currentDate(String format) {
    return new CurrentDate(format);
  }

  /**
   * Factory method for CurrentTimestamp */
  public static CurrentTimestamp getCurrentTimestamp() {
    return new CurrentTimestamp();
  }

  /**
   * Factory method for GetDaysBetweenTwoDates */
  public static GetDaysBetweenTwoDates getGetDaysBetweenTwoDates() {
    return new GetDaysBetweenTwoDates();
  }

  /**
   * Factory method for GetDaysBetweenTwoDates
   * @param firstDateTime First DateTime value
   * @param firstDateTimeFormat First DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.)
   * @param secondDateTime Second DateTime value
   * @param secondDateTimeFormat Second DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) */
  public static GetDaysBetweenTwoDates getDaysBetweenTwoDates(String firstDateTime,
      String firstDateTimeFormat, String secondDateTime, String secondDateTimeFormat) {
    return new GetDaysBetweenTwoDates(firstDateTime,firstDateTimeFormat,secondDateTime,secondDateTimeFormat);
  }

  /**
   * Factory method for GetHoursBetweenTwoDates */
  public static GetHoursBetweenTwoDates getGetHoursBetweenTwoDates() {
    return new GetHoursBetweenTwoDates();
  }

  /**
   * Factory method for GetHoursBetweenTwoDates
   * @param firstDateTime First DateTime value
   * @param firstDateTimeFormat First DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.)
   * @param secondDateTime Second DateTime value
   * @param secondDateTimeFormat Second DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) */
  public static GetHoursBetweenTwoDates getHoursBetweenTwoDates(String firstDateTime,
      String firstDateTimeFormat, String secondDateTime, String secondDateTimeFormat) {
    return new GetHoursBetweenTwoDates(firstDateTime,firstDateTimeFormat,secondDateTime,secondDateTimeFormat);
  }

  /**
   * Factory method for GetMinutesBetweenTwoDates */
  public static GetMinutesBetweenTwoDates getGetMinutesBetweenTwoDates() {
    return new GetMinutesBetweenTwoDates();
  }

  /**
   * Factory method for GetMinutesBetweenTwoDates
   * @param firstDateTime First DateTime value
   * @param firstDateTimeFormat First DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.)
   * @param secondDateTime Second DateTime value
   * @param secondDateTimeFormat Second DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) */
  public static GetMinutesBetweenTwoDates getMinutesBetweenTwoDates(String firstDateTime,
      String firstDateTimeFormat, String secondDateTime, String secondDateTimeFormat) {
    return new GetMinutesBetweenTwoDates(firstDateTime,firstDateTimeFormat,secondDateTime,secondDateTimeFormat);
  }

  /**
   * Factory method for GetSecondsBetweenTwoDates */
  public static GetSecondsBetweenTwoDates getGetSecondsBetweenTwoDates() {
    return new GetSecondsBetweenTwoDates();
  }

  /**
   * Factory method for GetSecondsBetweenTwoDates
   * @param firstDateTime First DateTime value
   * @param firstDateTimeFormat First DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.)
   * @param secondDateTime Second DateTime value
   * @param secondDateTimeFormat Second DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) */
  public static GetSecondsBetweenTwoDates getSecondsBetweenTwoDates(String firstDateTime,
      String firstDateTimeFormat, String secondDateTime, String secondDateTimeFormat) {
    return new GetSecondsBetweenTwoDates(firstDateTime,firstDateTimeFormat,secondDateTime,secondDateTimeFormat);
  }

  /**
   * Factory method for GetDateInFormat */
  public static GetDateInFormat getGetDateInFormat() {
    return new GetDateInFormat();
  }

  /**
   * Factory method for GetDateInFormat
   * @param currentDateTimeValue Current DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.)
   * @param currentDateTimeFormat Current DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.)
   * @param expectedDateTimeFormatFormat Expected DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.)
   * @param locale Locale of the date (Default=local locale value) */
  public static GetDateInFormat getDateInFormat(String currentDateTimeValue,
      String currentDateTimeFormat, String expectedDateTimeFormatFormat, String locale) {
    return new GetDateInFormat(currentDateTimeValue,currentDateTimeFormat,expectedDateTimeFormatFormat,locale);
  }

  /**
   * Factory method for GetCurrentDate */
  public static GetCurrentDate getGetCurrentDate() {
    return new GetCurrentDate();
  }

  /**
   * Factory method for GetCurrentDate
   * @param timeZone Desired Timezone (ex: 'America/Chicago', 'IST','Etc/GMT+0') */
  public static GetCurrentDate getCurrentDate(String timeZone) {
    return new GetCurrentDate(timeZone);
  }

  /**
   * Factory method for GetDayOfMonth */
  public static GetDayOfMonth getGetDayOfMonth() {
    return new GetDayOfMonth();
  }

  /**
   * Factory method for GetDayOfMonth
   * @param dateTimeValue DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.)
   * @param dateTimeFormat DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) */
  public static GetDayOfMonth getDayOfMonth(String dateTimeValue, String dateTimeFormat) {
    return new GetDayOfMonth(dateTimeValue,dateTimeFormat);
  }

  /**
   * Factory method for GetDayOfWeek */
  public static GetDayOfWeek getGetDayOfWeek() {
    return new GetDayOfWeek();
  }

  /**
   * Factory method for GetDayOfWeek
   * @param dateTimeValue DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.)
   * @param dateTimeFormat DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) */
  public static GetDayOfWeek getDayOfWeek(String dateTimeValue, String dateTimeFormat) {
    return new GetDayOfWeek(dateTimeValue,dateTimeFormat);
  }

  /**
   * Factory method for GetDayOfYear */
  public static GetDayOfYear getGetDayOfYear() {
    return new GetDayOfYear();
  }

  /**
   * Factory method for GetDayOfYear
   * @param dateTimeValue DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.)
   * @param dateTimeFormat DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) */
  public static GetDayOfYear getDayOfYear(String dateTimeValue, String dateTimeFormat) {
    return new GetDayOfYear(dateTimeValue,dateTimeFormat);
  }

  /**
   * Factory method for GetHour */
  public static GetHour getGetHour() {
    return new GetHour();
  }

  /**
   * Factory method for GetHour
   * @param dateTimeValue DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.)
   * @param dateTimeFormat DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) */
  public static GetHour getHour(String dateTimeValue, String dateTimeFormat) {
    return new GetHour(dateTimeValue,dateTimeFormat);
  }

  /**
   * Factory method for GetHourInStringFormat */
  public static GetHourInStringFormat getGetHourInStringFormat() {
    return new GetHourInStringFormat();
  }

  /**
   * Factory method for GetHourInStringFormat
   * @param dateTimeValue DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.)
   * @param dateTimeFormat DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.)
   * @param suffix Show in 12H format? (true/false) */
  public static GetHourInStringFormat getHourInStringFormat(String dateTimeValue,
      String dateTimeFormat, boolean suffix) {
    return new GetHourInStringFormat(dateTimeValue,dateTimeFormat,suffix);
  }

  /**
   * Factory method for GetMillis */
  public static GetMillis getGetMillis() {
    return new GetMillis();
  }

  /**
   * Factory method for GetMillis
   * @param dateTimeValue DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.)
   * @param dateTimeFormat DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) */
  public static GetMillis getMillis(String dateTimeValue, String dateTimeFormat) {
    return new GetMillis(dateTimeValue,dateTimeFormat);
  }

  /**
   * Factory method for GetMillisOfDay */
  public static GetMillisOfDay getGetMillisOfDay() {
    return new GetMillisOfDay();
  }

  /**
   * Factory method for GetMillisOfDay
   * @param dateTimeValue DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.)
   * @param dateTimeFormat DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) */
  public static GetMillisOfDay getMillisOfDay(String dateTimeValue, String dateTimeFormat) {
    return new GetMillisOfDay(dateTimeValue,dateTimeFormat);
  }

  /**
   * Factory method for GetMillisOfSecond */
  public static GetMillisOfSecond getGetMillisOfSecond() {
    return new GetMillisOfSecond();
  }

  /**
   * Factory method for GetMillisOfSecond
   * @param dateTimeValue DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.)
   * @param dateTimeFormat DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) */
  public static GetMillisOfSecond getMillisOfSecond(String dateTimeValue, String dateTimeFormat) {
    return new GetMillisOfSecond(dateTimeValue,dateTimeFormat);
  }

  /**
   * Factory method for GetMinutesOfDay */
  public static GetMinutesOfDay getGetMinutesOfDay() {
    return new GetMinutesOfDay();
  }

  /**
   * Factory method for GetMinutesOfDay
   * @param dateTimeValue DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.)
   * @param dateTimeFormat DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) */
  public static GetMinutesOfDay getMinutesOfDay(String dateTimeValue, String dateTimeFormat) {
    return new GetMinutesOfDay(dateTimeValue,dateTimeFormat);
  }

  /**
   * Factory method for GetMinutesOfHour */
  public static GetMinutesOfHour getGetMinutesOfHour() {
    return new GetMinutesOfHour();
  }

  /**
   * Factory method for GetMinutesOfHour
   * @param dateTimeValue DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.)
   * @param dateTimeFormat DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) */
  public static GetMinutesOfHour getMinutesOfHour(String dateTimeValue, String dateTimeFormat) {
    return new GetMinutesOfHour(dateTimeValue,dateTimeFormat);
  }

  /**
   * Factory method for GetMonthName */
  public static GetMonthName getGetMonthName() {
    return new GetMonthName();
  }

  /**
   * Factory method for GetMonthName
   * @param dateTimeValue DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.)
   * @param dateTimeFormat Date format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) */
  public static GetMonthName getMonthName(String dateTimeValue, String dateTimeFormat) {
    return new GetMonthName(dateTimeValue,dateTimeFormat);
  }

  /**
   * Factory method for GetMonthOfYear */
  public static GetMonthOfYear getGetMonthOfYear() {
    return new GetMonthOfYear();
  }

  /**
   * Factory method for GetMonthOfYear
   * @param dateTimeValue DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.)
   * @param dateTimeFormat DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) */
  public static GetMonthOfYear getMonthOfYear(String dateTimeValue, String dateTimeFormat) {
    return new GetMonthOfYear(dateTimeValue,dateTimeFormat);
  }

  /**
   * Factory method for GetSecondsOfDay */
  public static GetSecondsOfDay getGetSecondsOfDay() {
    return new GetSecondsOfDay();
  }

  /**
   * Factory method for GetSecondsOfDay
   * @param dateTimeValue DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.)
   * @param dateTimeFormat DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) */
  public static GetSecondsOfDay getSecondsOfDay(String dateTimeValue, String dateTimeFormat) {
    return new GetSecondsOfDay(dateTimeValue,dateTimeFormat);
  }

  /**
   * Factory method for GetSecondsOfMinute */
  public static GetSecondsOfMinute getGetSecondsOfMinute() {
    return new GetSecondsOfMinute();
  }

  /**
   * Factory method for GetSecondsOfMinute
   * @param dateTimeValue DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.)
   * @param dateTimeFormat DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) */
  public static GetSecondsOfMinute getSecondsOfMinute(String dateTimeValue, String dateTimeFormat) {
    return new GetSecondsOfMinute(dateTimeValue,dateTimeFormat);
  }

  /**
   * Factory method for GetWeekOfYear */
  public static GetWeekOfYear getGetWeekOfYear() {
    return new GetWeekOfYear();
  }

  /**
   * Factory method for GetWeekOfYear
   * @param dateTimeValue DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.)
   * @param dateTimeFormat DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) */
  public static GetWeekOfYear getWeekOfYear(String dateTimeValue, String dateTimeFormat) {
    return new GetWeekOfYear(dateTimeValue,dateTimeFormat);
  }

  /**
   * Factory method for GetFullYear */
  public static GetFullYear getGetFullYear() {
    return new GetFullYear();
  }

  /**
   * Factory method for GetFullYear
   * @param dateTimeValue DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.)
   * @param dateTimeFormat DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) */
  public static GetFullYear getFullYear(String dateTimeValue, String dateTimeFormat) {
    return new GetFullYear(dateTimeValue,dateTimeFormat);
  }

  /**
   * Factory method for SetDays */
  public static SetDays getSetDays() {
    return new SetDays();
  }

  /**
   * Factory method for SetDays
   * @param days Days to set to the original DateTime object (for example: -2 or 3)
   * @param originalDateTimeValue DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.)
   * @param originalDateTimeFormat Original DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.)
   * @param resultFormat Result DateTime format (default: same as the original date format) */
  public static SetDays setDays(String days, String originalDateTimeValue,
      String originalDateTimeFormat, String resultFormat) {
    return new SetDays(days,originalDateTimeValue,originalDateTimeFormat,resultFormat);
  }

  /**
   * Factory method for SetHours */
  public static SetHours getSetHours() {
    return new SetHours();
  }

  /**
   * Factory method for SetHours
   * @param hours Hours to set to the original DateTime object (for example: -2 or 3)
   * @param originalDateTimeValue DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.)
   * @param originalDateTimeFormat Original DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.)
   * @param resultFormat Result DateTime format (default: same as the original date format) */
  public static SetHours setHours(String hours, String originalDateTimeValue,
      String originalDateTimeFormat, String resultFormat) {
    return new SetHours(hours,originalDateTimeValue,originalDateTimeFormat,resultFormat);
  }

  /**
   * Factory method for SetMillis */
  public static SetMillis getSetMillis() {
    return new SetMillis();
  }

  /**
   * Factory method for SetMillis
   * @param milliseconds Milliseconds to set to the original DateTime object (for example: -2 or 3)
   * @param originalDateTimeValue DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.)
   * @param originalDateTimeFormat Original DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.)
   * @param resultFormat Result DateTime format (default: same as the original date format) */
  public static SetMillis setMillis(String milliseconds, String originalDateTimeValue,
      String originalDateTimeFormat, String resultFormat) {
    return new SetMillis(milliseconds,originalDateTimeValue,originalDateTimeFormat,resultFormat);
  }

  /**
   * Factory method for SetMinutes */
  public static SetMinutes getSetMinutes() {
    return new SetMinutes();
  }

  /**
   * Factory method for SetMinutes
   * @param minutes Minutes to set to the original DateTime object (for example: -2 or 3)
   * @param originalDateTimeValue DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.)
   * @param originalDateTimeFormat Original DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.)
   * @param resultFormat Result DateTime format (default: same as the original date format) */
  public static SetMinutes setMinutes(String minutes, String originalDateTimeValue,
      String originalDateTimeFormat, String resultFormat) {
    return new SetMinutes(minutes,originalDateTimeValue,originalDateTimeFormat,resultFormat);
  }

  /**
   * Factory method for SetMonths */
  public static SetMonths getSetMonths() {
    return new SetMonths();
  }

  /**
   * Factory method for SetMonths
   * @param months Months to set to the original DateTime object (for example: -2 or 3)
   * @param originalDateTimeValue DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.)
   * @param originalDateTimeFormat Original DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.)
   * @param resultFormat Result DateTime format (default: same as the original date format) */
  public static SetMonths setMonths(String months, String originalDateTimeValue,
      String originalDateTimeFormat, String resultFormat) {
    return new SetMonths(months,originalDateTimeValue,originalDateTimeFormat,resultFormat);
  }

  /**
   * Factory method for SetSeconds */
  public static SetSeconds getSetSeconds() {
    return new SetSeconds();
  }

  /**
   * Factory method for SetSeconds
   * @param seconds Seconds to set to the original DateTime object (for example: -2 or 3)
   * @param originalDateTimeValue DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.)
   * @param originalDateTimeFormat Original DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.)
   * @param resultFormat Result DateTime format (default: same as the original date format) */
  public static SetSeconds setSeconds(String seconds, String originalDateTimeValue,
      String originalDateTimeFormat, String resultFormat) {
    return new SetSeconds(seconds,originalDateTimeValue,originalDateTimeFormat,resultFormat);
  }

  /**
   * Factory method for SetWeeks */
  public static SetWeeks getSetWeeks() {
    return new SetWeeks();
  }

  /**
   * Factory method for SetWeeks
   * @param weeks Weeks to set to the original DateTime object (for example: -2 or 3)
   * @param originalDateTimeValue DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.)
   * @param originalDateTimeFormat Original DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.)
   * @param resultFormat Result DateTime format (default: same as the original date format) */
  public static SetWeeks setWeeks(String weeks, String originalDateTimeValue,
      String originalDateTimeFormat, String resultFormat) {
    return new SetWeeks(weeks,originalDateTimeValue,originalDateTimeFormat,resultFormat);
  }

  /**
   * Factory method for SetYears */
  public static SetYears getSetYears() {
    return new SetYears();
  }

  /**
   * Factory method for SetYears
   * @param years Years to set to the original DateTime object (for example: -2 or 3)
   * @param originalDateTimeValue DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.)
   * @param originalDateTimeFormat Original DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.)
   * @param resultFormat Result DateTime format (default: same as the original date format) */
  public static SetYears setYears(String years, String originalDateTimeValue,
      String originalDateTimeFormat, String resultFormat) {
    return new SetYears(years,originalDateTimeValue,originalDateTimeFormat,resultFormat);
  }

  /**
   * Get the current DateTime. Returns the current DateTime */
  public static class CurrentDate extends ActionProxy {
    /**
     * Expected DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) (INPUT) */
    public String format;

    /**
     * Current DateTime value (OUTPUT) */
    public String result;

    public CurrentDate() {
      this.setDescriptor(new ProxyDescriptor("9k_I6NoN_06CR22QXqBpAQ", "Actions.CurrentDate"));
    }

    public CurrentDate(String format) {
      this();
      this.format = format;
    }
  }

  /**
   * Get the current timestamp. Returns a moment in the datetime continuum specified as a number of milliseconds from January 1st 1970 */
  public static class CurrentTimestamp extends ActionProxy {
    /**
     * Current timestamp (OUTPUT) */
    public String result;

    public CurrentTimestamp() {
      this.setDescriptor(new ProxyDescriptor("9k_I6NoN_06CR22QXqBpAQ", "Actions.CurrentTimestamp"));
    }
  }

  /**
   * Get the days difference between two DateTime objects. Returns the amount of days between two given DateTime objects */
  public static class GetDaysBetweenTwoDates extends ActionProxy {
    /**
     * First DateTime value (INPUT) */
    public String firstDateTime;

    /**
     * First DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) (INPUT) */
    public String firstDateTimeFormat;

    /**
     * Second DateTime value (INPUT) */
    public String secondDateTime;

    /**
     * Second DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) (INPUT) */
    public String secondDateTimeFormat;

    /**
     * The duration between the two DateTime objects (OUTPUT) */
    public String result;

    public GetDaysBetweenTwoDates() {
      this.setDescriptor(new ProxyDescriptor("9k_I6NoN_06CR22QXqBpAQ", "Actions.DurationBetweenDates.GetDaysBetweenTwoDates"));
    }

    public GetDaysBetweenTwoDates(String firstDateTime, String firstDateTimeFormat,
        String secondDateTime, String secondDateTimeFormat) {
      this();
      this.firstDateTime = firstDateTime;
      this.firstDateTimeFormat = firstDateTimeFormat;
      this.secondDateTime = secondDateTime;
      this.secondDateTimeFormat = secondDateTimeFormat;
    }
  }

  /**
   * Get the hours between two DateTime objects. Returns the amount of hours between two given DateTime objects */
  public static class GetHoursBetweenTwoDates extends ActionProxy {
    /**
     * First DateTime value (INPUT) */
    public String firstDateTime;

    /**
     * First DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) (INPUT) */
    public String firstDateTimeFormat;

    /**
     * Second DateTime value (INPUT) */
    public String secondDateTime;

    /**
     * Second DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) (INPUT) */
    public String secondDateTimeFormat;

    /**
     * The duration between the two DateTime objects (OUTPUT) */
    public String result;

    public GetHoursBetweenTwoDates() {
      this.setDescriptor(new ProxyDescriptor("9k_I6NoN_06CR22QXqBpAQ", "Actions.DurationBetweenDates.GetHoursBetweenTwoDates"));
    }

    public GetHoursBetweenTwoDates(String firstDateTime, String firstDateTimeFormat,
        String secondDateTime, String secondDateTimeFormat) {
      this();
      this.firstDateTime = firstDateTime;
      this.firstDateTimeFormat = firstDateTimeFormat;
      this.secondDateTime = secondDateTime;
      this.secondDateTimeFormat = secondDateTimeFormat;
    }
  }

  /**
   * Get the minutes between two DateTime objects. Returns the amount of minutes between two given DateTime objects */
  public static class GetMinutesBetweenTwoDates extends ActionProxy {
    /**
     * First DateTime value (INPUT) */
    public String firstDateTime;

    /**
     * First DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) (INPUT) */
    public String firstDateTimeFormat;

    /**
     * Second DateTime value (INPUT) */
    public String secondDateTime;

    /**
     * Second DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) (INPUT) */
    public String secondDateTimeFormat;

    /**
     * The duration between the two DateTime objects (OUTPUT) */
    public String result;

    public GetMinutesBetweenTwoDates() {
      this.setDescriptor(new ProxyDescriptor("9k_I6NoN_06CR22QXqBpAQ", "Actions.DurationBetweenDates.GetMinutesBetweenTwoDates"));
    }

    public GetMinutesBetweenTwoDates(String firstDateTime, String firstDateTimeFormat,
        String secondDateTime, String secondDateTimeFormat) {
      this();
      this.firstDateTime = firstDateTime;
      this.firstDateTimeFormat = firstDateTimeFormat;
      this.secondDateTime = secondDateTime;
      this.secondDateTimeFormat = secondDateTimeFormat;
    }
  }

  /**
   * Get the seconds between two DateTime objects. Returns the amount of seconds between two given DateTime objects */
  public static class GetSecondsBetweenTwoDates extends ActionProxy {
    /**
     * First DateTime value (INPUT) */
    public String firstDateTime;

    /**
     * First DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) (INPUT) */
    public String firstDateTimeFormat;

    /**
     * Second DateTime value (INPUT) */
    public String secondDateTime;

    /**
     * Second DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) (INPUT) */
    public String secondDateTimeFormat;

    /**
     * The duration between the two DateTime objects (OUTPUT) */
    public String result;

    public GetSecondsBetweenTwoDates() {
      this.setDescriptor(new ProxyDescriptor("9k_I6NoN_06CR22QXqBpAQ", "Actions.DurationBetweenDates.GetSecondsBetweenTwoDates"));
    }

    public GetSecondsBetweenTwoDates(String firstDateTime, String firstDateTimeFormat,
        String secondDateTime, String secondDateTimeFormat) {
      this();
      this.firstDateTime = firstDateTime;
      this.firstDateTimeFormat = firstDateTimeFormat;
      this.secondDateTime = secondDateTime;
      this.secondDateTimeFormat = secondDateTimeFormat;
    }
  }

  /**
   * Get DateTime object in a specific format. Returns a DateTime object in the specified format */
  public static class GetDateInFormat extends ActionProxy {
    /**
     * Current DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.) (INPUT) */
    public String currentDateTimeValue;

    /**
     * Current DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) (INPUT) */
    public String currentDateTimeFormat;

    /**
     * Expected DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) (INPUT) */
    public String expectedDateTimeFormatFormat;

    /**
     * Locale of the date (Default=local locale value) (INPUT) */
    public String locale;

    /**
     * Formatted DateTime object (OUTPUT) */
    public String result;

    public GetDateInFormat() {
      this.setDescriptor(new ProxyDescriptor("9k_I6NoN_06CR22QXqBpAQ", "Actions.FormatDate.GetDateInFormat"));
    }

    public GetDateInFormat(String currentDateTimeValue, String currentDateTimeFormat,
        String expectedDateTimeFormatFormat, String locale) {
      this();
      this.currentDateTimeValue = currentDateTimeValue;
      this.currentDateTimeFormat = currentDateTimeFormat;
      this.expectedDateTimeFormatFormat = expectedDateTimeFormatFormat;
      this.locale = locale;
    }
  }

  /**
   * Get the current DateTime. Returns the current DateTime in ISO 8601 format (yyyy-MM-ddThh:mm:ss.SSS) */
  public static class GetCurrentDate extends ActionProxy {
    /**
     * Current DateTime (OUTPUT) */
    public String result;

    /**
     * Desired Timezone (ex: 'America/Chicago', 'IST','Etc/GMT+0') (INPUT) */
    public String timeZone;

    public GetCurrentDate() {
      this.setDescriptor(new ProxyDescriptor("9k_I6NoN_06CR22QXqBpAQ", "Actions.GetCurrentDate"));
    }

    public GetCurrentDate(String timeZone) {
      this();
      this.timeZone = timeZone;
    }
  }

  /**
   * Get the day of a month from a DateTime object. Returns the day of a month from the given DateTime object */
  public static class GetDayOfMonth extends ActionProxy {
    /**
     * DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.) (INPUT) */
    public String dateTimeValue;

    /**
     * DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) (INPUT) */
    public String dateTimeFormat;

    /**
     * Result (OUTPUT) */
    public int result;

    public GetDayOfMonth() {
      this.setDescriptor(new ProxyDescriptor("9k_I6NoN_06CR22QXqBpAQ", "Actions.Getters.Days.GetDayOfMonth"));
    }

    public GetDayOfMonth(String dateTimeValue, String dateTimeFormat) {
      this();
      this.dateTimeValue = dateTimeValue;
      this.dateTimeFormat = dateTimeFormat;
    }
  }

  /**
   * Get day of the week from a DateTime object. Returns the day of a week from the given DateTime object */
  public static class GetDayOfWeek extends ActionProxy {
    /**
     * DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.) (INPUT) */
    public String dateTimeValue;

    /**
     * DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) (INPUT) */
    public String dateTimeFormat;

    /**
     * Result (OUTPUT) */
    public int result;

    public GetDayOfWeek() {
      this.setDescriptor(new ProxyDescriptor("9k_I6NoN_06CR22QXqBpAQ", "Actions.Getters.Days.GetDayOfWeek"));
    }

    public GetDayOfWeek(String dateTimeValue, String dateTimeFormat) {
      this();
      this.dateTimeValue = dateTimeValue;
      this.dateTimeFormat = dateTimeFormat;
    }
  }

  /**
   * Get the day of a year from a DateTime object. Returns the day of a year from the given DateTime object */
  public static class GetDayOfYear extends ActionProxy {
    /**
     * DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.) (INPUT) */
    public String dateTimeValue;

    /**
     * DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) (INPUT) */
    public String dateTimeFormat;

    /**
     * Result (OUTPUT) */
    public int result;

    public GetDayOfYear() {
      this.setDescriptor(new ProxyDescriptor("9k_I6NoN_06CR22QXqBpAQ", "Actions.Getters.Days.GetDayOfYear"));
    }

    public GetDayOfYear(String dateTimeValue, String dateTimeFormat) {
      this();
      this.dateTimeValue = dateTimeValue;
      this.dateTimeFormat = dateTimeFormat;
    }
  }

  /**
   * Get hour from a DateTime object. Returns the hour from the given DateTime object */
  public static class GetHour extends ActionProxy {
    /**
     * DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.) (INPUT) */
    public String dateTimeValue;

    /**
     * DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) (INPUT) */
    public String dateTimeFormat;

    /**
     * Result (OUTPUT) */
    public int result;

    public GetHour() {
      this.setDescriptor(new ProxyDescriptor("9k_I6NoN_06CR22QXqBpAQ", "Actions.Getters.Hours.GetHour"));
    }

    public GetHour(String dateTimeValue, String dateTimeFormat) {
      this();
      this.dateTimeValue = dateTimeValue;
      this.dateTimeFormat = dateTimeFormat;
    }
  }

  /**
   * Get hour from a DateTime object in a string format. Returns the hour in string format from a given DateTime object (e.g. 09:45 AM) */
  public static class GetHourInStringFormat extends ActionProxy {
    /**
     * DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.) (INPUT) */
    public String dateTimeValue;

    /**
     * DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) (INPUT) */
    public String dateTimeFormat;

    /**
     * Show in 12H format? (true/false) (INPUT) */
    public boolean suffix;

    /**
     * Result (OUTPUT) */
    public String result;

    public GetHourInStringFormat() {
      this.setDescriptor(new ProxyDescriptor("9k_I6NoN_06CR22QXqBpAQ", "Actions.Getters.Hours.GetHourInStringFormat"));
    }

    public GetHourInStringFormat(String dateTimeValue, String dateTimeFormat, boolean suffix) {
      this();
      this.dateTimeValue = dateTimeValue;
      this.dateTimeFormat = dateTimeFormat;
      this.suffix = suffix;
    }
  }

  /**
   * Get the milliseconds from a DateTime object. Returns the milliseconds from the provided DateTime object */
  public static class GetMillis extends ActionProxy {
    /**
     * DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.) (INPUT) */
    public String dateTimeValue;

    /**
     * DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) (INPUT) */
    public String dateTimeFormat;

    /**
     * Result (OUTPUT) */
    public int result;

    public GetMillis() {
      this.setDescriptor(new ProxyDescriptor("9k_I6NoN_06CR22QXqBpAQ", "Actions.Getters.Milliseconds.GetMillis"));
    }

    public GetMillis(String dateTimeValue, String dateTimeFormat) {
      this();
      this.dateTimeValue = dateTimeValue;
      this.dateTimeFormat = dateTimeFormat;
    }
  }

  /**
   * Get milliseconds of a day from a DateTime object. Returns the milliseconds of a day from the provided DateTime object */
  public static class GetMillisOfDay extends ActionProxy {
    /**
     * DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.) (INPUT) */
    public String dateTimeValue;

    /**
     * DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) (INPUT) */
    public String dateTimeFormat;

    /**
     * Result (OUTPUT) */
    public int result;

    public GetMillisOfDay() {
      this.setDescriptor(new ProxyDescriptor("9k_I6NoN_06CR22QXqBpAQ", "Actions.Getters.Milliseconds.GetMillisOfDay"));
    }

    public GetMillisOfDay(String dateTimeValue, String dateTimeFormat) {
      this();
      this.dateTimeValue = dateTimeValue;
      this.dateTimeFormat = dateTimeFormat;
    }
  }

  /**
   * Get milliseconds of a second from a DateTime object. Returns the milliseconds of a second from the provided DateTime object */
  public static class GetMillisOfSecond extends ActionProxy {
    /**
     * DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.) (INPUT) */
    public String dateTimeValue;

    /**
     * DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) (INPUT) */
    public String dateTimeFormat;

    /**
     * Result (OUTPUT) */
    public int result;

    public GetMillisOfSecond() {
      this.setDescriptor(new ProxyDescriptor("9k_I6NoN_06CR22QXqBpAQ", "Actions.Getters.Milliseconds.GetMillisOfSecond"));
    }

    public GetMillisOfSecond(String dateTimeValue, String dateTimeFormat) {
      this();
      this.dateTimeValue = dateTimeValue;
      this.dateTimeFormat = dateTimeFormat;
    }
  }

  /**
   * Get the minutes of the day from a DateTime object. Returns the minutes of the day from the provided DateTime object */
  public static class GetMinutesOfDay extends ActionProxy {
    /**
     * DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.) (INPUT) */
    public String dateTimeValue;

    /**
     * DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) (INPUT) */
    public String dateTimeFormat;

    /**
     * Result (OUTPUT) */
    public int result;

    public GetMinutesOfDay() {
      this.setDescriptor(new ProxyDescriptor("9k_I6NoN_06CR22QXqBpAQ", "Actions.Getters.Minutes.GetMinutesOfDay"));
    }

    public GetMinutesOfDay(String dateTimeValue, String dateTimeFormat) {
      this();
      this.dateTimeValue = dateTimeValue;
      this.dateTimeFormat = dateTimeFormat;
    }
  }

  /**
   * Get the minutes of hour from a DateTime object. Returns the minutes of hour from the provided DateTime object */
  public static class GetMinutesOfHour extends ActionProxy {
    /**
     * DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.) (INPUT) */
    public String dateTimeValue;

    /**
     * DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) (INPUT) */
    public String dateTimeFormat;

    /**
     * Result (OUTPUT) */
    public int result;

    public GetMinutesOfHour() {
      this.setDescriptor(new ProxyDescriptor("9k_I6NoN_06CR22QXqBpAQ", "Actions.Getters.Minutes.GetMinutesOfHour"));
    }

    public GetMinutesOfHour(String dateTimeValue, String dateTimeFormat) {
      this();
      this.dateTimeValue = dateTimeValue;
      this.dateTimeFormat = dateTimeFormat;
    }
  }

  /**
   * Get the month name from a DateTime object. Returns the month's name from the provided DateTime object */
  public static class GetMonthName extends ActionProxy {
    /**
     * DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.) (INPUT) */
    public String dateTimeValue;

    /**
     * Date format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) (INPUT) */
    public String dateTimeFormat;

    /**
     * Month's name (OUTPUT) */
    public String result;

    public GetMonthName() {
      this.setDescriptor(new ProxyDescriptor("9k_I6NoN_06CR22QXqBpAQ", "Actions.Getters.Months.GetMonthName"));
    }

    public GetMonthName(String dateTimeValue, String dateTimeFormat) {
      this();
      this.dateTimeValue = dateTimeValue;
      this.dateTimeFormat = dateTimeFormat;
    }
  }

  /**
   * Get the month from a DateTime object. Returns the month from the provided DateTime object */
  public static class GetMonthOfYear extends ActionProxy {
    /**
     * DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.) (INPUT) */
    public String dateTimeValue;

    /**
     * DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) (INPUT) */
    public String dateTimeFormat;

    /**
     * Result (OUTPUT) */
    public int result;

    public GetMonthOfYear() {
      this.setDescriptor(new ProxyDescriptor("9k_I6NoN_06CR22QXqBpAQ", "Actions.Getters.Months.GetMonthOfYear"));
    }

    public GetMonthOfYear(String dateTimeValue, String dateTimeFormat) {
      this();
      this.dateTimeValue = dateTimeValue;
      this.dateTimeFormat = dateTimeFormat;
    }
  }

  /**
   * Get the seconds of a day from DateTime object. Returns the seconds of a day from the provided DateTime object */
  public static class GetSecondsOfDay extends ActionProxy {
    /**
     * DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.) (INPUT) */
    public String dateTimeValue;

    /**
     * DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) (INPUT) */
    public String dateTimeFormat;

    /**
     * Result (OUTPUT) */
    public int result;

    public GetSecondsOfDay() {
      this.setDescriptor(new ProxyDescriptor("9k_I6NoN_06CR22QXqBpAQ", "Actions.Getters.Seconds.GetSecondsOfDay"));
    }

    public GetSecondsOfDay(String dateTimeValue, String dateTimeFormat) {
      this();
      this.dateTimeValue = dateTimeValue;
      this.dateTimeFormat = dateTimeFormat;
    }
  }

  /**
   * Get the seconds of a minute from DateTime object. Returns the seconds of a minute from the provided DateTime object */
  public static class GetSecondsOfMinute extends ActionProxy {
    /**
     * DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.) (INPUT) */
    public String dateTimeValue;

    /**
     * DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) (INPUT) */
    public String dateTimeFormat;

    /**
     * Result (OUTPUT) */
    public int result;

    public GetSecondsOfMinute() {
      this.setDescriptor(new ProxyDescriptor("9k_I6NoN_06CR22QXqBpAQ", "Actions.Getters.Seconds.GetSecondsOfMinute"));
    }

    public GetSecondsOfMinute(String dateTimeValue, String dateTimeFormat) {
      this();
      this.dateTimeValue = dateTimeValue;
      this.dateTimeFormat = dateTimeFormat;
    }
  }

  /**
   * Get the week of the year from a DateTime object. Returns the week of a year from the provided DateTime object */
  public static class GetWeekOfYear extends ActionProxy {
    /**
     * DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.) (INPUT) */
    public String dateTimeValue;

    /**
     * DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) (INPUT) */
    public String dateTimeFormat;

    /**
     * Result (OUTPUT) */
    public int result;

    public GetWeekOfYear() {
      this.setDescriptor(new ProxyDescriptor("9k_I6NoN_06CR22QXqBpAQ", "Actions.Getters.Weeks.GetWeekOfYear"));
    }

    public GetWeekOfYear(String dateTimeValue, String dateTimeFormat) {
      this();
      this.dateTimeValue = dateTimeValue;
      this.dateTimeFormat = dateTimeFormat;
    }
  }

  /**
   * Get the year from a DateTime object. Returns the year from the provided DateTime object */
  public static class GetFullYear extends ActionProxy {
    /**
     * DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.) (INPUT) */
    public String dateTimeValue;

    /**
     * DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) (INPUT) */
    public String dateTimeFormat;

    /**
     * Result (OUTPUT) */
    public int result;

    public GetFullYear() {
      this.setDescriptor(new ProxyDescriptor("9k_I6NoN_06CR22QXqBpAQ", "Actions.Getters.Years.GetFullYear"));
    }

    public GetFullYear(String dateTimeValue, String dateTimeFormat) {
      this();
      this.dateTimeValue = dateTimeValue;
      this.dateTimeFormat = dateTimeFormat;
    }
  }

  /**
   * Set days of a DateTime object. Sets the days of a given DateTime object and returns the new DateTime object. Can be positive/negative. */
  public static class SetDays extends ActionProxy {
    /**
     * Days to set to the original DateTime object (for example: -2 or 3) (INPUT) */
    public String days;

    /**
     * DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.) (INPUT) */
    public String originalDateTimeValue;

    /**
     * Original DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) (INPUT) */
    public String originalDateTimeFormat;

    /**
     * Result DateTime format (default: same as the original date format) (INPUT) */
    public String resultFormat;

    /**
     * Result DateTime value (OUTPUT) */
    public String result;

    public SetDays() {
      this.setDescriptor(new ProxyDescriptor("9k_I6NoN_06CR22QXqBpAQ", "Actions.Setters.SetDays"));
    }

    public SetDays(String days, String originalDateTimeValue, String originalDateTimeFormat,
        String resultFormat) {
      this();
      this.days = days;
      this.originalDateTimeValue = originalDateTimeValue;
      this.originalDateTimeFormat = originalDateTimeFormat;
      this.resultFormat = resultFormat;
    }
  }

  /**
   * Set hours of a DateTime object. Set the hours of a given DateTime object and returns the new DateTime object. Can be positive/negative. */
  public static class SetHours extends ActionProxy {
    /**
     * Hours to set to the original DateTime object (for example: -2 or 3) (INPUT) */
    public String hours;

    /**
     * DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.) (INPUT) */
    public String originalDateTimeValue;

    /**
     * Original DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) (INPUT) */
    public String originalDateTimeFormat;

    /**
     * Result DateTime format (default: same as the original date format) (INPUT) */
    public String resultFormat;

    /**
     * Result DateTime value (OUTPUT) */
    public String result;

    public SetHours() {
      this.setDescriptor(new ProxyDescriptor("9k_I6NoN_06CR22QXqBpAQ", "Actions.Setters.SetHours"));
    }

    public SetHours(String hours, String originalDateTimeValue, String originalDateTimeFormat,
        String resultFormat) {
      this();
      this.hours = hours;
      this.originalDateTimeValue = originalDateTimeValue;
      this.originalDateTimeFormat = originalDateTimeFormat;
      this.resultFormat = resultFormat;
    }
  }

  /**
   * Set milliseconds of a DateTime object. Sets the milliseconds of a given DateTime object and returns the new DateTime object. Can be positive/negative. */
  public static class SetMillis extends ActionProxy {
    /**
     * Milliseconds to set to the original DateTime object (for example: -2 or 3) (INPUT) */
    public String milliseconds;

    /**
     * DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.) (INPUT) */
    public String originalDateTimeValue;

    /**
     * Original DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) (INPUT) */
    public String originalDateTimeFormat;

    /**
     * Result DateTime format (default: same as the original date format) (INPUT) */
    public String resultFormat;

    /**
     * Result DateTime value (OUTPUT) */
    public String result;

    public SetMillis() {
      this.setDescriptor(new ProxyDescriptor("9k_I6NoN_06CR22QXqBpAQ", "Actions.Setters.SetMillis"));
    }

    public SetMillis(String milliseconds, String originalDateTimeValue,
        String originalDateTimeFormat, String resultFormat) {
      this();
      this.milliseconds = milliseconds;
      this.originalDateTimeValue = originalDateTimeValue;
      this.originalDateTimeFormat = originalDateTimeFormat;
      this.resultFormat = resultFormat;
    }
  }

  /**
   * Set minutes of a DateTime object. Sets the minutes of a given DateTime object and returns the new DateTime object. Can be positive/negative. */
  public static class SetMinutes extends ActionProxy {
    /**
     * Minutes to set to the original DateTime object (for example: -2 or 3) (INPUT) */
    public String minutes;

    /**
     * DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.) (INPUT) */
    public String originalDateTimeValue;

    /**
     * Original DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) (INPUT) */
    public String originalDateTimeFormat;

    /**
     * Result DateTime format (default: same as the original date format) (INPUT) */
    public String resultFormat;

    /**
     * Result DateTime value (OUTPUT) */
    public String result;

    public SetMinutes() {
      this.setDescriptor(new ProxyDescriptor("9k_I6NoN_06CR22QXqBpAQ", "Actions.Setters.SetMinutes"));
    }

    public SetMinutes(String minutes, String originalDateTimeValue, String originalDateTimeFormat,
        String resultFormat) {
      this();
      this.minutes = minutes;
      this.originalDateTimeValue = originalDateTimeValue;
      this.originalDateTimeFormat = originalDateTimeFormat;
      this.resultFormat = resultFormat;
    }
  }

  /**
   * Set months of a DateTime object. Sets the months of a given DateTime object and returns the new DateTime object. Can be positive/negative. */
  public static class SetMonths extends ActionProxy {
    /**
     * Months to set to the original DateTime object (for example: -2 or 3) (INPUT) */
    public String months;

    /**
     * DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.) (INPUT) */
    public String originalDateTimeValue;

    /**
     * Original DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) (INPUT) */
    public String originalDateTimeFormat;

    /**
     * Result DateTime format (default: same as the original date format) (INPUT) */
    public String resultFormat;

    /**
     * Result DateTime value (OUTPUT) */
    public String result;

    public SetMonths() {
      this.setDescriptor(new ProxyDescriptor("9k_I6NoN_06CR22QXqBpAQ", "Actions.Setters.SetMonths"));
    }

    public SetMonths(String months, String originalDateTimeValue, String originalDateTimeFormat,
        String resultFormat) {
      this();
      this.months = months;
      this.originalDateTimeValue = originalDateTimeValue;
      this.originalDateTimeFormat = originalDateTimeFormat;
      this.resultFormat = resultFormat;
    }
  }

  /**
   * Set seconds of a DateTime object. Sets the seconds of a given DateTime object and returns the new DateTime object. Can be positive/negative. */
  public static class SetSeconds extends ActionProxy {
    /**
     * Seconds to set to the original DateTime object (for example: -2 or 3) (INPUT) */
    public String seconds;

    /**
     * DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.) (INPUT) */
    public String originalDateTimeValue;

    /**
     * Original DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) (INPUT) */
    public String originalDateTimeFormat;

    /**
     * Result DateTime format (default: same as the original date format) (INPUT) */
    public String resultFormat;

    /**
     * Result DateTime value (OUTPUT) */
    public String result;

    public SetSeconds() {
      this.setDescriptor(new ProxyDescriptor("9k_I6NoN_06CR22QXqBpAQ", "Actions.Setters.SetSeconds"));
    }

    public SetSeconds(String seconds, String originalDateTimeValue, String originalDateTimeFormat,
        String resultFormat) {
      this();
      this.seconds = seconds;
      this.originalDateTimeValue = originalDateTimeValue;
      this.originalDateTimeFormat = originalDateTimeFormat;
      this.resultFormat = resultFormat;
    }
  }

  /**
   * Set weeks of a DateTime object. Sets the weeks of a given DateTime object and returns the new DateTime object. Can be positive/negative. */
  public static class SetWeeks extends ActionProxy {
    /**
     * Weeks to set to the original DateTime object (for example: -2 or 3) (INPUT) */
    public String weeks;

    /**
     * DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.) (INPUT) */
    public String originalDateTimeValue;

    /**
     * Original DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) (INPUT) */
    public String originalDateTimeFormat;

    /**
     * Result DateTime format (default: same as the original date format) (INPUT) */
    public String resultFormat;

    /**
     * Result DateTime value (OUTPUT) */
    public String result;

    public SetWeeks() {
      this.setDescriptor(new ProxyDescriptor("9k_I6NoN_06CR22QXqBpAQ", "Actions.Setters.SetWeeks"));
    }

    public SetWeeks(String weeks, String originalDateTimeValue, String originalDateTimeFormat,
        String resultFormat) {
      this();
      this.weeks = weeks;
      this.originalDateTimeValue = originalDateTimeValue;
      this.originalDateTimeFormat = originalDateTimeFormat;
      this.resultFormat = resultFormat;
    }
  }

  /**
   * Set years of a DateTime object. Sets the years of a given DateTime object and returns the new DateTime object. Can be positive/negative. */
  public static class SetYears extends ActionProxy {
    /**
     * Years to set to the original DateTime object (for example: -2 or 3) (INPUT) */
    public String years;

    /**
     * DateTime value (for example: 28/05/2019 or Sep 22, 1991 20:07 etc.) (INPUT) */
    public String originalDateTimeValue;

    /**
     * Original DateTime format (for example: dd/MM/yyyy or MMM dd, yyyy HH:mm etc.) (INPUT) */
    public String originalDateTimeFormat;

    /**
     * Result DateTime format (default: same as the original date format) (INPUT) */
    public String resultFormat;

    /**
     * Result DateTime value (OUTPUT) */
    public String result;

    public SetYears() {
      this.setDescriptor(new ProxyDescriptor("9k_I6NoN_06CR22QXqBpAQ", "Actions.Setters.SetYears"));
    }

    public SetYears(String years, String originalDateTimeValue, String originalDateTimeFormat,
        String resultFormat) {
      this();
      this.years = years;
      this.originalDateTimeValue = originalDateTimeValue;
      this.originalDateTimeFormat = originalDateTimeFormat;
      this.resultFormat = resultFormat;
    }
  }
}
