package c230817;

class Variables{
	
	int instanceVariable; //�ν��Ͻ�

	static int classVariable; //Ŭ���� ����
}
class Card{
	
	//�ν��Ͻ�

	String kind;

	int number;
	
	
	//Ŭ��������

	static int width=100;  //��

	static int height=200; //����
	
	
	void Print() {

//		int num;
//
//		System.out.println(num); //�����ʱ�ȭ�� �ȵǹǷ� �ʱ�ȭ�� ������Ѵ�.

		}
}
public class Class02 {
	//������ ����         ������ġ                       �����ñ�

	//�ν��Ͻ� ����        Ŭ��������    �ν��Ͻ��� �����Ǿ�����

	//Ŭ���� ����        Ŭ��������    Ŭ������ �޸𸮿� �ö󰥶�

	//��������            Ŭ���� ���� �̿� ���    ���� ������ ����Ǿ�����

	//	              (�޼���, ������, ������..)
	
	
	//�ν��Ͻ� ����

	//

	public static void main(String[] agrs) 

	{

	//��������� ������ ������ ��������
	// Variables.classVariable=20;
	// System.out.println(Variables.classVariable);
		
	System.out.println("card�� �� : "+Card.width);
	System.out.println("card�� ���� : "+Card.height);
	
	Card c1=new Card();
	c1.kind="e";
	c1.number=7;
	
	Card c2=new Card();
	c2.kind="a";
	c2.number=5;
	
	System.out.println
	("c1��"+c1.kind+","+c1.number+"�̰� �������("+c1.width+","+c1.height+")");
	System.out.println
	("c2��"+c2.kind+","+c2.number+"�̰� �������("+c2.width+","+c2.height+")");
	
	System.out.println("c1�� width�� height�� �����غ���");
	c1.width=20;
	c1.height=20;
	
	//Ŭ���������� ������ ������ ������Ѵ�.

	System.out.println
	("c1��"+c1.kind+","+c1.number+"�̰� �������("+c1.width+","+c1.height+")");
	System.out.println
	("c2��"+c2.kind+","+c2.number+"�̰� �������("+c2.width+","+c2.height+")");
	System.out.println
	("c2��"+c2.kind+","+c2.number+"�̰� �������("+Card.width+","+Card.height+")");
	
	}	
}

class Example{
	void Print() {

	//void �̹Ƿ� ����Ÿ�� ����
	System.out.println("print�Լ� ȣ��");
	}
	
	int num() {

		return 3;
	}
	
	int sum(int a, int b) {

		return a+b;
	}
	
	void PrintMonth(int num) {

		if(num<0||num>12) {

		System.out.println("�߸��� �Է�");

		return; // �Լ��� �����Ѵ�.

		}
		else {

			System.out.println(num+"��");

		}
	}		
}

class MyMath{
	int a;
	int b;
	
	int add()

	{

	return a+b;

	}

	int subStract() 

	{

	return a-b;

	}
	//�ν��Ͻ� ������ ������� �Ű������� ó��

	static int add(int a,int b) //a,b�� local Variable

	{

	return a+b;

	}
}
