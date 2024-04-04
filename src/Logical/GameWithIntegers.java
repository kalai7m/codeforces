package Logical;
//https://codeforces.com/problemset/problem/1899/A
import java.util.Scanner;

public class GameWithIntegers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            String winner = ((n+1)%3 == 0 || (n-1)%3==0) ? "First" : "Second";
            System.out.println(winner);
        }
    }
}
