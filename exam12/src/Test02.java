import java.util.Scanner;

public class Test02 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("# of elem: "); int n = scanner.nextInt();

    ArrayControl arrayControl = new ArrayControl(n);
    arrayControl.print();

    System.out.println();
    System.out.print("index to delete: "); int idx = scanner.nextInt();
    int[] result = arrayControl.removedIndexArray(idx);
    (new ArrayControl(result)).print();
  }
}
