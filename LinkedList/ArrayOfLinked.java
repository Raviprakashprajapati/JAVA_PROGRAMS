
import java.util.LinkedList;

class Node<k,v>{
    k key;
    v value;
    Node(k key,v value){
        this.key = key;
        this.value = value;
    }

}


//Java-file
public class ArrayOfLinked {
    //main
    public static void main(String[] args) {

        // LinkedList<Node> ll = new LinkedList<>();
        // Node<Integer,Integer> n = new Node<>(1,100);
        // ll.add(n);
        // System.out.println(ll.get(0).key);
        // System.out.println(ll.get(0).value);
        // System.out.println(n);

        





       //array of linkedlist
        // LinkedList<Integer>[] ll  = new LinkedList[5];
        // // System.out.println(ll);

        // //initialize each linkedlist in array
        // for(int i=0;i<ll.length;i++)
        // {
        //     ll[i] = new LinkedList<>();
        // }

        // //add eleemtn to each linkedlist
        // for(int i=0;i<ll.length;i++)
        // {
        //     for(int j = 0;j<5;j++){
        //         ll[i].add(j+i);
        //     }
        // }

        // //print the elemetn in each lnkedlist
        // for(int i= 0;i<ll.length;i++){
        //     for(int j = 0;j<ll[i].size();j++){
        //         System.out.print(ll[i].get(j)+ "  ");
        //     }
         
        //     System.out.println();
        // }

        // System.out.println(ll[0].getFirst());

        
       


        //array of linkedlist with Node K,V
         Node<Integer,Integer> n = new Node<>(1,100);
        LinkedList<Node> ll[] = new LinkedList[5];
        // System.out.println(ll[0]); //null
        
        //create linleist node in every array index
        for(int i = 0; i < ll.length; i++)
        {
            ll[i] = new LinkedList<>();
        }

        
        //add K,V in evevry array linked upto 5 size
        for(int i = 0;i<ll.length;i++)
        {
            for(int  j = 0 ;j<5;j++){
                
                ll[i].add(n); //add Node n refernce
            }
        }

        // System.out.println(ll[0].get(0).key);
        // System.out.println(ll[0].get(0).value);

        //traverse  array of linkedlist
        // for(int i=0;i<ll.length;i++){
        //     for(int j=0;j<ll[i].size();j++)
        //     {
        //         System.out.printf("[%d]-[%d]  ",ll[i].get(j).key,ll[i].get(j).value);
        //     }
        //     System.out.println();
        // }
      
        for(int i = 0;i<ll.length;i++){
            System.out.println(ll[i].get(i).key);
        }
        

  



       
            

       
       
    }
    
}
