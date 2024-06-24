package CIE;
import java.util.Scanner;


public class Internals extends Student
{
	int marks[] = new int[5];
	Scanner x = new Scanner(System.in);

	public void input_marks()
	{
		for(int i=0;i<5;i++)
		{ 
			System.out.println("Enter marks of cie" + i);
			this.marks[i] = x.nextInt();
		}
	}
}