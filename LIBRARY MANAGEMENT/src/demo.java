// package PackageBook;
// import java.io.File;
// import java.io.FileWriter;
// import java.util.ArrayList;
// import java.util.Scanner;

// public class Book {
//     public int BookId;
//     public String BookName;
//     public String BookAuthor;
//     public int BookPages;
//     public int BookPrice;
//     // public String BookAvailable;

//     public void addBook(int id, String b, String au, int page, int price) {

//         ArrayList<String> ll = new ArrayList<>();
//         try {
//             File fp= new File("Book.txt");
//             if(fp.exists())
//             {
//                 Scanner scan = new Scanner(fp);
//                 while(scan.hasNextLine()){

//                     ll.add(scan.nextLine());
//                 }

//                 for (String obj : ll) {
                    
//                          String str[] = obj.split(" ");
//                             if(Integer.parseInt(str[0])==id)
//                             {
//                                 System.out.println("\nBook with Same ID already exists");
//                                 return;
//                             }
                           
//                         }
//             }
           
            
//         } catch (Exception e) {
//         }




//         this.BookId = id;
//         this.BookName = b;
//         this.BookAuthor = au;
//         this.BookPages = page;
//         this.BookPrice = price;

//         // combined bookname without dot--
//         String[] split = this.BookName.split(" ");
//         String newStr = "";
//         for (String string : split) {
//             newStr += string;
//         }
//         // combined bookAuthor withour dot--
//         String[] splitAuthor = this.BookAuthor.split(" ");
//         String newStrAuthor = "";
//         for (String string : splitAuthor) {
//             newStrAuthor += string;
//         }

//         try {
//             File fp = new File("Book.txt");
//             if (fp.exists()) {
//                 FileWriter fa = new FileWriter(fp, true); // Use append mode

//                 fa.write(this.BookId + " " + newStr + " " + newStrAuthor + " " + this.BookPages + " " + this.BookPrice
//                         + "\n");
//                 fa.close(); // Close the FileWriter
//                 System.out.println("Data appended");
//             } else {
//                 FileWriter fw = new FileWriter(fp);
//                 fw.write(this.BookId + " " + newStr + " " + newStrAuthor + " " + this.BookPages + " " + this.BookPrice
//                         + "\n");
//                 fw.close(); // Close the FileWriter
//                 System.out.println("Data written");
//             }
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//     }

//     public void displayBook() {
//         try {
//             File fp = new File("Book.txt");
//             if (fp.exists()) {
//                 Scanner scan = new Scanner(fp);
                
//                 if (scan.hasNextLine()) {

//                     while (scan.hasNextLine()) {
                     
//                         String[] split = scan.nextLine().split(" ");
//                         System.out.printf("%-10s%-20s%-20s%-15s%-10s", split[0], split[1], split[2], split[3],
//                                 split[4]);
//                         System.out.println();

//                     }
//                     scan.close(); // Close the Scanner
//                 } else {
//                     System.out.println("There is nothing in File");
//                 }
//             } else {
//                 System.out.println("File not exists");
//             }
//         } catch (Exception e) {
//             System.out.println("ERROR IN DISPLAY " +e);
//         }
//     }

//     public void deleteFile() {
//         File fp = new File("Book.txt");
//         if (fp.exists()) {
//             fp.delete();
//             System.out.println("Book.txt Deleted");
//         } else {
//             System.out.println("Book.txt is not exists");

//         }

//     }

//     public void searchBookById(int id) {
//         try {

//             File fp = new File("Book.txt");
//             if (fp.exists()) {

//                 Scanner scan = new Scanner(fp);
//                 boolean found = false;

//                 // loop for per line
//                 while (scan.hasNextLine()) {

//                     String line = scan.nextLine();
//                     // store per line in array
//                     String[] split = line.split(" ");
//                     if (split.length > 0) {
//                         int fileBookId = Integer.parseInt(split[0]);

//                         if (id == fileBookId) {

//                             System.out.printf("%-10s%-20s%-20s%-15s%-10s", split[0], split[1], split[2], split[3],
//                                     split[4]);
//                             System.out.println();

//                             found = true;
//                             break;

//                         }

//                     }
//                 }

//                 if (!found) {
//                     System.out.println("Book with ID " + id + " not found.");
//                 }
//                 scan.close();

//             }

//             else {
//                 System.out.println("File not found ");
//             }

//         } catch (Exception e) {
//             System.out.println("\nSomething went wrong\n");

//         }
//     }  

//     public void deleteBookById(int id) {
//         try {
//             File fp = new File("Book.txt"); // Read book data
//             boolean flag = false;
//             if (fp.exists()) {
//                 FileWriter fw = new FileWriter("NewBook.txt");
//                 try (Scanner scan = new Scanner(fp)) { // Use try-with-resources for Scanner

//                     while (scan.hasNextLine()) {
//                         // Store each line in an array
//                         String str = scan.nextLine();
//                         String[] split = str.split(" ");

