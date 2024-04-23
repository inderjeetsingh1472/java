package com.example.vscode;

public class operators {
    public static void main(String[] args) {
        // operators
        int a = 1;
        int b = 2;
        int add = a + b;
        int diff = a - b;
        int mul = a * b;
        int divide = a / b;
        System.out.println(diff);
        System.out.println(mul);
        System.out.println(divide);
        // on going to divide print is 0 because of integer value now we try to use
        // double
        double c = 5;
        double d = 3;
        double divid = c / d;
        System.out.println(divid);// but on going to double print value is in decimal.which is exact
        //there is % modulo operator which is used to find remainder
        double modulo=c%d;
        System.out.println(modulo);
    }
}