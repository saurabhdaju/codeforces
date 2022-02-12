package com.codeforces;
import java.util.Scanner;
public class P581A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if(a>b) {
            System.out.print(b + " ");
            System.out.println((a-b)/2);
        }
        else if(a<b) {
            System.out.print(a + " ");
            System.out.println((b-a)/2);
        }
        else {
            System.out.println(a + " ");
            System.out.println("0");
        }
    }
}
