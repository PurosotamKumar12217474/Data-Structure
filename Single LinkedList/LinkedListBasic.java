//package LinkedList;

class Node{
    int data;
    Node next;

    //constructor
    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }

    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}

class LinkedListBasic{
    public static void main(String[] arg){
        int[] arr ={2,5,6,8,5};
        Node y = new Node(arr[4]);
        System.out.print(y.data);
    }
}