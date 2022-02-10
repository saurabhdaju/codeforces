package com.codeforces;
import java.util.Arrays;
import java.util.Scanner;
public class P141A {
    public static String alphaSort(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();
        if(str1.length() + str2.length() != str3.length())
            System.out.println("NO");
        else {
            String str = str1 + str2;
            String a = alphaSort(str);
            String b = alphaSort(str3);
            if(a.compareTo(b) == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}