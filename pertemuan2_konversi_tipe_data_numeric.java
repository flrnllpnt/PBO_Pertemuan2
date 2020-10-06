package com.pboreg;

public class pertemuan2_konversi_tipe_data_numeric {
    public static void main(String[] args){
        // program untuk konversi data
        int nilaiInt = 14; //32-bit
        System.out.println("nilai int = " + nilaiInt);

        // Memperluas rentang ke tipe data yang lebih besar
        long nilailong = nilaiInt;
        System.out.println("nilai long = " + nilailong);

        // Memperkecil rentang ke tipe data yang lebih kecil (akan menghilangkan nilai aslinya)
        byte nilaiByte = (byte) nilaiInt; // menggunakan casting operator
        System.out.println("nilai byte = " + nilaiByte);
        System.out.println("nilai max byte = " + Byte.MAX_VALUE);
        System.out.println("nilai min byte = " + Byte.MIN_VALUE);

        // casting pembagian (otomatis)
        int a = 10;
        float b = 4;

        float c = a/b;
        System.out.printf("%d / %f = %f\n", a,b,c);

        int x = 10;
        int y = 4;

        float z = (float) x/y;
        System.out.printf("%d / %d = %f\n",x,y,z);
    }
}
