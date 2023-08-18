public class Method{
    
    static void passByValue(int a,int b){
        a = a+5;
        b = b+5;
    }

    public static void main(String[] args) {


        // for(int i=1;i<=5;i++){
        //     if(i==2) continue;
        //     System.out.println(i);
        // }
        // System.out.println("------");

        int i=1;
        while (i<=5) {
            System.out.println(i);
            i++;
            if(i==2){
                // i++;
                continue;
            } 
            
           
        }



    }


}