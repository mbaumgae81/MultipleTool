package dev.baumgaertner.multipletool.Utils;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.GregorianCalendar;

public class CheckForValidDate {

    public static boolean checkIsValid(int year, int month, int day) {
        try {
            LocalDate myDate = LocalDate.of(year, month, day);
            return true;
        } catch (RuntimeException e) {
            System.out.println(" Fehler");
        }
        return false;
    }

    public static boolean isSchaltjahr(int year) {
        return new GregorianCalendar().isLeapYear(year);
    }
}
