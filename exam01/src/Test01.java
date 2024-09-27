import java.util.Scanner;

//Negative Value
public class Test01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("정수값: ");
    int n = sc.nextInt();

    if(n < 0) {
      System.out.println("Negative");
    }
  }
}
