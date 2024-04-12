package Logical;

import java.util.Scanner;

//https://codeforces.com/problemset/problem/1899/C
public class YarikandArray {
    static int maxSum(int a[], int n) {
        int cursum = a[0], maxsum = a[0];
        for (int i = 1; i < n; i++) {
            if ((a[i] & 1) != (a[i - 1] & 1)) {
                cursum = Math.max(a[i], cursum + a[i]);
            } else {
                cursum = a[i];
            }
            maxsum = Math.max(cursum, maxsum);
        }
        return maxsum;
    }
//    static int maxSum(int a[], int n) {
//        int sum = 0, maxsum = 0;
//        for (int i = 0; i < n - 1; i++) {
//            if ((a[i] & 1) != (a[i + 1] & 1)) {
//                sum += a[i]; // 1 2 3 3
//                maxsum = Math.max(sum, maxsum);
//            } else {
//                if (i!=0 && ((a[i] & 1) != (a[i - 1] & 1))) {
//                    sum += a[i];
//                    maxsum = Math.max(sum, maxsum);
//                }
//                sum = 0;
//            }
//        }
//        if ((a[n - 1] & 1)!= (a[n - 2] & 1)) {
//            sum += a[n - 1];
//            maxsum = Math.max(sum, maxsum);
//        }
//        return maxsum;
//    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
            }
            System.out.println(maxSum(a, n));
        }
    }
}
