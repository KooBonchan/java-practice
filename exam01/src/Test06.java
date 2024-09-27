import java.util.Scanner;

//Comparison
public class Test06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Var A: "); int a = sc.nextInt();
    System.out.println("Var B: "); int b = sc.nextInt();
    if( a >b ) {
      System.out.println("A > B");
    }
    else if (a < b){
      System.out.println("A < B");
    }
    else{
      System.out.println("A == B");
    }
  }
}
