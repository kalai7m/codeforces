package Logical;

import java.util.*;

public class DoremyPaint3 {
    static String doremyPaint(int[] a) {
        int n = a.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i : a) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }
        if(mp.size()==1) return "YES";
        if (mp.size() > 2) return "NO";

        int count[] = new int[2], i = 0;
        for (int e : mp.values()) {
            count[i++] = e;
        }

        //even
        if ((n & 1) == 0) {
            return count[0] == count[1] ? "YES" : "NO";
        }
        //odd
        return (count[0] + 1 == count[1] || count[0] == count[1] + 1 ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            System.out.println(doremyPaint(arr));
        }
    }
}

