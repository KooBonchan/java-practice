import java.util.Scanner;

public class Test07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    do{
      System.out.println("PositiveInteger: ");n = sc.nextInt();
    }while(n<=0);
    if(n == 1){
      System.out.println("Not Prime Number");
    }
    int bound = (int)Math.floor(Math.sqrt(n));
    int count = 1;
    for(int i = 2; i <= bound; i++){
      if(n % i == 0){
        count++;
      }
    }
    if(count == 1){
      System.out.println("Prime Number");
    }
    else{
      System.out.println("Not Prime Number");
    }
  }
}