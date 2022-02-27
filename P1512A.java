package com.codeforces;
import java.util.Scanner;
public class P1512A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int ans = 0;
            int n = sc.nextInt();
            int[] arr = new int[n+1];
            for(int i=1; i<=n; i++) {
                arr[i] = sc.nextInt();
            }
            if( arr[1] != arr[2]) {
                if(arr[1] == arr[3]) ans=2;
                else ans=1;
            }
            else if (arr[n] != arr[n-1]) {
                if(arr[n-1] == arr[n-2]) ans = n;
                else ans = n-1;
            }
            else {
                for(int i=3; i<=(n-2); i++) {
                    if (arr[i] != arr[1]) {
                        ans = i;
                        break;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
