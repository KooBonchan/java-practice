import java.util.Random;

public class Matrix { //Test 05
  private static final Random random = new Random();
  private int[][] matrix;
  private int row;
  private int col;


  Matrix(int row, int col){
    this(row,col,-20,20);
  }
  Matrix(int row, int col, int lb, int ub){
    this.matrix = new int[row][col];
    for(int i = 0; i < row; i++){
      for(int j = 0; j < col; j++){
        matrix[i][j] = random.nextInt(lb,ub);
      }
    }
    this.row = row;
    this.col = col;
  }

  Matrix(int[][] matrix){
    if(matrix.length > 0 && matrix[0].length > 0){
      this.matrix = matrix;
      this.row = matrix.length;
      this.col = matrix[0].length;
    }
  }

  void print(){
    for(int i = 0; i < row; i++){
      for(int j = 0; j < col; j++){
        System.out.printf("%5d ",matrix[i][j]);
      }
      System.out.println();
    }
    System.out.println();
  }
  void set(int row,int col,int val){
    this.matrix[row][col] = val;
  }
  int get(int row, int col){
    return this.matrix[row][col];
  }
  int[][] getWhole(){
    return this.matrix;
  }

  static boolean add(Matrix a, Matrix b, Matrix c){
    if(a.row == b.row && b.row == c.row &&
       a.col == b.col && b.col == c.col){
      for(int i = 0; i < a.row; i++){
        for(int j = 0; j < a.col; j++){
          c.set(i,j, a.get(i,j)+b.get(i,j));
        }
      }
      return true;
    }
    return false;
  }

  Matrix deepcopy(){
    int[][] matrix = new int[row][col];
    for(int i = 0; i < row; i++){
      for(int j = 0; j < col; j++){
        matrix[i][j] = this.get(i,j);
      }
    }
    return new Matrix(matrix);
  }
}
