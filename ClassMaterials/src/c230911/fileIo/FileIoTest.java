package c230911.fileIo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileIoTest {
	public static void test() {
		String path = "C:\\Users\\KGA\\eclipse-workspace\\ClassMaterials\\src\\fileIo\\test.txt";
		// Window ±‚¡ÿ
		try {
			Writer writer = new FileWriter(path);
			
			writer.write('a');
			writer.write('b');
			
			
			writer.flush();
		
			
			writer.close();
			
			Reader reader = new FileReader(path);
			
//			System.out.println((char)reader.read());
//			System.out.println((char)reader.read());
//			System.out.println((char)reader.read());
//			System.out.println((char)reader.read());
			
			char[] arr = new char[10];
			int count = reader.read(arr);
			System.out.println(count + " : " + new String(arr, 0, count));
									
			reader.close();
			
		}catch(Exception e) {
			
		}
	}
}
