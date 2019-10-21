
public class ByImplementingRunnableInterface implements Runnable{

	public void run() {
		System.out.println("Thread is running...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByImplementingRunnableInterface m1 = new ByImplementingRunnableInterface();
		Thread t1 = new Thread(m1);
		t1.start();
	}
}
