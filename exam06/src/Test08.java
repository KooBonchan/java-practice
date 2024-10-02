import java.util.Scanner;

// 3 int, avg as double, sum as int
public class Test08 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int sum = 0;
    System.out.println("3 numbers");
    for(int i = 0; i < 3; i++){
      System.out.print("Number: ");
      sum += scanner.nextInt();
    }
    System.out.println("Sum: " + sum);
    System.out.println("Avg: " + (sum / 3.0));
  }
}
