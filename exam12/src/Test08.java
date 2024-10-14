import java.util.Scanner;

public class Test08 {
  static int abs(int x){
    return x > 0 ? x : -x;
  }
  static long abs(long x){
    return x > 0 ? x : -x;
  }
  static float abs(float x){
    return x > 0 ? x : -x;
  }
  static double abs(double x){
    return x > 0 ? x : -x;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Variable a of Integer: ");int a = scanner.nextInt();
    System.out.print("Variable b of Long   : ");long b = scanner.nextLong();
    System.out.print("Variable c of Float  : ");float c = scanner.nextFloat();
    System.out.print("Variable d of Double : ");double d = scanner.nextDouble();

    System.out.printf("abs(a): %10d\n", a);
    System.out.printf("abs(b): %10d\n", b);
    System.out.printf("abs(c): %10.5f\n", c);
    System.out.printf("abs(d): %10.5f\n", d);
  }

}
