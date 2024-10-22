package Shapes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TriangleLeftBottom implements Triangle{
  int length;

  @Override
  public void draw() {
    for(int i= 0; i < length; i++){
      for(int j = 0; j <= i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }

  @Override
  public String toString() {
    return "TriangleLeftBottom{" +
      "length=" + length +
      '}';
  }
}
