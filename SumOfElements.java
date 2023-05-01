package com.mycompany.practice;
import java.util.Scanner;
public class SumOfElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0,n;
        System.out.println("enter no. of elements-");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elements-");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("sum of elements="+sum);
    }
}