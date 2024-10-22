package Shapes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TriangleRightTop implements Triangle{
  int length;

  @Override
  public void draw() {
    for(int i= 0; i < length; i++){
      int j = 0;
      for(; j < i; j++){
        System.out.print(" ");
      }
      for(;j < length; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }

  @Override
  public String toString() {
    return "TriangleRightTop{" +
      "length=" + length +
      '}';
  }
}
