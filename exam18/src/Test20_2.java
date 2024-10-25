public class Test20_2 {
  public static void main(String[] args) {
    char[] c = new char[26];
    for(int i = 0; i < c.length; i++){
      c[i] = (char)(i + 'A');
    }

    String[] strings = new String[5];
    strings[0] = "ABC";
    strings[1] = new String();
    strings[2] = new String(c);
    strings[3] = new String(c,3,7);
    strings[4] = new String("DDEF");

    /*************************************/

    strings[0] = null;
    strings[2] = "";


    for(int i = 0; i < strings.length; i++)
      System.out.println(strings[i]);

    try{
      System.out.println(strings[0].length());
    } catch(NullPointerException e){
      System.out.println("Null Pt Exception as expected");
    }

    System.out.println();
    String s = "Static Something";
    String s1 = "Dynamic? " + s;
    String s2 = "Dynamic? " + s;
    System.out.println(s1 == s2);
    s1 = s1.intern(); s2 = s2.intern();
    /*
    * what does intern do
    * 1. if string is in the unique pool, return the unique one
    * 2. else, add it to the pool and return that added one.
    * */
    System.out.println(s1 == s2);

  }
}
