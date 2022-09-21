package com.ivycomptech.euro;

public class EuroDriver {
    public static void main(String[] args) {
        Euro tenEuros=new Euro(10);
        Euro othertenEuros=new Euro(10);
        Euro fiveeuros=new Euro(5);
        Euro twoeuros=new Euro(2);
        Euro seveneuros=new Euro(7);
        System.out.println(fiveeuros.sum(twoeuros).equals(seveneuros));
        System.out.println(tenEuros.equals(othertenEuros));
    }
}
