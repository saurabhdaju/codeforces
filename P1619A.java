package com.codeforces;
import java.util.Scanner;
public class P1619A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++) {
            String str = sc.next();
            int length = str.length();
            if(str.substring(0,length/2).equals(str.substring(length/2,length)))
                System.out.println("YES");
            else
                System.out.println("NO");
        }

    }
}