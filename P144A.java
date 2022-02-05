package com.codeforces;
import java.util.Scanner;
public class P144A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        long min = arr[0];
        int minIndex = 0;
        long max = arr[0];
        int maxIndex = 0;
        for(int i=1; i<n; i++) {
            if(arr[i] > max) {
                max = arr[i];
                maxIndex =i;
            }
            if(arr[i] <= min) {
                min = arr[i];
                minIndex = i;
            }
        }
        System.out.println(maxIndex + n - 1 - minIndex);
    }
}
