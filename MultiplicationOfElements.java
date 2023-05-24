package com.practice.practice;
import java.util.Scanner;
public class MultiplicationOfElements {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array-");
        int n=sc.nextInt();
        System.out.println("enter array elements-");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int rs=1;
        for(int i=0;i<n;i++){
           rs*=arr[i];
        }
        System.out.println("ans="+rs);
    }
}