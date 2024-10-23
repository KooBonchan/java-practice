package Skin;

public class Cursor implements Skinnable{
  SkinColors skin = SkinColors.BLACK;
  @Override
  public void changeSkin(SkinColors sc) {
    skin = sc;
  }
}
