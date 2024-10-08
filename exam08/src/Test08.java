import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test08 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("# of elem: ");
    int n = scanner.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
      System.out.printf("Array [%d]: ", i);
      arr[i] = scanner.nextInt();
    }

    System.out.println("Shuffling array...");
    Random random = new Random();
    for(int i = 0; i < n; i++){
      int next = random.nextInt(i,n);
      if(next != i){
        int temp = arr[next];
        arr[next] = arr[i];
        arr[i] = temp;
      }
    }
    System.out.println(Arrays.toString(arr));
  }
}
