package com.codeforces;
import java.util.Scanner;
public class P791A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int leman = sc.nextInt();
        int bob = sc.nextInt();
        int bin = 0;
        do{
            leman *= 3;
            bob *=2;
            bin +=1;
        }while(bob >= leman);
        System.out.println(bin);
    }
}