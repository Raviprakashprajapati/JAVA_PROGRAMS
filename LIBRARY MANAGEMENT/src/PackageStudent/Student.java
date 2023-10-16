package PackageStudent;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import PackageBook.Book;

public class Student {

    public int studentId;
    public String studentName;
    public String studentContact;
    public String studentIssueOrNot;
    public String studentTotleBookId;

    public Student() {
    }

    public boolean checkStudentId(int id) {
        boolean flag = false;
        try {
            File fp = new File("Student.txt"); // Read book data
            if (fp.exists()) {

                try (Scanner scan = new Scanner(fp)) { // Use try-with-resources for Scanner

                    while (scan.hasNextLine()) {

                        String str = scan.nextLine();
                        String split[] = str.split(" ");

                        if (Integer.parseInt(split[0]) == id) {
                            flag = true;
                        }
                    }
                } // Scanner is automatically closed here
            }
        } catch (Exception e) {
            System.out.println("ERROR IN CHECKING STUDENT ID");
        }
        return flag;
    }

    public void displayStudent(){

   
            try {
                int countBook = 0;
                File fp = new File("Student.txt");
                if (fp.exists()) {
                    Scanner scan = new Scanner(fp);
                    
                    if (scan.hasNextLine()) {
    
                        while (scan.hasNextLine()) {
                         
                            countBook++;
                            String[] split = scan.nextLine().split(" ");
                            System.out.printf("%-10s%-20s%-20s%-20s%-30s", split[0], split[1], split[2], split[3], split[4]);
                            System.out.println();
    
                        }
                        System.out.println("Total Students : " + countBook);
    
                        scan.close(); // Close the Scanner
                    } else {
                        System.out.println("There is nothing in File");
                    }
                } else {
                    System.out.println("File not exists");
                }
            } catch (Exception e) {
                System.out.println("ERROR IN DISPLAY " +e);
            }
        
    

    }

    public void addStudent(int id, String name, String contact, String issueornot, String totalBook) {

        ArrayList<String> ll = new ArrayList<>();
        try {
            File fp = new File("Student.txt");
            if (fp.exists()) {
                Scanner scan = new Scanner(fp);
                while (scan.hasNextLine()) {

                    ll.add(scan.nextLine());
                }

                for (String obj : ll) {

                    String str[] = obj.split(" ");
                    if (Integer.parseInt(str[0]) == id) {
                        System.out.println("\nStudent with Same ID already exists");
                        return;
                    }

                }
            }

        } catch (Exception e) {
        }

        this.studentId = id;
        this.studentName = name;
        this.studentContact = contact;
        this.studentTotleBookId = totalBook;
        this.studentIssueOrNot = issueornot;

        // combined bookname without dot--
        String[] split = this.studentName.split(" ");
        String newStr = "";
        for (String string : split) {
            newStr += string;
        }

        // add in student file
        try {
            File fp = new File("Student.txt");
            //append
            if (fp.exists()) {
                FileWriter fa = new FileWriter(fp, true); // Use append mode

                fa.write("\n"+this.studentId + " " + newStr + " " + this.studentContact + " "  
                        + this.studentIssueOrNot +" "+this.studentTotleBookId
                        );
                fa.close(); // Close the FileWriter
                System.out.println("Data appended");
            } 
            else {
                //first student write
                FileWriter fw = new FileWriter(fp);
                fw.write("\n"+this.studentId + " " + newStr + " " + this.studentContact + " "  
                        + this.studentIssueOrNot +" "+this.studentTotleBookId
                       );
                fw.close(); // Close the FileWriter
                System.out.println("\nData written");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void issueBook(int stdId,int bookId,Book store){

        try {
          
            ArrayList<String> ll = new ArrayList<>();
          File studentFp = new File("Student.txt");
          try (Scanner scan = new Scanner(studentFp)) {
            while(scan.hasNextLine())
              {
                ll.add(scan.nextLine());
              }
        }
          System.out.println(ll);

          //if studetnid equal
          for(int i = 0;i<ll.size();i++)
          {
            String str = ll.get(i);
            String[] split = str.split(" ");
            if(Integer.parseInt(split[0])==stdId)
            {
                //if no book present
                if(split[3].equals("0"))
                {

                    ll.set(i, split[0]+" "+split[1]+" "+split[2]+" "+"1"+" "+bookId);
                }else{

                    //coolection of bookID
                    String bookCollection[] = split[4].split(",");
                    ArrayList<String> bookCollectList = new ArrayList<String>();
                    for (String bbb : bookCollection) {
                        bookCollectList.add(bbb);
                    }
                    bookCollectList.add(String.valueOf(bookId));
                    String allBookIdInRow = "";
                    for (String bb : bookCollectList) {
                        if(bb.equals("null"))
                        {

                        }else{

                            allBookIdInRow+=bb+",";
                        }
                    }

                    ll.set(i, split[0]+" "+split[1]+" "+split[2]+" "+(Integer.parseInt(split[3])+1)+" "+allBookIdInRow);

                }




                
            }
            

          }


          FileWriter fw = new FileWriter("Student.txt");
          for (String row : ll) {
            fw.write(row+"\n");
          }
          fw.close();
        //   System.out.println(ll);

         
        } catch (Exception e) {
         System.out.println("ERROR IN ISSUING BOOK");
     }
        
    }







}
