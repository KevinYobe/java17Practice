package org.java17practice.java17practice.locales.creatinglocals;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundles {

    public static void main(String[] args) {
        String language;
        String country;

        if (args.length != 2) {
            language = new String("sh");
            country = new String("ZW");
        } else {
            language = new String(args[0]);
            country = new String(args[1]);
        }

        Locale currentLocale;
        ResourceBundle messages;

        currentLocale = new Locale(language, country);

        messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
        System.out.println();
        Locale locale = new Locale("fr","FR");
        System.out.println(locale.getVariant());
    }
}
