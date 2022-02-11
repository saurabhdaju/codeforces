package com.codeforces;
import java.util.Scanner;
public class P1335A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1; i<=t; i++) {
            int n = sc.nextInt();
            if(n>2 && n%2 == 0)
                System.out.println((n/2) -1);
            else if(n>2 && n%2 != 0)
                System.out.println(((n+1)/2) - 1);
            else
                System.out.println("0");
        }
    }
}
