package Recurrsion;

import java.util.*;

public class Subsequence {

    static void printF(int index, List<Integer> ds, int[] arr, int n) {
        if (index == n) {
            for (int num : ds) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        // Pick the current element
        ds.add(arr[index]);
        printF(index + 1, ds, arr, n);

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
