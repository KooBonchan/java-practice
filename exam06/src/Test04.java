import java.util.Scanner;

public class Test04 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Decimal int: ");int n = scanner.nextInt();
    System.out.printf("in octal      : %3o\n", n);
    System.out.printf("in hexadecimal: %3X\n", n);

  }
}
