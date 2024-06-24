import java.util.Scanner;
import java.lang.Math;

class Quad
{
	public static void main(String args[])
{
		Scanner x = new Scanner(System.in);
		
		double r1,r2,d;

		System.out.println("Enter value of a:");
		double a =x.nextDouble();
		System.out.println("Enter value of b:");
		double b =x.nextDouble();
		System.out.println("Enter value of c:");
		double c =x.nextDouble();

		d = b*b - 4*a*c;
		r1 = ((-1*b)+Math.sqrt(Math.abs(d)))/(2*a);		
		r2 = ((-1*b)-Math.sqrt(Math.abs(d)))/(2*a);
		
		if(a==0)
		{System.out.println("Invalid inputs");}
		
		else{
		if(d==0)
		{
			System.out.println("The roots are:"+r1+"and"+r2);
		}
		else if(d>0)
		{
			System.out.println("The roots are:"+r1+"and"+r2);	
		}
		else
		{
			System.out.println("The roots are:"+r1+" and i"+Math.abs(r2));
		}
		}
}
}