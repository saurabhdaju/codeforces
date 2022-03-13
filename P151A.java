package com.codeforces;
import java.util.Scanner;
public class P151A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), l = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt(), p = sc.nextInt(), nl = sc.nextInt(), np = sc.nextInt();
        int TotToastWrtDrinks = (k*l)/nl, TotToastWrtSlices = c*d, TotToastWrtSalt = p/np;
        System.out.println(Math.min(Math.min(TotToastWrtDrinks,TotToastWrtSalt),TotToastWrtSlices)/n);
    }
}
