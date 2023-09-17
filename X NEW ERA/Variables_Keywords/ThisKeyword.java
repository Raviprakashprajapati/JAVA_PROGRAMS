class Student{
    private int age;

    void setAge(int age,Student obj)
    {
        obj.age = age;
        System.out.println(this+ "  "+obj);
    }

    int getAge(){
        return this.age;
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        
        Student ravi  =  new Student();
        ravi.setAge(19,ravi);
        System.out.println(ravi.getAge());

    }
    
}
