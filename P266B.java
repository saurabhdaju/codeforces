package com.codeforces;
import java.util.Scanner;
public class P266B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), t =sc.nextInt();
        String str = sc.next();
        while(t-->0) {
            str = str.replaceAll("BG", "GB");
        }
        System.out.println(str);
    }
}
