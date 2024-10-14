public class Test10 {
  static void printArray(int[] a){
    for(int i = 0 ; i < a.length; i++){
      System.out.printf("%d ", a[i]);
    }
    System.out.println();
  }

  static void printArray(int[][] a){
    for(int i = 0; i < a.length; i++){
      for(int j = 0; j < a[0].length; j++){
        System.out.printf("%6d ",a[i][j]);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    ArrayControl arrayControl = new ArrayControl(5);
    printArray(arrayControl.memory);

    Matrix matrix = new Matrix(6,5);
    printArray(matrix.getWhole());
  }


}
