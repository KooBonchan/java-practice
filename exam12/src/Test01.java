import java.util.Random;
import java.util.Scanner;

public class Test01 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("# of elem: "); int n = scanner.nextInt();

    ArrayControl arrayControl = new ArrayControl(n);
    arrayControl.print();

    System.out.println();
    System.out.print("value to find: "); int idx = scanner.nextInt();
    int[] result = arrayControl.searchIndex(idx);
    (new ArrayControl(result)).print();



  }
}
