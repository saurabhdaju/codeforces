package com.codeforces;
import java.util.Scanner;
public class P996A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bills = 0;
        while(n!=0) {
            if(n>=1 && n<5) {
                n -= 1;
                bills++;
            }
            else if(n>=5 && n<10) {
                n -=5;
                bills++;
            }
            else if(n>=10 && n<20) {
                n -=10;
                bills++;
            }
            else if(n>=20 && n<100) {
                n -=20;
                bills++;
            }
            else {
                n -=100;
                bills++;
            }
        }
        System.out.println(bills);
    }
}
