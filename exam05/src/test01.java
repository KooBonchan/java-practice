import java.util.Scanner;

public class test01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Positive n: ");int n = sc.nextInt();

    for(int i = 1; i <= n; i++){
      System.out.println("square: " + (i * i));
    }
  }

}
