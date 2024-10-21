import lombok.Getter;


@Getter
public class Car {
  private String name;
  private int width, height, length;
  private double x=0, y=0;
  private double fuel;
  private Day purchaseDay;

  public Car(String name, int width, int height, int length, double fuel, Day purchaseDay) {
    this.name = name;
    this.width = width;
    this.height = height;
    this.length = length;
    this.fuel = fuel;
    this.purchaseDay = new Day(purchaseDay);
  }

  public void putSpec(){
    System.out.printf("""
      NAME  : %10s
      WIDTH : %10d
      HEIGHT: %10d
      LENGTH: %10d
      """, name, width, height, length);
  }

  public boolean move(double dx, double dy){
    double dist = Math.sqrt(dx * dx + dy * dy);
    if(dist > fuel){
      return false;
    }
    else{
      fuel -= dist;
      x += dx;
      y += dy;
      return true;
    }
  }


}
