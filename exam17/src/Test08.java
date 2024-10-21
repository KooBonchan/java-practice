public class Test08 {
  public static void main(String[] args) {
    Animal[] animals = new Animal[3];
    animals[0] = new Dog("Max");
    animals[1] = new Cat("Maxine");
    animals[2] = new Cat("Carmichael");
    for(Animal animal : animals){

      System.out.print(animal.getName() + ": ");
      animal.bark();
    }

  }
}
