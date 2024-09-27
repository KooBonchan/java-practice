// decrease x, check x for every loop

import java.util.Scanner;

public class Test05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x;
    do{
      System.out.println("Positive Integer");
      x = sc.nextInt();
    }while(x <= 0);

    while(x>=0){
      System.out.println(x--);
      //System.out.println(--x);
    }

  }
}
