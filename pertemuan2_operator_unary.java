package com.pboreg;

public class pertemuan2_operator_unary {
    public static void main(String[] args){
        // unary = operasi yang dilakukan pada satu variabel saja
        // unary + dan -
        int angka = 1;
        System.out.printf("unary '-', %d menjadi %d\n", angka, -angka);
        System.out.printf("unary '+', %d menjadi %d\n", angka, +angka); // tidak merubah angka

        //unary decrement dan increment
        int angka2 = 10;
        angka2++;// menambah angka
        System.out.println("nilai dengan '++' menjadi = " + angka2);

        int angka3 = 10;
        angka2--;// mengurangi angka
        System.out.println("nilai dengan '--' menjadi = " + angka3);

        int a = 5;
        System.out.printf("nilai dengan '++' prefix menjadi = %d\n", ++a); // akan dieksekusi baru ditampilkan
        int b = 5;
        System.out.printf("nilai dengan '++' postfix menjadi = %d\n", b++); //akan dipanggil dulu baru di eksekusi
        System.out.printf("nilai hasil dari postfix menjadi = %d\n", b);

        // unary boolean dengan ! untuk negasi
        boolean ucup = true;
        System.out.println("nilai boolean = " + ucup);
        System.out.println("nilai boolean = " + !ucup);// tidak akan mengubah nilai boolean
    }
}
