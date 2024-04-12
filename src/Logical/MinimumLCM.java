package Logical;
//https://codeforces.com/problemset/problem/1765/M
import java.util.Scanner;

public class MinimumLCM {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            long n = s.nextInt();
            long res = 1;
            for (int i = 2; i*i <= n; i++) {
                if (n % i == 0) {
                    res = n/i;
                    break;
                }
            }
            System.out.println(res + " " + (n - res));
        }
    }
}
