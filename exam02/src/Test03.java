//input: 2 int by system
//output: check if diff over 10

import java.util.Scanner;

public class Test03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Number a: ");int a = sc.nextInt();
    System.out.println("Number b: ");int b = sc.nextInt();

    if(Math.abs(a-b) > 10){
      System.out.println("Diff over 10");
    }
    else{
      System.out.println("Diff less or equal to 10");
    }

  }
}
