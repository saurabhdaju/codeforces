package com.codeforces;
import java.util.Scanner;
public class P732A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int r = sc.nextInt();
        int t = 1;
        for(t=1; t>=1; t++) {
            if((t*k)%10 == 0 || ((t*k)-r)%10 == 0) {
                System.out.println(t);
                break;
            }
        }
    }
}
