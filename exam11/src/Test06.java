import java.util.Random;
import java.util.Scanner;


// just accumulated from test05
public class Test06 {
  static int sumOf(int[] target){
    int acc = 0;
    for(int t : target) acc += t;
    return acc;
  }

  static int minOf(int[] target){
    int min = Integer.MAX_VALUE;
    for(int t : target){
      if(min > t) min = t;
    }
    return min;
  }

  static int linearSearchL(int[] target, int key){
    for(int i = 0; i < target.length; i++){
      if(target[i] == key) return i;
    }
    return -1;
  }
  static int linearSearchR(int[] target, int key){
    for(int i = target.length-1; i >=0; i--){
      if(target[i] == key) return i;
    }
    return -1;
  }

  static void arrayRemove(int[] target, int idx){
    if(idx >= 0 && idx < target.length){
      for(int i = idx; i < target.length - 1;i++){
        target[i] = target[i+1];
      }
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    System.out.print("# of elements: ");int n = scanner.nextInt();
    if(n <= 0){
      System.out.println("Array too short");
      System.out.println("Halting program...");
      return;
    }
    int[] arr = new int [n];

    System.out.println("Showing current array");
    for(int i = 0 ; i < n; i++){
      arr[i] = random.nextInt(-20, 20);
      System.out.printf("%4d, ", arr[i]);
      if(i%10 == 9) System.out.println();
    }
    System.out.println();

    System.out.print("Removing index: ");
    int idx = scanner.nextInt();
    arrayRemove(arr, idx);
    System.out.println("Showing current array");
    for(int i = 0 ; i < n; i++){
      System.out.printf("%4d, ", arr[i]);
      if(i%10 == 9) System.out.println();
    }

  }
}
