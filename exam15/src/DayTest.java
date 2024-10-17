public class DayTest {
  public static void main(String[] args) {
    Day day = new Day();
    Day target = new Day(1999, 1, 1);

    System.out.println(day);
    System.out.println(day.dayOfYear());
    System.out.println(target);
    System.out.println(target.dayDiff(day));
  }
}
