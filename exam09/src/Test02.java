import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Test02 {
  public static void main(String[] args) throws IOException {
    Random random = new Random();

    String[] day = "일,월,화,수,목,금,토".split(",");
    String[] dayName = {"Sunday", "Monday","Tuesday","Wednesday","Thursday","Friday","Saturday",};

    System.out.println("Name the day in English correctly");
    System.out.println("Enter Q to quit");
    int num = random.nextInt(7);
    int last = -1;
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    while(true){
      System.out.print(day[num] + "요일: ");
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
