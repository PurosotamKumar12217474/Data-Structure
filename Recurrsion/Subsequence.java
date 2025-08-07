package Recurrsion;

import java.util.*;

public class Subsequence {

    //overall Time Complexity is 2^n * n = 2^n
    static void printF(int index, List<Integer> ds, int[] arr, int n) {
        if (index == n) {
            for (int num : ds) {
                System.out.print(num + " ");    //time complexity -- n
            }
            System.out.println();
            return;
        }

        // Pick the current element
        ds.add(arr[index]);
        printF(index + 1, ds, arr, n);     // t.c -- 2^n

        // Backtrack and remove the element
        ds.remove(ds.size() - 1);

        // Do not pick the element
        printF(index + 1, ds, arr, n);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int n = arr.length;
        List<Integer> ds = new ArrayList<>();
        printF(0, ds, arr, n);
    }
}
