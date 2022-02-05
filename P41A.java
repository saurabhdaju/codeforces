package com.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P41A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = br.readLine();
        int bin = 0;
        if(s.length() == t.length()) {
            for(int i=0; i<s.length(); i++) {
                if(s.charAt(i) == t.charAt(t.length()-1-i))
                    bin +=1;
            }
            if(bin == s.length())
                System.out.println("YES");
            else
                System.out.println("NO");
        }

        else
            System.out.println("NO");
    }
}
