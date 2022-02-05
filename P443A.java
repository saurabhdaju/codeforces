package com.codeforces;
import java.util.Scanner;
public class P443A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        StringBuilder strNew = new StringBuilder("");
        for(int i=0; i<str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i)))
                strNew = strNew.append(str.charAt(i));
        }
        System.out.println(strNew.chars().distinct().count());
    }
}
