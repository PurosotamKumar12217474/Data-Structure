//package LinkedList;


//import LinkedList.Node;

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
public class RemoveK {
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
    private static Node removeK(Node  head ,int k){
        if(head == null) return head; //Handle empty list
        if(k==1){
            //Node temp = head;
            return head.next;   //Remove the head node
        }
        int cnt =0;
        Node temp = head;
        Node prev = null;

        while(temp!=null){
            cnt++;
            if(cnt==k){
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
        head=removeK(head,3);
        print(head);
    }
}





//college wallah

// class Solution{
//     public static void deleteNode(ListNode node){
//         node.val=node.next.val;
//         node.next=node.next.next;
//     }
// }