package com.codeforces;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Arrays;

public class P339A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder(br.readLine());
        int arrSize = (str.length()/2) + 1;
        int[] arr = new int[arrSize];
        for(int i=0; i<str.length(); i +=2) {
            int j=0;
            arr[j] = str.charAt(i) - '0';
            System.out.print(arr[j]);
        }
        Arrays.sort(arr);
        String output = "";
        
    }
}
