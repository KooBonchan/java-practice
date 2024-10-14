import java.util.Scanner;

public class Test09 {
  static void printBits(byte x){
    for(int i = Byte.SIZE - 1; i >= 0; i--){
      System.out.print((x >> i & 1)  == 1? '1' : '0');
    }
    // logical shift should be more logical
    // though, since we just mask only 1 bit, no matter.
  }
  static void printBits(short x){
    for(int i = Short.SIZE - 1; i >= 0; i--){
      System.out.print((x >> i & 1)  == 1? '1' : '0');
    }
  }
  static void printBits(int x){
    for(int i = Integer.SIZE - 1; i >= 0; i--){
      System.out.print((x >> i & 1)  == 1? '1' : '0');
    }
  }
  static void printBits(long x){
    for(int i = Long.SIZE - 1; i >= 0; i--){
      System.out.print((x >> i & 1)  == 1? '1' : '0');
    }
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Variable a of Byte   : ");byte a = scanner.nextByte();
    System.out.print("Variable b of Short  : ");short b = scanner.nextShort();
    System.out.print("Variable c of Integer: ");int c = scanner.nextInt();
    System.out.print("Variable d of Long   : ");long d = scanner.nextLong();

    System.out.printf("\nLet's go bit a: "); printBits(a);
    System.out.printf("\nLet's go bit b: "); printBits(b);
    System.out.printf("\nLet's go bit c: "); printBits(c);
    System.out.printf("\nLet's go bit d: "); printBits(d);
  }
}
