package com.ivycomptech.power;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter base");
        int b=sc.nextInt();
        System.out.println("enter power");
        int p=sc.nextInt();
        int result=1;
        for(int i=1;i<=p;i++)
        {
            result=result*b;
        }
        System.out.println(result);
    }
}
