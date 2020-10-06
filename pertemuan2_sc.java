package com.pboreg;

import java.util.*;

public class pertemuan2_sc {

    // sc

    public static void main(String[] args){

        String input;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("panggil nama: ");
        input = inputUser.next();

        // ekspresi berupa satuan (int,long,byte,short), String, atau enum
        switch(input){
            case "otong":
                System.out.println("saya otong dan hadir Bos!!!");
                break;
            case "ucup":
                System.out.println("saya ucup dan hadir Bos!!!");
                break;
            case "mario":
                System.out.println("saya mario dan hadir Bos!!!");
                break;
            default :
                System.out.println(input + " tidak hadir Bos!!!");
        }
        System.out.println("selesai program");
    }

}
