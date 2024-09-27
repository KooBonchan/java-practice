import java.util.Scanner;

// A divide by B, reminder 0
public class Test03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Int A: "); int a = sc.nextInt();
    System.out.println("Int B: "); int b = sc.nextInt();

    if(a % b == 0){
      System.out.println("B는 A의 약수입니다.");
    }
    else{
      System.out.println("B는 A의 약수가 아닙니다.");
    }
  }
}
