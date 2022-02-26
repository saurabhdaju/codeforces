package com.codeforces;
import java.util.Scanner;
public class P1644A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            String str = sc.next();
            if (str.indexOf('r') < str.indexOf('R') && str.indexOf('b') < str.indexOf('B') && str.indexOf('g') < str.indexOf('G')) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
