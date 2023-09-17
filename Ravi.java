import java.io.File;
import java.io.FileWriter;

public class Ravi {
    public static void main(String[] args) {


        // int currentBalance = 1800;
        // int amountCredit = 100;
        // if(currentBalance >=2000)
        // {
        //     currentBalance+=amountCredit;
        //     System.out.println(currentBalance);
        // }
        // else
        // {
            
        //     currentBalance-=currentBalance/100;
        //     System.out.println("2000 limit exhausted");
        //     System.out.println(currentBalance);
        // }


        try {
            File fp = new File("currentFile.txt");
        // fp.createNewFile();

        File fw = new File("EditFile.txt");
        // FileWriter fw = new FileWriter("EditFile.txt");
        // fw.createNewFile();
        // fw.close();
        
        if(fp.exists())
        {
            fp.delete();
            boolean rename = fw.renameTo(fp);
            if(rename)
            {
                System.out.println("rename done");
            }
            else{
                System.out.println("Not");
            }
        }



            
        } catch (Exception e) {
            System.out.println(e);
        }



  



       
            

       
       
    }
    
}
