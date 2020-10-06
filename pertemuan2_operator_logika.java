package com.pboreg;

public class pertemuan2_operator_logika {
    public static void main(String[] args){
        // Operator  Logika --> operasi yang biasa kita lakukan kepada tipe data boolean
        // AND, OR, XOR, negasi

        boolean a,b,c;
        // OR / ATAU (||)

        System.out.println("==== OR (||) ====");
        a = false;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b +  " = " + c);
        a = false;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b +  " = " + c);
        a = true;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b +  " = " + c);
        a = true;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b +  " = " + c);

        // AND / DAN (&&)
        System.out.println("==== DAN (&&) ====");
        a = false;
        b = false;
        c = (a&&b);
        System.out.println(a + " && " + b +  " = " + c);
        a = false;
        b = true;
        c = (a&&b);
        System.out.println(a + " && " + b +  " = " + c);
        a = true;
        b = false;
        c = (a&&b);
        System.out.println(a + " && " + b +  " = " + c);
        a = true;
        b = true;
        c = (a&&b);
        System.out.println(a + " && " + b +  " = " + c);

        // XOR / exclusive or (^)
        System.out.println("==== XOR (^) ====");
        a = false;
        b = false;
        c = (a^b);
        System.out.println(a + " ^ " + b +  " = " + c);
        a = false;
        b = true;
        c = (a^b);
        System.out.println(a + " ^ " + b +  " = " + c);
        a = true;
        b = false;
        c = (a^b);
        System.out.println(a + " ^ " + b +  " = " + c);
        a = true;
        b = true;
        c = (a^b);
        System.out.println(a + " ^ " + b +  " = " + c);

        // NOT / NEGASI --> flipping (!)
        System.out.println("==== NEGASI (!) ====");
        a = true;
        c = !a;
        System.out.println(a + " --> (!) = " + c);

        a = false;
        c = !a;
        System.out.println(a + " --> (!) = " + c);
    }
}
