package Wear;

public class Main {
  public static void main(String[] args) {
    Wearable headphone = new Headphone();
    Wearable wearableComputer = new WearableComputer();

    headphone.putOn();
    headphone.putOff();
  }
}
