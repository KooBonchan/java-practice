public class Car {
  private String name;
  private String number;
  private int width;
  private int height;
  private int length;

  private double x;
  private double y;

  private double maxFuel;
  private double fuel;
  private double sfc; // specific fuel consumption


  Car(String name, String number,
      int width, int height, int length,
      double maxFuel, double fuel, double sfc){
    this.name = name; this.number = number;
    this.width = width; this.height = height; this.length = length;
    this.maxFuel = maxFuel;
    this.fuel = Math.min(fuel,maxFuel); this.sfc = sfc;
    x = 0; y = 0;
  }

  double getX() {return x;}
  double getY() {return y;}
  double getFuel() {return fuel;}


  void print(){
    System.out.println("name    : " + name     );
    System.out.println("number  : " + number   );
    System.out.println("width   : " + width    + "mm");
    System.out.println("height  : " + height   + "mm");
    System.out.println("length  : " + length   + "mm");
    System.out.println("max fuel: " + maxFuel  + "l");
    System.out.println("sfc     : " + sfc      + "km/l");
  }

  boolean move(double dx, double dy){
    double dist = Math.sqrt(dx * dx + dy * dy);
    double fuel = dist / sfc;
    if(fuel > this.fuel){
      return false;
    }
    else{
      this.fuel -= fuel;
      x += dx;
      y += dy;
      return true;
    }
  }

  void refuel(double fuel){
    if(fuel > 0){
      this.fuel += fuel;
      if(this.fuel > maxFuel){
        this.fuel = maxFuel;
      }
    }
  }
}
