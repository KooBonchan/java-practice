import java.util.Scanner;

public class Test08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long sum = 0;

    while(true){
      String input = sc.nextLine();

      if (input.equalsIgnoreCase("q")) {
        System.out.println("Quitting the program.");
        break;
      }

      try {
        int n = Integer.parseInt(input);
        sum += n;
      }
      catch(NumberFormatException e){
        System.out.println("Press Q+Enter to escape");
      }
    }
    System.out.println("Sum: "+ sum);
  }
}
