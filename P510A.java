package com.codeforces;
import java.util.Scanner;
public class P510A {
    public static void main(String[] args) {
        //Nested loop approach
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=m; j++) {
                if ((i % 2 != 0) || (i % 4 == 2 && j == m) || (i % 4 == 0 && j == 1))
                    System.out.print('#');
                else
                    System.out.print('.');
            }
            System.out.println();
        }
    }
}
