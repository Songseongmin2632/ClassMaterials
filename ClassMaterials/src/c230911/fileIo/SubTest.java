package c230911.fileIo;

import java.io.Writer;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.FileInputStream;
import java.io.InputStream;


public class SubTest {
	public static void test() {
		try {
			write("�׽�Ʈ��", "test.txt");
			
			String str = read("test.txt");
			System.out.println("str : " + str);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void write(String str, String fileName) throws Exception{
		OutputStream os = new FileOutputStream("C:\\Users\\KGA\\eclipse-workspace\\ClassMaterials\\src\\fileIo\\" + fileName);
		Writer writer = new OutputStreamWriter(os, "UTF-8");
		
		writer.write(str);
		writer.flush();
		writer.close();
	}
	
	private static String read(String fileName) throws Exception {
		InputStream is = new FileInputStream("C:\\Users\\KGA\\eclipse-workspace\\ClassMaterials\\src\\fileIo\\" + fileName);
		Reader reader = new InputStreamReader(is, "UTF-8");
		
		char[] arr = new char[100];
		int count = reader.read(arr);
		reader.close();
		return new String(arr, 0, count);
		
	}
}
