import java.util.Scanner;

public class Test03 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Integer a: ");int a = scanner.nextInt();
    System.out.print("Integer b: ");int b = scanner.nextInt();
    System.out.print("Integer c: ");int c = scanner.nextInt();

    System.out.println("Median: " + med(a,b,c));
  }

  static int med(int a, int b, int c){
    if(a > b){
      if(b > c) return b;
      else if(a < c) return a;
      else return c;
    } else if (a > c) {
      return a;
    } else {
      if(b < c) return b;
      else return c;
    }
  }
}
