// decrease x, check x for every loop

import java.util.Scanner;

public class Test08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Number of star: ");
    int x = sc.nextInt();
    int i = 0;
    while(i++ < x){
      System.out.print('*');
    }
    if(x > 0){
      System.out.println();
    }
  }
}
