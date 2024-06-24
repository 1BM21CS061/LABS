import java.util.Scanner;
import java.lang.Math;
abstract class Calculate
{
Calculate(){}
double x,y,result;
abstract void calc();
}
class Arith1 extends Calculate
{
Scanner s=new Scanner(System.in);
void calc()
{
System.out.println("Enter values for x and y");
x=s.nextDouble();
y=s.nextDouble();
result=x+y;
System.out.println("Sum= "+result);
}
Arith1(){}
}


class Arith2 extends Calculate
{
Scanner s=new Scanner(System.in);
void calc()
{
System.out.println("Enter values for x and y");
x=s.nextDouble();
y=s.nextDouble();
result=x*y;
System.out.println("Product= "+result);
}
Arith2(){}
}

class Arith3 extends Calculate
{
Scanner s=new Scanner(System.in);
void calc()
{
System.out.println("Enter values for x and y");
x=s.nextDouble();
y=s.nextDouble();
result=x/y;
System.out.println("Quotient="+result);
}
Arith3(){}
}


class Lab6
{
public static void main(String xx[])
{
Arith1 a =new Arith1();
a.calc();
Arith2 b =new Arith2();
b.calc();
Arith3 c =new Arith3();
c.calc();

}
}
