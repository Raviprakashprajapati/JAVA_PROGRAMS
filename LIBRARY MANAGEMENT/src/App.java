
import java.util.Scanner;

import PackageBook.Book;
import PackageStudent.Student;

public class App {

    static void headerMain() {
        System.out.println();
        for (int i = 0; i < 100; i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.printf("%-10s%-20s%-20s%-15s%-20s%-10s", "I.D", "Book Name", "Book Author", "Book Pages",
                "Book Price", "Book Availability");
        System.out.println();

        for (int i = 0; i < 100; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

     static void headerStudentMain() {
        System.out.println();
        for (int i = 0; i < 100; i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.printf("%-10s%-20s%-20s%-20s%-30s", "I.D", "Student Name", "Student Contact", "Total Books","Books IDS");
        System.out.println();

        for (int i = 0; i < 100; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

    static void displayStudentMain(Student std) {

        headerStudentMain();
        std.displayStudent();
        for (int i = 0; i < 100; i++) {
            System.out.print("=");
        }
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
        for (int i = 0; i < 100; i++) {
            System.out.print("=");
        }
    }

    static void displayBookMain(Book store) {
        headerMain();
        store.displayBook();
        for (int i = 0; i < 100; i++) {
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

    static void addStudentMain(Student std) {
        System.out.println("[ Add Student ]");
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter Student Id");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Student Name: ");
            String name = sc.nextLine();
            System.out.println("Enter Student Contact No.:");
            String phone = sc.nextLine();
            std.addStudent(id, name, phone, "0", "null");
            sc.close();

    }

    static void issueBook(Student std, Book store) {
        System.out.println("[ Issue Book TO Student ]");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Student ID: ");
        int stuId = scan.nextInt();
        System.out.println("Enter Book Id to be issue: ");
        int bookId = scan.nextInt();
        scan.close();

        // check if anyone not present---
        if (std.checkStudentId(stuId) == true && store.checkBookId(bookId) == true) {

            std.issueBook(stuId, bookId, store);

        } else {
            if (std.checkStudentId(stuId) == false) {
                System.out.println("Student does not exist");
            } else {

                System.out.println("Book does not exist");
            }
        }
       

    }











    // main
    public static void main(String[] args) {

        Book store = new Book();
        Student std = new Student();

        try (Scanner scan = new Scanner(System.in)) {

            while (true) {
                System.out.println("\n--------------------------------");

                System.out.println("1: Display Books");
                System.out.println("2: Display Students");
                System.out.println("3: Add Book");
                System.out.println("4: Add Student");
                System.out.println("5: Issue Book");
                System.out.println("6: Search Book By ID");
                System.out.println("7: Modify Book By ID");
                System.out.println("8: Delete Book By ID");
                System.out.println("9: Delete All Books");
                System.out.println("10: Exit Code");
                System.out.println("Enter your choice:");
                int choice = scan.nextInt();
                System.out.println("--------------------------------");

                switch (choice) {
                    case 1:
                        displayBookMain(store);
                        break;
                    case 2:
                        displayStudentMain(std);
                        break;
                    case 3:
                        addBookMain(store);
                        break;

                    case 4:
                        addStudentMain(std);
                        break;

                    case 5:
                        issueBook(std, store);
                        break;

                    case 6:
                        searchBookByIdMain(store);
                        break;

                    case 7:
                        modifyBookByIdMain(store);
                        break;

                    case 8:
                        deleteBookByIdMain(store);
                        break;

                    case 9:
                        deleteFileMain(store);
                        break;
                    case 10:
                        return;

                    default:
                        System.out.println("Enter a valid choice");
                        break;

                }
            }
        }

    }

}
