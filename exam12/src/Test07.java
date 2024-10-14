import java.util.Random;
import java.util.Scanner;

public class Test07 {
  static int min(int a, int b){
    if (a < b) return a;
    return b;
  }

  static int min(int a, int b, int c){
    return min(a, min(b, c));
  }

  static int min(int ...values){
    int min = Integer.MAX_VALUE;
    for(int value : values){
      if(min > value) min = value;
    }
    return min;
  }
  public static void main(String[] args) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int[] xyz = new int[3];

    for(int i = 0; i < 3; i++){
      xyz[i] = random.nextInt(-10000,10000);
      System.out.println("Next element: " + xyz[i]);
    }
    System.out.print("Give me array length: "); int n = scanner.nextInt();
    ArrayControl arrayControl = new ArrayControl(n);
    arrayControl.print();
    System.out.println();

    System.out.printf("min(x, y)   : %6d\n",min(xyz[0],xyz[1]));
    System.out.printf("min(x, y, z): %6d\n",min(xyz[0],xyz[1], xyz[2]));
    System.out.printf("min(array)  : %6d\n",min(arrayControl.memory));


  }
}
