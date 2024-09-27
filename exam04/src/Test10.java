import java.util.Scanner;

public class Test10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    do{
      System.out.print("number: ");
      n = sc.nextInt();
    }while(n <= 0);

    int count = 0;
    for(int i = 1; i <= n; i++){
      if(n % i == 0){
        System.out.printf("%d ", i);
        count++;
      }
    }
    System.out.println();
    System.out.println("# of factors: " + count);
  }
}
