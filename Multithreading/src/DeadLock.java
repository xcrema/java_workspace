
public class DeadLock extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String res1 = "Printer";
		final String res2 = "USB";
		
		Thread t1 = new Thread() {
			public void run() {
				synchronized(res1) {
					System.out.println("Thead-0: Locked Printer.");
				
				try{Thread.sleep(100);}catch(Exception e) {System.out.println(e);}
				synchronized(res2) {
					System.out.println("Thread-0: Locked CPU.");
				}
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				synchronized(res2) {
					System.out.println("Thead-1: Locked CPU.");
				
				try{Thread.sleep(100);}catch(Exception e) {System.out.println(e);}
				synchronized(res1) {
					System.out.println("Thread-1: Locked Printer.");
				}
				}
			}
		};
		
		t1.start();
		t2.start();
		
	}

}
