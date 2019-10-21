package polymorphism;

class Person{
	int id;
	String name;
	Person(int id, String name){
		this.id = id;
		this.name = name;
	}
}

class Emp extends Person {

	float salary;
	
	Emp(int id, String name, float salary){
		super(id, name);	//reusing parent constructor
		this.salary = salary;
	}
	
	void display() {
		System.out.print(id+" "+name+" "+salary);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1 = new Emp(1, "Achyut", 12312f);
		e1.display();

	}

}
