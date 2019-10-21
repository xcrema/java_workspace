import java.util.Scanner;

public class quest3 {

	public static void main(String[] args) {
		String name;
		System.out.print("Enter your name: ");
		Scanner ip = new Scanner(System.in);
		name = ip.nextLine();
		System.out.print("Name: "+name);
		ip.close();
	}

}
