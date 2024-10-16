import java.util.Random;
import java.util.Scanner;

public class Test03 {
  public static void main(String[] args) {
    Random random = new Random();

    Day day1 = new Day(random.nextInt(1000,3000),
                       random.nextInt(1,12),
                       random.nextInt(1,31));

    System.out.println(day1);
    Day day2 = day1.clone();
    day2.setYear(3033);
    System.out.println(day2);
    Day day3 = new Day(day1);
    day3.setMonth(1);
    System.out.println(day3);

  }
}
