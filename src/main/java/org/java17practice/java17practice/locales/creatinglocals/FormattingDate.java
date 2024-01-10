package org.java17practice.java17practice.locales.creatinglocals;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;

public class FormattingDate {
    public static void main(String[] args) {
        ZonedDateTime date = ZonedDateTime.now();
        System.out.println(date.format(DateTimeFormatter.ofPattern("MMMM-dd-yyyy hh:mm:ss:SS  ZZZZ zzzz", Locale.ENGLISH)));
    }
}
