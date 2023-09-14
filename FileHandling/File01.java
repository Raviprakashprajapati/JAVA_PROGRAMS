import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class File01 {
    public static void main(String[] args) {

        try {

            // createfiele---
            // File f1 = new File("ravi.txt");
            // f1.createNewFile();

            // writefile----
            // FileWriter f1 = new FileWriter("ravi.txt");
            // f1.write("heelo bhai kya haal hai \n tu kal kya kar rh hai");
            // f1.close();

            // readfile----
            // File f1 = new File("ravi.txt");
            // Scanner scan = new Scanner(f1);
            // while (scan.hasNextLine()) {
            //     System.out.println(scan.nextLine());
                
            // }
            // scan.close();


            // deletefile----
            File f1 = new File("ravi.txt");
            if(f1.delete())
            {
                System.out.println("File deleted " + f1.getName());
            }
            else{
                System.out.println("File not deleted");
            }

            

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
