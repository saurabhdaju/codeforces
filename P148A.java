package com.codeforces;
import java.util.Scanner;
//public class P148A {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int k = sc.nextInt();
//        int l = sc.nextInt();
//        int m = sc.nextInt();
//        int n = sc.nextInt();
//        int d = sc.nextInt();
//
//        byte[] arr =  new byte[d];
//        for(int i=0; i<d; i++)
//            arr[i] = 1;
//
//        for(int i=k; i<=d; i= i+k) {
//            arr[i-1] = 0;
//        }
//
//        for(int i=l; i<=d; i= i+l) {
//            arr[i-1] = 0;
//        }
//
//        for(int i=m; i<=d; i= i+m) {
//            arr[i-1] = 0;
//        }
//
//        for(int i=n; i<=d; i= i+n) {
//            arr[i-1] = 0;
//        }
//
//        int bin = 0;
//        for(int i=0; i<d; i++) {
//            if(arr[i] == 0)
//                bin++;
//        }
//        System.out.println(bin);
//    }
//}


public class P148A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int l = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int d = sc.nextInt();

        int bin = 0;
        for(int i=1; i<=d; i++) {
            if(i%k==0 || i%l==0 || i%m==0 || i%n==0)
                bin++;
        }
        System.out.println(bin);
    }
}