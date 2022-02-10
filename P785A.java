package com.codeforces;
import java.util.Scanner;
public class P785A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int faces =0;
        for(int i=1; i<=n;i++) {
            String str = sc.next();
            if (str.compareTo("Tetrahedron") == 0)
                faces += 4;
            else if (str.compareTo("Cube") == 0)
                faces += 6;
            else if (str.compareTo("Octahedron") == 0)
                faces += 8;
            else if (str.compareTo("Dodecahedron") == 0)
                faces += 12;
            else if (str.compareTo("Icosahedron") == 0)
                faces += 20;
        }
        System.out.println(faces);
    }
}
