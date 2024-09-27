import java.util.Scanner;

public class Test05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    do{
      System.out.println("Countdown from: ");
      n = sc.nextInt();
    }while(n <= 0);

    System.out.println(n * (n+1) / 2);
  }
}
