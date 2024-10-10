import java.util.Scanner;

public class Test07 {
  static int reverseInt(int n){
    int acc = 0;
    while(n > 0){
      acc *= 10;
      acc += n % 10;
      n /= 10;
    }
    return acc;
  }

  static int readPositive(){
    Scanner scanner = new Scanner(System.in);
    int n;
    do{
      System.out.print("Positive integer: ");
      n = scanner.nextInt();
    }while(n <= 0);
    return n;
  }

  public static void main(String[] args) {
    int result = reverseInt(readPositive());
    System.out.println("I reversed your input: " + result);
  }
}
