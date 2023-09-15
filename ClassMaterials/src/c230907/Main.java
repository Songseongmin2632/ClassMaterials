package c230907;

public class Main {
	public static void main(String[] args) {
//		Exception e;
		// error => ���� �߻� �� �ش� ������ �ٸ� ������� ó���Ѵ�.
		// ���� ó��
		// �ε��� ���� ���� �� << ������ ��
		// �α��� �� �� ���� ���̵�, ��й�ȣ Ʋ��, ��ȭ��ȣ �Է��� �� 8�� ���ڸ� �Է�
		// ex) ������ ������ �� �� ������ ���� ���� ���� ���صΰ� �������� �����۵��ϴ� ��
		// if �Է� �� �޾ѳ�? => ����� �Է��� �ȵǸ� "�߸��� �Է��Դϴ�"
		// Exception => ������, ��Ÿ���� �����ϸ鼭 ������ �߻��ߴ� �Ǵ� �߻��� Ȯ���� �ִ�.
		// Throwable
		// Exception                 error
		// ClassNotFoundException, interruptedException, RuntimeException(�����ϴ� ���߿� ����ó��) -> ��Ÿ��(����)
		
		// RuntimeException
		// ArrayIndexOutOfBoundsException, NullPointerException
		try {
			ExceptionTest.test();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			throw new Exception("����ó����");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
