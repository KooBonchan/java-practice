import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test06 {
  public static void main(String[] args) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    System.out.print("# of elem: ");int n = scanner.nextInt();

    int[] rand = new int[n];
    int temp = -1;
    for(int i = 0; i < n; i++){
      int c;
      while(temp == (c = random.nextInt(1,11)));
      rand[i] = c;
      temp = c;
    }

    System.out.println(Arrays.toString(rand));
  }
}
