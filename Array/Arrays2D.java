import java.util.Scanner;

public class Arrays2D{

    static void printArray(int [][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void inputArray(int[][] array){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2D array...");
        for(int i=0; i<array.length; i++)
        {
            for(int j=0; j<array.length; j++)
            {

                array[i][j] = scan.nextInt();

            }
        }
    }

    static void sum(int[][] array,int r1,int c1,int[][] array2,int r2,int c2 ){
        if(r1!=r2 || c1!=c2)
        {
            System.out.println("Make sure row and col should be the same");
            return;
        }
        int[][] result = new int[r1][c1];

        for(int i=0; i<r1;i++)
        {
            for(int j=0; j<c1;j++)
            {
                result[i][j] = array[i][j]+array2[i][j];

            }
        }

        printArray(result);


    
    }

    static void multiply(int[][]arr1,int r1,int c1,int[][] arr2,int r2,int c2){

        if(c1!=r2)
        {
            System.out.println("Make sure c1 and r2 should be same");
            return;
        }

        int[][] result = new int[r1][c2];

        for(int i = 0; i < r1; i++)
        {
            for(int j = 0; j < c2; j++)
            {
                for(int k = 0; k <c1;k++){

                    result[i][j] += (arr1[i][j]* arr2[k][j]);
                }
            }
        }

        printArray(result);

        
    }

    static void transposeMatrix(int[][] arr){
        int[][] result = new int[arr.length][arr.length];
        // printArray(result);
        for(int i = 0;i < result.length;i++)
        {
            for(int j = 0;j < arr[i].length;j++)
            {
                result[j][i] = arr[i][j];
            }

        }
        printArray(result);
    }

    static void transposeInplace(int[][] arr){
   
        for(int i = 0; i < arr.length; i++)
        {
            for(int j=i; j <arr[i].length;j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

    }

    static void reverse(int[]arr ){
        int left = 0;
        int right = arr.length - 1;
        while(left < right)
        {
            int temp  = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        
    }

    static void rotateMatrix(int[][] arr){
        System.out.println("funciton");

        transposeInplace(arr);
        for(int i = 0; i < arr.length; i++)
        {
                reverse(arr[i]);
            

        }

      

    }

    public static void main(String[] args) {
        System.out.println("-----------------------------");
        Scanner scan = new Scanner(System.in);

        // sum of matrix
        // int[][] arr ={
        //     {1,2,3},
        //     {4,5,6}
        // };
        //  int[][] arr2 ={
        //     {1,2,3},
        //     {4,5,6}
        // };
        // sum(arr,2,3,arr2,2,3);
      

        // multplication f matrix----
        // int[][] arr1  = {{1,2,3},{4,5,6}}; //2*3
        // int[][] arr2  = {{1,2},{4,5},{6,7}}; //3*2
        // multiply(arr1,2,3,arr2,3,2);



        // transpose matrix-----
        // int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        // printArray(arr);
        // // transposeMatrix(arr);
        // transposeInplace(arr);
        // printArray(arr);



        // roate 90 degres----
         int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
         printArray(arr);
         rotateMatrix(arr);
           printArray(arr);


     
        
        

















































        System.out.println("-----------------------------");
    }
}