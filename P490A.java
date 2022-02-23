package com.codeforces;
import java.util.Scanner;
public class P490A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i=1; i<=n; i++) arr[i] = sc.nextInt();
        int N1s = 0, N2s = 0, N3s = 0;
        String str1 = "", str2 = "", str3 = "";
        for(int i=1; i<=n; i++) {
            if ((arr[i] == 1)) N1s++;
            else {
                if (arr[i] == 2) N2s++;
                else N3s++;
            }
        }
        int min = Math.min(Math.min(N1s,N2s),N3s);
        System.out.println(min);
        if(min != 0) {
            int[] pos = new int[n + 1];
            int idx = 1;
            for (int i = 1; i <= n; i++) {
                if (arr[i] == 1) {
                    pos[idx] = i;
                    idx++;
                }
            }
            for (int i = 1; i <= n; i++) {
                if (arr[i] == 2) {
                    pos[idx] = i;
                    idx++;
                }
            }

            for (int i = 1; i <= n; i++) {
                if (arr[i] == 3) {
                    pos[idx] = i;
                    idx++;
                }
            }

            for (int i = 1; i <= min; i++) {
                System.out.print(pos[i] + " ");
                System.out.print(pos[i + N1s] + " ");
                System.out.print(pos[i + N1s + N2s]);
                System.out.println();
            }
        }
    }
}