import java.util.Scanner;

public class Test01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(true){
      System.out.println("Integer input, Q/q to end");
      String input = sc.nextLine();
      if(input.equalsIgnoreCase("q")){
        System.out.println("Ending program");
        break;
      }
      try{
        int n = Integer.parseInt(input);

      }catch (NumberFormatException e){
        System.out.println("Not a number, retry");
      }
    }
  }
  private void sign(int n){
    if(n > 0) {
      System.out.println("Positive");
    } else if (n < 0){
      System.out.println("Negative");
    }
    else{
      System.out.println("Zero");
    }
  }
}
