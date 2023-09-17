public class stringBuffer {
    public static void main(String[] args) {
        

        StringBuffer str = new StringBuffer("ravi");
        // System.out.println(str.capacity()); //byydefauly 16 byte
        // System.out.println(str.capacity());
        System.out.println(str.length());
        str.append(" prakash");
        System.out.println(str);

        // to convert stringBuffer to string use ToString()--
        String strLiteral = str.toString();
         System.out.println(strLiteral);        


    }
    
}
