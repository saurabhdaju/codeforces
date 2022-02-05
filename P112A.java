package com.codeforces;
import java.util.Scanner;
public class P112A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        int bin = str1.compareTo(str2);
        if(bin<0)
            System.out.println("-1");
        else if(bin>0)
            System.out.println("1");
        else if(bin == 0)
            System.out.println("0");

    }
}