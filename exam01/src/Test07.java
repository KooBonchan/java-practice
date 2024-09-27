import java.util.Scanner;

//Reminder by quotient 5
public class Test07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Var n: "); int n = sc.nextInt();
    if (n < 0 ){
      System.out.println("Negative value");
    }
    else{
      if(n % 5 == 0){
        System.out.println("Div By 5");
      }
      else{
        System.out.println("Cannot Div By 5");
      }
    }
  }
}
