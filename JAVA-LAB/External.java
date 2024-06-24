package SEE;
import java.util.Scanner;
import CIE.*;

public class External extends Student
{
	int marks[] = new int[5];
	Scanner x = new Scanner(System.in);	

	public External()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter marks of see" + i);
			marks[i] = x.nextInt();
		}
	}
}