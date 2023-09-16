import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

class Book{
    public String BookName;
    public int BookPrice;
    public int BookId;

  
    public void addBook(String b, int p,int id) {
        this.BookName = b;
        this.BookPrice = p;
        this.BookId = id;

        try {
            File fp = new File("Book.txt");
            if (fp.exists()) {
                FileWriter fa = new FileWriter(fp, true); // Use append mode
                fa.write(this.BookId +" " +this.BookName + " " + this.BookPrice + "\n");
                fa.close(); // Close the FileWriter
                System.out.println("Data appended");
            } else {
                FileWriter fw = new FileWriter(fp);
                fw.write(this.BookId+" " +this.BookName + " " + this.BookPrice + "\n");
                fw.close(); // Close the FileWriter
                System.out.println("Data written");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
        
    public void displayBook() {
        try {
            File fp = new File("Book.txt");
            if (fp.exists()) {
                Scanner scan = new Scanner(fp);
                System.out.println("Displaying books-----");
                while (scan.hasNextLine()) {
                    System.out.println(scan.nextLine()); 
                }
                scan.close(); // Close the Scanner
            } else {
                System.out.println("File not exists");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void deleteFile(){
        File fp = new File("Book.txt");
        fp.delete();
        if(fp.exists())
        {}
        else{
            System.out.println("Book.txt Deleted");
        }
    }

    public void searchBookById(int id)
    {
        try {

            File fp  = new File("Book.txt");
            if(fp.exists())
            {
                
                Scanner scan = new Scanner(fp);
                boolean found = false;

                while(scan.hasNextLine())
                {
                    String line = scan.nextLine();
                    String[] split = line.split(" ");
                    if(split.length>0)
                    {
                        int fileBookId = Integer.parseInt(split[0]);

                        if(id==fileBookId)
                        {
                            System.out.println("Book found-----");
                            // System.out.println("BookId: " + fileBookId);
                            // System.out.println("BookName: " + split[1]);
                            // System.out.println("BookPrice: " + split[2]);
                            for (String string : split) {
                                System.out.print(string + " ");
                            }
                            found = true;
                            break;

                        }

                    }
                }

                if(!found)
                {
                     System.out.println("Book with ID " + id + " not found.");
                }

                

            }

            else{
                System.out.println("File not found ");
            }

            
        } catch (Exception e) {
            
        }
    }

}



public class FileLibraray {
    public static void main(String[] args) {

        Book store = new Book();
        // store.addBook("javascript ", 896,100);
        // store.addBook("python ", 896,200);
        // store.displayBook();        
        // store.deleteFile();
        store.searchBookById(100);
    
        
    }
    
}
