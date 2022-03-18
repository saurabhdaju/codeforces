package com.codeforces;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1399B {

    //Working with FastReader
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
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            long[] a = new long[n], b = new long[n];
            for(int i=0; i<n; i++) a[i] = sc.nextLong();
            for(int i=0; i<n; i++) b[i] = sc.nextLong();

           long a_min =  Arrays.stream(a).min().getAsLong(), b_min =  Arrays.stream(b).min().getAsLong();
            long ans = 0;
            for(int i=0; i<n; i++) ans += Math.max(a[i] - a_min, b[i] - b_min);
            System.out.println(ans);
        }
    }
}