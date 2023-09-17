

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

   

        


    }
    
}
