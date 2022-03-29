package com.codeforces;
import java.util.Scanner;
public class P1409A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            long a = sc.nextInt(), b = sc.nextInt(), bin = Math.max(a, b)-Math.min(a, b);
            System.out.println(bin%10==0 ? bin/10 : bin/10 + 1);
        }
    }
}
