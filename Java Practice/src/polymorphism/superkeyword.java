package polymorphism;

class Animals{
	String color = "white";
	Animals(){
		System.out.println("Animal is Created");
	}
}

class Dogs extends Animals{
	String color = "black";
	Dogs(){
		//super();
		System.out.println("Dog is created");
	}
	void printColor() {
		System.out.println(color);
		System.out.print(super.color);
	}
}

class superkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogs obj = new Dogs();
		obj.printColor();
	}

}
