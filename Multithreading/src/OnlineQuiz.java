
class Quiz{
	void Question() {
		for(int i=1; i<5; i++) {
			System.out.println("Question number: "+i);
			try {
				Thread.sleep(1000*2);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	
	void Answer() {
		
	}
}
public class OnlineQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
