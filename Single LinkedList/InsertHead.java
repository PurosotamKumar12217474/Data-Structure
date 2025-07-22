package LinkedList;

class Node {
    int data;
    Node next;

    //constructor
    Node(int data, Node next) {
        this.data=data;
        this.next=next;
    }

    Node(int data){
        this.data=data;
        this.next=null;
    }
}


public class InsertHead {
    private static Node convertArr2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next=temp;
            mover =temp;
        }
        return head;
    }

    private static void print(Node head){
        while(head!=null){
            System.out.print(head.data + " " );
            head = head.next;
        }
        System.out.println();
    }

    public static Node insertHead(Node head , int val){
        return new Node(val,head);
    }

    public static void main(String arg[]){
        int[] arr={12,23,45,4,5,6};
        Node head =convertArr2LL(arr);
        head = insertHead(head,100);
        print(head);
    }
}
