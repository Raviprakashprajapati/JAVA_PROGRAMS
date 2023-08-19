import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        // int[][] age = new int[2][3];
        // age[0][0] = 10;
        // age[0][1] = 20;
        // age[0][2] = 30;
        // for (int i : age[0]) {
        // System.out.println(i);
        // }

        // int [][] age = {
        // {10,20,30},
        // {40,50,60}
        // };

        // for (int i = 0; i < age.length; i++)
        // {
        // for (int j = 0; j < age[i].length; j++)
        // {
        // System.out.println(age[i][j]);
        // }
        // }

        // int num[] = {23,56,43,7,2};

        // int target = num[0];
        // for(int i=1;i<num.length;i++)
        // {
        // if(target<num[i])
        // {
        // target = num[i];
        // }
        // }
        // System.out.println(target);

        // int [] num = {12,34,56,1,3};
        // int target = 1;
        // for (int i = 0; i < num.length; i++)
        // {
        // if(target == num[i]){
        // System.out.println("found at " + i);
        // break;
        // }
        // }

        Scanner scan = new Scanner(System.in);
        int[][] age = new int[3][2];

        System.out.println("enter age ");
        for(int i = 0;i<age.length;i++) 
        {
            for(int j=0;j<age[i].length;j++)
            {
                int x = scan.nextInt();
                age[i][j] = x;
            }
        }

        for(int i=0;i<age.length;i++)
        {
            for(int j=0;j<age[i].length;j++)
            {
                System.out.print(age[i][j]+ " ");
            }
            System.out.println();
        }

        

        // end main
    }

}
