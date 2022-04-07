package com.example;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner anmol= new Scanner(System.in);
        int a,b;
        System.out.println("Enter the first number:");
        a=anmol.nextInt();
        System.out.println("Enter the second number:");
        b=anmol.nextInt();
        System.out.println("Enter 1 for add, 2 for subtract, 3 for multiplication, 4 for division");
        int c= anmol.nextInt();
        switch (c){
            case 1:
                System.out.printf("The sum of %d and %d is %d.",a,b,a+b);
                break;
            case 2:
                System.out.printf("The difference of %d and %d is %d.",a,b,a-b);
                break;
            case 3:
                System.out.printf("The product of %d and %d is %d.",a,b,a*b);
                break;
            case 4:
                System.out.printf("The quotation of %d and %d is %d.",a,b,a/b);
                break;
            default:
                System.out.println("Invalid Operator!!");
                break;
        }
    }
}
