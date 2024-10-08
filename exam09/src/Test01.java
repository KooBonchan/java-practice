import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Random;
import java.util.Scanner;

public class Test01 {
  public static void main(String[] args) throws IOException {
    Random random = new Random();

    String[] day = {"Day 1", "Day 2", "Day 3", "Day 4", "Day 5", "Day 6", "Day 7", };
    String[] dayName = {"Sunday", "Monday","Tuesday","Wednesday","Thursday","Friday","Saturday",};

    System.out.println("Name the day correctly");
    System.out.println("Enter Q to quit");
    int num = random.nextInt(7);
    int last = -1;
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    while(true){
      System.out.print("Name of " + day[num] + ": ");
      String command = bufferedReader.readLine();
      if(command.equalsIgnoreCase("q")){
        break;
      }


      if(command.equalsIgnoreCase(dayName[num])){
        System.out.println("Correct!");
        last = num;
        while(last == (num = random.nextInt(7)));

      }else{
        System.out.println("Retry");
      }

    }

    bufferedReader.close();
  }
}
