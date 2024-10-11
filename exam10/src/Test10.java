import java.util.Scanner;

public class Test10 {

  static int rotate(int x, int n, boolean directionLeft){
    if(n == 0) return x;
    if(n < 0){
      n = -n;
      directionLeft = !directionLeft;
    }
    if(directionLeft){
      n = 32 - n;
    }

    return (x << n) | (x >>> (32-n));
    //Bitwise operation is quite neat!
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Rotate int x to n");
    System.out.print("int x:"); int x = scanner.nextInt();
    System.out.print("int n:"); int n = scanner.nextInt();


    System.out.println("Before rotation : " +
      String.format("%32s",Integer.toBinaryString(x))
        .replace(' ', '0'));
    System.out.println("Left rotation   : " +
      String.format("%32s",Integer.toBinaryString(rotate(x,n,true)))
        .replace(' ', '0'));
    System.out.println("Right rotation : " +
      String.format("%32s",Integer.toBinaryString(rotate(x,n,false)))
        .replace(' ', '0'));
  }
}
