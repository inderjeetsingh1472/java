package com.example.vscode;

public class logicaloperator {
    public static void main(String[] args) {
          // logicaloperator
    //&&
    int a=30;
    int b=40;
    if(a<50 && b<50)
System.out.println("both less than 50");
if(a<=30 && b<=30)
System.out.println("a and b is less than 30");//this cannot print anything because one conditional is false
// || this is logical or operator
if(a<=30 || b<=30)
System.out.println("a and b is less than 30"); //this need only one statement trure to print
// ! this is not operator
boolean isadult=false;
if(! isadult)
System.out.println("is adult");
else
System.out.println("not adult");

    }
  
}
