
public class GuessGame {
	Player p1;
	Player p2;
	Player p3;
	public void startGame(){
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		int guess1 = 0;
		int guess2 = 0;
		int guess3 = 0;
		
		boolean p1isright = false;
		boolean p2isright = false;
		boolean p3isright = false;
		
		int targetNumber = (int)(Math.random()*10);
		System.out.println("I'm thinking of a number between 0 and 9...");
		
		while(true){
			System.out.println("Number to guess is "+targetNumber);
			
			p1.guess();
			p2.guess();
			p3.guess();
			
			guess1 = p1.number;
			System.out.println("P1 guessed: "+guess1);
			
			guess2 = p2.number;
			System.out.println("p2 guessed: "+guess2);
			
			guess3 = p3.number;
			System.out.println("p3 guessed: "+guess3);
			
			if(guess1 == targetNumber){
				p1isright = true;
			}
			if(guess2 == targetNumber){
				p2isright = true;
			}
			if(guess3 == targetNumber){
				p3isright = true;
			}
			
			if(p1isright || p2isright || p3isright){
				System.out.println("We have a Winner");
				System.out.println("Player 1 got it right: "+p1isright);
				System.out.println("Player 2 got it right: "+p2isright);
				System.out.println("Player 3 got it right: "+p3isright);
				System.out.println("Game Over");
				break;
			}
			else{
				System.out.println("Players have to try again");
			}			
		}
	}
}
