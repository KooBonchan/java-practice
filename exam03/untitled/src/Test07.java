import java.util.Scanner;

public class Test07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Number of star: ");
    int x = sc.nextInt();
    int i = 0;
    while(i < x){
      if(i%2==0){
        System.out.print('*');
      }else{
        System.out.print('+');
      }
      i ++;
    }
    if(x > 0){
      System.out.println();
    }
  }
}
