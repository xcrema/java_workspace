package userinput;
import java.util.Scanner;

class UserInput {

	public static void main(String[] args) {
		//DataInputStream ip = new DataInputStream(System.in);
		System.out.print("Input a String: ");
		
		Scanner ip = new Scanner(System.in);
		String s = ip.nextLine();
		//String s = ip.readLine();
		System.out.print(s);
		ip.close();
	}

}
