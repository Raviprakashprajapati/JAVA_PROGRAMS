import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

class Book {
    public int BookId;
    public String BookName;
    public String BookAuthor;
    public int BookPages;
    public int BookPrice;

    public void addBook(int id, String b, String au, int page, int price) {
        this.BookId = id;
        this.BookName = b;
        this.BookAuthor = au;
        this.BookPages = page;
        this.BookPrice = price;

        // combined bookname without dot--
        String[] split = this.BookName.split(" ");
        String newStr = "";
        for (String string : split) {
            newStr += string;
        }
        // combined bookAuthor withour dot--
        String[] splitAuthor = this.BookAuthor.split(" ");
        String newStrAuthor = "";
        for (String string : splitAuthor) {
            newStrAuthor += string;
        }

        try {
            File fp = new File("Book.txt");
            if (fp.exists()) {
                FileWriter fa = new FileWriter(fp, true); // Use append mode

                fa.write(this.BookId + " " + newStr + " " + newStrAuthor + " " + this.BookPages + " " + this.BookPrice
                        + "\n");
                fa.close(); // Close the FileWriter
                System.out.println("Data appended");
            } else {
                FileWriter fw = new FileWriter(fp);
                fw.write(this.BookId + " " + newStr + " " + newStrAuthor + " " + this.BookPages + " " + this.BookPrice
                        + "\n");
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
                // System.out.println("Displaying books-----\n");
                if (scan.hasNextLine()) {

                    while (scan.hasNextLine()) {
                        // System.out.printf("%-10s%-20s%-20s%-15s%-10s", "I.D", "Book Name", "Book
                        // Author", "Book Pages", "Book Price");
                        // System.out.println(scan.nextLine());
                        String[] split = scan.nextLine().split(" ");
                        System.out.printf("%-10s%-20s%-20s%-15s%-10s", split[0], split[1], split[2], split[3],
                                split[4]);
                        System.out.println();

                    }
                    scan.close(); // Close the Scanner
                } else {
                    System.out.println("There is nothing in File");
                }
            } else {
                System.out.println("File not exists");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void deleteFile() {
        File fp = new File("Book.txt");
        if (fp.exists()) {
            fp.delete();
            System.out.println("Book.txt Deleted");
        } else {
            System.out.println("Book.txt is not exists");

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
                    // store per line in array
                    String[] split = line.split(" ");
                    if (split.length > 0) {
                        int fileBookId = Integer.parseInt(split[0]);

                        if (id == fileBookId) {

                            System.out.printf("%-10s%-20s%-20s%-15s%-10s", split[0], split[1], split[2], split[3],
                                    split[4]);
                            System.out.println();

                            found = true;
                            break;

                        }

                    }
                }

                if (!found) {
                    System.out.println("Book with ID " + id + " not found.");
                }
                scan.close();

            }

            else {
                System.out.println("File not found ");
            }

        } catch (Exception e) {
            System.out.println("\nSomething went wrong\n");

        }
    }  

    public void deleteBookById(int id) {
        try {
            File fp = new File("Book.txt"); // Read book data
            boolean flag = false;
            if (fp.exists()) {
                FileWriter fw = new FileWriter("NewBook.txt");
                try (Scanner scan = new Scanner(fp)) { // Use try-with-resources for Scanner

                    while (scan.hasNextLine()) {
                        // Store each line in an array
                        String str = scan.nextLine();
                        String[] split = str.split(" ");

                        if (split.length >= 0) {
                            int fileId = Integer.parseInt(split[0]);
                            // If id matches with file data, skip writing it to the new file
                            if (id != fileId) {
                                fw.write(split[0] + " " + split[1] + " " + split[2] + " " + split[3] + " " + split[4]
                                        + "\n");
                                // flag = true;
                            }
                            if (id == fileId) {
                                flag = true;
                            }

                        }
                    }
                } // Scanner is automatically closed here

                // Close the FileWriter before proceeding with file deletion and renaming
                fw.close();

                if (flag) {
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
                    System.out.println("Book with ID " + id + " not present.");
                }

            } else {
                System.out.println("File does not exist.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void modifyBookById(int id) {
        try {

            File fp = new File("Book.txt");
            // if file exists
            if (fp.exists()) {

                Scanner scan = new Scanner(fp);

                // if file has nothing
                if (scan.hasNextLine()) {

                    // loop for per line
                    while (scan.hasNextLine()) {

                        String line = scan.nextLine();
                        String[] split = line.split(" ");

                        // if ID
                        if (id == Integer.parseInt(split[0])) {

                            System.out.println("\nBook is present ");
                            for (int i = 0; i < 84; i++) {
                                System.out.print("=");
                            }
                            System.out.println();
                            System.out.printf("%-10s%-20s%-20s%-15s%-10s", "I.D", "Book Name", "Book Author",
                                    "Book Pages", "Book Price");
                            System.out.println();
                            for (int i = 0; i < 84; i++) {
                                System.out.print("=");
                            }
                            System.out.println();
                            System.out.printf("%-10s%-20s%-20s%-15s%-10s", split[0], split[1], split[2], split[3],
                                    split[4]);
                            System.out.println();
                            for (int i = 0; i < 84; i++) {
                                System.out.print("=");
                            }

                            //addind new field
                            System.out.println("\n[ Modify Book ]");
                            Scanner sc = new Scanner(System.in);
                            System.out.println("Enter New Book Id: ");
                            int ide = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Enter New Book Name: ");
                            String name = sc.nextLine();
                            System.out.println("Enter New Book Author: ");
                            String author = sc.nextLine();
                            System.out.println("Enter New Book Pages: ");
                            int page = sc.nextInt();
                            System.out.println("Enter New Book Price: ");
                            int price = sc.nextInt();

                            String updateData = String.format("%d %s %s %d %d",ide,name,author,page,price);
                            
                            //open file for write updated data
                            
                           

                            System.out.println("Modify Done\n");
                            sc.close();
                            break;
                            

                        }
                       
                    }
               
                    
                }
                else{
                    System.out.println("File has no Data\n");
                }
                System.out.println("Book with "+id+ " ID is not present \n" );

                scan.close();

            }

            else {
                System.out.println("File not found ");
            }

        } catch (Exception e) {
            System.out.println("\nSomething went wrong\n");

        }

    }

}// Book class end here



























// MAIN ENTRY
public class FileLibraray {

    static void headerMain() {
        System.out.println();
        for (int i = 0; i < 84; i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.printf("%-10s%-20s%-20s%-15s%-10s", "I.D", "Book Name", "Book Author", "Book Pages", "Book Price");
        System.out.println();

        for (int i = 0; i < 84; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

    static void addBookMain(Book store) {
        System.out.println("[ Adding Book ]");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Book Id: ");
        int id = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Book Name: ");
        String name = scan.nextLine();
        System.out.println("Enter Book Author: ");
        String author = scan.nextLine();
        System.out.println("Enter Book Pages: ");
        int page = scan.nextInt();
        System.out.println("Enter Book Price: ");
        int price = scan.nextInt();
        store.addBook(id, name, author, page, price);

  

    }

    static void searchBookByIdMain(Book store) {
        System.out.println("[ Enter Book ID For Searching ]");
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        headerMain();
        store.searchBookById(id);
        for (int i = 0; i < 84; i++) {
            System.out.print("=");
        }
    }

    static void displayBookMain(Book store) {
        headerMain();
        store.displayBook();
        for (int i = 0; i < 84; i++) {
            System.out.print("=");
        }
    }

    static void deleteFileMain(Book store) {
        store.deleteFile();
    }

    static void deleteBookByIdMain(Book store) {

        System.out.println("[ Deleting Book By ID ]");
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        store.deleteBookById(id);
        // scan.close();
    }

    static void modifyBookByIdMain(Book store) {
        System.out.println("[ Enter Book Id For Modification ]");
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        store.modifyBookById(id);
    }

    public static void main(String[] args) {

        // Book store = new Book();

        // try (Scanner scan = new Scanner(System.in)) {

        //     while (true) {
        //         System.out.println("\n--------------------------------");

        //         System.out.println("1: Display Books");
        //         System.out.println("2: Add Book");
        //         System.out.println("3: Search Book By ID");
        //         System.out.println("4: Modify Book By ID");
        //         System.out.println("5: Delete Book By ID");
        //         System.out.println("6: Delete File");
        //         System.out.println("7: Exit Code");
        //         System.out.println("Enter your choice:");
        //         int choice = scan.nextInt();
        //         System.out.println("--------------------------------");

        //         switch (choice) {
        //             case 1:
        //                 displayBookMain(store);
        //                 break;
        //             case 2:
        //                 addBookMain(store);
        //                 break;
        //             case 3:
        //                 searchBookByIdMain(store);
        //                 break;
        //             case 4:
        //                 modifyBookByIdMain(store);
        //                 break;
        //             case 5:
        //                 deleteBookByIdMain(store);
        //                 break;
        //             case 6:
        //                 deleteFileMain(store);
        //                 break;
        //             case 7:
        //                 return;
        //             default:
        //                 System.out.println("Enter a valid choice");
        //                 break;

        //         }
        //     }
        // }


        try {
            File fp = new File("Book.txt");
        String updateline = "112 java ";
        // FileWriter fw = new FileWriter(fp);
        // fw.write(updateline, , 0);
        Scanner scan = new Scanner(fp);
        // System.out.println(scan.nextLine());
        FileReader read = new FileReader("Book.txt");
        System.out.println(read.read());
        scan.close();

            
        } catch (Exception e) {
            
        }





    }

}
