import java.util.Scanner;

class Student
{
	String USN,name;
	int marks[],size,credits[];
	Scanner s = new Scanner(System.in);	

	void input()
	{
		System.out.println("Enter USN of student:");
		this.USN = s.next();
		System.out.println("Enter name of student:");
		this.name  = s.next();
		System.out.println("Enter number of subjects:");
		this.size = s.nextInt();
		
		marks = new int[size];
		credits = new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter marks of subject"+i+" :");
			this.marks[i] = s.nextInt();			
		}

		for(int i=0;i<size;i++)
		{
			System.out.println("Enter credits of subject"+i+" :");
			this.credits[i] = s.nextInt();			
		}
	}

	void display()
	{
		System.out.println("Name of student:"+this.name);
		System.out.println("USN of student:"+this.USN);
		for(int i=0;i<size;i++)
		{
			System.out.println("Marks in subject"+i+" are:"+this.marks[i]);			
		}		
	}

	void SGPA()
	{
		double result=0,grade_sub=0;
		int credit_sum=0;

		for(int i=0;i<size;i++)
		{
			if(marks[i]>=90)
			{grade_sub = this.credits[i]*9;}
			else if(marks[i]>=80)
			{grade_sub = this.credits[i]*8;}
			else if(marks[i]>=70)
			{grade_sub = this.credits[i]*7;}
			else if(marks[i]>=60)
			{grade_sub = this.credits[i]*6;}
			else if(marks[i]>=50)
			{grade_sub = this.credits[i]*5;}
			else
			{grade_sub=0;}
			
			result = result + grade_sub;
			credit_sum = credit_sum + credits[i];
		}
	
		result = (result/credit_sum);
		System.out.println("SGPA  is :"+result);				
	}
}

class Stud
{
	public static void main(String args[])
	{
		Student s = new Student();
		s.input();
		s.display();
		s.SGPA();
	}
}
