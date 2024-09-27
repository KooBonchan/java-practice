import java.util.Scanner;

// Factorial n

public class test01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    do{
      System.out.print("Positive int: ");
      n = sc.nextInt();
    }while(n<=0);

    long facto = 1;
    while(n>1){
      facto *= n--;
    }
    System.out.println("Factorial: " + facto);
  }
}
