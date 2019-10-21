import java.io.*;
public class CreateDir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dirname = "E:\\Workspaces\\Java Workspace\\Java Files and IO\\src\\bin";
		File d = new File(dirname);
		d.mkdir();
	}

}
