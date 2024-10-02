import java.util.Random;
import java.util.Scanner;


public class Test02 {
  static int inputLimit = 10;
  public static void main(String[] args) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int target = random.nextInt(0,99);

    for(int i = 0; i < inputLimit; i++){
      System.out.printf("You have %d life(s)\n", inputLimit - i);
      System.out.print("Try: ");int n = scanner.nextInt();
      if(n < 0 || n > 99){
        System.out.println("Range: 0 to 99");
        continue;
      }
      if(n == target){
        System.out.println("Success");
      }
    }
    System.out.printf("Failure: Target was (%d)\n",target);
  }
}
