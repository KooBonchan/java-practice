import java.util.Scanner;

public class Test04 {
  static String seasonOf(int n){
    return
      switch (n) {
        case 3, 4, 5 -> "Spring";
        case 6, 7, 8 -> "Summer";
        case 9, 10, 11 -> "Autumn";
        case 12, 1, 2 -> "Winter";
        default -> null;
      };
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int month;
    do {
      System.out.print("Month: ");
      month = scanner.nextInt();
    } while (month <= 0 || month > 12);
    System.out.println("Season is: " + seasonOf(month));
  }
}
