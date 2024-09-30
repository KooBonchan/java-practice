import java.util.Scanner;

public class Test10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long sum = 0;
    int count = 0;
    System.out.println("Nonnegative integer, q to quit");

    while(true){
      String input = sc.nextLine();

      if (input.equalsIgnoreCase("q")) {
        System.out.println("Quitting the program.");
        break;
      }

      try {
        int n = Integer.parseInt(input);
        if(n < 0){
          System.out.println("Nonnegative required");
          continue;
        }
        sum += n;
        count++;
      }
      catch(NumberFormatException e){
        System.out.println("Press Q+Enter to escape");
      }
    }
    if(count == 0){
      System.out.println("Zero Division");
      return;
    }
    System.out.printf("Sum: %d Avg: %.02f", sum, sum / (float)count);
  }
}
