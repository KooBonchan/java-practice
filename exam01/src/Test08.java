import java.util.Scanner;

//Reminder by 10
public class Test08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Var n: "); int n = sc.nextInt();
    if (n < 0 ){
      System.out.println("Negative value");
    }
    else{
      if(n % 10 == 0){
        System.out.println("Div By 10");
      }
      else{
        System.out.println("Cannot Div By 10");
      }
    }
  }
}
