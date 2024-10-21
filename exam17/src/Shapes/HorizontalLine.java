package Shapes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class HorizontalLine implements Line {
  private int length;
  @Override
  public void draw() {
    for(int i = 0; i < length; i++) System.out.print('-');
    System.out.println();

  }

  @Override
  public String toString() {
    return "HorizontalLine(" +
      "length: " + length +
      ')';
  }

}