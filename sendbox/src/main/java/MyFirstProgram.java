public class MyFirstProgram {

   public static void main(String[] args) {
      double l = 5;
      System.out.println ("S квадрат со стороной " + l + " = " + area (l));
      double a = 2;
      double b = 5;
      System.out.println("S квадрат со стороной " + a + " и " + b + " = " + area (a,b));
   }

   public static double area (double a,double b) {
      return a*b;
   }

   public static double area (double l) {
      return l*l;
   }

}