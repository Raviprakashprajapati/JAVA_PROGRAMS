class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

class StackLinkedList{
    Node head=null;
    int index = 0;

    int size(){
        return index;
    }

    void display(){
        if(head==null){
            System.out.println("Empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"  ");
            temp = temp.next;
        }
        System.out.println();
    }

    void push(int value){
        Node newNode = new Node(value);
        if(head==null){
            head = newNode;
            newNode.next = null;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        index++;
        
    }

    int pop(){
        if(head==null){
            System.out.println("empty");
            return -1;
        }
        int value = head.data;
        head = head.next;
        index--;
        return value;

    }

    int peek(){
        if(head==null){
            System.out.println("empty");
            return -1;
        }
        return head.data;
    }


}


public class StackLinked {
    public static void main(String[] args) {
        

        StackLinkedList s = new StackLinkedList();
        s.push(100);
        s.push(200);
        s.push(300);
        s.display();
        System.out.println(s.peek());
        System.out.println(s.pop());
        s.display();
        System.out.println(s.peek());
        s.push(300);
        s.display();
        System.out.println(s.size());
    }

    
}
