//input: 2 int
//inner process:
// if b > a, swap b and a
//output: sorted numbers, descending order


import java.util.Scanner;

public class Test07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Number a: ");int a = sc.nextInt();
    System.out.println("Number b: ");int b = sc.nextInt();

    if(b > a){
      int t = a;
      a = b;
      b = t;
    }
    System.out.println("Now sorted");
    System.out.println("Number a: " + a);
    System.out.println("Number b: " + b);
  }
}
