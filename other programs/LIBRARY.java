class LibraryBook{
    public String book[] = new String[100];
    public int index=0;
    public void addBook(String book )
    {
        this.book[index++] = book;
        System.out.println("Book Added");

    }
    
    public void display(){
        for(int i=0; i<index;i++)
        {
            if(book[i]!=null)
            {
                System.out.print(book[i]+" ");
            }
        }
        System.out.println();
    }

    public void issueBook(String b)
    {
        for(int i=0; i<index; i++)
        {  
        if(book[i]==b)
        {
            System.out.println("book present");
            book[i] = null;
            return;
        }
        }
        System.out.println("Book not present");
    }


    public void returnBook(String b)
    {
        for(int i=0; i<index; i++)
        {
            if(book[i]==b)
            {
                System.out.println("Book already present");
                return;
            }
        }
        book[index++] = b;
    }


}



public class LIBRARY {
    public static void main(String[] args) {
        

        LibraryBook l1 = new LibraryBook();
        l1.addBook("python");
        l1.addBook("java");
        l1.addBook("ruby");
        l1.display();
        l1.issueBook("ruby");
        l1.display();
        l1.returnBook("ruby");
        l1.display();
        l1.addBook("javascript");
        l1.addBook("html");
        l1.addBook("css");
        l1.display();
        l1.issueBook("html");
        l1.display();

        


    }
    
}
