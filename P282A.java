package com.codeforces;
import java.util.Scanner;
public class P282A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bin = 0;
        for(int i=1; i<=n; i++) {
            String str = sc.next();
            if(str.equals("X++") || str.equals("++X"))
                bin+=1;
            else if(str.equals("--X") || str.equals("X--"))
                bin-=1;
        }
        System.out.println(bin);
    }
}