package com.example.vscode;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        // Arrays in integer these are non-primmitive
        int[] marks = new int[3];
        // boolean[] marks = new boolean[3];

        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        
        //length
        System.out.println(marks.length);

        //sort means make in accending order 95,97,98
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);
    }
}
