import java.util.Scanner;

public class Test02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x;

    do {
      System.out.println("3-digit integer value: ");
      x = sc.nextInt();
    }while (x < 100 || x > 999);
    System.out.println("Correct: " + x);
  }
}
