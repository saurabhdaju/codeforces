package com.codeforces;
import java.util.Scanner;
public class P200B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double totVol = 0;
        for(int i=1; i<=n; i++) {
            double vol = sc.nextDouble();
            totVol+= vol/n;
        }
        System.out.println(totVol);
    }
}
