public class ThreadSync extends Thread {
	
	synchronized static void table()
	{
		int i;
		for(i=1;i<=5;i++)
		{
			System.out.println((6*i)+ " In thread : "+Thread.currentThread().getName());
			try
			{
				Thread.sleep(400); 
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
	
	public static void main(String[] args) {
		
		ThreadSync t1 =new ThreadSync()
				{
			public void run() {
				table();
				}
			
		};
		ThreadSync t2 =new ThreadSync()
		{
	public void run() {
		table();
		}
	
};
		t1.start();
		t2.start();
		
	}

}