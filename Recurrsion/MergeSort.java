import java.util.*;

public class MergeSort {

    // Merge function
    static void merge(List<Integer> arr, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        // Merge the two sorted halves
        while (left <= mid && right <= high) {
            if (arr.get(left) <= arr.get(right)) {
                temp.add(arr.get(left));
                left++;
            } else {
                temp.add(arr.get(right));
                right++;
            }
        }

        // Copy remaining elements from left half (if any)
        while (left <= mid) {
            temp.add(arr.get(left));
            left++;
        }

        // Copy remaining elements from right half (if any)
        while (right <= high) {
            temp.add(arr.get(right));
            right++;
        }

        // Copy sorted elements back into original list
        for (int i = 0; i < temp.size(); i++) {
            arr.set(low + i, temp.get(i));
        }
    }

    // Recursive merge sort function
    static void mS(List<Integer> arr, int low, int high) {
        if (low >= high) return;

        int mid = (low + high) / 2;
        mS(arr, low, mid);
        mS(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    // Public method to call merge sort
    static void mergeSort(List<Integer> arr) {
        if (arr == null || arr.size() <= 1) return;
        mS(arr, 0, arr.size() - 1);
    }

    // Main method to test
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 6, 3));
        System.out.println("Before sorting: " + arr);
        mergeSort(arr);
        System.out.println("After sorting: " + arr);
    }
}
