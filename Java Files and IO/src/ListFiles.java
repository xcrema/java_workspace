import java.io.*;

public class ListFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("E:\\Workspaces\\Java Workspace\\Java Files and IO\\src");
		
		String []paths = null;
		paths = file.list();
		
		for(String path:paths) {
			System.out.println(path);
		}
	}

}
