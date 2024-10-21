public class Dog implements Animal{
  private String name;

  public Dog(String name) {
    this.name = name;
  }

  @Override
  public void bark() {
    System.out.println("Bark");
  }

  @Override
  public String getName() {
    return this.name;
  }
}
