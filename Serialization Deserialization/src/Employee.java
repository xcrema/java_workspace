public class Employee implements java.io.Serializable {

	// TODO Auto-generated method stub
	public String name;
	public String address;
	public transient int SSN;
		
	public void mailCheck() {
		System.out.println("Mailing a check to "+name+" "+address);
	}
}
