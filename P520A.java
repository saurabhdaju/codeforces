package com.codeforces;
import java.util.Scanner;
public class P520A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        int bin = (int) str.toLowerCase().chars().distinct().count();
        if(bin == 26)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
