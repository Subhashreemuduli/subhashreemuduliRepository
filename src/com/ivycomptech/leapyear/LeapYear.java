package com.ivycomptech.leapyear;

import java.util.Scanner;

public class LeapYear {
    public static void main(String [] args)
    {
        System.out.println("Enter any year");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(((year%4==0) && (year%100!=0)) || (year%400==0))
        {
            System.out.println(year+" is leap year" );
        }
        else {
            System.out.println(year+" not a leap year");
        }
    }
}
