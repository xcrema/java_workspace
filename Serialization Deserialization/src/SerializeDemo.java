import java.io.*;

public class SerializeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee();
		e.name = "Achyut";
		e.address = "Vellore";
		e.SSN = 11223344;
		
		try {
			FileOutputStream fileout = new FileOutputStream("employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileout);
			out.writeObject(e);
			out.close();
			fileout.close();
		}
		catch(IOException e1) {
			System.out.print(e1);
		}
	}

}
