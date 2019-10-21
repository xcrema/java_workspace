import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n, a = 0, b = 1;
		System.out.println("Enter a Fibonacci Series limit: ");
		n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = a;
			b = a+b;
			a = b-a;
		}
		sc.close();
		System.out.println("Fibonacci Series: ");
		for(int i:arr){
			System.out.println(i);
		}
		
	}

}
// 0 1 1 2 3 5 8 
