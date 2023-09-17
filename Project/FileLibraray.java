import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

class Book {
    public String BookName;
    public int BookPrice;
    public int BookId;

    public void addBook(String b, int p, int id) {
        this.BookName = b;
        this.BookPrice = p;
        this.BookId = id;

        try {
            File fp = new File("Book.txt");
            if (fp.exists()) {
                FileWriter fa = new FileWriter(fp, true); // Use append mode
                fa.write(this.BookId + " " + this.BookName + " " + this.BookPrice + "\n");
                fa.close(); // Close the FileWriter
                System.out.println("Data appended");
            } else {
                FileWriter fw = new FileWriter(fp);
                fw.write(this.BookId + " " + this.BookName + " " + this.BookPrice + "\n");
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

    public void deleteFile() {
        File fp = new File("Book.txt");
        fp.delete();
        if (fp.exists()) {
        } else {
            System.out.println("Book.txt Deleted");
        }
    }

    public void searchBookById(int id) {
        try {

            File fp = new File("Book.txt");
            if (fp.exists()) {

                Scanner scan = new Scanner(fp);
                boolean found = false;

                // loop for per line
                while (scan.hasNextLine()) {

                    String line = scan.nextLine();
                    //store per line in array 
                    String[] split = line.split(" ");
                    if (split.length > 0) {
                        int fileBookId = Integer.parseInt(split[0]);

                        if (id == fileBookId) {
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

                if (!found) {
                    System.out.println("Book with ID " + id + " not found.");
                }

            }

            else {
                System.out.println("File not found ");
            }

        } catch (Exception e) {

        }
    }

   public void deleteBookById(int id) {
    try {
        File fp = new File("Book.txt"); // Read book data
        FileWriter fw = new FileWriter("NewBook.txt");
        if (fp.exists()) {
            try (Scanner scan = new Scanner(fp)) { // Use try-with-resources for Scanner
                boolean flag = false;

                while (scan.hasNextLine()) {
                    // Store each line in an array
                    String str = scan.nextLine();
                    String[] split = str.split(" ");

                    if (split.length>=0) {
                        int fileId = Integer.parseInt(split[0]);
                        // If id matches with file data, skip writing it to the new file
                        if (id != fileId) {
                            fw.write(split[0] + " " + split[1] + " "  + "\n");
                        }
                    }
                }
            } // Scanner is automatically closed here

            // Close the FileWriter before proceeding with file deletion and renaming
            fw.close();

            // Delete the original file
            if (fp.delete()) {
                // Rename the new file to the original file name
                File fwn = new File("NewBook.txt");
                if (fwn.renameTo(fp)) {
                    System.out.println("Book with ID " + id + " deleted.");
                } else {
                    System.out.println("Renaming failed.");
                }
            } else {
                System.out.println("File deletion failed.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    } catch (Exception e) {
        System.out.println(e);
    }
}

    


}

public class FileLibraray {
    public static void main(String[] args) {

        Book store = new Book();
        // store.addBook("javascript ", 96,100);
        // store.addBook("python ", 896,200);
        // store.addBook("five ", 369,500);
        // store.displayBook();
        // store.deleteFile();
        store.deleteBookById(500);
        // store.displayBook();

        // try {
        //     FileReader fr = new FileReader("Book.txt");
        //     Scanner scan = new Scanner(fr);
        //     while (scan.hasNextLine()) {
        //         System.out.println(scan.nextLine());
                
        //     }

            
        // } catch (Exception e) {
        
        // }

    }

}
