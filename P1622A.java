package com.codeforces;
import java.util.Scanner;
public class P1622A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a==b && c%2==0)
                System.out.println("YES");
            else if(b==c && a%2==0)
                System.out.println("YES");
            else if(a==c && b%2==0)
                System.out.println("YES");
            else if(a+b==c)
                System.out.println("YES");
            else if(b+c==a)
                System.out.println("YES");
            else if(a+c==b)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
