package com.codeforces;
import java.util.Scanner;
public class P1328A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1; i<=t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a<b)
                System.out.println(b-a);
            else if(a>b && a%b !=0)
                System.out.println(b - (a%b));
            else
                System.out.println("0");
        }
    }
}
