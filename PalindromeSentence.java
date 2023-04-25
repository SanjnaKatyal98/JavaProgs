package com.mycompany.practice;
import java.util.Scanner;
public class PalindromeSentence{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="",str;
        System.out.println("enter a string sentence-");
        str=sc.nextLine();
        int l=str.length();
        for(int i=l-1;i>=0;i--){
            s=s+str.charAt(i);
        }
        if(str.equals(s))//this has a problem->if a character is in capital it'll show not palindrome
          System.out.println("palindrome sentence");
        else
          System.out.println("not a palindrome sentence");
        if(str.equalsIgnoreCase(s))//to solve above prob
          System.out.println("palindrome sentence");
        else
          System.out.println("not a palindrome sentence");
    }
}