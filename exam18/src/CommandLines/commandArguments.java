package CommandLines;

public class commandArguments {
  public static void main(String[] args) {
    for(int i = 0; i < args.length; i++){
      System.out.println(args[i]);
    }

    if(args.length == 1){
      try{
        double r = Double.parseDouble(args[0]);
        System.out.printf("""
          Radius       : %.2f
          Circumference: %.2f
          Area         : %.2f
          """,
          r,
          2 * Math.PI * r,
          r * r / 2);
      }catch(NumberFormatException e){
        System.out.println("Argument should be a double.");
      }
    }

    try{
      double sum = 0.0;
      for(int i = 0; i < args.length; i++){
        sum += Double.parseDouble(args[0]);
      }
      System.out.println(sum);
    }catch(NumberFormatException e){
      System.out.println("Arguments should be a double.");
    }
  }
}
