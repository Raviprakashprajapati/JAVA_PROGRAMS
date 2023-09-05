import java.util.Scanner;

public class Array4 {

    static void printArray(int[] array){
        for (int i : array) {
            System.out.print(i+"  ");
        }
        System.out.println();
    }

    static void sort(int[] array){
        int count = 0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==0){
                count++;
            }
        }
        for(int i=0;i<count;i++)
        {
            array[i] = 0;
        }
        for(int i=count;i<array.length;i++)
        {
            array[i] = 1;
        }
    }

    static void reverse(int[] array)
    {
        int left = 0;
        int right = array.length-1;
        while(left < right){
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    static void swap(int[] array,int beg,int end){
        int temp = array[beg];
        array[beg] = array[end];
        array[end] = temp;
    }
    
    static int[] prefixSumArray(int[] arr,int prefixIndex){

        int value= 0;
     
        for(int j=prefixIndex;j>=0;j--)
        {
             value+=arr[j];
        }
        arr[prefixIndex] = value;
        return arr;

        
            
            

    }

    static int sumOfRangeIndex(int[] array,int left,int right){
        int value=0;
        while(left<=right){
            value+=array[left];
            left++;
        }
        return value;

    }

    public static void main(String[] args) {
        
        System.out.println("----------------------------");
        Scanner scan  = new Scanner(System.in);

        // returnprefix sum of an array-------
        // int arr[] = {1,2,3,4,5,6,7};
        // printArray(arr);
        // int prefixIndex = 5;
        // int[] result = prefixSumArray(arr,prefixIndex);
        // printArray(result);


        // sum of index l=1 to r=n where 1 base indexing ---
        // int arr[] = {10,20,30,40,50};
        // int left=0;
        // int right=4;
        // int value = sumOfRangeIndex(arr,left,right);
        // printArray(arr);
        // System.out.println("sum of index "+left+" to " +right+" : " + value);
    

        System.out.println("a"+5);





































































































        System.out.println("----------------------------");
    }


}
