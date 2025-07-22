//package LinkedList;


//import LinkedList.Node;

class Node {
    int data;
    Node next;

    Node(int data, Node next){
        this.data=data;
        this.next=next;

    }
    Node (int data){
        this.data=data;
        this.next=null;
    }
}

public class RemoveTail {
    private static Node convertArr2LL(int [] arr){
        Node head =new Node(arr[0]);
        Node mover = head;
        for(int i = 1;i<arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next=temp;
            mover =temp;
        }
        return head;
    }
    private static void print(Node head){
        while(head!= null){
            System.out.print(head.data + " ");
            head =head.next;
        }
        System.out.println();
    }
    private static Node removeTail(Node head ){
        if(head ==null || head.next == null) return null;  //Handle empty or single-node list

        Node temp = head;
        while(temp.next.next != null){ //Traverse to the second-last node
            temp = temp.next;
        }
        temp.next = null;  //Remove the Tail node
        return head; //Return the updated head
    }
    public static void main(String[] args){
        int[] arr={12,5,7,9};
        Node head = convertArr2LL(arr);
        head =removeTail(head);
        print(head);
    }
}
