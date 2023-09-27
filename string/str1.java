import java.util.Map;
import java.util.Stack;

class str1 {

    static boolean acronym(String words[], String str) {
        for (int i = 0; i < words.length; i++) {
            if ((words[i].charAt(0)) != (str.charAt(i))) {
                return false;

            }

        }
        return true;

    }

 
    public static void main(String[] args) {

        //   String str = "hello" ;
        //   String str2 = "world";
        //   str2 = "hello";
        // //   System.out.println(str.equals(str2));
        // //   System.out.println(str.charAt(0));
        // //   System.out.println(str.split("e"));
        //   var arr = str.split("e");
        //   for (String string : arr) {
        //     System.out.println(string);
        //   }
        //   System.out.println(str.contains("o"));
        //   System.out.println(str.indexOf("h"));

         
        // string buffer---
        // StringBuffer str = new StringBuffer("hello");
        // String s = str.toString();
        // str.reverse();
        // System.out.println(str);

        // String str = "aaabc";
        // int index = 1;
        // char ch = 'a';
        // //left side
        // int length = 0;
        
        // for(int i=index-1;i>=0;i--)
        // {
        //     if(str.charAt(i)==ch){
        //         length= str.length()-1;
        //         break;
        //     }
        // }

        // //right side---
        // for(int i=index+1;i<str.length();i++)
        // {
        //     if(str.charAt(i)==ch){
        //         length= str.length()-1;
        //         break;
        //     }

        // }
        // System.out.println(length);

      



       

   

      





    }
}