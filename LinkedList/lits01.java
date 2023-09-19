class Node{
    int data; //value
    Node next; //address of next node

    Node(int data){
            this.data = data;
    }
}


public class lits01 {

    static void display(Node temp)
    {
        while(temp!=null)
        {
            System.out.print(temp.data+"  ");
            temp=temp.next;
        }
        System.out.println();
    }

    static void recursiveDisplay(Node temp)
    {
        if(temp==null) return;
        System.out.print(temp.data+"  ");
        recursiveDisplay(temp.next);
        
    }

    static void reverseDisplay(Node temp){
        if(temp==null) return;
        reverseDisplay(temp.next);
    System.out.print(temp.data+"  ");        
    }



    public static void main(String[] args) {
        
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);

        a.next = b;
        b.next=  c;
        // System.out.println(a.next.data); 


        // display meth1---
        // System.out.println(a.data);
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);
        

        // display meth2----
            display(a);
            // recursiveDisplay(a);
            reverseDisplay(a);








    }
}
