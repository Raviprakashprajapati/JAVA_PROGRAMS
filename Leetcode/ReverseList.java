import java.util.ArrayList;
import java.util.Collection;

class Node{
    int data; //value
    Node next; //address of next node

    Node(int data){
            this.data = data;
    }
}


public class ReverseList {

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


    static Node reverseDisplay(Node head,int l,int r)
    {
        if(head==null || l==r)return head;
        int left = l;
        int right = r;
        Node temp = head;
        Node temp2 = temp;
     
        for(int i=0;i<left;i++)
        {
            temp = temp.next;
        }
        temp2 = temp;


        ArrayList<Integer> arr = new ArrayList<>();
        // move to left to right node and store values----
        while (left<=right) {
            arr.add(temp.data);
            temp=temp.next;
            left++;
        }

        temp = temp2;
     

        int j = arr.size()-1; 
        while (l<=right) {
            temp.data = arr.get(j--);
            temp = temp.next;
            l++;
        }
     
        return head;


    }

    static void centerNode(Node head){

        Node temp = head;
        int i = 0;
        while(temp!=null){
            temp = temp.next;
            i++;
        }
        if(i%2==0)
        {
            i = i/2;
            i++;
            int j=1;
            while(j<i){
                head = head.next;
                j++;
            }
            display(head);
        }
        else{
            int j = 1;
            i = i/2;
            i++;
            while(j<i){
                head = head.next;
                j++;
            }
            display(head);
        }
    }

    static void removeSame(Node head,int data){
        Node left  = head;
        Node right = head.next;

        if (left.data == data) {
            head = right;
            left.next = null;
            display(head);
            return;
        }

        while(right!=null)
        {
            if(right.data==data){
                left.next = right.next;
                right.next = null;

            }
            left = left.next;
            right = left.next;
        }
       
        display(head);
        
    }

    static void Intersect(Node A,Node B){
        Node a = A;
    }

    static int size(Node head){
        Node temp = head;
        int count = 0;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }

    static void IntersectNode(Node head1,Node head2){

        Node temp1 = head1;
        Node temp2 = head2;
        int size1 = size(temp1);
        int size2 = size(temp2);
        
        while(temp1!=null){

            while(temp2!=null){
                
            if(temp1.next == temp2.next) {
                display(temp2.next);
                return;
            }
            temp2 = temp2.next;
            
            }

            temp1 = temp1.next;
            head2 = head2.next;
            temp2 = head2;
            
        }

     
    }




    public static void main(String[] args) {


       
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        Node head = a;
        a.next = b;
        b.next=  c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next=null;
     
        

        // display meth2----
            display(a);
            // head = reverseDisplay(head,1,5);
            // display(a);

        // center head;
        // centerNode(head);
        // removeSame(head, 30);

         Node aa  = new Node(1);
        Node bb  = new Node(2);
        Node cc  = new Node(3);
        aa.next = bb;
        bb.next = cc;
        cc.next = d;
        Node head2 = aa;
        display(head2);

        IntersectNode(head,head2);
        
       









    }
}
