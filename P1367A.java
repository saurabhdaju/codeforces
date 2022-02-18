package com.codeforces;
import java.util.Scanner;
public class P1367A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            StringBuilder str = new StringBuilder(sc.next());
            for(int i=2; i<str.length(); i++) {
                str.deleteCharAt(i);
            }
            System.out.println(str);
        }
    }
}
