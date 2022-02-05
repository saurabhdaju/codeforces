package com.codeforces;
import java.util.Scanner;
public class P467A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bin = 0;
        for(int i=1; i<=n; i++) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            if(q - p >= 2)
                bin +=1;
        }
        System.out.println(bin);
    }
}