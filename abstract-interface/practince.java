interface BasicAnimal{
    void eat();
    void sleep();
}

class Monkey{
    void jump(){
        System.out.println("jumped");
    }
    void bite(){
        System.out.println("bited");
    }
}

class Human extends Monkey implements BasicAnimal{

    public void eat(){
        System.out.println("eat");
    }

    public void sleep(){
        System.out.println("sleep");
    }

}


public class practince {
    public static void main(String[] args) {

        Human ravi = new Human();
        ravi.sleep();

        
    }
}
