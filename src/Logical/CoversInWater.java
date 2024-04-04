package Logical;
//https://codeforces.com/problemset/problem/1900/A
import java.util.Scanner;

public class CoversInWater {
    static int coverInWater(String s) {
        int k=0,c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='.'){
                c++;k++;
                if(c==3) return 2;
            }else{
                c=0;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            System.out.println(coverInWater(s));
        }
    }

}