//input: 3 int
//output: min value

import java.util.Scanner;

public class Test04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Number a: ");int a = sc.nextInt();
    System.out.println("Number b: ");int b = sc.nextInt();
    System.out.println("Number c: ");int c = sc.nextInt();

    System.out.println("Min value: " + Math.min(a, Math.min(b, c)));
  }
}
