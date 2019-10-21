
class NewVehicle{
	synchronized static void Running() {
		for(int i=1; i<=5; i++) {
			System.out.println("Car "+i+" is running by "+Thread.currentThread().getName());
			try {Thread.sleep(500);}catch(Exception e) {System.out.println(e);}
		}
	}
}
public class StaticSync extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1 = new Thread() {
			public void run() {
				NewVehicle.Running();
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				NewVehicle.Running();
			}
		};
		
		t1.start();
		t2.start();
	}

}
