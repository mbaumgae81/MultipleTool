package dev.baumgaertner.multipletool.Utils;

import java.util.ArrayList;

public class durchschnitt {

    ArrayList<Double> list =new ArrayList<>();


    public void addList(double uebergabe){
        list.add(uebergabe);
    }

    public double getDurchschnitt(){

        double rechne = 0;
        int lenght = this.list.size();

        for(double tmp : list){
            rechne += tmp;
        }

        return rechne / lenght;
    }

}
