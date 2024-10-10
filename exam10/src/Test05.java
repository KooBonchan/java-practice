import java.util.Scanner;

public class Test05 {
  static void putChars(char c, int n){
    System.out.print(String.valueOf(c).repeat(n));
  }
  static void putStars(int n){
    putChars('*', n);
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Size: ");int n = scanner.nextInt();

    for(int i = 1; i <= n; i++){
      putStars(i);
      System.out.println();
    }
  }
}
