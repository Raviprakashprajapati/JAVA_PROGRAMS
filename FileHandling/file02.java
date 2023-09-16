import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class file02{
    public static void main(String[] args) {
        
        try {
        //  File f1 = new File("ravi02.txt");
        // f1.createNewFile();

        // FileWriter w = new FileWriter("ravi02.txt");
        // w.write("helo");
        // w.close();

        // File d = new File("ravi02.txt");
        // d.delete();
        

        // File r = new File("ravi02.txt");
        // if(r.canRead())
        // if(r.exists())
        // {
        //     System.out.println("true");
        // }
        // else{ System.out.println("false");}
        // System.out.println(r.length());

        // read--
        // File fp = new File("ravi02.txt");
        // if(fp.exists())
        // {
        //     Scanner scan = new Scanner(fp);
        //     while(scan.hasNextLine())
        //     {
        //         System.out.println(scan.nextLine());
        //     }
        // }


        // append---
        File fp = new File("ravi02.txt");
        if(fp.exists())
        {
            System.out.println("exist");
            FileWriter fw = new FileWriter("ravi02.txt",true);
            fw.write("\nhola bhai");
            fw.close();

        }



        }
         catch (Exception e) {
            System.out.println(e);
        }
        

    }
}