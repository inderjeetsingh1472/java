package com.example.vscode;

public class stringoperation2 {
    public static void main(String[] args) {
        //Strings
        //charAt
        //lenght
        String name="Aman";
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.length());
        //replace
        String name2 =name.replace('a', 'b');
        System.out.println(name2);
        //my original string not changes by replace
        System.out.println(name);
    }
}
