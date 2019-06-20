package ByteOrientedData;
import java.io.*;

/**
 * @author Paribartan
 *
 */
public class ByteOrientedData {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fs = new FileOutputStream("FileOutputStream.text");
		
		String data = "Hello, Paribartan !";
		
		byte[] bs = data.getBytes();
		
		fs.write(bs);
		
		fs.close();

	}

}
