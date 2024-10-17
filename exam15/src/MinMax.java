import java.util.function.BiFunction;

public class MinMax {
  public static int min(int...argi){
    int min = Integer.MAX_VALUE;
    for(int i : argi){
      if(i < min) min = i;
    }
    return min;
  }
  public static int max(int...argi){
    int max = Integer.MIN_VALUE;
    for(int i : argi){
      if(i > max) max = i;
    }
    return max;
  }

}
