package c230817;

class Exam{
	//���� ��Ű�� �������� ��밡���ϴ�.

	void packagePrivateMethod() 

	{

	System.out.println("����packagePrivateMethod!!");

	}

	//���� ��Ű������������ ��밡��

	private void PrivateMethod() {

	System.out.println("����PrivateMethod!!");

	}

	static void staticMethod() {

	System.out.println("����staticMethod!!"); 

	}

	private static void staticPrivateMethod() {

	System.out.println("����staticPrivateMethod!!"); 

	}

	public void publicMethod() {

	System.out.println("����publicMethod!!"); 

	}
}
public class Class04 {
	public static void main(String[] agrs) {
		Exam exam=new Exam();

		exam.packagePrivateMethod();

//		exam.PrivateMethod();
		
		//1.packagePrivate(default) ���� ��Ű�� �������� ��밡��

		//2.private Ű���尡 ��õɶ��� �ڱ� �ڽ� Ŭ�����ܿ� ���� �Ұ�

		//3.public�� ���� static�� �پ� ���� ���.packagePrivate�� ����

		//4.public�� ���� �޼���� �ܺ���Ű�� ��𼭵��� ���ٰ����ϴ�.
	}
}
