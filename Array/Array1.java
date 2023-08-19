import java.util.Scanner;
import java.util.Arrays;
public class Array1 {

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // System.out.println("Enter size of array: ");
        // int size = scan.nextInt();
        // int arr[] = new int[size];
        // for (int i = 0; i<size; i++)
        // {
        // arr[i] = scan.nextInt();
        // }
        // System.out.println("Array is: ");
        // printArray(arr);
        // System.out.println(arr);

        // count the occurence----
        // int arr[] = {1,2,3,4,5,3,2,1,1};
        // int target = 1;
        // int count=0;
        // for (int i = 0;i <arr.length;i++)
        // {
        // if(arr[i]==target) count++;
        // }
        // System.out.println("count: " + count);

        // last occurence----
        // int arr[] = {1,2,3,1};
        // int target = 1;
        // int index=0;
        // for(int i = 0; i < arr.length;i++)
        // {
        // if(arr[i]==target){
        // index = i;
        // }
        // }
        // System.out.println("Last occurence of " + target + " is at index " + index);

        // no of elemtn strintly greateethan
        // int arr[] = {2,4,4,5,3};
        // int target = 3;
        // int countGreater = 0;
        // for (int i = 0; i < arr.length; i++)
        // {
        // if(arr[i]>target)
        // {
        // countGreater++;
        // }
        // }
        // System.out.println("Total greater number of elements " + countGreater);

        // array is sorted or--------------------
        // int arr[] = { 1, 2, 3 };
        // int target = 0;
        // for (int i = 0; i < arr.length - 1; i++) { 
            
        //     if (arr[i + 1] < arr[i]) {
        //         System.out.println("Array is not ascending ");
        //         target = 1;
        //         break;
        //     }
        // }

        // if (target != 1) {
        //     System.out.println("Array is ascending ");
        // }



        // int arr[] = {10,20,30,40,50,60};
        // // int arr2[] = Arrays.copyOf(arr, arr.length);
        // int arr2[] = Arrays.copyOfRange(arr, 0, 3);

        // // arr2[0] = 10000;
        // printArray(arr);
        // printArray(arr2);




        // total number of pairs of arrays whose sum is equal to target--
        // int arr[] = {3,2,1,4,3,5,6,43,23,1};
        // int target = 4;
        // int value[] = new int[20];
        // int a=0;
        // // int[][] value = new int[arr.length][2];
        // for (int i = 0; i < arr.length-1; i++)
        // {
        //     for (int j =1; j<arr.length; j++)
        //     {
        //         if((arr[i]+arr[j])==target)
        //         {
        //             value[a++] = arr[i];
        //             value[a++] = arr[j];
                 
                    
        //         }

        //     }

        // }
        // printArray(value);




        // count trplets of sum of number---
        // int arr[] = {1,4,5,6,3};
        // int target = 12;
        // int count=0;

        // for(int i=0; i<arr.length-2; i++)
        // {
        //     for(int j=1;j<arr.length-1;j++)
        //     {
        //         for(int k=2;k<arr.length;k++)
        //         {
        //             if((arr[i]+arr[j]+arr[k])==target)
        //             {
        //                 count++;
        //             }
        //         }
        //     }
        // }
        // System.out.println("Cout size: " + count);



        // also show patterns---
        // int arr[] = {1,4,5,6,3};
        // int target = 12;
        // int count=0;
        // int value[] = new int[20];
        // int a= 0 ;
        // for(int i=0; i<arr.length-2; i++)
        // {
        //     for(int j=i+1;j<arr.length-1;j++)
        //     {
        //         for(int k=j+1;k<arr.length;k++)
        //         {
        //             if((arr[i]+arr[j]+arr[k])==target)
        //             {
        //                 value[a++] = arr[i];
        //                 value[a++] = arr[j];
        //                 value[a++] = arr[k];
        //                 count++;
        //             }
        //         }
        //     }
        // }
        // System.out.println("Cout size: " + count);
        // printArray(value);




        // find unique no in array where all elemet are repeated twice where one value is still unique

        // int arr[] = {1,2,3,4,3,2,1};
        // for(int i = 0; i < arr.length; i++)
        // {
        //     for(int j = i+1; j < arr.length;j++)
        //     {
        //         if(arr[i] == arr[j])
        //         {
        //             arr[i] = -1;
        //             arr[j] = -1;
        //         }

        //     }
        // }

        // for(int i = 0; i < arr.length; i++)
        // {
        //     if(arr[i]>0)
        //     {
        //         System.out.println("unique: " + arr[i]);
        //     }
        // }



        // second largest number in array----
        // int arr[] = {7,6,5,4,8,9};
        // int target=0;
        // int finalTarget = Integer.MIN_VALUE;
        // for(int i = 0; i < arr.length-1; i++)
        // {
        //     for(int j = i+1; j < arr.length; j++)
        //     {
        //         if(arr[i]<arr[j])
        //         {
        //             if(arr[j]>target)
        //             {
        //                 target=arr[j];
        //             }
        //             // sort[index++] = arr[j];
        //         }
        //     }
        // }
        // for(int i=0;i<arr.length;i++)
        // {
        //     if(arr[i]==target)
        //     {
        //         arr[i] = Integer.MIN_VALUE;
        //     }
        // }

        //  for(int i = 0; i < arr.length-1; i++)
        // {
        //     for(int j = i+1; j < arr.length; j++)
        //     {
        //         if(arr[i]<arr[j])
        //         {
        //             if(arr[j]>finalTarget)
        //             {
        //                 finalTarget=arr[j];
        //             }
        //             // sort[index++] = arr[j];
        //         }
        //     }
        // }
        // System.out.println("Second larget is " + finalTarget);
        



        // find first repeated value from the array---
        int arr[] = {1,2,3,2,3};
        int target = 0;
        for (int i = 0; i < arr.length; i++)
        {
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[i]==arr[j])
                {
                    target = arr[i];
                    break;
                }

            }

        }
        System.out.println("First repeated value is " + target);
        
        

    }
}
