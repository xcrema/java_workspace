import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		while(true) {
			System.out.println("\nMAIN MENU");
			System.out.print("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit\nYour Choice: ");
			int n = sc.nextInt();
			if(n>=5)
				System.exit(0);
			System.out.print("Enter number a: ");
			int a = sc.nextInt();
			System.out.print("Enter number b: ");
			int b = sc.nextInt();
			switch(n) {
				case 1: System.out.println("a+b: "+(a+b));
						break;
				case 2: System.out.println("a-b: "+(a-b));
						break;
				case 3: System.out.println("a*b: "+(a*b));
						break;
				case 4: try {
						System.out.println("a/b: "+(float)(a/b));
						}catch(Exception e) {
						System.out.println(e);
						}
						break;
			}
		}	
	}
}
