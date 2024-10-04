public class Test06 {
  public static void main(String[] args) {
    int[] arr = new int[5];
    for(int i = 0; i < 5; i++){
      arr[i] = 5-i;
    }

    for(int i = 0; i < arr.length; i++){
      System.out.printf("arr[%d]: %d\n",i,arr[i]);
    }
  }
}
