
class MyQuene{
    int f = -1;
    int r  = -1;
    int size = 0;
    int arr[] = new int[10];

    public void add(int value){
        if(f==-1 && r==-1)
        {
            f++;
            r++;
            arr[r] = value;
            size++;
        }
        else if(r==size){
            System.out.println("Quene full");
        }
        else{
            arr[++r] = value;
            size++;
        }

    }

    public void display(){
        if(size==0) {
            System.out.println("Quene empty");
            return;
        }
        for (int i : arr) {
            if(i!=0){
                System.out.print(i+"  ");
            }
        }
        System.out.println();
    }

    public int remove(){
       
        if(size==0){
            System.out.println("Quene empty");
            return -1;
        }
        else{
            size--;
            int value = arr[f];
            arr[f] = 0;
            f++;
            return value;
            
        }
        
    }

    public int peek(){
        return arr[f];
    }



}


public class Quene_Array_IMPLEMENT {

    public static void main(String[] args) {

        MyQuene q = new MyQuene();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(   q.remove());
        System.out.println(   q.remove());
        System.out.println(   q.remove());
        q.display();
        q.add(40);
        q.add(50);
        q.display();
        System.out.println(q.peek());

    
        
        
        

    }
    
}
