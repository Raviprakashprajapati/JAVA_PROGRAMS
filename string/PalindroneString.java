public class PalindroneString {
    public static void main(String[] arg)
    {
        String str = "taba";
        String s = "";
        for(int i=str.length()-1;i>=0;i--)
        {
            s+=str.charAt(i);

        }
        System.out.println(str.equals(s));

    }
}
