import java.util.Arrays;
import java.util.Scanner;

public class Test09 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("# of elem: ");
    int n = scanner.nextInt();
    int[] arr = new int[n], barr = new int[n];
    for(int i = 0; i < n; i++){
      System.out.printf("Array [%d]: ", i);
      arr[i] = scanner.nextInt();
    }

//----------------------------------------
    for(int i = 0; i < n; i++){
      barr[i] = arr[n-1-i];
    }
//    --------------------------------------

    System.out.println(Arrays.toString(barr));
  }
}
