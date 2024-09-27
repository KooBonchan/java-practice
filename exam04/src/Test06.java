import java.util.Scanner;

public class Test06 {
  public static void main(String[] args) {
    //add to n, showing the equation

    Scanner sc = new Scanner(System.in);
    int n;
    do{
      System.out.print("Countdown from (max 2-digit): ");
      n = sc.nextInt();
    }while(n <= 0 || n > 99);

    for(int i = 1; i < n; i++){
      System.out.printf("%02d + ", i);
      if(i % 10 == 0){
        System.out.println();
      }

    }
    System.out.println(n + " = " + (n * (n+1) / 2));
  }
}
