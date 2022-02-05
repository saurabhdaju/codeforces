package com.codeforces;
import java.util.Scanner;
public class P271A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(Integer.toString(++n).chars().distinct().count() < 4) {}
        System.out.println(n);
    }
}