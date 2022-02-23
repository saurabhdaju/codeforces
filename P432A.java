package com.codeforces;
import java.util.Scanner;
public class P432A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int bin = 0;
        while(n-->0) {
            int a = sc.nextInt();
            if(5-a >= k) bin++;
        }
        System.out.println(bin/3);
    }
}
