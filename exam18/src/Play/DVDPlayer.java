package Play;

public class DVDPlayer implements ExPlayer{
  @Override
  public void slow() {
    System.out.println("""
      S
      L
      O
      W
      """);
  }

  @Override
  public void play() {
    System.out.println("Go");
  }

  @Override
  public void stop() {
    System.out.println("--------S T O P---------");
  }
}
