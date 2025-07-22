//package LinkedList;


//import LinkedList.Node;

class Node{
    int data;
    Node next;

    Node(int data,Node next){
        this.data=data;
        this.next =next;
    }

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class SearchElementLL {
    private static Node convertArr2LL(int[] arr){
        Node head =new Node(arr[0]);
        Node mover = head;
        for(int i=1; i< arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    private static int checkIfPresent(Node head, int val){
        Node temp = head;
        while(temp != null){
            if(temp.data==val) return 1;
            temp=temp.next;
        }
        return 0;
    }    

    public static void main(String arg[]){
        int[] arr = {12,5,6,9};
        Node head = convertArr2LL(arr);
        System.out.print(checkIfPresent(head ,12));
    }
}
