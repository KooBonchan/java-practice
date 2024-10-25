package ExceptionHandling;

import java.util.Arrays;

public class BuggyArrayMan {
  static void swap(int[] a, int idx1, int idx2){
    int temp = a[idx1];
    a[idx1] = a[idx2];
    a[idx2] = temp;
  }

  static void reverse(int[] array){
    try{
      for(int i = 0; i < array.length / 2; i++){
        swap(array, i, array.length - i);
        // buggy, since referencing array[length]
      }
    } catch(NullPointerException e){
      System.err.println(e.getMessage());
      System.exit(-1);
    } catch(ArrayIndexOutOfBoundsException e){
      throw new RuntimeException(e);
      // error chaining
      // exception from checked to unchecked wrapping available
    }
  }

  public static void main(String[] args) {
    int[] array = new int[5];
    for(int i = 0; i < array.length; i++){
      array[i] = i * 3;
    }
    System.out.println(Arrays.toString(array));

    reverse(array);
  }
}
