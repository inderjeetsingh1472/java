package com.example.vscode;

import java.util.Scanner;

public class conditionalstatement2 {
    public static void main(String[] args) {
        //conditional staement
        Scanner sc=new Scanner(System.in);
        //pen=10; notebook=40
        int cash=sc.nextInt();
        // System.out.println(""); you dont need to print to get input value from user
        if(cash<10){
        System.out.println("cannot buy anything");
System.out.println("get more cash");
    }
    else if(cash>10 && cash<40)
    {
        System.out.println("can get only pen");
        System.out.println("you need more cash to buy notebook");

    }
    else
    System.out.println("can get both");
}
}