//                         if (split.length >= 0) {
//                             int fileId = Integer.parseInt(split[0]);
//                             // If id matches with file data, skip writing it to the new file
//                             if (id != fileId) {
//                                 fw.write(split[0] + " " + split[1] + " " + split[2] + " " + split[3] + " " + split[4]
//                                         + "\n");
//                                 // flag = true;
//                             }
//                             if (id == fileId) {
//                                 flag = true;
//                                 // break;
//                             }

//                         }
//                     }
//                 } // Scanner is automatically closed here

//                 // Close the FileWriter before proceeding with file deletion and renaming
//                 fw.close();

//                 if (flag) {
//                     // Delete the original file
//                     if (fp.delete()) {
//                         // Rename the new file to the original file name
//                         File fwn = new File("NewBook.txt");
//                         if (fwn.renameTo(fp)) {
//                             System.out.println("Book with ID " + id + " deleted.");
//                         } else {
//                             System.out.println("Renaming failed.");
//                         }
//                     } else {
//                         System.out.println("File deletion failed.");
//                     }
//                 } else {
//                     System.out.println("Book with ID " + id + " not present.");
//                 }

//             } else {
//                 System.out.println("File does not exist.");
//             }
//         } catch (Exception e) {
//             System.out.println(e);
//         }

//         File ff = new File("NewBook.txt");
//         if(ff.exists()){
//             ff.delete();
//         }

//     }

   
//     public void modifyBookById(int id) {

       
      
//         try {

//             File fp = new File("Book.txt");
            
//             // if file exists
//             if (fp.exists()) {

//                 try (Scanner scan = new Scanner(fp)) {
//                     // if file has nothing
//                     if (scan.hasNextLine()) {

//                         // loop for per line
//                           ArrayList<String> ll = new ArrayList<>();              
//                           while (scan.hasNextLine()) {
//                             ll.add(scan.nextLine());
//                         }
//                         scan.close();
//                         int index= 0 ;
//                         boolean flag = false;
                        
//                             //if book prestn
//                             for (String obj : ll) {
                                
//                             String split[] = obj.split(" ");
//                             if(Integer.parseInt(split[0])==id)
//                             {
                                
//                                 //display match book first---
//                                 System.out.println("\nBook is present ");
                               
//                                 for (int i = 0; i < 84; i++) {
//                                     System.out.print("=");
//                                 }
//                                 System.out.println();
//                                 System.out.printf("%-10s%-20s%-20s%-15s%-10s", "I.D", "Book Name", "Book Author",
//                                 "Book Pages", "Book Price");
//                                 System.out.println();
//                                 for (int i = 0; i < 84; i++) {
//                                     System.out.print("=");
//                                 }
//                                 System.out.println();
//                                 System.out.printf("%-10s%-20s%-20s%-15s%-10s", split[0], split[1], split[2], split[3],
//                                 split[4]);
//                                 System.out.println();
//                                 for (int i = 0; i < 84; i++) {
//                                     System.out.print("=");
//                                 }
//                                 flag = true;
                                
//                                 break;
                                
                                
                                

                               
                               
//                             }
//                             else{

//                             }
//                              index++;
                            
//                         }


//                         //write
//                         if(flag){
                            
                          
                          
//                              // addind new field
//                                 Scanner sc = new Scanner(System.in);
//                                 System.out.println("\n[ Modify Book ]");
//                                 System.out.println("Enter New Book Id: ");
//                                 int ide = sc.nextInt();
//                                 sc.nextLine();
//                                 System.out.println("Enter New Book Name: ");
//                                 String name = sc.nextLine();
//                                 System.out.println("Enter New Book Author: ");
//                                 String author = sc.nextLine();
//                                 System.out.println("Enter New Book Pages: ");
//                                 int page = sc.nextInt();
//                                 System.out.println("Enter New Book Price: ");
//                                 int price = sc.nextInt();
//                                 String updateData = String.format("%d %s %s %d %d",ide,name,author,page,price);
//                                 ll.set(index, updateData);
//                                 // System.out.println(ll);

//                                 //write all things in file
//                                 FileWriter fw = new FileWriter("Book.txt");
//                                 for (String obj : ll) {
//                                     fw.write(obj+"\n");
//                                 }
//                                 fw.close();
                                
//                                 System.out.println("\nModify Completed...");
                                    
//                         }else{
//                             System.out.println("\nBook is not present");
//                         }
                        

            
                        
//                     }
//                     else{
//                         System.out.println("File has no Data\n");
//                     }
//                     // System.out.println("Book with "+id+ " ID is not present \n" );
//                 }

//             // }
//                 // scan.close();


//             }

//             else {
//                 System.out.println("File not found ");
//             }

//         } catch (Exception e) {
//             System.out.println("\nSomething went wrong\n");

//         }

     
       

//     }




// }// Book class end here




// // MAIN ENTRY
// // public class FileLibraray {

// // }
