package com.ivycomptech.Dora;

import java.util.Scanner;

public class DoraMangoTree {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows, number of columns, tree number");
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int treeNumber=sc.nextInt();
        if(treeNumber>=1 && treeNumber<=cols)
            System.out.println("Yes");
        else if(treeNumber%cols==1)
            System.out.println("Yes");
        else if(treeNumber%cols==5)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
