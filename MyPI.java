public class MyPI {
  private static String PI;  // millions of digits of PI
  private static long NUMPI; // number of digits of PI
 
  public static String getPI() {
    return PI;
  }

  public static void setPI(String in_) {
    PI = in_;
    NUMPI = PI.length();
  }

  public static long getNUMPI() {
    return NUMPI;
  }


  public static String [] getSubs(String s_) {
    s_ = s_.replace("/", "");
    String [] us = new String [s_.length()];
    for (int i = 0; i < s_.length(); i++) {
      us[i] = s_.substring(0, i+1);
    }
    return us;
  }

  public static int findinPI(String in_) {
    int out = -1;
    for (int i = 0; i < NUMPI - in_.length(); i++) {
      String inPi = PI.substring(i, i + in_.length());
      //System.out.println(inPi+","+in_);
      if (in_.equals(inPi)) {
        return i;
      }
    }
    return out;
  }
}
