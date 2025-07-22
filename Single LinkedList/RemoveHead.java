//package LinkedList;


class Node {
    int data;
    Node next;

    //constructor
    Node (int data1, Node next1){
        this.data=data1;
        this.next=next1;
    }

    Node (int data1){
        this.data=data1;
        this.next=null;
    }
}
public class RemoveHead {
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
    private static Node removeHead(Node head){
        if(head==null) return head;
        head=head.next;
        return head;
    }

    public static void main(String arg[]){
        int[] arr = {12,6,7,9,4};
        Node head = convertArr2LL(arr); 
        head = removeHead(head);
        print(head);
    }
}
