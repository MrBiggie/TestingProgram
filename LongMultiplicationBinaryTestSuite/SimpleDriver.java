
 
public class SimpleDriver {
   private static final String a = "18446744073709551616";
   private static final String b = "18446744073709551616";
 
   public static void main(String[] args) {
      LongMultBinary lmb = new LongMultBinary();
      System.out.println(lmb.doMult(a,b));
   }
}
 
