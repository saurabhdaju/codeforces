package com.codeforces;
import java.util.Scanner;
public class P61A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        for(int i=0; i<str1.length(); i++) {
            if(str1.charAt(i) != str2.charAt(i))
                System.out.print("1");
            else
                System.out.print("0");
        }
    }
}
