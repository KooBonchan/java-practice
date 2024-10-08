import java.util.*;

public class Test07 {
  public static void main(String[] args) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    System.out.print("# of elem: ");int n = scanner.nextInt();
    if(n > 10){
      System.out.println("Max number: 10");
      System.out.println("Halting Program....");
      return;
    }


    int[] rand = new int[n];
    for(int i = 0; i < n; i++){
      boolean found = false;
      while(!found){
        int c = random.nextInt(1,11);
        int j = 0;
        for(; j < i; j++){
          if(c == rand[i]) break;
        }
        if(j == i){
          found = true;
          rand[i] = c;
        }
      }
    }

    System.out.println(Arrays.toString(rand));
  }

  static void randomSortLike(Random rand, int[] arr) throws Exception{
    if(arr.length > 10) throw new Exception("Pigeon Hole");
    List<Integer> sample = new ArrayList<>();
    for(int i = 0 ; i < 10; i ++ ){
      sample.add(i+1);
    }
    Collections.shuffle(sample);

    for(int i = 0; i < arr.length; i++){
      arr[i] = sample.get(i);
    }
  }
}
