package RockScissorsPaper;

public class Main {
  public static void main(String[] args) {
    boolean draw = false;
    User leftuser = new ComputerUser();
    User rightuser = new ComputerUser();
    while(! draw){
      Hand lefthand = leftuser.decideMove();
      Hand righthand = rightuser.decideMove();

      System.out.printf("%s : %s\n", lefthand, righthand);
      if(lefthand == righthand) draw = true;
    }
  }
}
