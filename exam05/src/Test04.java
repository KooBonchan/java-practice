import java.util.Scanner;

public class Test04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Star size: ");int n = sc.nextInt();

    for(int i = 0; i < n; i++){
      for (int j = 0; j <= i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println();
    for(int i = 0; i < n; i++){
      for (int j = n; j >i; j--){
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println();
    for(int i = 0; i < n; i++){
      for (int j = 0; j < n; j++){
        if(i < j){
          System.out.print(" ");
        }
        else{
          System.out.print("*");
        }
      }
      System.out.println();
    }
    System.out.println();
    for(int i = 0; i < n; i++){
      for (int j = 0; j < n; j++){
        if(i + j < n-1){
          System.out.print(" ");
        }
        else{
          System.out.print("*");
        }
      }
      System.out.println();
    }
    System.out.println();
  }
}
