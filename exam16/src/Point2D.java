import java.util.Calendar;
import java.util.GregorianCalendar;

public class Point2D {
  private static int day;
  private int x;
  private int y;

  private static int counter = 0;

  static{
    GregorianCalendar gregorianCalendar = new GregorianCalendar();
    day = gregorianCalendar.get(Calendar.DATE);
  }

  public Point2D(int x, int y) {
    this.x = x;
    this.y = y;

    counter++;
    if(counter == day){
      System.out.println("Congrats");
    }
  }

  public Point2D(int x) {
    this(x,0);
  }
  public Point2D(){
    this(0,0);
  }

  public static int getCounter() {
    return counter;
  }

  @Override
  public String toString() {
    return "Point2D{" +
      "x=" + x +
      ", y=" + y +
      '}';
  }
}
