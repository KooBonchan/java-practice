import java.util.Scanner;

public class Test04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Bound a:");;int a = sc.nextInt();
    System.out.println("Bound b:");;int b = sc.nextInt();

    if (a > b){
      int t = a;
      a = b;
      b = t;
    }
    a++;
    while(a < b){
      System.out.println(a++);
    }
  }
}
