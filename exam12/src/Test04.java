import java.util.Scanner;

public class Test04 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("# of elem: "); int n = scanner.nextInt();

    ArrayControl arrayControl = new ArrayControl(n);
    arrayControl.print();

    System.out.println();
    System.out.print("index to insert: "); int idx = scanner.nextInt();
    System.out.print("inserting value: "); int m = scanner.nextInt();
    int[] result = arrayControl.insertAt(idx, m);
    (new ArrayControl(result)).print();
  }
}
