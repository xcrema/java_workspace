
public class ByExtendingThreadClass extends Thread{
/*
	public void run() {
		System.out.println("Thread is running...");
	}
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByExtendingThreadClass t1 = new ByExtendingThreadClass() {
			public void run() {
				System.out.println("Running...");
			}
		};
		t1.start();
	}

}
