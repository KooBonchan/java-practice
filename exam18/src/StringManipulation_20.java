import java.util.Scanner;

public class StringManipulation_20 {

  static String reverse(String s){
    StringBuilder stringBuilder = new StringBuilder();
    for(int i = s.length() - 1; i>=0; i--){
      stringBuilder.append(s.charAt(i));
    }
    return stringBuilder.toString();
  }

  static String reverse2(String s){
    StringBuilder stringBuilder = new StringBuilder(s);
    return
      stringBuilder
      .reverse()
      .toString();
  }

  static String charStat(char c){
    return String.format("%c %4X", c, (int)c);
  }

  static void printStringArray(String[] strings){
    for(String string : strings){
      for(int i = 0 ; i < string.length(); i++){
        System.out.print(string.charAt(i));
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("String: ");
//    String s = scanner.nextLine();

    /*Single String Manage*/
//    System.out.println();
//    System.out.println("String reverse 1: " + reverse(s));
//    System.out.println("String reverse 2: " + reverse2(s));
//
//    System.out.println();
//    for(int i = 0; i < s.length(); i++){
//      System.out.printf("s[%d] : %s\n", i, charStat(s.charAt(i)));
//    }

    /*2 String Comparison*/
//    System.out.print("String: ");
//    String s2 = scanner.nextLine();
//
//    if(s.contains(s2)){
//      System.out.println(s);
//      for(int i = 0; i < s.indexOf(s2); i++){
//        System.out.print(' ');
//      }
//      System.out.println(s2);
//    }
//
//    System.out.println(s.equals(s2));
//    int comparison = s.compareTo(s2);
//    if(comparison == 0){
//      System.out.println("Equals");
//    } else if (comparison < 0){
//      System.out.println("<");
//    } else{
//      System.out.println(">");
//    }

    Double target = Math.PI;
    printDouble(target, 10, 15);
  }

  static void printDouble(double x, int p, int w){
    // w be total with, p be width after point
    // w > p
    System.out.printf(String.format("%%%d.%df\n",w,p),x);
  }
}