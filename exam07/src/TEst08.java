import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class TEst08 {
  public static void main(String[] args) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int n;
    do{
      System.out.print("Positive Integer(max:1023): ");
      n = scanner.nextInt();
    }while(n <= 0 || n >= 1<<10);

    int[] arr = new int[n];
    for(int i = 0; i < arr.length; i++){
      arr[i] = random.nextInt(1,10);
    }

    for(int i = 0; i < 10; i++){
      for(int j = 0; j < n; j++){
        System.out.print((arr[j] >= 10 - i) ? '*' : ' ');
      }
      System.out.println();
    }
    for(int i = 0; i < n; i++) System.out.print('-');
    System.out.println();
    for(int i = 0; i < n; i++) System.out.print(i%10);
    System.out.println();
  }
}
