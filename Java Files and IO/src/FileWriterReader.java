import java.io.*;
public class FileWriterReader {

   public static void main(String args[])throws IOException {
      //File file = new File("Hello1.txt");
      
      // creates the file
      //file.createNewFile();
      
      // creates a FileWriter Object
      FileWriter writer = new FileWriter("hello1.txt"); 
      
      // Writes the content to the file
      writer.write("This\n is\n an\n example\n"); 
      writer.flush();
      writer.close();

      // Creates a FileReader Object
      FileReader fr = new FileReader("hello1.txt"); 
      char [] a = new char[50];
      fr.read(a);   // reads the content to the array
      
      for(char c : a)
         System.out.print(c);   // prints the characters one by one
      fr.close();
   }
}