package com.example.vscode;

import java.util.Scanner;
 
public class miniproject {
     public static void main(String[] args) {
        //mini project
        Scanner sc=new Scanner(System.in);

        int mynumber=(int)(Math.random()*100);
        int usernumber =0;
        do{
            System.out.println("guess my number(1-100) :");
             usernumber= sc.nextInt();

            if (usernumber == mynumber) {
                System.out.println("WOOHOO ... CORRECT NUMBER!");
                break;
            }
            else if (usernumber > mynumber) {
                System.out.println("your num is too large");
                
            }
            else{
                System.out.println("your num is too small");
            }

        }
        while(usernumber>=0);
        
      {  System.out.print("mynumber was ");
System.out.println(mynumber);
    }
}

}
