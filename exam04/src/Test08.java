import java.util.Scanner;

public class Test08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    do{
      System.out.print("# of stars: ");
      n = sc.nextInt();
    }while(n <= 0);

    for(int i = 0; i < n; i++){
      System.out.print("*");
      if(i % 5 == 4){
        System.out.println();
      }
    }
  }
}
