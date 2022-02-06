package com.codeforces;
import java.util.Scanner;
public class P304A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bin = 0;
        for(int a=1; a<=n; a++) {
            for(int b=a; b<=n; b++) {
                for(int c=b; c<=n; c++) {
                    if(c*c == (a*a) + (b*b))
                        bin++;
                }
            }
        }
        System.out.println(bin);
    }
}