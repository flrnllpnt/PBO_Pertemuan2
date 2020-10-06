package com.pboreg;
import java.util.*;

public class pertemuan2_latihan_kalkulator_ifelse {
    public static void main(String[] args){
        // a operator b
        Scanner inputUser;
        float a,b,hasil;
        char operator;

        inputUser = new Scanner(System.in);

        System.out.print("nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("operator = ");
        operator = inputUser.next().charAt(0);
        System.out.print("nilai b = ");
        b = inputUser.nextFloat();

        System.out.println("input use: " +a+" "+operator+" "+b);

        // operator tersedia x / + -
        if(operator == '+'){
            // penjumlahan
            hasil = a + b;
            System.out.println("hasil = " +hasil);
        } else if (operator == '-') {
            //pengurangan
            hasil = a - b;
            System.out.println("hasil = " +hasil);
        } else if (operator == '*') {
            //perkalian
            hasil = a * b;
            System.out.println("hasil = " +hasil);
        } else if (operator == '/') {
            //pembagian
            if (b == 0){
                System.out.println("pembagi nol menghasilkan tak hingga");
            } else {
                hasil = a / b;
                System.out.println("hasil = " +hasil);
            }
        } else {
            // operator tidak ditemukan
            System.out.println("operator tidak ditemukan");
        }
    }
}
