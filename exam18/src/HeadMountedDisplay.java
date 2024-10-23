import Skin.SkinColors;
import Skin.Skinnable;
import Wear.Wearable;

public class HeadMountedDisplay implements Wearable, Skinnable {
  SkinColors color = SkinColors.YELLOW;
  @Override
  public void changeSkin(SkinColors sc) {
    color = sc;
  }

  @Override
  public void putOn() {
    System.out.println("Display On");
  }

  @Override
  public void putOff() {
    System.out.println("Display Off");
  }
}
