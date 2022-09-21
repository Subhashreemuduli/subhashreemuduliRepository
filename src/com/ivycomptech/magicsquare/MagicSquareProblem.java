package com.ivycomptech.magicsquare;
import java.util.Scanner;
public class MagicSquareProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int flag=0,sumd1=0,sumd2=0,sumr=0,sumc=0;
        int[][] a=new int[3][3];
        System.out.println("enter the elements of matrix");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
       System.out.println("Matrix is");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(i==j){
                    sumd1=sumd1+a[i][j];
                }
                if(i+j==3-1)
                {
                    sumd2=sumd2+a[i][j];
                }
            }}
        if(sumd1!=sumd2)
            flag=1;
        else {

            for(int i=0;i<3;i++) {
                sumc = 0;
                sumr = 0;
                for (int j = 0; j < 3; j++) {
                    sumr = sumr + a[i][j];
                    sumc = sumc + a[j][i];
                }

                if (sumc != sumr)
                    flag = 1;
                else if (sumd1 != sumr)
                    flag = 1;

            }
            if(flag==0)
                System.out.println("yes");
            else
                System.out.println("no");

            }


        }



}
