package com.codeforces;
import java.util.Scanner;
public class P1624A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1; i<=t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            //input
            for(int j=0; j<n; j++) {
                arr[j] = sc.nextInt();
            }
            //big
            int big = arr[0];
            for(int j=1;j<n; j++) {
                if(big < arr[j])
                    big = arr[j];
            }
            int small = arr[0];
            for(int j=1;j<n; j++) {
                if(small > arr[j])
                    small = arr[j];
            }
            System.out.println(big - small);
        }
    }
}