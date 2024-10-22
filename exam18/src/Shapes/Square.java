package Shapes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Square implements Shape {
  int width;
  int height;

  @Override
  public void draw() {
    for(int i = 0; i < height; i++){
      for(int j = 0; j < height; j++){
        System.out.print('*');
      }
      System.out.println();
    }
  }

  @Override
  public String toString() {
    return "Square{" +
      "width=" + width +
      ", height=" + height +
      '}';
  }
}
