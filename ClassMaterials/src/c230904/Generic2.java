package c230904;


//���׸� �޼���� ȣ��Ǵ� ������ ���� ���׸� Ÿ���� �����Ѵ�.
//1. ���׸� Ÿ�Ժ������� 1���϶�
//���� ������ <T> T �޼��� �̸�(T t)
//2. ���׸� Ÿ�Ժ������� 2���϶�
//���� ������ <T, V> T �޼��� �̸�(T t, V v)
//3. �Ű��������� ���׸��� ���� ���
//���� ������<T> void �޼��� �̸�(T T){}
//4. ����Ÿ�Կ��� ���� ���
//���� ������<T> T �޼��� �̸�(int a){}


class GenericMethod {
	public <T> T method(T t) {
		return t;
	}
	public <T> boolean method2(T t1, T t2) {
		return t1.equals(t2);
	}
	public <K, V> void method3(K k, V v) {
		System.out.println(k+ " : "+v);
	}
}

class A {
	public <T> void method(T t) {
		System.out.println(t.equals("����")); //Ÿ���� ������ ���°� �ƴϱ� ������ �ֻ��� class�� Object�� ���� �޼��常 ��밡���ϴ�!!
		System.out.println();
		//���ǽ������� � Ÿ������ �˼��� ���� �ڹ��� ��� Ŭ������
		//ObjectŬ������ �ֻ��� �̹Ƿ� � ���൵ ���� �ʴ� Object���� �޼��常
		//��밡���ϴ�.
		//System.out.println(t.length());//�Ұ���
	}
}

public class Generic2 {
	public static <T> void Swap(T[] array,int index1, int index2) { //����
		T temp = array[index1];
		
	}

	public static void main(String[] args) {
		GenericMethod gm = new GenericMethod();
		
		String str1 = gm.<String>method("�ȳ�"); //��ü Ÿ���� ���� ���׸� Ÿ���� ������ �� �ִٸ� ���� ����!!
		
		String str2 = gm.method("�ȳ�");
		
		System.out.println(str1);
		System.out.println(str1);
		
		boolean b1 = gm.method2(2.5, 2.5);
		System.out.println(b1);
		
		gm.<String, Integer> method3("����", 10);
		gm.method3("����", 20);
		
		
	}
}
