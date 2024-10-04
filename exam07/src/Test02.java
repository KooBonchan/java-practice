public class Test02 {
  public static void main(String[] args) {
    System.out.println("float\t\tint");
    System.out.println("-----------------------");
    float f = 0.0f;
    for(int i = 0; i <= 1000; i++, f+=0.001f){
      System.out.printf("%.8f\t%.8f\n", f, i / 1000.0);
    }
  }
}
