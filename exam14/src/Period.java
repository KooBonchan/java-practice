public class Period {
  private Day from;
  private Day to;

  public Period(Day from, Day to){
    this.from = from.clone();
    this.to = to.clone();
  }

  public Day getFrom() {
    return from.clone();
  }

  public Day getTo() {
    return to.clone();
  }

  @Override
  public String toString() {
    return String.format("""
      | FROM |
      %s
      | TO   |
      %s
      """, from, to);
  }
}
