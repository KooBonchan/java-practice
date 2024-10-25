package Date;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.function.Function;

public class Main {
  static void printMonth(int year, int month){
    int dayOfWeek = Day.dayOfWeek(year, month, 1);
    int monthDays = Day.monthDays[month-1];

    System.out.println("SUN|MON|TUE|WED|THU|FRI|SAT|");
    System.out.println("----------------------------");
    for(int i = 0; i < dayOfWeek;i++){
      System.out.print(" ".repeat(4));
    }
    for(int day = 1; day <= monthDays; day++){
      System.out.printf("%2d |",day);
      if((day + dayOfWeek) % 7 == 0){
        System.out.println();
      }
    }
    if((monthDays + dayOfWeek) % 7 != 0) System.out.println();
  }
  public static void main(String[] args) {
    int year = 1, month = 0;
    boolean printWhole = false;
    if(args.length == 0){
      GregorianCalendar gregorianCalendar = new GregorianCalendar();
      year = gregorianCalendar.get(Calendar.YEAR);
      month = gregorianCalendar.get(Calendar.MONTH) + 1;
    }
    if(args.length == 1){
      try{
        year = Integer.parseInt(args[0]);
      }catch(NumberFormatException e){
        System.out.println("Only Number");
        return;
      }
      printWhole = true;
    }
    if(args.length == 2){
      try{
        year = Integer.parseInt(args[0]);
        month = Integer.parseInt(args[1]);
      }catch(NumberFormatException e){
        System.out.println("Only Number");
        return;
      }
    }
    if(year == 0) year = 1;
    if(month < 1) month = 1;
    else if(month > 12) month = 12;

    if( ! printWhole){
      System.out.printf("%d | %d\n", year, month);
      printMonth(year, month);
    }else{
      System.out.printf("Calenter %d\n", year);
      for(int i = 1; i <= 12; i++){
        System.out.println(i);
        printMonth(year, i);
        System.out.println();
      }
    }
  }
}
