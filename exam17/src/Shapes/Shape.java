package Shapes;

public interface Shape {
  void draw();
  String toString();

  default void print(){
    System.out.println(toString());
    draw();
  }

}
