import java.util.Scanner;

public class e {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // * * * * * *
        // * * * * * *
        // * * * * * *
        // for(int i = 0;i<3;i++)
        // {
        // for(int j=1;j<=3;j++){
        // System.out.print(i+" ");
        // }
        // System.out.println();
        // }

        int m = scan.nextInt();
        int n = scan.nextInt();

        // for (int r = 1; r <= m; r++) {
        //     for (int c = 1; c <= n; c++) {
        //         if (r == 1 || r == m || c == 1 || c == n) {

        //             System.out.print("*" + " ");
        //         } else {

        //             System.out.print(" ");
        //         }
        //     }

        //     System.out.println();
        // }





        // for(int r=1;r<=m;r++){
        //     for(int c = 1;c<=r;c++)
        //     {   System.out.print("*"+"  ");

        //     }
        //     System.out.println();
        // }


        for(int r=1;r<=m;r++)
        {
            for(int c=1;c<=(m+1-r);c++){
                System.out.print("*"+"");
            }
            System.out.println();
        }




        // main end
    }

}
