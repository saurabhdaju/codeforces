package com.codeforces;
import java.util.Scanner;
public class P275A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) arr[i][j] = sc.nextInt();
        }

        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                int sum = 0;
                sum += arr[i][j];
                if(i-1 >=0) sum += arr[i-1][j];
                if(i+1<3) sum += arr[i+1][j];
                if(j-1>=0) sum += arr[i][j-1];
                if(j+1<3) sum += arr[i][j+1];
                System.out.print(sum%2==0 ? "1" : "0");
            }
            System.out.println();
        }
    }
}
