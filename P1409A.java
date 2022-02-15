package com.codeforces;
import java.util.Scanner;
public class P1409A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=1; i<=t; i++) {
            int a =sc.nextInt();
            int b =sc.nextInt();
            if(a == b)
                System.out.println("0");
            else if(a > b) {
                if((a-b)%10 == 0)
                    System.out.println((a-b)/10);
                else
                    System.out.println(((a-b)/10) + 1);
            }
            else {
                if ((b - a) % 10 == 0)
                    System.out.println((b-a)/ 10);
                else
                    System.out.println(((b-a)/ 10) + 1);
            }
        }
    }
}
