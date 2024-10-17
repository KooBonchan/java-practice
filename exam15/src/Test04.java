public class Test04 {
  public static void main(String[] args) {
    System.out.printf("""
      Number range
      BYTE   : %20d ~ %19d
      SHORT  : %20d ~ %19d
      INTEGER: %20d ~ %19d
      LONG   : %20d ~ %19d
      """, Byte.MIN_VALUE, Byte.MAX_VALUE,
          Short.MIN_VALUE, Short.MAX_VALUE,
        Integer.MIN_VALUE, Integer.MAX_VALUE,
           Long.MIN_VALUE, Long.MAX_VALUE);
  }
}
