import java.util.Scanner;

public class Test05 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Real Value: ");
    double x = scanner.nextDouble();

    System.out.println("Absolute  : " + Math.abs(x));
    System.out.println("SquareRoot: " + Math.sqrt(x));
    System.out.println("CircleArea: " + Math.PI * x * x);

  }
}
