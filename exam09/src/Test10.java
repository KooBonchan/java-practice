import java.util.Scanner;

public class Test10 {
  static int min(int a, int b, int c){
    int min = a;
    if(b < min) min = b;
    if(c < min) min = c;
    return min;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Integer a: ");int a = scanner.nextInt();
    System.out.print("Integer b: ");int b = scanner.nextInt();
    System.out.print("Integer c: ");int c = scanner.nextInt();

    System.out.println("Minimum: " + min(a,b,c));

  }
}
