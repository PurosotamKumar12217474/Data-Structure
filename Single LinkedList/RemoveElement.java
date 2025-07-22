//package LinkedList;

class Node {
    int data;
    Node next;

    Node (int data, Node next){
        this.data=data;
        this.next=next;

    }

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class RemoveElement {
    private static void print(Node head){
        while(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    private static Node convertArr2LL(int [] arr){
        Node head= new Node(arr[0]);
        Node mover=head;
        for(int i=1; i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next=temp;
            mover = temp;
        }
        return head;
    }
    private static Node removeEl(Node  head ,int el){
        if(head == null) return head; //Handle empty list
        if(head.data==el){
            //Node temp = head;
            return head.next;   //Remove the head node
        }
        
        Node temp = head;
        Node prev = null;

        while(temp!=null){
            if(temp.data==el){
                if(prev !=null && prev.next !=null){    //Ensure 'prev and prev.next'  are not null
                    prev.next=prev.next.next;    //Remove the k-th node
                }
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;    //Return the updated head
    }
    public static void main(String arg[]){
        int[] arr = {12,5,67,8};
        Node head = convertArr2LL(arr);
        head=removeEl(head,5);
        print(head);
    }
}
