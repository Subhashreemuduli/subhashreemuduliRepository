package com.ivycomptech.random;

import java.util.Scanner;

public class RandomNumberGeneration {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int guess;
        int number=16;
        do{
            System.out.println("enter any number between 1 to 20 ");
            guess=sc.nextInt();
            if(guess>number)
                System.out.println("Too high,try again");
            else if (guess<number)
                System.out.println("Too low, try again");

        }while(guess!=number);
        System.out.println("your guess is correct");


    }
}


