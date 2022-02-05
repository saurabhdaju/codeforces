package com.codeforces;
import java.util.Scanner;
public class P1633B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i=1; i<=test; i++) {
            String str = sc.next();
            int c1 = 0;
            int c0 = 0;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(j) == '1')
                    c1++;
                else
                    c0++;
            }
            if(c1>c0)
                System.out.println(c0);
            else if(c0>c1)
                System.out.println(c1);
            else
                System.out.println(c0-1);
        }
    }
}
