import java.util.InputMismatchException;
import java.util.Scanner;

public class Test05 {
  public static void main(String[] args) {
    int[][] a = new int[4][3], b = new int[3][4];
    Scanner scanner = new Scanner(System.in);
    System.out.println("Matrix A");
    for(int i = 0; i < 4; i++){
      for(int j = 0; j < 3; j++){
        System.out.printf("A[%d][%d]: ", i, j);
        a[i][j] = scanner.nextInt();
      }
    }
    System.out.println("Matrix B");
    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 4; j++){
        System.out.printf("B[%d][%d]: ", i, j);
        b[i][j] = scanner.nextInt();
      }
    }

    int[][] result = matrixMulti(a, b);
    System.out.println("Matrix Multiplication");
    for(int i = 0; i < result.length; i++){
      for(int elem : result[i]){
        System.out.print(elem + "\t");
      }
      System.out.println();
    }
  }

  static int[][] matrixMulti(int[][] a, int[][] b) throws InputMismatchException {
    if(a.length == 0 || a[0].length == 0 ||
       b.length == 0 || b[0].length == 0){
      throw new InputMismatchException("No size 0 ");
    }
    if(a[0].length != b.length){
      throw new InputMismatchException("A, B not multiplicable");
    }
    int[][] result = new int[a.length][b[0].length];

    for(int i = 0; i < result.length; i++){
      for(int j = 0; j < result[0].length; j++){
        for(int k = 0; k < b.length; k++){
          result[i][j] += a[i][k] * b[k][j];
        }
      }
    }

    return result;
  }
}
