class Library{

    String book[];
    int noOfBooks;

    Library(){
        this.book = new String[100];
        this.noOfBooks = 0;
    }

    void addBook(String book){
        this.book[noOfBooks] = book;
        noOfBooks++;
        System.out.println(book+" added!");
    }

    void showBook(){
        System.out.println("Available books--------------");
        for (String i : book) {
            if(i==null){ continue;}
            System.out.println("- "+i);
        }
    }

    void issueBook(String book )
    {
        for (int i=0; i<book.length();i++){
            
            if(this.book[i].equals(book))
            {
                System.out.println(book+" has been Issued");
                this.book[i] = null;
                return;
            }

        }

        System.out.println("This book does not exist");

    }


    void returnBook(String b)
    {
        this.book[noOfBooks] = b;
        noOfBooks++;
        System.out.println(b+ " has added");
    }

}



public class libraryManagement {
    public static void main(String[] args) {
        
    Library one = new Library();
    one.addBook("python graph");
    one.addBook("JAVA");
    one.addBook("DSA");
    one.showBook();
    one.issueBook("DSA");
    one.showBook();
    one.returnBook("DSA");
    one.showBook();
    

    }
}
