import java.util.Scanner;

public class Test06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Pyramid size: ");int n = sc.nextInt();

    for(int i = 0; i < n; i++){
      for (int j = i; j < n-1; j++){
        System.out.print(" ");
      }
      for (int j = 0; j < 2 * i + 1; j++){
        System.out.print((i+1)%10);
      }
      System.out.println();
    }
  }
}