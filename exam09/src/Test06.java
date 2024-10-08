import java.util.Scanner;

public class Test06 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int size = 6;
    String[] subject = {"English", "Math"};
    int[] total = new int[subject.length];
    int[][] score = new int[size][subject.length];


    System.out.printf("Give me score of %d students", size);
    for(int i = 0; i < size; i++){
      if(subject.length == 0) return;
      System.out.printf("Student %d - %-10s:", i, subject[0]);
      score[i][0] = scanner.nextInt();
      for(int j = 1; j < subject.length; j++){
        System.out.printf("             %-10s:",subject[j]);
        score[i][j] = scanner.nextInt();
      }
    }

  }
}
