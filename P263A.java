package com.codeforces;
import java.util.Scanner;
public class P263A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t1 = 0;
        int t2 = 0;
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                int a = sc.nextInt();
                if (a == 1) {
                    t1 = 3 - i;
                    t2 = 3 - j;
                }
            }
        }
        if (t1 < 0)
            t1 *= -1;
        if (t2 < 0)
            t2 *= -1;
        System.out.println(t1 + t2);
    }
}