// Node class
class Node {
    int data;      // Data of the node
    Node next;     // Reference to the next node

    // Constructor to initialize the node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Linked List class
class LinkedList {
    private Node head;  // Head of the linked list

    // Constructor to initialize the linked list
    public LinkedList() {
        this.head = null;
    }

    // Method to append a value to the linked list
    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode; // If the list is empty, set head to the new node
        } else {
            Node current = head;
            while (current.next != null) { // Traverse to the end of the list
                current = current.next;
            }
            current.next = newNode; // Add the new node at the end
        }
    }

    // Method to convert the linked list to a string representation
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = head;
        while (current != null) {
            result.append(current.data).append(" -> ");
            current = current.next;
        }
        // Remove the trailing " -> " if the list is not empty
        return result.length() > 0 ? result.substring(0, result.length() - 4) : "Empty List";
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        for (int i = 1; i <= 5; i++) {
            ll.append(i);
        }
        System.out.println(ll); // Print the linked list
    }
}
