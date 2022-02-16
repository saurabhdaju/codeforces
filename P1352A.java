package com.codeforces;
import java.util.Scanner;
public class P1352A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1; i<=t; i++) {
            String n = sc.next();
            int bin = 0;
            for(int j=0; j<n.length(); j++) {
                if(n.charAt(j) != '0')
                    bin++;
            }
            System.out.println(bin);
            for(int j=0; j<n.length(); j++) {
                if(n.charAt(j) != '0') {
                    System.out.print(n.charAt(j));
                    for(int k=1; k<=(n.length()-1-j); k++)
                        System.out.print("0");
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
