package com.codeforces;
import java.util.Scanner;
public class P1374A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int x = sc.nextInt(), y = sc.nextInt(), n = sc.nextInt();
             if(n%x == y) System.out.println(n);
             else if(n%x > y) System.out.println(n - (n%x) + y);
             else System.out.println(n - (n%x) - x + y);
        }
    }
}
