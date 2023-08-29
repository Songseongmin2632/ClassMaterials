package c230829;

interface InterfaceTest {
	/* public static final */int NUMBER = 1; //����� �ݵ�� �빮��!!
	// ������ ����� �������̽����� ����� �����ϴ�.
	// ��� �� ���� ����� �����ұ�? >> Ŭ������ �޸� ������ ���� �̸��� �����ϱ� ������
	// ��ǻ�Ͱ� �ν��� ���� �� �� �ִ�.
	/* public abstract */void methodTest();
	
	static void staticMethodTest() {
		System.out.println("���� �޼��� ����");
		// private �޼��� ȣ�� ����? �Ұ���?
		privateStaticMethodTest();
	}
	
	private static void privateStaticMethodTest() {
		System.out.println("private ���� �޼��� ����");
	}
	
	private void privateMethodTest() {
		System.out.println("private �޼��� ����");
	}
	// static�� Ÿ Ŭ������ �޼��带 ����ϱ����ؼ� ����
	// private�� Ÿ Ŭ�������� ���� ����� �� ������ �������̽� ������
	// static�� �������ֱ� ���ؼ� ����Ѵ�.
	static int add(int ...args) {
		return 1;
	}
	
	default void defaultMethodTest() {
		privateMethodTest();
	}
}

class ClassTest implements InterfaceTest{
	@Override
	public void methodTest() {}
	
	@Override
	public void defaultMethodTest() {
		InterfaceTest.super.defaultMethodTest();
	}
}

public class Main {
	public static void main(String[] args) {
		InterfaceTest.staticMethodTest();
		
		YellowRace JKH = new YellowRace();
		JKH.move();
//		JKH.skinColor
		Person[] people = new Person[] {JKH, new WhiteRace()}; //��ĳ����!!
//		people[0].skin
		//���� YellowRaceŬ�������� ���� �����°Ŷ� �����ϰ�
		//�Ʒ��� Person�̶�� �θ�Ŭ���� Ÿ���� ������ ������ Person�� ��Ų�÷��� �����Ƿ� �Ұ���
//		people[0].move -> �ּ������ؼ� ã�ƺ���!!
	}
}

