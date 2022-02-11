package com.codeforces;
import java.util.Scanner;
public class P155A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int amazing = 0;
        int[] points = new int[n];
        for(int i=0; i<n; i++)
            points[i] = sc.nextInt();
        for(int i=1; i<n; i++) {
            int minBin = 0;
            int maxBin = 0;
            for(int j=0; j<i; j++) {
                if(points[j] > points[i])
                    minBin++;
                else if(points[j] < points[i])
                    maxBin++;
            }
            if(maxBin == i || minBin == i)
                amazing++;
        }
        System.out.println(amazing);
    }
}
