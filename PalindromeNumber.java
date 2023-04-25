package com.mycompany.practice;
import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,rev=0,temp,tp=0;
        System.out.println("enter a 2 or 3 digit number-");
        n=sc.nextInt();
        temp=n;
        while(n!=0){
            tp=n%10;
            rev=rev*10+tp;
            n/=10;
        }
        if(temp==rev)
            System.out.println("number is palindrome");
        else
            System.out.println("number is not palindrome");
    }
}