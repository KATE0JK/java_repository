package ru.stqa.pft.sandbox;

import ru.stqa.pft.sandbox.Rectangle;

public class MyFirstProgram {

   public static void main(String[] args) {
      Square s = new Square (5);
      System.out.println ("S квадрат со стороной " + s.l + " = " + s.area());

      Rectangle r = new Rectangle(2,5);
      System.out.println("S прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
   }

//   public static double area (Square s) {
//      return s.l*s.l;
//   }

//   public static double area (Rectangle r) {
//
//      return r.a * r.b;
//   }

}