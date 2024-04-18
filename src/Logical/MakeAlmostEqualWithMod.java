package Logical;
//https://codeforces.com/problemset/problem/1909/B
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MakeAlmostEqualWithMod {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = s.nextLong();
            }
            long res = 2;
            while (true) {
                Set<Long> set = new HashSet<>();
                for (int i = 0; i < n; i++) {
                    long rem = a[i] % res;
                    set.add(rem);
                }
                if (set.size() == 2) {
                    System.out.println(res);
                    break;
                }
                res *= 2;
            }
        }
    }
}
