import java.util.Random;


public class Test09 {
  static int pow2(int n){
    int acc = 1;
    for(;n>0;n--) acc*=2;
    return acc;
  }

  public static void main(String[] args) {
    Random random = new Random();
    int n = random.nextInt(10000);
    System.out.println("Testing number: " + n);

    int shift = random.nextInt(1,10);
    System.out.println("Shifting number: " + shift);

    System.out.printf("left shifting %d %d\n", n << shift, pow2(shift) * n);

    n = random.nextInt(10000,10000000);
    System.out.println("Testing number: " + n);

    shift = random.nextInt(1,6);
    System.out.println("Shifting number: " + shift);
    System.out.printf("right shifting %d %d\n", n >> shift, n / pow2(shift));

  }
}
