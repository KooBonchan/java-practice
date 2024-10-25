package RockScissorsPaper;

import java.util.Scanner;

public class HumanUser implements User{
  private String name = "Human";

  @Override
  public String getName() {
    return name;
  }

  private static Scanner scanner;
  static{
    scanner = new Scanner(System.in);
  }

  @Override
  public Hand decideMove() {
    Hand[] hands = Hand.values();
    int next = scanner.nextInt() % hands.length;
    return hands[next];
  }
}
