package com.ivycomptech.switchcase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args)
    {
        System.out.println("Give your rating");
        Scanner sc=new Scanner(System.in);
        int rating=sc.nextInt();
        switch(rating)
        {
            case 1:
                System.out.println("One star rating");
                break;
            case 2:
                System.out.println("Two star rating");
                break;
            case 3:
                System.out.println("Three star rating");
                break;
            case 4:
                System.out.println("Four star rating");
                break;
            case 5:
                System.out.println("Five star rating");
                break;
            default:
                System.out.println("Invalid rating");
        }

    }
}
