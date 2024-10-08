import java.util.Random;
import java.util.Scanner;

public class Test10 {
  public static void main(String[] args) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    String[] month = {
      "January", "February", "March",
      "April"  , "May"     , "June",
      "July"   , "August"  , "September",
      "October", "November", "December",
    };

    int last = -1;
    System.out.println("Month and word");
    System.out.println("Enter Q to quit");
    while(true){
      int next;
      while(last == (next = random.nextInt(13)));

      while(true){
        System.out.printf("Month %d: ", next + 1);
        String line = scanner.nextLine();
        if(line.equalsIgnoreCase("q")){
          System.out.println("Halting program...");
          return;
        }
        if(line.equalsIgnoreCase(month[next])){
          break;
        }
        System.out.println("Retry");
      }
      System.out.println("Correct, go next");

      last = next;
    }
  }
}
