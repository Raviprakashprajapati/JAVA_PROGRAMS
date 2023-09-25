class Node{
    int data;
    Node next;
    Node prev;
    Node(int value){
        this.data = value;
    }
}

class LinkedList{
    Node heap=null;
    Node tail=null;

    

    
}


public class DoublyLinkedList {

   static void display(Node temp){
        while (temp!=null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
        System.out.println();
    }

    static void reverse(Node temp){
        while (temp!=null) {
            System.out.print(temp.data + "  ");
            temp = temp.prev;   
        }
        System.out.println();
    }

    static void random(Node temp){
        while (temp.prev!=null) {
            temp = temp.prev;   
        }
        while (temp!=null) {
            System.out.print(temp.data+"  ");
            temp = temp.next;
        }
      System.out.println();
    }

    static Node insertAtBegin(Node temp,int value){

        Node ptr =  new Node(value);
        ptr.prev = null;
        ptr.next = temp;
        temp.prev = ptr;
        temp = ptr;
        return temp;
        
    }

    static void insertAtEnd(Node temp,int value){
        Node newNode = new Node(value);
        while (temp.next != null) {
            temp = temp.next;
        }
        newNode.prev = temp;
        temp.next = newNode;
        

        
    }

    static void insertAtIndex(Node temp,int index,int value)
    {
        Node newNode = new Node(value);
        int i=0;
        while(i<index-1)
        {
            temp = temp.next;
            i++;
        }
        newNode.prev = temp;
        newNode.next = temp.next;
        temp.next.prev = newNode;
        temp.next = newNode;


    }

    static Node deleteAtBegin(Node temp){

        temp = temp.next;
        temp.prev = null;
        return temp;
    }

    static void deleteAtEnd(Node temp){
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
    
    }

    static void deleteAtIndex(Node temp,int index){
        int i=0;
        while (i<index-1) {
            temp= temp.next;
            i++;
        }
        temp.next.next.prev = temp;
        temp.next = temp.next.next;

    }

    public static void main(String[] args) {
        
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = null;
        display(a);
        // reverse(d);
        // random(c);
       Node newHead =  insertAtBegin(a,8);
       display(newHead);
       insertAtEnd(newHead, 55);
       display(newHead);
       insertAtIndex(newHead,2,15);
       display(newHead);
       insertAtEnd(newHead, 60);
       display(newHead);
       newHead = deleteAtBegin(newHead);
       display(newHead);
      deleteAtEnd(newHead);
       display(newHead);
       deleteAtIndex(newHead,3);
       deleteAtIndex(newHead,3);
       display(newHead);





        

    }
    
}
