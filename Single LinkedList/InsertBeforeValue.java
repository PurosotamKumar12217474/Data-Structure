package Single LinkedList;
class  Node {
    int data;
    Node next;

    //constructor

    Node(int data, Node next){
        this.data=data;
        this.next = next;
    }
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class InsertBeforeValue {
    private static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

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

    private static Node insertBeforeValue(Node head, int el, int val){
        if(head == null){
            return null;
        }
        if(head.data == val){
            return new Node(el ,head);
        }
        Node temp = head;
        bool found = false;
        while(temp.next !=val){
            if(temp.next.data==val){
                Node x = new Node NOde(el, temp.next);
                temp.next=x;
                found =1;
                break;
            }
            temp=temp.next;
        }
        if(found ==false){

        }
        return head;
    }

    public static void main(String arg[]){
        int[] arr = {12,34,45,56,78,56};
        Node head =convertArr2LL(arr);
        head = insertBeforeValue(head, 100 ,7);
        print(head);
    }
    

}


