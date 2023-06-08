package com.practice.practice;
import java.util.Scanner;
public class StarPattern6 {
    public static void main(String[] args) {
        //reverse pyramid pattern
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of rows u want-");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){ //row
           for(int k=0;k<=i;k++){ //for space
              System.out.print(" ");//for printing stars
           }
           for(int j=0;j<=n-1-i;j++){ //column
              System.out.print("* ");//for printing stars
           }
           System.out.println(); //for new line
        }
    }
}