package Heap;

public class BinaryHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public BinaryHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    private int parent(int i) {
        return (i - 1) / 2;
    }

    private int leftChild(int i) {
        return 2 * i + 1;
    }

    private int rightChild(int i) {
        return 2 * i + 2;
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    private void heapifyUp(int i) {
        while (i > 0 && heap[parent(i)] < heap[i]) {
            swap(i, parent(i));
            i = parent(i);
        }
    }

    public void insert(int key) {
        if (size == capacity) {
            throw new IllegalStateException("Heap is full");
        }
        heap[size] = key;
        size++;
        heapifyUp(size - 1);
    }

    private void heapifyDown(int i) {
        int max = i;
        int left = leftChild(i);
        int right = rightChild(i);

        if (left < size && heap[left] > heap[max]) {
            max = left;
        }

        if (right < size && heap[right] > heap[max]) {
            max = right;
        }

        if (max != i) {
            swap(i, max);
            heapifyDown(max);
        }
    }

    public int extractMax() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        int max = heap[0]; // Fixed the bug here
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return max;
    }

    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    // MAIN METHOD to test the BinaryHeap
    public static void main(String[] args) {
        BinaryHeap maxHeap = new BinaryHeap(10);

        // Inserting elements
        maxHeap.insert(20);
        maxHeap.insert(15);
        maxHeap.insert(30);
        maxHeap.insert(5);
        maxHeap.insert(10);

        System.out.print("Heap array: ");
        maxHeap.printHeap(); // Should show the max heap order

        // Extract max
        System.out.println("Extracted Max: " + maxHeap.extractMax());

        System.out.print("Heap after extraction: ");
        maxHeap.printHeap();
    }
}
