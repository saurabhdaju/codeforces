package com.codeforces;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
//
//public class P281A {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        System.out.println(str.substring(0,1).toUpperCase() + str.substring(1));
//    }
//}

import java.util.Scanner;
public class P281A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str.substring(0,1).toUpperCase() + str.substring(1));
    }
}