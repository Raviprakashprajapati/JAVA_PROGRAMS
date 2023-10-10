package PackageStudent;

import java.io.File;
import java.io.FileWriter;
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
        this.studentIssueOrNot = issueornot;
        this.studentTotleBookId = totalBook;

        // combined bookname without dot--
        String[] split = this.studentName.split(" ");
        String newStr = "";
        for (String string : split) {
            newStr += string;
        }

        // add in student file
        try {
            File fp = new File("Student.txt");
            if (fp.exists()) {
                FileWriter fa = new FileWriter(fp, true); // Use append mode

                fa.write(this.studentId + " " + newStr + " " + this.studentContact + " " + this.studentIssueOrNot + " "
                        + this.studentTotleBookId
                        + "\n");
                fa.close(); // Close the FileWriter
                System.out.println("Data appended");
            } else {
                FileWriter fw = new FileWriter(fp);
                fw.write(this.studentId + " " + newStr + " " + this.studentContact + " " + this.studentIssueOrNot + " "
                        + this.studentTotleBookId
                        + "\n");
                fw.close(); // Close the FileWriter
                System.out.println("\nData written");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }


    public void issueBook(int stdId,int bookId,Book store){

        ArrayList<String> ll = new ArrayList<>();
        try {
          File studentFp = new File("Student.txt");
          Scanner scan = new Scanner(studentFp);
          while(scan.hasNextLine())
          {
            ll.add(scan.nextLine());
          }

          for(int i = 0;i<ll.size();i++)
          {
            String str = ll.get(i);
            String[] split = str.split(" ");
            

          }


         
        } catch (Exception e) {
         System.out.println("ERROR IN ISSUING BOOK");
     }
        
    }







}
