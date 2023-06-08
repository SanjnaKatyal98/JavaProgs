package com.practice.practice;
import java.util.Scanner;
public class StarPattern4 {
    public static void main(String[] args) {
        //seedha star pattern with space
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of rows u want-");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){ //row
           for(int k=2*(n-i);k>=0;k--){ //for space
              System.out.print(" ");//for printing stars
           }
           for(int j=0;j<=i;j++){ //column
              System.out.print("* ");//for printing stars
           }
           System.out.println(); //for new line
        }
    }
}