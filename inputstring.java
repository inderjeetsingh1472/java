package com.example.vscode;

import java.util.Scanner;

public class inputstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        // String name=sc.next();
        // System.out.println(name);
        String name=sc.nextLine();//nextLine is used to print all name with space 
        System.out.println(name);
    }
}
