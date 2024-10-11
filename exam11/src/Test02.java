import java.util.Random;
import java.util.Scanner;

public class Test02 {
  static int set(int x, int pos, int n){
    return x | maskTo1(pos, n);
  }
  static int reset(int x, int pos, int n){
    return x & ~maskTo1(pos, n);
  }
  static int inverse(int x, int pos, int n){
    return x ^ maskTo1(pos, n);
  }

  static int maskTo1(int pos, int n){
    return ~(~0 << n) << pos;
  }

  static String toByteStringWith0(int num){
    return String.format("%32s", Integer.toBinaryString(num)).replace(' ', '0');
  }

  public static void main(String[] args) {
    Random random = new Random();
    int x = random.nextInt(1<<30,Integer.MAX_VALUE);
    int index = random.nextInt(5,10);
    int n = random.nextInt(3,32-index);

    System.out.printf("x     : %d\n", x);
    System.out.printf("index : %d\n", index);
    System.out.printf("n     : %d\n", n);
    System.out.println("-----------------");
    System.out.println("        x  : " + toByteStringWith0(x));
    System.out.println("    set(x) : " + toByteStringWith0(    set(x,index,n)));
    System.out.println("  reset(x) : " + toByteStringWith0(  reset(x,index,n)));
    System.out.println("inverse(x) : " + toByteStringWith0(inverse(x,index,n)));


  }
}