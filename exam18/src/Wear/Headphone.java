package Wear;

import lombok.Getter;

@Getter
public class Headphone implements Wearable{
  private static final int MAX_VOLUME = 10;
  private int volume;
  public void turnUp(){
    if(volume < MAX_VOLUME)
      volume++;
  }
  public void turnDown(){
    if(volume > 0) volume--;
  }

  @Override
  public void putOn() {
    System.out.println("Head ON");
  }

  @Override
  public void putOff() {
    System.out.println("Head Off");
  }
}
