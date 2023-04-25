package com.mycompany.practice;
import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str,rev="";
        System.out.println("enter a string-");
        str=sc.next();
        int n=str.length();
        for(int i=n-1;i>=0;--i){
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev))//this has a problem->if a character is in capital it'll show not palindrome
          System.out.println("palindrome string");
        else
          System.out.println("not a palindrome string");
        if(str.toLowerCase().equals(rev.toLowerCase()))//to solve above problem
          System.out.println("palindrome string");
        else
          System.out.println("not a palindrome string");
    }
}