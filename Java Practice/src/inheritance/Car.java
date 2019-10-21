package inheritance;

import java.util.Scanner;

class Vehicle{
	private String sound;
	void setSound(String sound) {
		this.sound = sound;
	}
	String getSound() {
		return this.sound;
	}
}

class Car extends Vehicle{
	String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter Name of the Car: ");
		myCar.name = ip.nextLine();
		System.out.print("Enter Sound of the Car: ");
		myCar.setSound(ip.nextLine());
		System.out.print("Car: "+myCar.name+"\n"+"Sound: "+myCar.getSound());
		ip.close();
	}

}
