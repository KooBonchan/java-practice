import java.util.Scanner;

public class Test08 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("# of classes: ");int n = scanner.nextInt();
    int[][] score = new int[n][];
    for(int i = 0; i < n; i++){
      System.out.print("\n# of students: ");int std = scanner.nextInt();
      score[i] = new int[std];
      for(int j = 0; j < std; j++){
        System.out.printf("Class %d, Student ID %d -- score: ", i + 1, std + 1);
        score[i][j] = scanner.nextInt();
      }
    }

    int allTotal = 0, allStudents = 0;
    System.out.println("Class | Total | Average");
    System.out.println("-----------------------");
    for(int i = 0; i < n; i++){
      if(score[i].length == 0) continue;
      int total = 0;
      for(int j = 0; j < score[i].length; j++){
        total += score[i][j];
      }
      allTotal += total;
      allStudents += score[i].length;
      System.out.printf("%5d | %5d | %5.1f\n", i, total, (float) total / score[i].length);
    }
    System.out.println("-----------------------");
    if(allStudents > 0)
      System.out.printf ("Total | %5d | %5.1f\n", allTotal, (float)allTotal / allStudents);
  }
}
