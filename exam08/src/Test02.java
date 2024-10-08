import java.util.Scanner;

public class Test02 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("# of elements: ");int n = scanner.nextInt();
    int[] arr = new int[n];

    for(int i = 0; i < n; i++){
      System.out.printf("Array[%d]: ", i);
      arr[i] = scanner.nextInt();
    }

    System.out.print("Number to find: ");
    int target = scanner.nextInt();
    boolean found = false;
    for(int i = 0; i < n; i++){
      if(arr[i] == target){
        System.out.printf("Found target at Array[%d]\n", i);
        found = true;
      }
    }
    if(!found){
      System.out.println("No such target");
    }

  }
}
