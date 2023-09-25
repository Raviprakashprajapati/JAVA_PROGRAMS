

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}


class LinkedList {
    Node head = null;
    Node tail = null;

    void display() {
        System.out.println("-----------------------------------------");
        Node temp = head;
        int i = 0;
        while (temp != null) {
            // System.out.print(+temp.data + " ");
            System.out.printf("[%d]%d ", i++, temp.data);
            temp = temp.next;
        }
        System.out.println("\n-----------------------------------------");

    }

    int size() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    void insertAtEnd(int value) {
        Node temp = new Node(value);
        if (head == null) {
            head = temp;
        } else {
            tail.next = temp;
        }
        tail = temp;

    }

    void insertAtBegin(int value) {
        Node temp = new Node(value);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }

    void insertAtIndex(int value, int index) {
        if (index >= size()) {
            insertAtEnd(value);
        } else if (index == 0) {
            insertAtBegin(value);
        } else if (index < 0) {
            System.out.println("Index cannot be negative");
        } else {
            Node temp = new Node(value);
            Node ptr = head;
            for (int i = 0; i < index - 1; i++) {
                ptr = ptr.next;
            }
            temp.next = ptr.next;
            ptr.next = temp;
        }

    }

    int getElement(int index) {

        if (index < 0) {
            System.out.println("Index cannot be negative");
        } else if (index > size()) {
            System.out.println("Index out of bounds");
        } else {
            Node temp = head;
            for (int i = 0; i <index; i++) {
                    temp = temp.next;
            }
            return temp.data;
        }
        return -1;
        
    }

    void deleteAtFirst(){
        if(head==null){
            System.out.println("LinkedList empty");
        }
        else if(head.next==null)
        {
            head = null;
            tail= null;
        }
        else{
            head = head.next;
        }

    }

    void deleteAtEnd(){
        if(head==null)
        {
            System.out.println("LinkedList empty");
        }else if(head.next==null)
        {
            head=null;
            tail=null;
        }else{
            Node temp = head;
            Node nextTemp= head.next;
            while(nextTemp.next!=null)
            {
                temp=temp.next;
                nextTemp = nextTemp.next;
            }
            temp.next = null;
            tail=temp;
            

        }

    }

    void deleteAtIndex(int index){
        if(index<0)
        {System.out.println("Index cannot be negative");
        }
        else if(index==0){
            deleteAtFirst();
        }else if(index>size()){
            deleteAtEnd();
        }
        else{

            Node temp = head;
            for(int i=0;i<index-1;i++)
            {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }


}


// main class
public class Singly01 {
    public static void main(String[] args) {

        LinkedList x = new LinkedList();
        x.insertAtBegin(6);
        x.insertAtBegin(8);
        x.insertAtEnd(10);
        x.insertAtEnd(20);
        x.display();
        x.deleteAtEnd();
        x.display();
     

    }

}
