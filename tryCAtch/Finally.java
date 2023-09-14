public class Finally {
    
    static float get(){

        try {
            float result = 454/653;
                return result;
        } catch (Exception e) {
            
            System.out.println(e);
        }
        finally{
            System.out.println("FUNCTION END");
        }
        return 0;
    }
    
    public static void main(String[]args)
    {
        
            // float i =  get();
            // System.out.println(i);
        int i=0;

        
            while (i<4) {
                System.out.println("Ada");
                
            }



    }
    
}
