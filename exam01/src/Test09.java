import java.util.Scanner;

//Reminder by 3, each diff string output
public class Test09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Var n : "); int n = sc.nextInt();

    if( n <= 0){
      System.out.println("Not Positive Number");
    }
    else{
      if(n%3 == 0){
        System.out.println("Reminder 0");
      }
      else if(n%3 == 1){
        System.out.println("Reminder 1");
      }
      else{
        System.out.println("Reminder 2");
      }
    }
  }
}
