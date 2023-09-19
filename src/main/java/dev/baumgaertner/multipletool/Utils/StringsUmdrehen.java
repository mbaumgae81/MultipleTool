package dev.baumgaertner.multipletool.Utils;

public class StringsUmdrehen {

    public static String doStringUmkehren(String eingabe) {
        StringBuilder myString = new StringBuilder(eingabe);
        myString.reverse();
        String ausgabe = myString.toString();
        ausgabe = ausgabe.toLowerCase();
        return ausgabe.substring(0, 1).toUpperCase() + ausgabe.substring(1);
    }
}
