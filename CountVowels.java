package com.mycompany.practice;
import java.util.Scanner;
public class CountVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string sentence-");
        String str=sc.nextLine();
        str=str.toLowerCase();
        int c=0,l=str.length();
        for(int i=0;i<l;i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
              c++;
        }
        System.out.println("no. of vowels in string="+c);
    }
}