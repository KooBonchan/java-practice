import java.util.Scanner;

//수우미양가
public class Test10 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("점수: "); int pt = sc.nextInt();

    if(pt < 0 || pt > 100){
      System.out.println("잘못된 점수");
    } else if (pt < 60) {
      System.out.println("가");
    } else if (pt < 70) {
      System.out.println("양");
    } else if (pt < 80) {
      System.out.println("미");
    } else if (pt < 90) {
      System.out.println("우");
    } else{
      System.out.println("수");
    }
  }
}
