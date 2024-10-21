public class ExCar extends Car{

  private double mileage = 0.0;
  public ExCar(String name, int width, int height, int length, double fuel, Day purchaseDay) {
    super(name, width, height, length, fuel, purchaseDay);
  }

  public double getMileage() {
    return mileage;
  }

  @Override
  public void putSpec() {
    super.putSpec();
    System.out.printf("Total mileage: %10.2f\n", mileage);
  }

  @Override
  public boolean move(double dx, double dy) {
    double dist = Math.sqrt(dx * dx + dy * dy);
    if(!super.move(dx, dy)) return false;
    else{
      mileage += dist;
      return true;
    }
  }
}
