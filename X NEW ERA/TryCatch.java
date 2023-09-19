public class TryCatch {
    public static void main(String[] args) {
        
        try {
            int i = 0;
            if(i==0)
            {
                // int j = 45/i;
                throw new Exception("galat hia bhia");
            
            }
        
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
    
}
