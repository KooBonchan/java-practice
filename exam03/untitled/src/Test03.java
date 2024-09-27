import java.util.Random;
import java.util.Scanner;

public class Test03 {
  public static void main(String[] args) {
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    int target = rand.nextInt(10,99);
    while(true){
      System.out.print("2-digit integer: ");
      int x = sc.nextInt();
      if (x < 10 || x > 99){
        System.out.println("Wrong input");
        continue;
      }
      if (x == target){
        break;
      }
      System.out.println("Retry");
    }
    System.out.println("You've done");
  }
}
