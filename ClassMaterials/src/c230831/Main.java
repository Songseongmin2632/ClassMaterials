package c230831;

public class Main { // extends Object {
	public static void main(String[] args) throws Exception {
		// Ŭ������ ������ �ν��Ͻ��� ������ �Ѵ�? Y / N
		// Ŭ������ �츮�� �̸��� ���� ��, ����� �� ��� �Ѵ�?
		// => ù char�� �빮�ڴ�.
		// String, System, Math
		// ����ó�� �˾Ƽ� ������ ����ϴ� �͵��� �⺻ ����̶�� ����� �� �ִ�.
		// java.lang���� �����´�.
		// Scanner << java.util�� ���ԵǾ��ִ�.
		// ���� ���� �ٿ�ްų� ��ġ���� ���� ������ ǥ�� ����̶�� �Ѵ�.
		// java.lang << � �͵��� ���ԵǾ� ������?
		// Object, System, String, StringBuilder, Math, Class
		
		// �츮�� �׻� Object�� ��Դ�.
		// Object�� �ֻ��� Ŭ�����̴�.
		
//		Object obj = new Object();
//		Main main = new Main();
//		main.
		
		EqualsTest et1 = new EqualsTest(1, "test");
		EqualsTest et2 = new EqualsTest(2, "test");
		EqualsTest et3 = et1;
//		EqualsTest2 et4 = new EqualsTest2("test");
		System.out.println(et1.equals(et2));
		System.out.println(et1.equals(et3));
//		System.out.println(et1.equals(et4));
		
//		String temp1 = new String("aaa");
//		String temp2 = new String("aaa");
//		String temp3 = "aaa";
//		String temp4 = "aaa";
//		System.out.println(temp4 == temp3);
		
		System.out.println(et1.hashCode());
		System.out.println(et2.hashCode());
		System.out.println(et1.name.hashCode());
		System.out.println(et2.name.hashCode());
		
		System.out.println(et1.toString());
		System.out.println(et2.toString());
		
		RecordTest recordTest = new RecordTest(1, "test");
		RecordTest recordTest2 = new RecordTest(1, "test");

		System.out.println(recordTest.num());
		System.out.println(recordTest2.name());
		System.out.println(recordTest.toString());
		System.out.println(recordTest2.toString());
		
		// ���� ���� Object
		
		// System
		System.out.print(""); // out�� �ܼ�â�� ����Ѵ�.
		System.out.println(""); //
		
		// System.in; // Ű���带 �Է¹޴´�.
//		int keyInput = 0;
//		while(true) {
//			break;
//			keyInput = System.in.read();
//			System.out.println(keyInput);
//			// 7 => 55, 13, 10
//			// 8 => 56, 13, 10
//			// a => 97, 13, 10
//		}
		
		// System.currentTimeMillis(); // ���� �ð��� ms ������ �޾ƿ´�.
		// System.nanoTime(); // ���� ������ ���� �ð��� �޾ƿ´�.
		// ����ӽ�, �������
		System.out.println(System.currentTimeMillis());
		// 1693449477.674 s
		// 28,224,157 m
		// 470,402 h + 37 m
		// 19,600 d + 2 h
		// 53 y 255d
		// 2023y 8 M 31 d
		// 0���� �ƴ϶� 1970���� �������� �ð��� üũ�Ѵ�.
		// GMT �׸���ġ �ð� : ������ GMT + 0 / �ѱ� GMT + 9
		// UTC, ms ����
		// Date type
//		System.exit(0);
		
		System.out.println("Java Version : " + System.getProperty("java.specification.version"));
		System.out.println("JDK Directory : " + System.getProperty("java.home"));
		System.out.println("OS : " + System.getProperty("os.name"));
		System.out.println("user : " + System.getProperty("user.name"));
		System.out.println("user Directory : " + System.getProperty("user.home"));
		System.out.println("directory : " + System.getProperty("user.dir"));
	}
}

//class EqualsTest2 {
//	String name;
//	
//	EqualsTest2(String name){
//		this.name = name;
//	}
//}