
class Thread1 implements Runnable
{
	Thread t;
	
	Thread1()
	{
		t = new Thread(this, "CSE");
	}	

	synchronized public void run()
	{
		try
		{
			for(int i =5;i>0;i--)
			{
				System.out.println("CSE");
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException ie)
		{System.out.println("Child Interrupted");}
	}
}

class ThreadMain
{
	public static void main(String args[])
	{
		Thread1 nt = new Thread1();
		nt.t.start();

		try
		{
			Thread.sleep(10000);
			for(int i = 5; i>0;i--)
			{
				System.out.println("BMS College of Engineering");
				Thread.sleep(10000);
			}
		}
		catch(InterruptedException ie)
		{System.out.println("Main thread interrupted");}
		
	}
} 