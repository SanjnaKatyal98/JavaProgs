package com.practice.practice;
import java.util.Scanner;
public class StarPattern5 {
    public static void main(String[] args) {
        //pyramid pattern
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of rows u want-");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){ //row
           for(int k=n-i;k>1;k--){ //for space
              System.out.print(" ");//for printing stars
           }
           for(int j=0;j<=i;j++){ //column
              System.out.print("* ");//for printing stars
           }
           System.out.println(); //for new line
        }
    }
}