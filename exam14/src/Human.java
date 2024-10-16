public class Human {
  private String name;
  private int age;
  private double temperature = 36.5;
  private Day birthday;
  private static int counter = 10111;
  private int id;

  Human(String name, int age){
    this.name = name;
    this.age = age;
    this.id = counter; counter++;
  }
  Human(String name, int age, Day birthday){
    this(name, age);
    this.birthday = birthday;
  }

  public int getId() {
    return id;
  }

  public Day getBirthday() {
    return birthday.clone();
  }

  String getName() {return name;}
  int getAge() {return age;}
  double getTemperature() {return temperature;}

  void addAge() {age++;}
  void highTemp() {
    if(temperature < 40.1)
      temperature += 0.3;
  }
  void toGoodTemp(){
    temperature = 36.5;
  }

  @Override
  public String toString() {
    return String.format(
      """
        Human ID-%d
        Name : %10s
        Age  : %10d
        On-do: %10.3f
        
        Birthday is %s
        """
    , this.id, this.name, this.age, this.temperature, this.birthday);
  }
}
