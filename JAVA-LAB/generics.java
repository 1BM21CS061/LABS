import java.lang.*;
import java.util.*;

class Gen<T, V> {

  T ob1;
  V ob2;

  Gen(T x, V y) {
    ob1 = x;
    ob2 = y;
  }

  T getob1() {
    return ob1;
  }

  V getob2() {
    return ob2;
  }

  void showType() {
    System.out.println("value of T =" + ob1.getClass().getName());
    System.out.println("value of V =" + ob2.getClass().getName());
  }
}

class generics {

  public static void main(String args[]) {
    Gen<Integer, String> wob;
    wob = new Gen<Integer, String>(001, "Nithin");
    int x = wob.getob1();
    System.out.println("The value for x =" + x);
    String y = wob.getob2(); 
    System.out.println("The value for y =" + y);
    wob.showType();
  }
}