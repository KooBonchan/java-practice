package Wear;

public class WearableComputer implements Wearable{
  @Override
  public void putOn() {
    System.out.println("Computer In");
  }

  @Override
  public void putOff() {
    System.out.println("Computer Out");
  }

  public void restart(){
    putOff();
    putOn();
  }
}
