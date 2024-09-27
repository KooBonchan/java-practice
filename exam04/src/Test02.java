import java.util.Scanner;

public class Test02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("# of star: ");
    int n = sc.nextInt();

    if(n > 0){
      for(int i = 0; i < n; i++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
