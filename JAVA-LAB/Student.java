package CIE;
import java.util.Scanner;

public class Student
{
	int sem,usn;
	String name = new String();
	Scanner x = new Scanner(System.in);	

	public Student()
	{
		System.out.println("Enter sem,usn,name");
		this.sem = x.nextInt();
		this.usn = x.nextInt();
		this.name = x.next();
	}
}

