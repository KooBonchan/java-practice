import java.util.Random;
import java.util.Scanner;

public class Test08 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    System.out.println("Calculate Now!");
    System.out.println("Enter Q to quit");
    int x = random.nextInt(1000);
    int y = random.nextInt(1000);
    int z = random.nextInt(1000);
    int pattern = random.nextInt(4);
    while(true){
      switch(pattern){
        case 0: System.out.printf("%d + %d + %d = ", x, y, z);break;
        case 1: System.out.printf("%d + %d - %d = ", x, y, z);break;
        case 2: System.out.printf("%d - %d + %d = ", x, y, z);break;
        case 3: System.out.printf("%d - %d - %d = ", x, y, z);break;
      }

      String line = scanner.nextLine();
      if(line.equalsIgnoreCase("q")){
        System.out.println("Halting Program...");
        return;
      }
      try {
        int reply = Integer.parseInt(line);
        int answer = Integer.MIN_VALUE;
        switch(pattern){
          case 0: answer = x + y + z;break;
          case 1: answer = x + y - z;break;
          case 2: answer = x - y + z;break;
          case 3: answer = x - y - z;break;
        }
        if(answer == reply){
          System.out.println("Right!");
          x = random.nextInt(1000);
          y = random.nextInt(1000);
          z = random.nextInt(1000);
          pattern = random.nextInt(4);
        }else{
          System.out.println("Retry");
        }
      } catch (NumberFormatException e){
        System.out.println("Only Number");
      }

    }
  }
}
