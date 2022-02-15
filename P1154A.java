package com.codeforces;
import java.util.Scanner;
public class P1154A {

    public static int[] removeElement(int[] arr, int index) {
        int[] newArr = new int[arr.length -1];
        System.arraycopy(arr, 0, newArr, 0, index);
        System.arraycopy(arr, index+1, newArr, index, arr.length - index - 1);
        return newArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[4];
        for(int i=0; i<4; i++) {
            arr[i] = sc.nextInt();
        }

        int threesome = 0;
        int indexThreesome = 0;
        for(int i=0; i<4; i++) {
            if(arr[i] > threesome) {
                threesome = arr[i];
                indexThreesome = i;
            }
        }

        arr = removeElement(arr, indexThreesome);
        int a = threesome - arr[0];
        System.out.print(a + " ");
        if(a > arr[1])
            System.out.print(a - arr[1] + " ");
        else
            System.out.print(arr[1] - a + " ");

        if(a> arr[2])
            System.out.println(a - arr[2]);
        else
            System.out.println(arr[2] - a);
    }
}
