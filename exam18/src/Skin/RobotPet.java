package Skin;

public class RobotPet extends Pet implements Skinnable{
  SkinColors color = SkinColors.BLACK;
  public RobotPet(String name, String masterName) {
    super(name, masterName);
  }

  @Override
  public void introduce() {
    System.out.println("-------ANNOUNCE-------");
    super.introduce();
    System.out.println("-----ANNOUNCE END-----");
  }

  @Override
  public void changeSkin(SkinColors sc) {
    color = sc;
  }
}
