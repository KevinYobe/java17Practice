package org.java17practice.java17practice.locales.creatinglocals;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.util.Locale;

public class NumbersAndCurrency {
    public static void main(String[] args) throws ParseException {

        double tryr = 111.12;
      Locale zim = Locale.getDefault();
      Locale germany = Locale.GERMANY;
      Locale france = Locale.FRANCE;
      Locale italy = Locale.ITALY;

      LocalDate date = LocalDate.now();

      LocalTime time = LocalTime.now();

      LocalDateTime dateTime = LocalDateTime.now();

      DateTimeFormatter dateTimeFormatter = new DateTimeFormatterBuilder()
              .toFormatter();
      dateTimeFormatter.withLocale(Locale.FRENCH);

      DateTimeFormatter anotherFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(france);
        System.out.println(NumberFormat.getInstance(Locale.CHINA).format(tryr));


    }
}
