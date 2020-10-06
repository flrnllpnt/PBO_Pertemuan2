package com.pboreg;

public class Main {

    public static void main(String[] args) {
	// Operasi Aritmatika
    int variable1 = 10;
    int variable2 = 5;

    int hasil;

    // 1. Penjumlahan
        hasil = variable1 + variable2;
        System.out.println(variable1 + " + " + variable2 + " = " + hasil);

    // 2. Pengurangan
        hasil = variable1 - variable2;
        System.out.printf("%d - %d = %d \n",variable1,variable2,hasil);

    // 3. Perkalian
        hasil = variable1 * variable2;
        System.out.printf("%d x %d = %d \n",variable1,variable2,hasil);

    // 4. Pembagian
        // Pembagian menggunakan integer
        hasil = variable1 / variable2;
        System.out.printf("%d / %d = %d \n",variable1,variable2,hasil);

        // Pembagian menggunakan float (koma-komaan)
        float a = 6;
        float b = 5;
        float hasilFLoat = a/b;
        System.out.println(a + " / " + b + " = " + hasilFLoat);

    // 5. Modulus (sisa pembagian)
        hasil = variable1 % variable2;
        System.out.printf("%d %% %d = %d \n",variable1,variable2,hasil);
    }
}
