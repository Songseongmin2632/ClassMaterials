package c230901;

public class Main {
	public static void main(String[] args) throws Exception { //enum -> ������ ������ �ʿ��� �� ����Ҽ��ִ�.
//		Week week = Week.FRIDAY;
////		week = 1; ������ Ÿ������ ������ ������ �ش� �������� �����͸� �Է��� �� �ִ�.
//		week = Week.SUNDAY;
//		switch(week) {
//		case SUNDAY:
//			System.out.println("�ݿ����̴�!!");
//			break;
//		}
		
		
		int num = 1;
		int studentNum = 1; //ī��ǥ���
		int StudentNum = 1; //�Ľ�Į�� -> ī���� + ù ���� �빮��
		int student_num = 1; // ������ũ�� 
		// int student-num = 1; // �ɹ���
		// int IntStudentNum = 1; // �밡���� ǥ��� << 
		System.out.println(num);
		
		StringTest stringTest = new StringTest();
		stringTest.stringTest();
		
		StrBuilderTest.strBuilderTest();
		MathTest.test();
		Wrapper.test();
		DateTest.test();
		
	}
}

