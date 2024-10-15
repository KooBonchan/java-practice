public class Human {
  private String name;
  private int age;
  private double temperature = 36.5;

  Human(String name, int age){
    this.name = name;
    this.age = age;
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


}
