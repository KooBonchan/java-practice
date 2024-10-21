package Shapes;

public class Main {
  public static void main(String[] args) {
    Shape[] shapes = new Shape[4];
    shapes[0] = new Square(5, 6);
    shapes[1] = new HorizontalLine(3);
    shapes[2] = new VerticalLine(5);
    shapes[3] = new Point();

    for(Shape shape : shapes){
      shape.print();
    }

  }
}
