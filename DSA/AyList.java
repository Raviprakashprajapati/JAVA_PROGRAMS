public class AyList{

    static int[] cumulative(int arr[])
    {
        int result[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
        {
            for(int j=i;j>=0;j--)
            {
                result[i]+=arr[j];
            }
        }
        return result;
    }
 
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4};
        int result[] = cumulative(arr);


        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i : result) {
            System.out.print(i+" ");
        }
    }
}