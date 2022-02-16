package com.codeforces;
import java.util.Scanner;
public class P1352A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1; i<=t; i++) {
            int n = sc.nextInt();
            String str = "";
            int bin = 0;
            int a = 1;
            while (n > 0) {
                if(n%10 != 0) {
                    str += n%10 * a + " ";
                    bin++;
                }
                n /= 10;
                a *=10;
            }
            System.out.println(bin);
            System.out.println(str);
        }
    }
}
