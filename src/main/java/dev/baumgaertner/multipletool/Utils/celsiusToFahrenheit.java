package dev.baumgaertner.multipletool.Utils;

public class celsiusToFahrenheit {

    public static double doUmrechnungCtF(double eingabe){
        return eingabe * 1.8 + 32;
    }

    public static double doUrechnungFtC(double eingabe){
        return (eingabe- 32) /1.8;
    }


}
