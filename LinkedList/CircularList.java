class Node{
    int data;
    Node next;
    Node(int value){
        this.data = value;
    }
}


public class CircularList {

    static void display(Node head){
        Node temp = head.next;
        System.out.print(head.data+"  ");
        while(temp!=head)
        {
            System.out.print(temp.data+"  ");
            temp = temp.next;
        }
        System.out.println();

    }
    public static void main(String[] args) {
        

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = a;
        Node Head = a;
        display(Head);

    }
    
}
