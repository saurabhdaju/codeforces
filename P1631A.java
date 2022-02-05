package com.codeforces;
import java.util.Scanner;
public class P1631A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1; i<=t; i++) {
            int n = sc.nextInt();
            int[] arr1 = new int[n];
            for(int j=0; j<n; j++) {
                arr1[j] = sc.nextInt();
            }
            int[] arr2 = new int[n];
            for(int j=0; j<n; j++) {
                arr2[j] = sc.nextInt();
            }
            int max = 0;
            for(int j=0; j<n; j++) {
                if(arr1[j] * arr2[j] > max)
                    max = arr1[j] * arr2[j];
            }
            System.out.println(max);
        }
    }
}