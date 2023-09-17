
class Student{
    // static variable
    static int totalStudent=0;
    // Instance variable
    String name;
    Student(){
        totalStudent++;
    }
}

public class staticVaribale01 {
    public static void main(String[] args) {
        
        Student ravi = new Student();
        Student ravi02 = new Student();
        Student ravi03 = new Student();
        ravi.name = "ravi prakash prajapati";
     
        System.out.println(ravi.name);
        
        // static vairable can only called by className.staticvariable
        // static vairale have only one copy per class
        System.out.println(Student.totalStudent);

        // it show error because instance variable cannot be call by classname.instancevaraible
        // it have each copy per object which is created 
        // System.out.println(Student.name);
        

    }
    
}
