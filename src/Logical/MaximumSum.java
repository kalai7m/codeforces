package Logical;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSum {
    //    n=6 k=2
//    15 22 12 10 13 11
//    10 11 12 13 15 22
//    0  10 21 33 46 61 83
//    0  1  2  3  4  5  6
    static long maxSum(long a[], int k) {
        Arrays.sort(a);
        int n = a.length;
        long max = 0;
        long prefix[] = new long[n + 1];
        prefix[0] = 0;
        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + a[i - 1];
//          0 10 21 33 46 61 83
        }
//        System.out.println("Prefix: " + Arrays.toString(prefix));
        for (int i = 0; i <= k; i++) {
//          max
            int x = n - k+i;
//          min
            int y = 2 * i;
            max = Math.max(max, prefix[x] - prefix[y]);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int k = s.nextInt();
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = s.nextLong();
            }
            System.out.println(maxSum(a, k));
        }
    }
}
