package com.codeforces;
import java.util.Scanner;
public class P268A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i=0; i<n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        int bin = 0;
        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {
                if (arr[i][0] == arr[j][1]) bin++;
                if (arr[i][1] == arr[j][0]) bin++;
            }
        }
        System.out.println(bin);
    }
}
