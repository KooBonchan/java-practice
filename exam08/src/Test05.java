import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test05 {
  public static void main(String[] args) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    System.out.print("# of elem: ");int n = scanner.nextInt();

    int[] rand = new int[n];
    for(int i = 0; i < n; i++){
      rand[i] = random.nextInt(1,11);
    }

    System.out.println(Arrays.toString(rand));

  }
}
