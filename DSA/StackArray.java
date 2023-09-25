
public class StackArray {
     int arr[] = new int[100];
    int index=0;
   
    void push(int value){
        arr[index++] = value;
    }

    int pop(){
        if(index==0){
            System.out.println("empty");
            return -1;

        }
        int value = arr[index-1];
        arr[index-1] = 0;
        index--;
        return value;
        
    }

    int peek(){
        if(index==0){
            System.out.println("empty");
            return -1;
        }
        
        return arr[index-1];
    }

    void display(){
       for(int i = 0;i<index;i++){
        System.out.print(arr[i]+"  ");
       }
       System.out.println();
    }

    int size(){
        return index;
    }
    
    
    
    // main
    public static void main(String[] args) {

        StackArray s = new StackArray();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.pop();
        s.display();
        s.push(40);
        s.display();
        System.out.println(s.peek());


        
    }
}
