import java.util.Scanner;

public class Test01 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int count = 0, sum=0, max=0,min=100;

    System.out.println("Enter Q to quit");

    while(true){
      System.out.printf("Score %d: ", count + 1);
      String s = scanner.nextLine();
      if(s.equalsIgnoreCase("q")) break;
      int n = Integer.parseInt(s);
      if(n < 0 || n > 100) {
        System.out.println("Wrong score: retry");
        continue;
      }
      count++;
      sum+=n;
      if(max < n) max = n;
      if(min > n) min = n;
    }

    System.out.println();
    System.out.println("Calculating Statistics:::");
    System.out.println();
    System.out.println("Number of students: " + count);
    System.out.println("Sum               : " + sum);
    if(count!=0){
    System.out.printf ("Average           : %.2f\n", sum / (float)count);
    System.out.println("Max score         : " + max);
    System.out.println("Max score         : " + min);
    }



  }
}
