package polymorphism;

class Animal{
	void animalSound() {
		System.out.println("Animal Sound");
	}
}
class Dog extends Animal {

	void animalSound() {
		System.out.println("Dog Sound");
	}
	public static void main(String[] args) {
		
		Animal obj1 = new Dog();
		Animal obj2 = new Animal();
		Dog obj3 = new Dog();
		
		obj1.animalSound();
		obj2.animalSound();
		obj3.animalSound();
	}
}
