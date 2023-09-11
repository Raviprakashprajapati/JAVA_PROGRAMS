import java.util.Scanner;

class Student {
    int age;
    String name;
}


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student obj1 = new Student();

        System.out.println("Enter age : ");
        int x = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter name : ");
        String y = scan.nextLine();
        obj1.age = x;
        obj1.name = y;
        System.out.println(obj1.age);
        System.out.println(obj1.name);



    }
    
}
