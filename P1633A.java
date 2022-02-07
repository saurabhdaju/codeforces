package com.codeforces;
import java.util.Scanner;
public class P1633A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1; i<=t; i++) {
            StringBuilder str = new StringBuilder(sc.next());
            if(Integer.parseInt(String.valueOf(str))%7 == 0)
                System.out.println(str);
            else {
                str.setCharAt(str.length()-1,'9');
                int n = Integer.parseInt(String.valueOf(str));
                System.out.println(n - (n%7));
            }
        }
    }
}