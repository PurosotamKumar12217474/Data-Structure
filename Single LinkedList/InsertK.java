//package LinkedList;


class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertK {
    // Print the linked list
    private static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    // Convert an array to a linked list
    private static Node convertArr2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    // Insert a node at the k-th position
    // private static Node insertK(Node head, int k, int value) {
    //     Node newNode = new Node(value);

    //     // Handle inserting at the head (position 1)
    //     if (k == 1) {
    //         newNode.next = head;
    //         return newNode;
    //     }

    //     int cnt = 1;
    //     Node temp = head;

    //     // Traverse the list to find the (k-1)-th node
    //     while (temp != null && cnt < k - 1) {
    //         temp = temp.next;
    //         cnt++;
    //     }

    //     // If k is greater than the length of the list, append at the end
    //     if (temp == null) {
    //         System.out.println("Position exceeds the length of the list. Appending at the end.");
    //         return head;
    //     }

    //     // Insert the new node
    //     newNode.next = temp.next;
    //     temp.next = newNode;

    //     return head;
    // }

    private static Node insertK(Node head , int el ,int k){
        if(head==null){
            if(k==1){
                return new Node(el);
            }
            else {
                return head;
            }
        }
        if(k==1){
            return new Node(el,head);
        }
        int cnt = 0;
        Node temp = head;
        while(temp!=null){
            cnt++;
            if(cnt==(k-1)){
                Node x  = new Node(el, temp.next);
                temp.next = x;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {12, 5, 67, 8};
        Node head = convertArr2LL(arr);

        // Insert a new value (e.g., 99) at the 3rd position
        head = insertK(head, 99, 3);

        // Print the updated linked list
        print(head);
    }
}
