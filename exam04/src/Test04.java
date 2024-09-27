import java.util.Scanner;

// count up
public class Test04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    do{
      System.out.println("Countdown from: ");
      n = sc.nextInt();
    }while(n <= 0);

    for(int i = 0; i < n; i++){
      System.out.println(i);
    }
  }
}
