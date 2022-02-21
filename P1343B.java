package com.codeforces;
import java.util.Scanner;
public class P1343B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            if(n % 4 == 0) {
                System.out.println("YES");
                int a =2;
                int sum = 0;
                for(int j=1; j<= n/2; j++) {
                    System.out.print(a + " ");
                    sum += a;
                    a +=2;
                }
                a =  1;
                for(int j=1; j<= n/2; j++) {
                    if(j != n/2) {
                        System.out.print(a + " ");
                        sum -= a;
                        a += 2;
                    }
                    else
                        System.out.println(sum);
                }
            }
            else
                System.out.println("NO");
        }
    }
}
