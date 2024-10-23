package Plane2D;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Square implements Shape, Plane2D{
  int width;
  int height;

  @Override
  public int getArea() {
    return width * height;
  }

  @Override
  public void draw() {
    for(int i = 0; i < height; i++){
      for(int j = 0; j < width; j++){
        System.out.print('*');
      }
      System.out.println();
    }
  }

}
