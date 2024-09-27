import java.util.Scanner;

public class Test03 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    do{
      System.out.println("Countdown from: ");
      n = sc.nextInt();
    }while(n <= 0);

    for(;n>=0;n--){
      System.out.println(n);
    }
  }
}
