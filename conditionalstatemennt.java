package com.example.vscode;

import java.util.Scanner;

public class conditionalstatemennt {
    public static void main(String[] args) {
        //conditional stt
        boolean isSunUp=true;
        if(isSunUp==true)
        System.out.println("day");
        else
        System.out.println("night");

        Scanner sc=new Scanner(System.in);
        System.out.println("input your age");
        float age=sc.nextFloat();
        if(age>=18)
        System.out.println("adult");
        else
        System.out.println("minor");

    }
}
