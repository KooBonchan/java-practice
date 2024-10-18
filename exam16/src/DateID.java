import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateID {
  static long nextId;
  long id;

  static{
    GregorianCalendar today = new GregorianCalendar();
    int year = today.get(Calendar.YEAR);
    int month = today.get(Calendar.MONTH);
    int date = today.get(Calendar.DATE);
    System.out.printf("Today: %4d / %2d / %2d\n", year, month, date);

    nextId = year * 1000000L + month*100000 + date * 1000 + 1;
  }

  public DateID(){
    id = nextId++;
  }

  public long getId(){
    return id;
  }
}

