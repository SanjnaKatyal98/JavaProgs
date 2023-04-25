package com.mycompany.practice;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string sentence-");
        String str=sc.nextLine();
        char ch;String s="";
        StringBuilder s1=new StringBuilder();
        char ch1[]=str.toCharArray();
        int l=str.length();
        System.out.println("orignal sentence:- "+str);
        for(int i=0;i<l;i++){//method 1
            ch=str.charAt(i);
            s=ch+s;//adds each character in front of existing string
        }
        System.out.println("reverse sentence:- "+s);
        s1.append(str);//method 2
        s1.reverse();
        System.out.println("reverse sentence:- "+s1);
        for(int i=ch1.length-1;i>=0;i--){//method 3
            System.out.print(ch1[i]);
        }
    }
}