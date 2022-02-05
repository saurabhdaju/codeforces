package com.codeforces;
import java.util.Scanner;
public class P617A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x <= 5)
            System.out.println("1");
        else if(x%5==0)
            System.out.println(x/5);
        else
            System.out.println((x/5) + 1);
    }
}