import java.util.Scanner;

public class Test01 {
  static int sum(int n){
    return n * (n + 1 ) / 2;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Sum 1 to x || x should be positive number");
    int x;
    do{
      System.out.print("X : ");
      x = scanner.nextInt();
    }while(x < 0);
    System.out.printf("Sum is: %d\n", sum(x));
  }

}
