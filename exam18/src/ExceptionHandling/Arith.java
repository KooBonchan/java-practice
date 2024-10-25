package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Arith {
  static void basicTryCatchWithArithIO(){
    Scanner scanner = new Scanner(System.in);

    try{
      System.out.print("x: ");int x = scanner.nextInt();
      System.out.print("y: ");int y = scanner.nextInt();
      System.out.println("x * y = " + x * y);
      System.out.println("x / y = " + x / y);
    } catch (InputMismatchException e){
      System.out.println("Integer input required");
    } catch (ArithmeticException e) {
      System.out.println("Zero Division");
    }
  }

  static void check(int sw) throws Exception{
    // checked error should be handled somehow at compile time
    // runtime error have not to deal with in a code.
    switch(sw) {
      case 1: throw new Exception("Checked Error");
      case 2: throw new RuntimeException("Unchecked Error");
    }
    // throwable can chain
  }


  public static void main(String[] args) {
    Random random = new Random();
//    basicTryCatchWithArithIO();

    try{
      check(random.nextInt(1,4));
    } catch (RuntimeException e) {
      System.out.println("Runtime Exception");
    } catch (Exception e) {
      System.out.println("Should be somehow handled by self or ancestral");
    }

  }
}
