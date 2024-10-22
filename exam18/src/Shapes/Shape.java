package Shapes;

/**
 * has default method print
 * All shapes should implement this/child of this
 * @see Point Line Trangle Square
*/
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
