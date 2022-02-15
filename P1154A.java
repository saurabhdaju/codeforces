package com.codeforces;
import java.util.Scanner;
import java.util.Arrays;
public class P1154A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[4];
        for(int i=0; i<4; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print(arr[3] - arr[1] + " ");
        System.out.print(arr[3] - arr[2] + " ");
        System.out.print(arr[3] - arr[0]);
    }
}
