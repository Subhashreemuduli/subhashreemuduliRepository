package com.ivycomptech.averagesalary;

import java.util.Scanner;

public class AverageSalary {
    public static void main(String[] args )
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size ");
        int n=sc.nextInt();
        int[] salary=new int[n];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        double sum=0;
        System.out.println("Enter salary of employee");
        for(int i=1;i<n;i++) {

            salary[i] = sc.nextInt();
            if(salary[i]>max)
                max=salary[i];
            if(salary[i]<min)
                min=salary[i];
            sum = sum + salary[i];
        }
        sum=sum-min-max;
        System.out.println("average salary is "+ sum/(n-2));

    }
}
