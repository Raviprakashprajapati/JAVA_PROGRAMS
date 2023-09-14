import java.util.Calendar;

public class calendar01 {
    public static void main(String[] args) {
        
        Calendar a= Calendar.getInstance();
        System.out.println(a.getTime());
        System.out.println(a.getWeekYear());
        System.out.println(a.get(Calendar.HOUR)+": " + a.get(Calendar.MINUTE)+": " + a.get(Calendar.SECOND));

    }
    
}
