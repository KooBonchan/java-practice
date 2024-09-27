import java.util.Random;

public class Test09 {
  public static void main(String[] args) {
    Random rand = new Random();

    switch(rand.nextInt(3)){
      case 0:
        System.out.println("Rock");break;
      case 1:
        System.out.println("Scissors");break;
      default:
        System.out.println("Paper");break;
    }

  }
}
