package JAVA;
public class MyThread extends Thread{
	MyThread(String name)
	{
		super(name);
	}
	MyThread()
	{
		//super();
	}
	public void run()
	{
		for(int i=0;i<=3;i++)
		{
			System.out.println("Child Thread "+i);
			try{
			Thread.sleep(500);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		
		MyThread mt1=new MyThread();
		mt1.start();
		for(int i=6;i<=7;i++)
		{
			System.out.println("Main Thread "+i);
			try{
				Thread.sleep(500);
				}
				catch(InterruptedException ie)
				{
					ie.printStackTrace();
				}
		}
	}
}