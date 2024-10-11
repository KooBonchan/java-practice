import java.util.Random;
import java.util.Scanner;


// just accumulated from test06
public class Test07 {
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
  static void arrayRemoveN(int[] target, int idx, int n ){
    if(idx >= 0 && idx < target.length && n > 0){
      for(int i = idx; i < target.length - n;i++){
        target[i] = target[i+n];
      }
    }
  }

  //Test08
  static void arrayInsert(int[] target, int idx, int x){
    if(idx >= 0 && idx < target.length){
      for(int i = target.length-1; i > idx; i--){
        target[i] = target[i-1];
      }
      target[idx] = x;
    }
  }

  //Test09
  static void arrayExchange(int[] first, int[] second){
    int limit = Math.min(first.length, second.length);
    for(int i = 0; i < limit; i++){
      int temp = first[i];
      first[i] = second[i];
      second[i] = temp;
    }
  }


  //Test10
  static int[] deepcopy(int[] a){
//    return a.clone();
    int[] copy = new int[a.length];
    for(int i = 0; i < a.length; i++) copy[i] = a[i];
    return copy;
  }

  static void printArray(int[] target){
    System.out.println("Showing current array");
    for(int i = 0 ; i < target.length; i++){
      System.out.printf("%4d, ", target[i]);
      if(i%10 == 9) System.out.println();
    }
    System.out.println();
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
    for(int i = 0; i < n; i++) arr[i] = random.nextInt(-200, 200);
    printArray(arr);

    /*
    // Test07
    System.out.print("Removing index: ");
    int idx = scanner.nextInt();
    System.out.print("upto n: ");
    int k = scanner.nextInt();
    arrayRemoveN(arr, idx, k);
    System.out.println("Showing current array");
    for(int i = 0 ; i < n; i++){
      System.out.printf("%4d, ", arr[i]);
      if(i%10 == 9) System.out.println();
    }*/

    /*
    //Test08
    System.out.print("Inserting element: ");
    int x = scanner.nextInt();
    System.out.print("At index: ");
    int idx = scanner.nextInt();
    arrayInsert(arr, idx, x);
    printArray(arr);
     */

    /*
    //Test09
    System.out.print("# of elements, second one: ");int nb = scanner.nextInt();
    if(nb <= 0){
      System.out.println("Array too short");
      System.out.println("Halting program...");
      return;
    }
    int[] arrB = new int [nb];
    for(int i = 0; i < nb; i++) arrB[i] = random.nextInt(-200, 200);
    printArray(arrB);

    System.out.println("EXCHANGING...\n-------------------");

    arrayExchange(arr, arrB);
    printArray(arr);
    printArray(arrB);
    */

    //Test10
    System.out.println("DEEP COPY..ing");
    printArray(deepcopy(arr));

  }
}
