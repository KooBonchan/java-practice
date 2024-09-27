import java.util.Scanner;

public class Test07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Standard weight per height(kg, cm)");
    System.out.print("Min height: ");int hmin = sc.nextInt();
    System.out.print("Max height: ");int hmax = sc.nextInt();
    System.out.print("Gap: ");int hgap = sc.nextInt();
    for(int i = hmin; i <= hmax; i+=hgap){
      System.out.printf("%d\t%.1f\n", i, (i-100)*0.9);
    }


  }
}
