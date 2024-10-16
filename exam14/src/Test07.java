public class Test07 {
  public static void main(String[] args) {
    Account a = new Account(
      "Adeline Bruce",
      "8904273561",
      300400500,
      new Day(1234,5,6)
    );

    System.out.println(a);
    System.out.println(a.getOpenDay());
  }
}
