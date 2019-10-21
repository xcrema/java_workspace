import java.io.*;

public class ByteStream {
	public static void main(String[] args)throws IOException {
		InputStream in = null;
		OutputStream out = null;
		try {
			//in = new FileInputStream("input.txt");
			out = new FileOutputStream("output.txt");
			//int c;
			/*
			while((c  = in.read())!=-1) {
			c = in.read();
				out.write(c);
			}
			*/
		}
		finally {
			if(in!=null)
				in.close();
			if(out!=null)
				out.close();
		}
	}
}
