package com.example.vscode;

public class casting {
    public static void main(String[] args) {
        // casting
        double price = 100.00;
        double finalprice = price + 18;
        System.out.println(finalprice);
//Explicit Casting
        int p = 100;
        int fp = p + (int)18.18;//this cannot store any decimal value
        System.out.println(fp);
        // we cannot replace double to int because double store 8 byte mem whereas int
        // store only 4byte.
        // but we repace int to double without any error
    }
}
