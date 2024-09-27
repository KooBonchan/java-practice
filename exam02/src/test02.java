//
//input : 2 int value by system
//output : diff btw 2 values
//test : (1, 2 -> 1), (3, 1 -> 2)


import java.util.Scanner;

public class test02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Number a: ");int a = sc.nextInt();
    System.out.println("Number b: ");int b = sc.nextInt();

    System.out.println("Diff is: " + Math.abs(a-b));
  }
}
