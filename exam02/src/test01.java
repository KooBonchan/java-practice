/* read 2 double, print bigger one */

import java.util.Scanner;

public class test01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Real a: "); double a = sc.nextDouble();
    System.out.println("Real b: "); double b = sc.nextDouble();

    System.out.println("Max value is " + (Math.max(a, b)));
  }
}
