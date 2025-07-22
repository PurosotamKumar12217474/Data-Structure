//package LinkedList;

class Node {
    int data;
    Node next;

    //Constructor
    Node(int data, Node next){
        this.data=data;
        this.next=next;
    }

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class InsertionTail {
    private static void print(Node head){
        while(head!=null){
            System.out.print(head.data + " " );
            head = head.next;
        }
        System.out.println();
    }

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
    private static Node insertTail(Node head,int val){
        if(head == null){
            return new Node(val);
        }
        Node temp = head;
        while(temp.next !=null){
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        return head;
    }
    public static void main(String arg[]){
        int[] arr={22,45,56,67,87};
        Node head = convertArr2LL(arr);
        head = insertTail(head , 100);
        print(head);
    }
}
