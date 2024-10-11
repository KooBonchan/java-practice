import java.util.Random;
import java.util.Scanner;


// just accumulated from test04
public class Test05 {
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

    for(int i = 0 ; i < n; i++){
      arr[i] = random.nextInt(-20, 20);
      System.out.printf("arr[%d] : %d\n", i, arr[i]);
    }
    System.out.print("Key: ");int key = scanner.nextInt();
    int idxLmost = linearSearchL(arr, key);
    int idxRmost = linearSearchR(arr, key);
    if(idxLmost == -1){
      System.out.println("No such element");
    } else if (idxRmost == idxLmost) {
      System.out.println("Found key at: " + idxLmost);
    } else{
      System.out.println("Leftmost: " + idxLmost +", Rightmost: "+idxRmost);
    }

  }
}
