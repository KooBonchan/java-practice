package RockScissorsPaper;

import java.util.Random;

public class ComputerUser implements User{
  private static Random random;
  static{
    random = new Random();
  }

  @Override
  public Hand decideMove() {
    Hand[] hands = Hand.values();
    int next = random.nextInt(hands.length);
    return hands[next];
  }
}
