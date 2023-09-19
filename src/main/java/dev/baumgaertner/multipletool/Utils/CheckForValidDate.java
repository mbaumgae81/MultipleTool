package dev.baumgaertner.multipletool.Utils;

import java.time.LocalDate;
import java.util.GregorianCalendar;

public class CheckForValidDate {

    public static boolean checkIsValid(int year, int month, int day){
        System.out.println(" Eingang : " +day +" " + month + " " + year);

        try {
            LocalDate myDate = LocalDate.of(year, month, day);

           LocalDate my = LocalDate.of(1981, 1,9);
            System.out.println(my);
           return true;
        } catch (RuntimeException e ){
            System.out.println(" Fehler");
        }
       return false;
    }

    public static boolean isSchaltjahr(int year) {
        return new GregorianCalendar().isLeapYear(year);
    }
}
