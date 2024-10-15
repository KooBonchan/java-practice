import java.util.Random;
import java.util.Scanner;

public class Test04 {
  public static void main(String[] args) {
    Car car = new Car("Damas", "133-44-55",
      1333, 1444, 1555,
      40.0, 35.5, 12.5);
    Car kart = new Car("Cotton", "KART-rider",
      1333, 144, 1555,
      40.0, 35.5, 12.5);

    car.print();
    System.out.println();
    kart.print();
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    while(true){
      System.out.printf("Current position: (%.2f %.2f)\n", car.getX(), car.getY());
      System.out.printf("Current fuel    : %.2f\n", car.getFuel());
      System.out.println("Enter 0 to stop...");
      if(scanner.nextInt() == 0) return;

      System.out.println("Random Walk");
      double dx = random.nextDouble(-3,3);
      double dy = random.nextDouble(-3,3);
      System.out.printf("How much? : %.2f %.2f\n", dx, dy);
      if(!car.move(dx, dy)){
        System.out.println("Out of fuel: refuel");
        car.refuel(333);
      }
    }
  }
}
