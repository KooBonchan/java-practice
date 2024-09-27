import java.util.Scanner;

public class Test10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Positive Int: ");int x = sc.nextInt();
    int count = 0;
    while(x > 0){
      count++;
      x /= 10;
    }
    System.out.println("# of digit: "+count);
  }
}
