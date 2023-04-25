package com.mycompany.practice;
import java.util.Scanner;
import java.lang.Math;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,rs=0,temp=0;
        System.out.println("enter number-");
        n=sc.nextInt();
        temp=n;
        while(n!=0){
            int tp=n%10;
            //rs=rs+(tp*tp*tp);
            rs+=Math.pow(tp,3);//instead of above line of code we can also use this
            n/=10;
        }
        if(temp==rs)
          System.out.println("armstrong number");
        else
          System.out.println("not armstrong number");
    }
}