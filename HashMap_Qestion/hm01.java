import java.util.HashMap;

public class hm01 {

    // two string same in charactar
    static HashMap<Character,Integer> count(String str){
         HashMap <Character,Integer> hh = new HashMap<>(); 
        for(int i = 0;i<str.length();i++){


                if(hh.containsKey(str.charAt(i)))
                {
                    int value = hh.get(str.charAt(i));
                    value++;
                    hh.put(str.charAt(i),value );
                }else{
                    hh.put(str.charAt(i), 1);
                }
            }
            return hh;

    }

    //isomorphic--
    static  boolean isomorphic(String str,String t){

        if(str.length()!=t.length()) return false;

         HashMap<Character,Character> hh = new HashMap<>();
         String temp = "";
            int index= 0 ;
         for(int i=0;i<str.length();i++){

            if(!hh.containsKey(str.charAt(i)))
            {
                
                if(hh.containsValue(t.charAt(index))){
                        continue;
                }
                
                hh.put(str.charAt(i),t.charAt(index++));
                continue;
            }
            index++;
         }

         

         for(int i = 0;i<str.length();i++)
         {
            
                char c = str.charAt(i);
                if(hh.containsKey(c))
                {
                    temp+=hh.get(c);

                }
         }
      
         if(temp.equals(t))
         {
            return true;
         }
         return false;
      
      
    }

    

    public static void main(String[] args) {

        String str = "badc";
        String t = "baba";
        boolean result = isomorphic(str,t);
        System.out.println(result);
        //b-b
        //a-a
        //d-








        // 01---
        // String str = "silent";
        // String str2 = "listen";

        // if (str.length() == str2.length()) {
        //     HashMap <Character,Integer> hh = count(str);
        //     HashMap <Character,Integer> h2 = count(str2);

        //     System.out.println(hh.equals(h2));
        // }


    }
}
