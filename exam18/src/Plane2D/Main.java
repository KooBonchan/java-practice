package Plane2D;

public class Main {
  public static void main(String[] args) {
    Plane2D[] plane2DS = new Plane2D[2];
    plane2DS[0] = new Square(5, 5);
    plane2DS[1] = new Parallelogram(5, 10, 1);

    for(Plane2D p : plane2DS) System.out.println(p.getArea());
  }
}
