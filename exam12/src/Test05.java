public class Test05 {
  public static void main(String[] args) {
    Matrix a = new Matrix(2, 3);
    Matrix b = new Matrix(2,3);
    Matrix c = new Matrix(new int[2][3]);

    if(Matrix.add(a,b,c)){
      System.out.println("Matrix a");a.print();
      System.out.println("Matrix b");b.print();
      System.out.println("Matrix c");c.print();
    }
  }
}
