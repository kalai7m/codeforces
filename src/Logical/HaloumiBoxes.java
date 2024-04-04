package Logical;

import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/1903/A
 * Halloumi Boxes
 *
 * **/
public class HaloumiBoxes {
    static String hallumiBox(int a[], int n, int k){
        if(k>1) return "YES";
        for(int i=0;i<n;i++){
            if(a[i]>a[i+1]) return "NO";
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int k = s.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++) {
                a[i] = s.nextInt();
            }
            System.out.println(hallumiBox(a,n,k));
        }
    }

}

//INPUT
//        5
//        3 2
//        1 2 3
//        3 1
//        9 9 9
//        4 4
//        6 4 2 1
//        4 3
//        10 3 830 14
//        2 1
//        3 1

//OUTPUT
//    YES
//    YES
//    YES
//    YES
//    NO