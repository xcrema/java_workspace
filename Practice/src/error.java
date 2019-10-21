
public class error {
	public static void main(String[] args){
		try{
			int[] array = {1,2,3};
			System.out.print(array[10]);
		}
		catch(Exception e){
			System.out.print("Something went wrong!!\n");
		}
		finally{
			System.out.print("Try Catch is finished");
		}
	}
}
