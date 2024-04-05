package Logical;

import java.util.Scanner;

public class JaggedSwaps {
//    static String jaggedSwap(int a[]) {
//        return a[0] == 1 ? "YES" : "NO";
//    }

    static String jaggedSwap(int a[]) {
        int n = a.length;
        for (int i = 1; i < n - 1; i++) {
            if (a[i - 1] < a[i] && a[i] > a[i + 1]) {
                if(a[i-1] > a[i+1]) return "NO";
                int t = a[i];
                a[i] = a[i + 1];
                a[i + 1] = t;
            }
            else {
                return "NO";
            }
        }
        for(int i=0;i<n;i++) {
            if(a[i] != i+1) return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(jaggedSwap(arr));
        }
    }
}