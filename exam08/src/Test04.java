import java.util.Scanner;

public class Test04 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("# of double elem: ");int n = scanner.nextInt();
    double[] arr = new double[n];

    for(int i = 0; i < n; i++){
      System.out.printf("Array [%d]: ", i+1);
      arr[i] = scanner.nextDouble();
    }

    double sum = sum(arr);
    System.out.printf("Sum: %.2f\n",sum);
    if(n>0){
      System.out.printf("Avg: %.2f\n",sum/n);
    }

  }

  static double sum(double[] arr){
    double acc = 0.0;
    for(double a : arr){
      acc += a;
    }
    return acc;
  }
}
