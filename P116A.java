package com.codeforces;
import java.util.Scanner;
public class P116A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int enterToT = 0;
        int bin = 0;
        for(int i=1; i<=n; i++) {
            int  exit = sc.nextInt();
            int enter = sc.nextInt();
            enterToT = enterToT + enter - exit;
            if(enterToT>bin)
                bin = enterToT;
        }
        System.out.println(bin);
    }
}
