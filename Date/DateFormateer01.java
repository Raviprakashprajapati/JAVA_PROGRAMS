import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormateer01 {
public static void main(String[] args) {
    
    LocalDateTime a = LocalDateTime.now();
    System.out.println(a);

    DateTimeFormatter df = DateTimeFormatter.ISO_LOCAL_DATE;
    DateTimeFormatter df2 = DateTimeFormatter.ofPattern("yyyy-MM-dd -- HH:mm:ss");
    
    String myDate  = a.format(df2);
    System.out.println(myDate);

}    
}
