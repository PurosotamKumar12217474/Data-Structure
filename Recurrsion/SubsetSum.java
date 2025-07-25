import java.util.*;

public class SubsetSum {

    // Function to print subsets that sum up to 'sum'
    static void printSubsets(int index, List<Integer> list, int currentSum, int[] arr, int n, int targetSum) {
        if (index == n) {
            if (currentSum == targetSum) {
                for (int num : list) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            return;
        }

        // Pick the current element
        list.add(arr[index]);
        printSubsets(index + 1, list, currentSum + arr[index], arr, n, targetSum);

        // Backtrack and not pick the element
        list.remove(list.size() - 1);
        printSubsets(index + 1, list, currentSum, arr, n, targetSum);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1}; // Example array
        int n = arr.length;
        int targetSum = 2;

        List<Integer> currentSubset = new ArrayList<>();
        printSubsets(0, currentSubset, 0, arr, n, targetSum);
    }
}
