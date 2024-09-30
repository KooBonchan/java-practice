import java.util.Scanner;

public class Test09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long sum = 0;
    int count = 0;

    while(true){
      String input = sc.nextLine();

      if (input.equalsIgnoreCase("q")) {
        System.out.println("Quitting the program.");
        break;
      }

      try {
        int n = Integer.parseInt(input);
        sum += n;
        if(sum > 1000){
          sum -= n;
          System.out.println("Sum exceeds 1000: ignoring last input");
          break;
        }
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
