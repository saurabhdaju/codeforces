package com.codeforces;
import java.util.Arrays;
import java.util.Scanner;
public class P1353B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for(int i=0; i<n; i++) a[i] = sc.nextInt();
            for(int i=0; i<n; i++) b[i] = sc.nextInt();
            Arrays.sort(a);
            Arrays.sort(b);
            int p = 0;
            while (k != 0 && p<n) {
                if(b[n-1-p] > a[p]) {
                    int temp = a[p];
                    a[p] = b[n-1-p];
                    b[n-1-p] = temp;
                    k--;
                }
                p++;
            }
            int sum = 0;
            for(int i=0; i<n; i++) sum += a[i];
            System.out.println(sum);
        }
    }
}
