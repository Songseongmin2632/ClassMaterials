package c230907;

public class ExceptionTest {
	public static void test() throws Exception {
		try { //������ �õ��غ���!
			// ���� �⺻���� ����ó�� ���
			// try catch finally : � ������ ���ִ�. �׸��� �� �Ȱ���.
			int[] arr = new int[] {1};
			System.out.println(arr[1]);
//			arr[0] = 3;
		}catch(Exception e) { //�����ϴ� ���� ������ ��ٸ� ĳġ�� ����ش�!
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
			// Parent adsf = new Child(); // ��ĳ����
		}finally {
			System.out.println("������ ����");
		}
		System.out.println("������ ����111");
		
		new ExceptionTest().printLength(null);
	}
	
	public void printLength(String str) {
		int result = str.length();
		System.out.println("str's length is "+result);
	}
}
