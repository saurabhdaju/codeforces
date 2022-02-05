package com.codeforces;
import java.util.Scanner;
public class P59A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int totUpper = 0;
        int totLower = 0;
        for(int i=0; i<s.length();i++) {
            char cr = s.charAt(i);
            if (cr >= 'A' && cr <= 'Z')
                totUpper += 1;
            else
                totLower += 1;
        }
        if(totUpper > totLower)
            System.out.println(s.toUpperCase());
        else
            System.out.println(s.toLowerCase());
    }
}
