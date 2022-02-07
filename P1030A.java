package com.codeforces;
import java.util.Scanner;
public class P1030A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bin = 0;
        for(int i=1; i<=n; i++) {
            byte opinion = sc.nextByte();
            if(opinion == 1) {
                bin +=1;
                break;
            }
        }
        if(bin == 0)
            System.out.println("EASY");
        else
            System.out.println("HARD");
    }
}
