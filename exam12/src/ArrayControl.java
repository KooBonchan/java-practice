import java.util.Random;

public class ArrayControl { //test 1 to 4
  static final Random random;
  static {
    random = new Random();
  }
  int[] memory;


  public ArrayControl(int num){
    this(num,-20,20);
  }
  public ArrayControl(int num, int lb, int rb){
    this.memory = new int[num];
    for(int i = 0; i < memory.length; i++){
      memory[i] = random.nextInt(lb, rb);
    }
  }
  public ArrayControl(int[] memory) {
    this.memory = memory;
  }

  int[] searchIndex(int x){ //Test 01
    int count = 0;
    for(int elem : memory){
      if(elem == x) count++;
    }
    int[] result = new int [count];
    count = 0;
    for(int i = 0; i < memory.length; i++){
      if(memory[i] == x){
        result[count] = i;
        count++;
      }
    }
    return result;
  }

  int[] removedIndexArray(int x){ // Test02
    if(x < 0 || x >= memory.length) return memory.clone();
    int[] result = new int[memory.length - 1];
    for(int i = 0; i < result.length; i++){
      if(i < x) result[i] = memory[i];
      else result[i] = memory[i+1];
    }
    return result;
  }

  int[] removedRangeArray(int from, int n){ //Test 03
    if(from + n <= 0 || from >= memory.length || n < 0) return memory.clone();
    if(from < 0){
      n = n + from;
      from = 0;
    }
    if(from + n > memory.length){
      n = memory.length - from;
    }

    int[] result = new int[memory.length - n];
    for(int i = 0; i < from; i++){
      result[i] = memory[i];
    }
    for(int i = from;i < memory.length - n;i++){
      result[i] = memory[i+n];
    }
    return result;
  }

  int[] insertAt(int idx, int value){ //Test04
    if(idx < 0 || idx >= memory.length) return memory.clone();
    int[] result = new int[memory.length + 1];

    for(int i = 0; i < idx; i++){
      result[i] = memory[i];
    }
    result[idx] = value;
    for(int i = idx; i < memory.length; i++){
      result[i+1] = memory[i];
    }
    return result;
  }

  void print(){
    for(int i = 0; i < memory.length; i++){
      System.out.printf("Memory[%d]: %d\t", i, memory[i]);
      if(i%5 == 4){
        System.out.print("\n");
      }
    }
  }
}
