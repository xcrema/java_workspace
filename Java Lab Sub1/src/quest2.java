import java.util.*;

public class quest2 {

	public static void main(String[] args) {
		int a, b, c;
		System.out.print("Enter value of a & b: \n");
		Scanner ip = new Scanner(System.in);
		a = ip.nextInt();
		b = ip.nextInt();
		c = a + b;
		System.out.print("Sum: "+c);
		ip.close();
	}

}
