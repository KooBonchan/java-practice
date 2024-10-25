package ExceptionHandling;

import java.util.Random;

public class RangeExceptionTest {
  static boolean isOneDigit(int i){
    return i >= 0 && i < 10;
  }

  static int add(int a, int b) throws ParameterRangeException, ResultRangeException{
    if( ! isOneDigit(a)) throw new ParameterRangeException(a);
    if( ! isOneDigit(b)) throw new ParameterRangeException(b);

    int result = a + b;
    if( ! isOneDigit(result)) throw new ResultRangeException(result);
    return result;
  }

  public static void main(String[] args) {
    Random random = new Random();
    int a = random.nextInt(3, 7);
    int b = random.nextInt(3, 7);

    System.out.printf("%d %d %d\n", a, b, a + b);
    add(a,b);
  }
}
