package c230822;

//public private protected static final



interface InterfacePhone{

String SiMNUMBER = "dd";

//public static final�� �����ϴ�.

public void installApp(String appName); //�ۼ�ġ �޼���

void call(String otherOwner); //��ȭ�Ѵ�.

}

public abstract class Phone implements InterfacePhone {

	// abstract �� �߻�

	public String number;

	//�ۺ� ������ �� ������� �ʴ´�.

	//��ü ���������� �ڵ��ؾ��Ѵ�.

	//ĸ��ȭ, �߻�ȭ, ������, ���

	//ĸ��ȭ Ư¡�� �ֱ⶧���� �ۺ� ������ �� ���� �ʴ´�.

	private String owner;

	protected String operator = "SKT";//����Ҷ� �Ѱ��ֱ� ���� ���,��Ű���� �޶����� �����ü�����.

	// public static String model = "������ ����3";//Ŭ���� ��ü�� ������ ����,�ν��Ͻ���

	//����ص� ������ Ŭ������ ����Ѵ�.

	// public final String MANUFACTURER = "�Ｚ"; //�������� ������ ��� ���(������ �ʴ´�)

	// public static final double PI = 3.14;//��ȸ������ ���ǵ� ��

	public Phone(String owner) {

		this.owner = owner;

	}
	public void setOwner(String owner) {

		// setter

		this.owner = owner;

	}

	public String getOwner() {

		// getter

		return owner;

		//super �θ�Ŭ���� ��������,���� : �ּҰ��� ã�ư��� �����͸� �����´�.

	}
	
	public void takeAPicture() {

		System.out.println("������ ������ϴ�.");

	}
	@Override

	public void call(String otherOwner) {

		System.out.println(owner + "��" + otherOwner +"���� ��ȭ�� �Ǵ�.");

	}
}

