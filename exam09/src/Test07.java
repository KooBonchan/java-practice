import java.util.Random;
import java.util.Scanner;

public class Test07 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Non-regular 2d array");
    System.out.print("# of Rows: ");
    int row = scanner.nextInt();

    int[][] board = new int[row][];

    for(int i = 0; i < row; i++){
      System.out.print(String.format("# of Cells in row[%d]: ",i));
      int col = scanner.nextInt();
      board[i] = new int[col];
    }

    Random random = new Random();
    System.out.println("Random board");
    for(int i = 0; i < row; i++){
      for(int j = 0; j < board[i].length; j++){
        board[i][j] = random.nextInt(100);
      }
    }

    for(int i = 0; i < row; i++){
      for(int j = 0; j < board[i].length; j++){
        System.out.printf("%02d ", board[i][j]);
      }
      System.out.println();
    }




  }
}
