package com.codeforces;
import java.util.Scanner;
public class P472A {
// isn.t allowing me to rturn true false in if/else statement
    public static boolean checkPrime(int n) {
        int bin = 0;
        for(int i=2; i<=n/2; i++) {
            if(n%i == 0) {
                bin++;
                return false;
            }
        }
        if (bin == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%2 == 0) {
//            if((n/2) % 2 == 0)
//                System.out.println(n/2 + " " + n/2);
//            else
//                System.out.println((n/2)-1 + " " + ((n/2)+1));
            System.out.println((n/2) % 2 == 0 ? n/2 + " " + n/2 : (n/2)-1 + " " + ((n/2)+1)); //ternary operator

        }
        else {
            int first = n/2;
            int second = (n/2) + 1;
            while(checkPrime(first ) || checkPrime(second)) {
                first++;
                second--;
            }
            System.out.println(first + " " + second);
        }
    }
}
