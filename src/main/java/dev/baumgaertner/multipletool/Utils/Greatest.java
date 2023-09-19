package dev.baumgaertner.multipletool.Utils;

import java.util.ArrayList;

public class Greatest {

    ArrayList<Integer> list = new ArrayList<>();

    public void addWert(int uebergabe){
        list.add(uebergabe);
    }

    public int getBiggest(){
        int greatest =0;
        for ( int tmp : list){
            if (tmp > greatest){
                greatest = tmp;
            }

        }
        return greatest;
    }
}
