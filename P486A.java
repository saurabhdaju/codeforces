package com.codeforces;
import java.util.Scanner;
public class P486A {
    public static void main(String[] args) {
        long n = new Scanner(System.in).nextLong();
        if(n%2 == 0)
            System.out.println(n/2);
        else
            System.out.println((n/2) - n);
    }
}
