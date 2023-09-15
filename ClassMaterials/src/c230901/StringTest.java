package c230901;

public class StringTest {
	public void stringTest() throws Exception {
		//	String = ���ڿ�, ���� => ����(char)�� �迭
		char[] tempstr = new char[10];
		// 10����? ���� => 000 232 / �ѱ� => 3
		tempstr[0] = '��';
		tempstr[1] = '��';
		tempstr[2] = '��';
		tempstr[3] = '��';
		tempstr[4] = '��';
		tempstr[5] = '��';
		tempstr[6] = '��';
		tempstr[7] = '��';
		tempstr[8] = '��';
		tempstr[9] = '��';
		for(char temp : tempstr) {
			System.out.println(temp);
		}
		// UTF-8
		String str1 = "test";
		String str2 = new String("test");
		byte[] bytes = new byte[] {'t','e','s','t'};
		String str3 = new String(bytes);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		byte[] strBytes = str1.getBytes();
		for(byte temp : strBytes) {
			System.out.println((char)temp);
		}
		
		
		byte[] arrEUCKR = str1.getBytes("EUC-KR");
		String strEUCKR = new String(arrEUCKR, "EUC-KR");
		// 2350 -> �ϼ��� �ѱ� EUC_KR�� �̰��� ������� ������.
		// ������ �ѱ� UTF-8
	}
}

