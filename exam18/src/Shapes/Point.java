package Shapes;

import lombok.NoArgsConstructor;


@NoArgsConstructor
public class Point implements Shape {


  @Override
  public void draw() {
    System.out.println("+");
  }

  @Override
  public String toString() {
    return "Point";
  }
}
