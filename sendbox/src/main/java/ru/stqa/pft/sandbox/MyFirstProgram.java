package ru.stqa.pft.sandbox;

import ru.stqa.pft.sandbox.Rectangle;

public class MyFirstProgram {

   public static void main(String[] args) {
      Square s = new Square ();
      s.l = 5;
      System.out.println ("S квадрат со стороной " + s.l + " = " + area (s));

      Rectangle r = new Rectangle();
      r.a = 2;
      r.b = 5;
      System.out.println("S прямоугольника со сторонами " + r.a + " и " + r.b + " = " + area (r));
   }

   public static double area (Square s) {
      return s.l*s.l;
   }

   public static double area (Rectangle r) {

      return r.a * r.b;
   }

}