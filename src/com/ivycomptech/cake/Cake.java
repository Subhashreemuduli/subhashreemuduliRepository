package com.ivycomptech.cake;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of candles");
        int n=sc.nextInt();
        int[] candles=new int[n];
        System.out.println("enter the candles:");
        for(int i=0;i<n;i++)
        {
            candles[i]=sc.nextInt();
        }
        int max=0;
        int count;
        for(int i=0;i<n;i++)
        {
            if(candles[i]>max)
            {
                max=candles[i];
            }}
        count=0;
        for(int i=0;i<n;i++)
        {

             if(max==candles[i])
                count++;
        }
        System.out.println(count);
    }
}
