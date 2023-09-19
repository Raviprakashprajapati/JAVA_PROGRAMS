
// enum Status{
//     Running,Playing;
// }


enum Laptop{
    MacBook(price:2000),HP(price:1200),Asus(price:899);

   private int price;
    private Laptop(){}
    private Laptop(int price)
    {
        this.price = price;
    }

}

public class Enum01 {
    public static void main(String[] args) {

        // Status s = Status.Playing;
        // System.out.println(s);

    }
    
}
