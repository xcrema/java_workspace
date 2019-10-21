//Public methods is accessed only by objects but static methods is 
//accessed directly. 
public class Car {
	public void fullThrottle(){
		System.out.println("This car is going as fast as it can");		
	}
	public void speed(int maxSpeed){
		System.out.println("Max Speed is: " + maxSpeed);
	}
	public static void main(String[] args){
		Car myCar = new Car();
		myCar.fullThrottle();
		myCar.speed(100);
	}
}
