package CharacterOrientedData;
import java.io.*;

/**
 * @author Paribartan
 *
 */
public class FileIODemo {

	public static void main(String[] args) throws IOException, FileNotFoundException{
		
		FileWriter fw = new FileWriter("C:\\workspace\\Java\\Java_eclipse\\FileHandeling\\FileIODemo.zip");
		fw.write("Hello, Thank You.");
		fw.close();
		
		FileReader fr = new FileReader("FileIODemo.zip");
		int i = 0;
		while((i = fr.read()) != -1) {
			System.out.print((char)i);
		}
		fr.close();
	}

}
