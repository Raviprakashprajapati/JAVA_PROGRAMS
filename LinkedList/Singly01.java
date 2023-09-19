//node is like user defined data type
class Node {
    int data;
    Node next;
    

    Node(int data) {
        this.data = data;
    }
}

//linkedlist is lie data structre
class LinkedList {
    Node head = null;
    Node tail = null;

    void display() {
        System.out.println("-----------------------------------------");
        Node temp = head;
        int i = 0;
        while (temp != null) {
            // System.out.print(+temp.data + "  ");
            System.out.printf("[%d]%d " , i++, temp.data);
            temp = temp.next;
        }
        System.out.println("\n-----------------------------------------");
      
    }

    int size(){
        Node temp = head;
        int count=0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    void insertAtEnd(int value) {
        Node temp = new Node(value);
        if (head == null) {
            head = temp;
        } 
        else {
            tail.next = temp;
        }
        tail = temp;

    }

    void insertAtBegin(int value){
        Node temp = new Node(value);
        if(head==null)
        {
            head=temp;
            tail = temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
    }

    void insertAtIndex(int value,int index)
    {
        if(index>=size())
        {
            insertAtEnd(value);
        }
        else if(index==0)
        {
            insertAtBegin(value);
        }
        else{
            Node temp = new Node(value);
            Node ptr = head;
        for(int i=0;i<index-1;i++)
        {
            ptr=ptr.next;
        }
        temp.next = ptr.next;
        ptr.next = temp;
        }

    }

    
}

public class Singly01 {
    public static void main(String[] args) {

        LinkedList x = new LinkedList();
        x.insertAtEnd(10);
        x.insertAtEnd(20);
        x.display();
        x.insertAtBegin(8);
        x.insertAtBegin(6);
        x.insertAtEnd(40);
        x.display();
        x.insertAtIndex(9,2);
        x.display();
        x.insertAtIndex(100, 570);
        x.display();
        x.insertAtIndex(5, 0);
        x.display();

    }

}
