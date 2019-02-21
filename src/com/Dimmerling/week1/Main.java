package com.Dimmerling.week1;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        int[] highTemp ={45,29,10,22,41,28,33};
        int[] perpChance ={95,60,25,5,0,75,90};
        String[] weekDay = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};

        for (int i = 0; i < highTemp.length; i++) {
            if (highTemp[i] <= 32 && perpChance[i] > 50 ) {
                System.out.println("it's going to snow on " + weekDay[i]);
            }
        }

    }
}