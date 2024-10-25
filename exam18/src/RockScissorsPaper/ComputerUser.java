package RockScissorsPaper;

import java.util.Random;

public class ComputerUser implements User{
  private static Random random;
  private static int count = 1;
  static{
    random = new Random();
  }

  @Override
  public String getName() {
    return name;
  }

  private String name;

  ComputerUser(){
    this.name = "Computer" + count;
    count++;
  }

  @Override
  public Hand decideMove() {
    Hand[] hands = Hand.values();
    int next = random.nextInt(hands.length);
    return hands[next];
  }
}
