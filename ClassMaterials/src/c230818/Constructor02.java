package c230818;

//�����ڿ��� �ٸ� ������ ȣ��

//���� Ŭ������ ����� ���� ���� ȣ���Ҽ� �ִ� ��ó�� 

//������ ������ ���� ȣ���� �����ϴ�.

//1.�������� �̸����� Ŭ���� �̸� ��� this�� ȣ��

//2.�� �����ڿ��� �ٸ� �����ڸ� ȣ���� ���� �ݵ�� ù�ٿ�����

//ȣ�� ����

class Car01{

	String color;	
	String name;	
	int price;
	
//	Car01() {	
//		this("�Ͼ���","���",5);
//	}
	
//	Car01(String color) {
//
//		//�ٸ� �����ڸ� ȣ���Ҷ� ù��° ������ ������ ����
//
//		//Car01(String color, String name, int pirce)�� ȣ��
//
//		this(color,"a",5);
//	}
	Car01(String color, String name, int price) 

	{

	this.color=color;

	this.name=name;

	this.price=price;

	}
	//�����ڸ� �̿��� �ν��Ͻ� ����

	//���� : Object Ŭ������ �ִµ� clone

	//�ν��Ͻ� ���縦 ���� ������
	
	Car01(Car01 c) {
	
		color=c.color;	
		name=c.name;	
		price=c.price;
	}
//	Car01(Car c) {
//
//		this(c.color,c.name, c.price);
//
//	}

}
public class Constructor02 {

	public static void main(String[] args) {
		// Car01 c1=new Car01();
		// Car01 c2=new Car01("�Ķ���");
		// 
		// System.out.println(c1.color+" , "+c1.name+" , "+c1.price);
		// System.out.println(c2.color+" , "+c2.name+" , "+c2.price);
		
		Car01 c1=new Car01("�Ͼ��","���",5);
		//Car01�� ���纻 Car02 �����Ѵ�.
		Car01 c2=new Car01(c1);
		System.out.println(c1.color+" , "+c1.name+" , "+c1.price);
		System.out.println(c2.color+" , "+c2.name+" , "+c2.price);
		
		c1.price=599;

		System.out.println(c1.color+" , "+c1.name+" , "+c1.price);
		System.out.println(c2.color+" , "+c2.name+" , "+c2.price);
	
	}
}
