package com.codeforces;
import java.util.Scanner;
public class P734A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int anton = 0;
        int danik = 0;
        for(int i=0; i<n; i++) {
            if(str.charAt(i) == 'A')
                anton+=1;
            else if(str.charAt(i) == 'D')
                danik+=1;
        }
        if(anton>danik)
            System.out.println("Anton");
        else if(anton<danik)
            System.out.println("Danik");
        else
            System.out.println("Friendship");
    }
}
