public class JoinMethod1 extends Thread{
	public void run() {
		for(int i=1; i<=5; i++) {
			try {Thread.sleep(500);}catch(InterruptedException e) {System.out.println(e);}
			System.out.print(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JoinMethod1 t1 = new JoinMethod1();
		JoinMethod1 t2 = new JoinMethod1();
		t1.start();
		try {t1.join();}catch(InterruptedException e) {System.out.println(e);}
		t2.start();
	}

}
