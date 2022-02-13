package com.codeforces;
import java.util.Scanner;
public class P427A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int police = 0, bin = 0;
        for(int i =1; i<=n; i++) {
            int x = sc.nextInt();
            if(x == -1 && police ==0)
                bin += 1;
            else
                police = police + x;
        }
        System.out.println(bin);
    }
}
