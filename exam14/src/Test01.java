import java.util.Random;

public class Test01 {
  public static void main(String[] args) {
    Random random = new Random();

    Human[] teachers = {
      new Human("R. Banks", 33),
      new Human("D. Stanley", 29),
      new Human("H. Walters", 71),
    };

    int n = 20;
    Human[] juniors = new Human[n];
    for(int i = 0; i < n; i++){
      juniors[i] = new Human(randNames[random.nextInt(randNames.length)], random.nextInt(10,98));
    }

    System.out.println("TEACHERS!!!");
    for(Human teacher : teachers){
      System.out.println(teacher);
      System.out.println();
    }
    System.out.println("-----------------------");
    System.out.println("Juniors");
    for(int i = 0; i < n; i++){
      System.out.println(juniors[i]);
      System.out.println();
    }
  }


  static final String[] randNames = {
    "Arianna Hickman",
    "Jakobe Spence",
    "Aislinn Hess",
    "Lawrence Snyder",
    "Callie Craig",
    "Odin Ingram",
    "Katie Magana",
    "Rey Wu",
    "Liana Moreno",
    "Myles Ross",
    "Peyton Esparza",
    "Carl Herrera",
    "Ximena Garrett",
    "Kairo Henry",
    "Summer Holt",
    "Niko Watts",
    "Melissa Kane",
    "Brock Espinosa",
    "Braylee Nolan",
    "Maximo Long",
    "Jade Melton",
    "Lennon Shaw",
    "Emersyn Hardin",
    "Hassan Carrillo",
    "Kaylani Baldwin",
    "Jaiden Mahoney",
    "Promise Mata",
    "Ray Newman",
    "Oaklynn Alvarado",
    "Andres Dorsey",
    "Addyson Peterson",
    "Santiago Copeland",
    "Dayana Grimes",
    "Harlan Howe",
    "Persephone Murray",
    "Ashton Spence",
    "Aislinn Cochran",
    "Danny Houston",
    "Lylah Enriquez",
    "Elisha Lane",
    "Amy McPherson",
    "Foster Stone",
    "Catalina Le",
    "Damien Fleming",
    "Fatima McKee",
    "Bjorn Wolf",
    "Jolene Davenport",
    "Dariel Guevara",
    "Teresa Trevino",
    "Jaime McIntyre",
    "Rebekah Monroe",
    "Colby Dejesus",
    "Julissa Collier",
    "Edison May",
    "Adriana Dominguez",
    "Kaden McCarthy",
    "Kira Weiss",
    "Koa Ballard",
    "Alejandra Acevedo",
    "Dakari Wilson",
    "Luna King",
    "Julian McConnell",
    "Denise Golden",
    "Amias Larson",
    "Alayna Klein",
    "Marco Hill",
    "Hannah Beltran",
    "Ricky Hopkins",
    "Gabriela Wu",
    "Kyson Torres",
    "Violet Christian",
    "Ledger Montgomery",
    "Evangeline Dominguez",
    "Kaden Schwartz",
    "Lilliana Reed",
    "Easton Fischer",
    "Maci Hale",
    "Ezequiel Colon",
    "Remy Byrd",
    "Cristian Rodriguez",
    "Evelyn Elliott",
    "Blake Maddox",
    "Zainab Norris",
    "Cairo Chang",
    "Ophelia Villa",
    "Clay Hall",
    "Leah Clements",
    "Fisher Dalton",
    "Lilian McLean",
    "Crosby Tyler",
    "Helena Stevens",
    "Zachary Sosa",
    "Cassandra Calhoun",
    "Gary Delarosa",
    "Iyla Chandler",
    "Royal Hail",
    "Lainey Powell",
    "Bennett Buckley",
    "Theodora Bullock"
  };
}

