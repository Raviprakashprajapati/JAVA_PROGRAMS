
class Number<T1,T2>{
    T1 a;
    T2 b;

    Number(T1 a, T2 b){
        this.a = a;
        this.b = b;
    }

   public T1 getT1(){
        return a;
    }

    public T2 getT2()
    {
        return b;
    }



}


public class GenericsClasss {

    public static void main(String[] args) {
        
        Number <String,String> n1 = new Number("453",5454);
        System.out.println(n1.getT1());
        System.out.println(n1.getT2());

    }
    
}
