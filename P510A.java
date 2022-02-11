package com.codeforces;
import java.util.Scanner;
public class P510A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String snake = "#";
        String first = "";
        String last = "#";
        for(int i=1; i<m; i++) {
            snake += "#";
        }
        for(int i=1; i<m; i++) {
            first += ".";
        }
        String bin = "";
        for(int i=1; i<=n; i++) {
            if(i%2 != 0)
                System.out.println(snake);
            else {
                System.out.print(first);
                System.out.println(last);
                bin = first;
                first = last;
                last = bin;
            }
        }
    }
}
