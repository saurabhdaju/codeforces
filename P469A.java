package com.codeforces;
//import java.util.Scanner;
//public class P469A {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int maxLvl = sc.nextInt();
//        int[] Totlvl = new int[maxLvl];
//        int bin = 0;
//        for(int i=0; i<maxLvl; i++)
//            Totlvl[i] = i+1;
//        for(int j=0; j<2; j++) {
//            int n = sc.nextInt();
//            for(int x=0; x<n; x++) {
//                int lvl = sc.nextInt();
//                if(Totlvl[lvl-1] == lvl) {
//                    bin++;
//                    Totlvl[lvl-1] = 0;
//                }
//            }
//        }
//        if(bin == maxLvl)
//            System.out.println("I become the guy.");
//        else
//            System.out.println("Oh, my keyboard!");
//    }
//}









import java.util.Scanner;
public class P469A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxLvl = sc.nextInt();
        int[] Totlvl = new int[maxLvl];
        int bin = 0;
        for(int i=0; i<maxLvl; i++)
            Totlvl[i] = i+1;

        int n1 = sc.nextInt();
        for(int x=0; x<n1; x++) {
            int lvl = sc.nextInt();
            if(Totlvl[lvl-1] == lvl) {
                bin++;
                Totlvl[lvl-1] = 0;
            }
        }

        int n2 = sc.nextInt();
        for(int x=0; x<n2; x++) {
            int lvl = sc.nextInt();
            if(Totlvl[lvl-1] == lvl) {
                bin++;
                Totlvl[lvl-1] = 0;
            }
        }

        if(bin == maxLvl)
            System.out.println("I become the guy.");
        else
            System.out.println("Oh, my keyboard!");
    }
}