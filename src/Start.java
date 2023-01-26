import java.time.LocalDateTime;
import java.time.Month;

public class Start {
    public static void main(String[] args) {
  int dayOfYear = LocalDateTime.now().getDayOfYear();
  System.out.print(dayOfYear + "/");
  Month monthName = LocalDateTime.now().getMonth();
  System.out.print(monthName + "/");
  String stringYear = String.valueOf(LocalDateTime.now().getYear());
  System.out.print(stringYear.substring(2) + "   ");
  int hour = LocalDateTime.now().getHour();
  System.out.print(hour + ":");
  int minute = LocalDateTime.now().getMinute();
  System.out.print(minute);
    }
}
