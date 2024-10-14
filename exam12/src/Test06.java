import java.util.Random;
import java.util.Scanner;

public class Test06 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("# of rows: "); int row = scanner.nextInt();
    System.out.print("# of columns: "); int col = scanner.nextInt();

    Matrix now = new Matrix(row, col);
    System.out.println("Matrix A");
    now.print();

    System.out.println("Copy of Matrix A");
    now.deepcopy().print();
  }
}
