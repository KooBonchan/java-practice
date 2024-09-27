import java.util.Scanner;

//check sign of int
public class Test05 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Int n: "); int n = sc.nextInt();

    if (n > 0){
      System.out.println("+");
    }
    else if (n < 0){
      System.out.println("-");
    }
    else{
      System.out.println(0);
    }
  }
}
