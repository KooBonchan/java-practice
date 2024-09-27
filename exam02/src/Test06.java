import java.util.Scanner;

//input: 2 int
//output: if same, "same" if diff, notate each
public class Test06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Number a: ");int a = sc.nextInt();
    System.out.println("Number b: ");int b = sc.nextInt();

    if(a == b){
      System.out.println("Same");
    }
    else{
      System.out.println("Smaller value: " + Math.min(a,b));
      System.out.println("Bigger value: " + Math.max(a,b));
    }




  }
}
