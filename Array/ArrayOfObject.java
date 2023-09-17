
class Student{
    String name;
    int rollNo;
}

public class ArrayOfObject {
    public static void main(String[] args) {
        

        // arrya of objects----
        Student s1 = new Student();
        s1.name = "ravi";
        s1.rollNo = 100;
        Student s2 = new Student();
        s2.name ="saurav";
        s2.rollNo = 200;

        Student s[] = new Student[2];
        s[0] = s1;
        s[1] = s2;

        for(int i = 0; i < s.length; i++) 
        {
            System.out.println(s[i].name + " " + s[i].rollNo);
        }


    }
    
}
