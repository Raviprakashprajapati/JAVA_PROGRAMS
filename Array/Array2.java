import java.util.Scanner;

public class Array2 {
    
    static void printArray(int[] array){
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    static void swap(int x,int y){
        int temp = x;
        x=y;
        y=temp;
        System.out.println("After swap: " + x + " " +y);

    }

    static void reverse(int arr[]){
        int temp[] = new int[arr.length];
        int index = arr.length-1;
        for(int i=0; i<arr.length; i++)
        {
            temp[i] = arr[index--];
        }
        printArray(temp);
    }

    static void reverseInplace(int[] arr)
    {
        int beg = 0;
        int end = arr.length-1;
        while(beg < end) 
        {
            int temp = arr[beg];
            arr[beg] = arr[end];
            arr[end] = temp;
            beg++;
            end--;
        }
   
       
    }

    static void rotate(int[] arr, int k)
    {
        int n = arr.length;
        k=k%n;
        int temp[] = new int[n];
        int index = 0;

        for(int i=n-k;i<n;i++)
        {
            temp[index++] = arr[i];
          
        }
        
        for(int i=0;i<n-k;i++){
            temp[index++] = arr[i];
    
        }

        printArray(temp);
        

    }

    static void reversewithindex(int[] arr,int beg,int end){
        while(beg<end){
            int temp = arr[beg];
            arr[beg] = arr[end];
            arr[end] = temp;
            beg++;
            end--;
        }
    }

    static void rotateInplace(int[] arr, int k){
        int n = arr.length;
        reversewithindex(arr,0,n-k-1);
        reversewithindex(arr, n-k, n-1);
        reversewithindex(arr, 0, n-1);
        for(int i=0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    static int[] frequencyArray(int[] arr)
    {
        int fre[] = new int[100005];
        for(int i=0; i < arr.length; i++)
        {
            fre[arr[i]]++;

        }
        return fre;
    }
   
   
    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);
    
        // swap number--
        // int a = 9,b=10;
        // System.out.println("Before swap: " + a + " " + b);
        // swap(a,b);

        // reverse array
        // int arr[] = {10,20,30,40,50};
        // printArray(arr);
        // reverse(arr);


        // reverse without new array
        // int arr[] = {10,20,30,40};
        // reverseInplace(arr);
        // for(int i = 0; i < arr.length; i++)
        // {
        //     System.out.print(arr[i]+" ");
        // }




        // rotate array k steps wheren k can be greater than lengthof array----
        // k=0  = 1 2 3 4 5
        // k=1  = 5 1 2 3 4
        // k=2  = 4 5 1 2 3

        // int arr[] = {1,2,3,4,5};
        // int k=1;
        // printArray(arr);
        // rotate(arr, k);
        // rotate(arr, 2);
        // rotate(arr, 3);
        // rotate(arr, 4);
        // rotate(arr, 5);
        // rotate(arr, 6);


        // rotate in place
        // int arr[] = {10,20,30,40,50};
        // int k= 1;
        // rotateInplace(arr, k);
        // System.out.println("roated array is ");
        // printArray(arr);



        // frequency array question--
        // int arr[] = {1,2,32,4,235,34,6,45,657,56,7,568,5,6,45,63,45};
        // int q = 5;
        // int fre[] = frequencyArray(arr);
        // while (q>0) {
        //     System.out.println("Search number : ");
        //     int target = scan.nextInt();
        //     if(fre[target]>0){
        //         System.out.println("Yes");
        //     }
        //     else{
        //         System.out.println("no");
        //     }
        //     q--;   
        // }
        

  







    

        
    }
}
