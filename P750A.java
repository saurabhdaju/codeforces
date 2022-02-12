package com.codeforces;
import java.util.Scanner;
public class P750A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int mins = 240 -k;
        int bin = 0;
        for(int i=1; i<=n; i++) {
            mins = mins - (5*i);
            if(mins >=0)
                bin++;
            else
                break;
        }
        System.out.println(bin);
    }
}
