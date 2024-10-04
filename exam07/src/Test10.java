import java.util.Scanner;

public class Test10 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Length n: ");int n = scanner.nextInt();
    int[] arr = new int[n];

    for(int i = 0; i < n; i++){
      System.out.printf("arr[%d]: ", i);arr[i] = scanner.nextInt();
    }
    StringBuilder stringBuilder = new StringBuilder();
    for(int i = 0; i < n; i++){
      stringBuilder.append(arr[i]);
      if(i != n-1){
        stringBuilder.append(", ");
      }

    }
    System.out.printf("arr: {%s}", stringBuilder);
  }
}
