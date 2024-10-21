package Shapes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class VerticalLine implements Line {
  int length;

  @Override
  public void draw() {
    for(int i = 0; i < length; i++){
      System.out.println("|");
    }
  }
}
