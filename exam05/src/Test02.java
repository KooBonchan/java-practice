import java.util.Scanner;

public class Test02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int month;

    while (true) {
      do {
        System.out.println("-1 to escape");
        System.out.print("Month: ");
        month = sc.nextInt();
      } while (month == 0 || month <= -2 || month > 12);
      if(month == -1) return;

      if (month < 3 || month > 11){
        System.out.println("Winter");
      }
      else if (month < 6){
        System.out.println("Spring");
      }
      else if (month < 9){
        System.out.println("Summer");
      }
      else{
        System.out.println("Autumn");
      }
    }


  }

}
