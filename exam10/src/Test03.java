import java.util.Scanner;

public class Test03 {
  private enum Season{
    Spring,
    Summer,
    Autumn,
    Winter;
    static boolean validate(int n){
      return n > 0 && n <= 12;
    }
    static Season toSeason(int month){
      return switch (month) {
        case 3, 4, 5 -> Spring;
        case 6, 7, 8 -> Summer;
        case 9, 10, 11 -> Autumn;
        case 12, 1, 2 -> Winter;
        default -> null;
      };
    }
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int month;
    do {
      System.out.print("Month: ");
      month = scanner.nextInt();
    } while (!Season.validate(month));
    System.out.println("Season is: " + Season.toSeason(month));
  }
}
