// input: 0 < int < 13
// output: season { spring, summer, autumn, winter }

import java.util.Scanner;

public class Test10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Month: ");
    while(true){
      int month = sc.nextInt();
      if(month > 2 && month <= 5){
        System.out.println("Spring");
        break;
      }
      else if(month > 5 && month <= 8){
        System.out.println("Summer");
        break;
      }
      else if(month > 8 && month <= 11){
        System.out.println("Autumn");
        break;
      }
      else if((month > 11 && month <= 12) ||
              (month >  0 && month <=  2)){
        System.out.println("Winter");
        break;
      }
      System.out.println("Wrong input");
    }

  }
}
