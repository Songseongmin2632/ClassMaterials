package c230901;

import java.util.Random;

public class MathTest {
	public static void test() {
		System.out.println(Math.abs(-5)); //�ۼַ�Ʈ ����
		System.out.println(Math.abs(-5.5));
		
		System.out.println(Math.ceil(5.1)); //�ø�
		System.out.println(Math.ceil(5.00000001)); //�Ҽ����� �����ϸ� �ݵ�� �ø�
		
		System.out.println(Math.floor(5.1)); //����
		System.out.println(Math.floor(5.99999999999)); //�Ҽ����� �����ϸ� �ݵ�� ����
		
		System.out.println(Math.max(4, 7)); //�ִ�
		System.out.println(Math.min(4, 7)); //�ּڰ�
		
		System.out.println(Math.round(5.1)); //�ݿø�
		System.out.println(Math.round(5.9));
		
		Random rd = new Random(2); //�Ű������� ������ ���� �������� ������ �� �ִ�. �̷� �������� ���ڰ�(seed) �̶�� ���Ѵ�.
		System.out.println(rd.nextInt(9)+1);
		System.out.println(rd.nextInt(9)+1);
		System.out.println(rd.nextInt(9)+1);
		Random rd1 = new Random(1);
		System.out.println(rd1.nextInt(9)+1);
		System.out.println(rd1.nextInt(9)+1);
		System.out.println(rd1.nextInt(9)+1);
		
		
	}
}