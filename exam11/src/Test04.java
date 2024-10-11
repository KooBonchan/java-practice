import java.util.Random;
import java.util.Scanner;


// just accumulated from test03
public class Test04 {
  static int sumOf(int[] target){
    int acc = 0;
    for(int t : target) acc += t;
    return acc;
  }

  static int minOf(int[] target){
    int min = Integer.MAX_VALUE;
    for(int t : target){
      if(min > t) min = t;
    }
    return min;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    System.out.print("# of elements: ");int n = scanner.nextInt();
    if(n <= 0){
      System.out.println("Array too short");
      System.out.println("Halting program...");
      return;
    }
    int[] arr = new int [n];

    for(int i = 0 ; i < n; i++){
      arr[i] = random.nextInt(-200, 200);
      System.out.printf("arr[%d] : %d\n", i, arr[i]);
    }
    System.out.println("Sum: " + sumOf(arr));
    System.out.println("Min: " + minOf(arr));
  }
}
