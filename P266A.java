package com.codeforces;
import java.util.Scanner;
public class P266A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int bin = 0;
        for(int i=0; i<str.length()-1; i++) {
            char s1 = str.charAt(i);
            char s2 = str.charAt(i+1);
            if(s1 == s2)
                bin+=1;
        }
        System.out.println(bin);
    }
}