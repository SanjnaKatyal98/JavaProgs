package com.mycompany.practice;
import java.util.Scanner;
public class CountWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string sentence-");
        String str=sc.nextLine();
        str=str.toLowerCase();
        int c=str.split("\\s").length;//space
        System.out.println("no. of words in string="+c);
  }
}