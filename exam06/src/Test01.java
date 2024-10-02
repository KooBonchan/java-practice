import java.util.Scanner;

public class Test01 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int total = 0;
    for(int i = 0; i < 10; i++){
      boolean outflag = false;
      for(int j = 0; j < 5; j++){
        System.out.printf("Group %d - integer:\n",i);int n = scanner.nextInt();
        if(n == 99999){
          outflag = true;
          break;
        }
        else if(n == 88888){
          break;
        }
        total += n;
      }
      if(outflag) break;
    }
    System.out.println("Total: " + total);
  }
}
