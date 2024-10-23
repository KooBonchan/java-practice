package Skin;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Pet{
  private String name;
  private String masterName;

  public void introduce(){
    System.out.println("I am " + name);
    System.out.println("I'm under " + masterName);
  }
}
