
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

class MyQueneLinkedList{
    Node head=null;
    Node tail=null;
    int size=0;

    public void add(int value){
        Node ptr = new Node(value);
        if(size==0){
            head = ptr;
           tail = ptr;
        }
        else{
            tail.next = ptr;
            tail = ptr;
            
        }
        size++;
       
           
        
    }

    public int remove(){
        if(size==0){
            System.out.println("Quene empty");
            return -1;
        }
        else{
            int value = head.data;
            head = head.next;
            size--;
            return value;

        }
    }

    public int peek(){
        if(size == 0){
            System.out.println("Quene empty");
            return -1;
        }
        return head.data;
    }

    public void display(){
        if(size == 0){
            System.out.println("Quene empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"  ");
            temp =temp.next;
        }
        System.out.println();
    }

}


public class Quene_Linklist_IMPLEMENTE {
    public static void main(String[] args) {

        MyQueneLinkedList q = new MyQueneLinkedList();
        q.add(10);
        q.add(20);
        q.add(30);
        q.display();
        System.out.println(q.remove());
        q.display();
        System.out.println(q.peek());
        System.out.println(q.size);
        
    }
    
}
