package com.ivycomptech.ountandsay;

import java.util.Scanner;

public class CountAndSay {

    public static String countAndSay(int n) {
        if(n==1)
            return "1";
        String s=countAndSay(n-1);
        int counter=0;
        String res="";
        for(int i=0;i<s.length();i++)
        {
            counter++;
            if(i==s.length()-1||s.charAt(i)!=s.charAt(i+1))
            {
                res=res+counter+s.charAt(i);
                counter = 0;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(countAndSay(sc.nextInt()));

    }
}
