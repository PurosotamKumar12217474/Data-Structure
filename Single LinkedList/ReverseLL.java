class Node {
    int data;
    Node next;

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLL {
    // Display method to print the linked list in reverse order
    public static void display(Node head) {
        if (head == null) {
            return; // Base case: if the list is empty, do nothing
        }
        display(head.next); // Recursive call
        System.out.print(head.data + " "); // Print data after recursive call
    }

    public static void main(String[] args) {
        // Creating nodes
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(12);
        Node d = new Node(8);
        Node e = new Node(4);
        Node f = new Node(23);

        // Linking nodes
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        // Display the linked list in reverse order
        display(a);
    }
}
