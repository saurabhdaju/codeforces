package com.codeforces;
import java.util.Scanner;
public class P344A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int groups = 0;
        int option = 0;
        for(int i=1; i<=n; i++) {
            int arrangement = sc.nextInt();
            if(arrangement != option ) {
                groups += 1;
                option = arrangement;
            }
        }
        System.out.println(groups);
    }
}
