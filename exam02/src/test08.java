//input: 3 int
//inner process: sort by ascending order
//output: sorted numbers, ascending order
import java.util.Scanner;

public class test08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Number a: ");int a = sc.nextInt();
    System.out.println("Number b: ");int b = sc.nextInt();
    System.out.println("Number c: ");int c = sc.nextInt();

    if(c < b){
      int t = b;
      b = c;
      c = t;
    }
    if(b < a){
      int t = a;
      a = b;
      b = t;
    }
    if(c < b){
      int t = b;
      b = c;
      c = t;
    }

    System.out.println("Now sorted");
    System.out.println("Number a: " + a);
    System.out.println("Number b: " + b);
    System.out.println("Number c: " + c);
  }
}
