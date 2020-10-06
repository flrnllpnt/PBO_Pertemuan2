package com.pboreg;

public class pertemuan2_operator_komparasi {
    public static void main(String[] args){
        // Operator komparasi akan menghasilkan nilai dalam bentuk boolean
        int a,b;
        boolean hasilKomparasi;
        // operator equal atau persamaan
        System.out.println("\n---- PERSAMAAN");
        a = 10;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s\n", a,b, (a==b)); // nilai a==b akan menghasilkan nilai boolean

        a = 12;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s\n", a,b, (a==b)); // nilai a==b akan menghasilkan nilai boolean

        // operator not equal atau pertidaksamaan
        // kalau misal angkanya beda hasilnya true
        System.out.println("\n---- PERTIDAKSAMAAN");
        a = 10;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s\n", a,b, hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s\n", a,b, hasilKomparasi);

        // operator less atau kurang dari
        System.out.println("\n---- KURANG DARI");
        a = 9;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s\n", a,b, hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s\n", a,b, hasilKomparasi);

        // operator greater than atau lebih dari
        System.out.println("\n---- LEBIH DARI");
        a = 10;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s\n", a,b, hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s\n", a,b, hasilKomparasi);

        // operator less equal atau kurang dari sama dengan
        System.out.println("\n---- KURANG DARI SAMA DENGAN");
        a = 9;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s\n", a,b, hasilKomparasi);

        a = 10;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s\n", a,b, hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s\n", a,b, hasilKomparasi);

        // operator greater than equal atau lebih dari sama dengan
        System.out.println("\n---- LEBIH DARI SAMA DENGAN");
        a = 9;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s\n", a,b, hasilKomparasi);

        a = 10;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s\n", a,b, hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s\n", a,b, hasilKomparasi);
    }
}
