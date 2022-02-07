package com.codeforces;
import java.util.Scanner;
public class P71A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            String s = sc.next();
            if(s.length() > 10) {
                System.out.print(s.charAt(0));
                System.out.print(s.length()-2);
                System.out.print(s.charAt(s.length()-1));
            }
            else {
                System.out.println(s);
            }
        }
    }
}