package com.Bridgelabzworkshop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayinput {
     static void sum(int arr[],int arr_size) {
        int even=0;
        int odd=0;
         for (int i=0;i<arr_size;i++){
             if(arr[i]%2==0)
             {
                 // System.out.println(num[i]);
                 even++;
             }
             else
             {
                 //  System.out.println(num[i]);
                 odd++;
             }
         }
         System.out.println("Numbers of given elements array is: " +even+ "are even numbers");
         System.out.println();
         System.out.println("Number of elements in the array is: " +odd+ " are odd numbers");
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,22};
        int n= arr.length;
        sum(arr,n);
    }
}
