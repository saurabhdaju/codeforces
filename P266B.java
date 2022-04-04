package com.codeforces;
import java.util.Scanner;
public class P266B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), t =sc.nextInt();
        StringBuilder str = new StringBuilder(sc.next());
        while(t-->0) {
            for(int i=1; i<str.length(); i++) {
                if(str.charAt(i) == 'G' && str.charAt(i-1) == 'B') {
                    str.setCharAt(i, 'B');
                    str.setCharAt(i-1, 'G');
                    i++;
                }
            }
        }
        System.out.println(str);
    }
}
