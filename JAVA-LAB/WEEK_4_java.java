import java.util.Scanner;

abstract class Shape
{
    int a,b;
    Scanner x = new Scanner(System.in);
    void printArea(){}
}

class Rectangle extends Shape
{
    Rectangle()
    {
        System.out.println("Enter length and breadth:");
        a = x.nextInt();
        b = x.nextInt();
    }
    void printArea()
    {
        System.out.println("AREA: "+ a*b);
    }
}

class Circle extends Shape
{
    Circle()
    {
        System.out.println("Enter radius:");
        a = x.nextInt();
        b = x.nextInt();
    }
    void printArea()
    {
        System.out.println("AREA: "+ 3.14*a*b);
    }
}

class Triangle extends Shape
{
    Triangle()
    {
        System.out.println("Enter height and base:");
        a = x.nextInt();
        b = x.nextInt();
    }
    void printArea()
    {
        System.out.println("AREA: "+ (0.5*a*b));
    }
}


class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        Triangle t  = new Triangle();
        t.printArea();
        c.printArea();
        r.printArea();
    }
}