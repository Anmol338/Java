package com.example;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        Scanner anmol=new Scanner(System.in);
        String a,b;
        System.out.println("Enter the first name:");
        a= anmol.nextLine();
        System.out.println("Enter the second name:");
        b= anmol.nextLine();
        System.out.printf("First Name:- %s \nLast NAme:- %s",a,b);
    }
}
