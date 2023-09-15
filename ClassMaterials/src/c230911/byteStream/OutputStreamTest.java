package c230911.byteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.InputStream;

public class OutputStreamTest {
	//����̶�?
	// - �����͸� �ְ�޴� ��
	// - ���� �߻��ұ�?
	// �����͸� ������ ����� ���� ��? -> ����? ����? Ŭ���̾�Ʈ? DB?
	// �� ������ �Ϲ������� ������ �� �ִ� ����̴�.
	// Ű���� �Է� �� �����Ͱ� ���κ��带 ���� CPU�� ���޵ȴ�.
	public static void test() {
		// C:\Users\KGA\eclipse-workspace\ClassMaterials\src\c230911\byteStream
		String path = "C:\\Users\\KGA\\eclipse-workspace\\ClassMaterials\\src\\c230911\\byteStream/test.db";
		// Window �� ������(Linux, Unix, Mac, Ubuntu, Android, ...)
		System.out.println();
		try {
			OutputStream os = new FileOutputStream(path); //������ ��������
			
			os.write(10);
			os.write(20);
			os.write(30);
			
			os.flush(); // �޸𸮰� ���� ���� �ʾҾ ������ ���Ϸ� �����Ѵ�. HDD�� ����Ѵ�.
			os.close();
			
			InputStream is = new FileInputStream(path);
			
//			System.out.println(is.read());
//			System.out.println(is.read());
//			System.out.println(is.read());
//			System.out.println(is.read());
			
			while(true) {
				int data = is.read();
				if(data == -1) break;
				System.out.println("data : " + data);
				
			}
			
			is.close(); //����� ������
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			OutputStream os = new FileOutputStream(path);
			
			byte[] arr = {10, 20, 30};
			os.write(arr);
			
			os.flush();
			os.close();
			
			InputStream is = new FileInputStream(path);
			byte[] arr1 = new byte[100]; // �ִ� �� ����Ʈ���� �������� �迭�� �����Ѵ�.
			
			int count = is.read(arr1);
			
			for(int i=0; i < count; i++) {
				System.out.println("arr1[" + i + "] : " + arr[i]);
			}
			// "��" << UTF-8 << 3byte << FF FF FF => AC 00
			
			is.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
