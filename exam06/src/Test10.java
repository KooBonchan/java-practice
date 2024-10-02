// same with test8, implement by typecast

import java.util.Scanner;

public class Test10 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int sum = 0;
    System.out.println("3 numbers");
    for(int i = 0; i < 3; i++){
      System.out.print("Number: ");
      sum += scanner.nextInt();
    }
    System.out.println("Sum: " + sum);
    System.out.println("Avg: " + ((double)sum / 3));
  }
}
