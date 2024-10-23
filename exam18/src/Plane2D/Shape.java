package Plane2D;

public interface Shape {
  /**
   * Draws a shape of function on a dos console
   */
  void draw();

  /**
   * Print status of an object.
   *
   */
  default void print(){
    System.out.println(toString());
    draw();
  }

}
