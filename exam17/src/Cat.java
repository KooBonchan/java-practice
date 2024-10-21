public class Cat implements Animal{
  private String name;

  public Cat(String name) {
    this.name = name;
  }

  @Override
  public void bark() {
    System.out.println("Mew");
  }

  @Override
  public String getName() {
    return name;
  }
}
