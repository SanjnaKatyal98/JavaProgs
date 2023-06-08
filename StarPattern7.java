package com.practice.practice;
import java.util.Scanner;
public class StarPattern7 {
    public static void main(String[] args) {
        //oolta star pattern with space
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of rows u want-");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){ //row
           for(int k=n;k>i;k--){ //for space
              System.out.print(" ");//for printing stars
           }
           for(int j=1;j<=i;j++){ //column
              System.out.print("*");//for printing stars
           }
           System.out.println(""); //for new line
        }
    }
}