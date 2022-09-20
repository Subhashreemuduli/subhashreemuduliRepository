package com.ivycomptech.stringproblem3;

public class StringProblem {
    public static void main(String[] args)
    {
        String s1="Hello Forks";
        String s2="Hi Forks";
        System.out.println(s1.regionMatches(6,s2,3,5));
        System.out.println(s1.regionMatches(7,s2,3,4));
    }
}
