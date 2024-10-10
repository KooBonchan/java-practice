import java.util.Scanner;

public class Test09 {

  static int signOf(int n){
    if(n < 0) return -1;
    else if(n == 0) return 0;
    else return 1;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Integer x: ");int x = scanner.nextInt();

    System.out.println("Sign of x: " + signOf(x));
  }
}
