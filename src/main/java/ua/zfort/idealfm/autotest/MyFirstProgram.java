package ua.zfort.idealfm.autotest;

public class MyFirstProgram {

  public static void main (String[] arg){
    hello( "Tester");
    Square s = new Square(5);

    System.out.println("square with side " + s.l + "=" + s.area());

    Rectangle r = new Rectangle(5, 6);

    System.out.println("Rectangle with side " +r.a+ " and " +r.b+ "=" + r.area());
  }


  public static void hello(String somebody){

    System.out.println("Hello," + somebody + "world!");
  }




}
