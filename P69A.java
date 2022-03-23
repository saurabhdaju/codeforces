package com.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P69A {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        int [][] arr = new int[n][3];
        for(int i=0; i<n; i++) {
            for(int j=0; j<3; j++) arr[i][j] = sc.nextInt();
        }
        int sum_x = 0, sum_y = 0, sum_z = 0;
        for(int i=0; i<n; i++) sum_x += arr[i][0];
        for(int i=0; i<n; i++) sum_y += arr[i][1];
        for(int i=0; i<n; i++) sum_z += arr[i][2];
        System.out.println((sum_x==0 && sum_y==0 && sum_z==0) ? "YES" : "NO");
    }
}
