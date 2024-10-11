import java.util.Scanner;

public class Test01 {

  static int[] deepcopy(int[] original){
    int[] copy = new int[original.length];

    for(int i = 0; i < original.length; i++){
      copy[i] = original[i];
    }
    return copy;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("# of elements: ");int n = scanner.nextInt();
    if(n <= 0){
      System.out.println("Array too short");
      System.out.println("Halting program...");
      return;
    }
    int[] arr = new int [n];

    for(int i = 0; i < n; i++){
      System.out.printf("arr[%d]: ", i);
      arr[i] = scanner.nextInt();
    }

    int[] copy = deepcopy(arr);
    for(int i = 0; i < n; i++){
      System.out.printf("copy[%d]: %d\n", i, copy[i]);
    }
  }
}
