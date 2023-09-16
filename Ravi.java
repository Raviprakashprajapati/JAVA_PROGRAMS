
public class Ravi {
    public static void main(String[] args) {

        // int age = 80;
        // if(age>17 && age<79)
        // {
        //     System.out.println("person can vote");
        // }
        // else{
        //     System.out.println("person can't vote");
        // }



        int currentBalance = 2000;
        int transaction = 100;
        if(currentBalance >=2000)
        {
            currentBalance+=transaction;
            System.out.println(currentBalance);
        }
        else
        {
            
            currentBalance-=currentBalance/100;
            System.out.println("2000 limit exhausted");
            System.out.println(currentBalance);
        }


       
            

       
       
    }
    
}
