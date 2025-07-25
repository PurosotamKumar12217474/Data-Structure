import java.util.*;

public class SubsetSum {

    // Function to print subsets that sum up to 'sum'
    // static void printSubsets(int index, List<Integer> list, int currentSum, int[] arr, int n, int targetSum) {
    //     if (index == n) {
    //         if (currentSum == targetSum) {
    //             for (int num : list) {
    //                 System.out.print(num + " ");
    //             }
    //             System.out.println();
    //         }
    //         return;
    //     }

    //     // Pick the current element
    //     list.add(arr[index]);
    //     printSubsets(index + 1, list, currentSum + arr[index], arr, n, targetSum);

    //     // Backtrack and not pick the element
    //     list.remove(list.size() - 1);
    //     printSubsets(index + 1, list, currentSum, arr, n, targetSum);
    // }


    // Function to find any one subset that sums up to targetSum
    // static boolean printS(int ind, List<Integer> list, int s, int sum, int[] arr, int n) {
    //     if (ind == n) {
    //         if (s == sum) {
    //             for (int num : list) {
    //                 System.out.print(num + " ");
    //             }
    //             System.out.println();
    //             return true;
    //         }
    //         return false;
    //     }

    //     // Pick the current element
    //     list.add(arr[ind]);
    //     s += arr[ind];
    //     if (printS(ind + 1, list, s, sum, arr, n)) {
    //         return true;
    //     }

    //     // Backtrack and not pick the current element
    //     s -= arr[ind];
    //     list.remove(list.size() - 1);

    //     if (printS(ind + 1, list, s, sum, arr, n)) {
    //         return true;
    //     }

    //     return false;
    // }


    

    // Function to count subsets that sum up to a given target
    static int printS(int ind, int s, int sum, int[] arr, int n) {
        if (ind == n) {
            // If condition is satisfied, count this subset
            return s == sum ? 1 : 0;
        }

        // Pick the current element
        s += arr[ind];
        int l = printS(ind + 1, s, sum, arr, n);

        // Backtrack
        s -= arr[ind];

        // Don't pick the current element
        int r = printS(ind + 1, s, sum, arr, n);

        return l + r;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1}; // Example array
        int n = arr.length;
        int targetSum = 2;

        int count = printS(0, 0, targetSum, arr, n);
        System.out.println("Number of subsets with sum " + targetSum + " = " + count);
    }
}
