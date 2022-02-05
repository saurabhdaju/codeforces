package com.codeforces;
import java.util.Scanner;
public class P136A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] givento = new int[n];
        for(int i=0; i<n; i++) {
            givento[i] = sc.nextInt();
        }
        for(int i=1; i<=n; i++) {
            for(int j=0; j<n; j++) {
                if(givento[j] == i)
                    System.out.print(j+1 + " ");
            }
        }
    }
}
