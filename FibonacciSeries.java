package com.practice.practice;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number-");
        int n=sc.nextInt();
        int a=0,b=1;
        System.out.print("series:-"+a+" "+b+" ");
        for(int i=2;i<n;i++){
            int c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }
}