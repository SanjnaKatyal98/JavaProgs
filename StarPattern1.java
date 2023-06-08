package com.practice.practice;
import java.util.Scanner;
public class StarPattern1 {
    public static void main(String[] args) {
        //seedha star pattern
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of rows u want-");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){ //row
           for(int j=0;j<=i;j++){ //column
              System.out.print("* ");//for printing stars
           }
           System.out.println(); //for new line
        }
    }
}