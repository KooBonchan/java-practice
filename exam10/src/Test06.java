import java.util.Random;
import java.util.Scanner;

public class Test06 {
  static Random random;

  static int randInt(int lb, int ub){
    return random.nextInt(lb, ub + 1);

  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    random = new Random();
    System.out.print("Lowerbound: ");int lb = scanner.nextInt();
    System.out.print("Upperbound: ");int ub = scanner.nextInt();

    System.out.println("This time random: " + randInt(lb, ub));
  }
}
