import java.util.Scanner;

// input: 3 input
// output: median among 3 inputs
public class Test05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Number a: ");int a = sc.nextInt();
    System.out.println("Number b: ");int b = sc.nextInt();
    System.out.println("Number c: ");int c = sc.nextInt();

    int max = Math.max(a, Math.max(b,c));
    int min = Math.min(a, Math.min(b,c));

    System.out.println("Med value: " + (a + b + c - max - min));
  }

}
