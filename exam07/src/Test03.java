public class Test03 {
  public static void main(String[] args) {
    System.out.println("f\t\tf square");
    System.out.println("-----------------------");
    float f = 0.0f;
    for(int i = 0; i <= 1000; i++, f+=0.001f){
      /*
      * float f = i / 1000.0;
      * more precise, for while adding a float, precision decreases.
      * */


      System.out.printf("%.8f\t%.8f\n", f, f * f);
    }

  }

}
