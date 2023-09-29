

class MyCircularQuene{
    int f= -1;
    int r= -1 ;
    int size = 0;
    int arr[] = new int[5];



    public int size(){
        if(size==0) {
            System.out.println("Circular quene Empty");
            return -1;
        }
        return size;
    }
    
    public void add(int value) throws Exception {
        if(size==arr.length){
            throw new Exception("Full");
            
        }
        else if(size==0){
            f=r=0;
            arr[0] = value;
        }
        else if(r==arr.length-1)
        {
            r=0;
            arr[r] = value;
        }
        else{
            arr[++r] = value;
           
        }
        size++;


    }

    public int remove() throws Exception  {
        if(size==0){
            throw new Exception("Empty");
        }
        else if(f==arr.length-1)
        {
            int value = arr[f];
            f=0 ;
            size--;
            return value;
        }
        else{
            int value = arr[f];
            f++;
            size--;
            return value;
        }
    }

    public int peek() throws Exception{
            if(size==0){
            throw new Exception("Empty");
        }
        return arr[f];
    }

    public void display(){
            if(size==0){
                System.out.println("Empty");
                return;
            }
            else{
                if(f<=r){
                    for(int i= f;i<=r;i++){
                        System.out.print(arr[i]+"  ");
                    }
                }else{ //r<f

                    for(int i= f;i<arr.length;i++){
                        System.out.print(arr[i]+"  ");
                    }
                    for(int i = 0;i<=r;i++){
                        System.out.print(arr[i]+"  ");

                    }
                }
                System.out.println();
            }
    }

}


public class Circular_Quene_IMPLEMENT {
    
    public static void main(String[] args) throws Exception {
        

        MyCircularQuene q = new MyCircularQuene();
        System.out.println(q.size);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);               //  10 20 30 40 50
        // q.add(60);
        System.out.println(q.size);     // 5
        q.display();
        System.out.println(q.remove());//     20 30 40 50
        q.display();
        q.add(600);              // 600 20 30 40 50
        q.display();
        System.out.println(q.size);
        System.out.println(q.arr[0]);
        System.out.println(q.peek());


    }

}
