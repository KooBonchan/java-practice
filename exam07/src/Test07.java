public class Test07 {
  public static void main(String[] args) {
    double[] arr = new double[5];
    for(int i = 0; i < 5; i++){
      arr[i] = (i+1) * 1.1;
    }

    for(int i = 0; i < arr.length; i++){
      System.out.printf("a[%d]: %.1f\n",i,arr[i]);
    }
  }
}
