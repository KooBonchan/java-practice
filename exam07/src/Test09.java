// initialize array by {a, b, ..} notation

//import java.util.Arrays;

public class Test09 {
  public static void main(String[] args) {
    int[] arr = {5, 4, 3, 2, 1};

//    System.out.println(Arrays.toString(a));
    for(int i = 0; i < arr.length; i++){
      System.out.printf("arr[%d]: %d\n", i, arr[i]);
    }
  }
}
