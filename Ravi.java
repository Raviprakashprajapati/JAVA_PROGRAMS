

public class Ravi {

    static void insert(int []arr,int index,int value)
    {
        
        System.out.println();
        for(int i=arr.length;i>index;i--)
        {
            arr[i+1] = arr[i];
        }
        arr[index] = value;
        for (int i : arr) {
            System.out.print(i+ "   ");
        }

    }
    public static void main(String[] args) {

        

      
            

       
       
    }
    
}
