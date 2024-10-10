import java.util.Scanner;

public class Test06 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int size = 6;
    String[] subject = {"English", "Math"};
    int[] total = new int[subject.length];
    int[][] score = new int[size][subject.length];


    System.out.printf("Give me score of %d students\n", size);
    for(int i = 0; i < size; i++){
      if(subject.length == 0) return;
      System.out.printf("Student %d - %-10s:", i, subject[0]);
      score[i][0] = scanner.nextInt();
      total[0] += score[i][0];
      for(int j = 1; j < subject.length; j++){
        System.out.printf("            %-10s:",subject[j]);
        score[i][j] = scanner.nextInt();
        total[j] += score[i][j];
      }
    }

    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("No.|");
    for(String sub : subject){
      stringBuilder.append(String.format("%10s|",sub));
    }
    stringBuilder.append("Average\n");
    stringBuilder.append("---------------------------\n");
    for(int i = 0; i < size; i++){
      stringBuilder.append(String.format("%3d|",i));
      int totalMe = 0;
      for(int j = 0; j < subject.length;j++){
        totalMe += score[i][j];
        stringBuilder.append(String.format("%10d|", score[i][j]));
      }
      stringBuilder.append(String.format("%.3f\n", (float)totalMe / subject.length));
    }
    stringBuilder.append("Avg");
    for(int j = 0; j < subject.length; j++){
      stringBuilder.append(String.format("|%10.3f", (float)total[j] / size));
    }
    System.out.println(stringBuilder);
  }
}
