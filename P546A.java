package com.codeforces;
import java.util.Scanner;
public class P546A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // k ==> cost of 1st banana
        // n ==> total money he has
        // w ==> total bananas he want
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int moneyNeeded = 0;
        for(int i=1; i<=w; i++) {
            moneyNeeded = moneyNeeded + i*k;
        }
        if(moneyNeeded >= n)
            System.out.println(moneyNeeded-n);
        else
            System.out.println("0");
    }
}