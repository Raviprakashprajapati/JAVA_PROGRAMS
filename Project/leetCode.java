import java.math.BigInteger;

import practiveCollection02.Node;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class leetCode {

    static void display(Node temp) {
        while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
    }

    static Node doubleValue(Node temp) {
        Node current = temp;
        int carry = 0;
        // 9 9 9
        while (current != null) {
            int newValue = current.data * 2 + carry; // 18
            current.data = newValue % 10;// 8
            carry = newValue / 10;// 1

            if (current.next == null && carry > 0) {
                current.next = new Node(carry);
                break;
            }

            current = current.next;
        }

        return temp;
    }

    static Node Divisor(Node head) {

        Node temp = head;
        int num = 0;
        while (temp != null && temp.next != null) {

            int x = temp.data;
            int y = temp.next.data;
            for (int i = 1; i < (x + y); i++) {
                if ((x % i) == 0 && (y % i) == 0) {
                    num = i;
                }
            }

            Node ptr = new Node(num);
            ptr.next = temp.next;
            temp.next = ptr;
            temp = temp.next.next;

        }

        return head;

    }

    


    static Node reverseIndex(Node head,int left,int right){
        Node temp = head;
        int i=0;
        while(i<=left-1)
        {
            temp = temp.next;
            i++;
        }

        while(left<=right)
        {
            
        }


        return head;

        
    }
    public static void main(String[] args) {

        Node a = new Node(9);
        Node b = new Node(12);
        Node c = new Node(20);
        Node d = new Node(30);
        Node e = new Node(40);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        Node head = a;
        display(head);
        System.out.println();

        // head = Divisor(head);
        // display(head);
        // head = reverse(head,)

        head = reverseIndex(head, 1, 3);
        display(head);

    }
}
