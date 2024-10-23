package Plane2D;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Parallelogram implements Shape, Plane2D{
  int width;
  int height;
  int shiftPerLine;

  @Override
  public int getArea() {
    return width * height;
  }

  @Override
  public void draw() {
    for(int i = 0; i < height; i++){
      for(int j = 0; j < i * shiftPerLine; j++){
        System.out.print(' ');
      }
      for(int j = 0; j < width; j++){
        System.out.print('*');
      }
      System.out.println();
    }
  }
}
