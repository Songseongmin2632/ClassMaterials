package c230901;

public class Wrapper {
	public static void test() {
		// String, System, StringBuilder, Math, Record
		// Wrapper�� Ŭ�������� ��Ī�̴�. ���� Ÿ���� Ŭ������ �����ش�. Ŭ������ �����ش�.
		// Integer(int) / Byte(byte) / Double(double) / Float(float)
		// Short(short) / Long(long) / Char(char) / Boolean(boolean)
		
		Integer wrappedInt = 1;
		System.out.println(wrappedInt);
		int unwrappedInt = wrappedInt; //�ڵ� Ÿ�� ��ȯ
		int unwrappedInt2 = wrappedInt.intValue();
		Integer wrappedInt2 = 1;
		System.out.println(unwrappedInt == wrappedInt2);
		// == �� ����Ͽ� ���� ��� ������ ���� �������� ���ٰ� ����� ���´�
		// ������ �� ������ ��� ��� �ٸ��� ��� ������ �ȴ�.
		// boolean => true, false
		// byte, short, int => -128 ~ 127
		// byte �ּҰ� : -128 / �ִ밪 : 127
		// short -32.768 ~ 32.767
		// int => -21�� ~ 21��
		byte temp = 127;
		System.out.println(++temp); //�ִ񰪿��� ������ �ȴٸ� �ּڰ����� ���Եȴ�! ������ ��������
		System.out.println(--temp);
		// unsigned? unsigned int => uInt
		// 1 byte => 8 bit => 2������ 1111 1111 => 255
		// byte temp => 1 byte => ���ڸ� �����? => 255
		
		System.out.println(wrappedInt.equals(wrappedInt2));
		
	}
}

