package Logical;
//https://codeforces.com/problemset/problem/1850/D
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BalancedRound {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            long k = s.nextInt();
            Long a[] = new Long[n];
            for (int i = 0; i < n; i++) {
                a[i] = s.nextLong();
            }
            Arrays.sort(a, Collections.reverseOrder());
            int c = 1, max = 0;
            for (int i = 0; i < n - 1; i++) {
//                System.out.print(a[i] + " " + a[i + 1] + " ");
                if (a[i] - a[i + 1] <= k) {
                    c++;
                } else {
                    max = Math.max(c, max);
//                    System.out.print(max + " " + c);
                    c = 1;
                }
                System.out.println();
            }
            max = Math.max(c, max);
            System.out.println(n - max);
        }
    }
}
