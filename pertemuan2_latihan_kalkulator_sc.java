package com.pboreg;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner inputUser;
	float a,b,hasil;
	String operator;

	inputUser = new Scanner(System.in);

        System.out.print("nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("operator");
        operator = inputUser.next();
        System.out.print("nilai b = ");
        b = inputUser.nextFloat();

         switch (operator){
            case "+":
                hasil = a + b;
                break;
             case "-":
                hasil = a - b;
                break;
             case "*":
                hasil = a * b;
             case "/":
                hasil = a / b;
             default:
                 System.out.println("operator" + operator + "tidak ditemukan");
        }

    }
}
