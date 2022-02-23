package com.codeforces;
import java.util.Arrays;
import java.util.Scanner;
public class P758A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i=1; i<=n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int sum = 0;
        for(int i=1; i<n; i++) sum += arr[n] - arr[i];
        System.out.println(sum);
    }
}

