package com.practice.practice;
import java.util.Scanner;
public class StarPattern3 {
    public static void main(String[] args) {
        //diamond star pattern
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of rows u want-");
        int n=sc.nextInt();
        for(int i=0;i<=n-1;i++){ //row
           for(int j=0;j<=i;j++){ //column
              System.out.print("* ");//for printing stars
           }
           System.out.println(); //for new line
        }
        for(int i=n-1;i>=0;i--){ //row
           for(int j=0;j<=i-1;j++){ //column
              System.out.print("* ");//for printing stars
           }
           System.out.println(); //for new line
        }
    }
}