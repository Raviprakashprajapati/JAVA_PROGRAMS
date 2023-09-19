

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

        int arr[] = new int[6];
        arr[0] = 10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        for (int i : arr) {
            System.out.print(i+"   ");
        }

        insert(arr, 2, 444);
        



      
        

  



       
            

       
       
    }
    
}
