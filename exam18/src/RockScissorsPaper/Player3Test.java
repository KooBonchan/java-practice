package RockScissorsPaper;

public class Player3Test {
  //will cover more than 3
  static final int NUM_USER = 10;
  public static void main(String[] args) {

    User[] users = new User[NUM_USER];
    for(int i = 0; i < NUM_USER; i++){
      users[i] = new ComputerUser();
    }

    while(true){
      int rock = 0, scissors = 0, paper = 0;
      Hand[] hands = new Hand[NUM_USER];

      for(int i = 0; i < NUM_USER; i++){
        hands[i] = users[i].decideMove();
        switch(hands[i]){
          case Rock -> rock++;
          case Paper -> paper++;
          case Scissors -> scissors++;
        }
        System.out.printf("%-8s ",hands[i]);
      }
      System.out.println();

      Hand winner;
      if(rock * scissors * paper == 0){

        if(rock * scissors != 0){
          winner = Hand.Rock;
        } else if(scissors * paper != 0){
          winner = Hand.Scissors;
        } else if(paper * rock != 0){
          winner = Hand.Paper;
        } else continue;

        for(Hand hand : hands){
          if(hand.equals(winner)){
            System.out.printf("%-8s ", "Win");
          } else{
            System.out.printf("%-8s ", "Lose");
          }
        }

        break;
      }
    }
  }
}
