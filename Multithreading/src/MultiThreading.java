
class Vehicle{
	synchronized void Running() {
		for(int i=1; i<=5; i++) {
			System.out.println("Car "+i+" is running by "+Thread.currentThread().getName());
			try {Thread.sleep(500);}catch(InterruptedException e) {System.out.println(e);}
		}
	}
}

public class MultiThreading extends Thread{

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Vehicle v = new Vehicle();
		Thread t1 = new Thread() {
			public void run() {
				v.Running();
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				v.Running();
			}
		};
		t1.start();
		t2.start();
	}

}
