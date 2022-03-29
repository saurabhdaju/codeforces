package com.codeforces;
import java.util.Arrays;
import java.util.Scanner;
public class P339A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.next().split("\\+");
        Arrays.sort(str);
        System.out.println(String.join("+",str));
    }
}