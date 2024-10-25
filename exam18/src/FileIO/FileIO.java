package FileIO;


import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class FileIO {
  static final String filename = "LastTime.txt";
  //hardcoded, need different style
  public static void main(String[] args) {

    try(
      FileReader fileReader = new FileReader(filename);
      BufferedReader bufferedReader = new BufferedReader(fileReader)
      ) {
      System.out.println("Last Time: " + bufferedReader.readLine());

    } catch (FileNotFoundException e) {
      System.out.println("No Last Time: First time running");
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    try(
      FileWriter fileWriter = new FileWriter(filename)
      ) {
      GregorianCalendar c = new GregorianCalendar();
      fileWriter.write(String.format(
        "%04d | %02d | %02d | %02d:%02d:%02d",
        c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1, c.get(Calendar.DATE),
        c.get(Calendar.HOUR_OF_DAY), c.get(Calendar.MINUTE), c.get(Calendar.SECOND)
      ));
    } catch (IOException e) {
      System.out.println("Error while writing");
    }
  }
}
