import java.util.Scanner;

public class Array3 {

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

    static void sortWithReverse(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while (left<right) {
            if (arr[left]==1 && arr[right]==0) {
                swap(arr, left, right);
                left++;
                right--;
            }

            if(arr[left]==0) left++;
            if(arr[right]==1) right--;
            
        }
    }

    static int[] sortEvenOdd(int[] arr)
    {
        int temp[] = new int[arr.length];
        int oddIndex = arr.length - 1;
        int evenIndex = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i]%2==0){
                temp[evenIndex++] = arr[i];
            }
            else
            {
                temp[oddIndex--] = arr[i];
            }
            
        }
        return temp;
    }

    static void sortEvenOddWithReverse(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left < right)
        {
            if(arr[left]%2!=0 && arr[right]%2==0)
            {
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left]%2==0) left++;
            if(arr[right]%2!=0) right--;
        }
    }

    static int[] squareArray(int[] arr)
    {
        int temp[] = new int[arr.length];
        int left = 0;
        int right = arr.length - 1;
        int index = 0;
        while (left <=right){
            if(Math.abs(arr[left])>Math.abs(arr[right]))
            {
                temp[index++] = arr[left]*arr[left];
                left++;
            }
            else{
                temp[index++] = arr[right]*arr[right];
                right--;
            }
        }
       

        return temp;

        
    }


    public static void main(String[] args) {
        System.out.println("--------------------------------");
        Scanner scan = new Scanner(System.in);
        
        
        // sort ans array of only 0 and 1 elements--
        // int arr[] = {1,0,0,1,0,1,1,0,0};
        // printArray(arr);
        // sort(arr);
        // printArray(arr);

        // sort with reverse method----
        // int arr[] = {0,0,0,1,1,0,1,0,1,1};
        // sortWithReverse(arr);
        // printArray(arr);


        // sort an array where all even number place beg and all odd after beg----
        // int arr[] = {1,2,3,4};
        // int result[]=sortEvenOdd(arr);
        // printArray(result);

        // sort with reverse---
        // int arr[] = {1,2,3,4,5};
        //  sortEvenOddWithReverse(arr);
        // printArray(arr);


        // return array with their square and final array should be non devereasing----
        // int arr[] = {-10,2,4,6,7};
        // printArray(arr);
        // int result[] = squareArray(arr);
        // reverse(result);
        // printArray(result);
   






























        

        
        System.out.println("--------------------------------");
    }
    
}
