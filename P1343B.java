package com.codeforces;
import java.util.Scanner;
public class P1343B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            if(n % 4 == 0) {
                System.out.println("YES");
                for(int i=2; i<=n/2; i +=2) System.out.print((n-i) + " " + (n+i) + " ");
                for(int i=1; i<n/2; i +=2) System.out.print((n-i) + " " + (n+i) + " ");
                System.out.println();
            }
            else
                System.out.println("NO");
        }
    }
}
