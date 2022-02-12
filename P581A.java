package com.codeforces;
import java.util.Scanner;
public class P581A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(Math.min(a,b) + " " + (Math.max(a,b) - Math.min(a,b) )/2);
    }
}
