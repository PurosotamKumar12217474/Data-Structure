public class QuickSort {

    // Partition method
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            // Move i to the right until an element greater than pivot is found
            while (i <= high && arr[i] <= pivot) {
                i++;
            }
            // Move j to the left until an element less than or equal to pivot is found
            while (j >= low && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, low, j); // Place pivot in correct position
        return j;
    }

    // QuickSort method
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            quickSort(arr, low, pIndex - 1);
            quickSort(arr, pIndex + 1, high);
        }
    }

    // Swap helper
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] arr = { 8, 4, 7, 3, 10, 2, 5 };
        System.out.println("Before Sorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        quickSort(arr, 0, arr.length - 1);

        System.out.println("\nAfter Sorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
