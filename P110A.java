package com.codeforces;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P110A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int totLuckyNos = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == '7' || str.charAt(i) == '4')
                totLuckyNos +=1;
        }
        if(totLuckyNos == 4 || totLuckyNos ==7)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
