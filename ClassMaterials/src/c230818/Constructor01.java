package c230818;

//������
//�ν��Ͻ��� �����ɶ� ȣ��
//�ν��Ͻ� ������ �ʱ�ȭ �۾��� �ַ� ���
//Ŭ�������� ����, ������ �޼���� ������.
//���ϰ��� ����, �ѹ��� ȣ���̵ȴ�, Ŭ������ �̸��� �����ؾ���.

//default Constructor

//��� Ŭ�������� �ݵ�� �����ڰ� ���� �Ǿ� �־�� �Ѵ�.
//�����ڸ� ��������� �������� �ʰ� �ν��Ͻ��� �����Ҽ� �ִ� ������
//�����Ϸ��� default Constructor�� �ڵ������� �߰��ϱ� ������.

/*class Student{

//������

Student(){} // ->����Ʈ ������

//�����ε� ����

Student(String str, int number){}

}

*/
class Data

{

	int value;

}

class Data3

{

	int value1;

//�Ű������� �ִ� ������.

	Data3(int n) 

	{

		value1=n;

	}

}

class Car{

	String color;
	String name;
	String type;
	int price;

	Car(){}

	Car(String c, String n, String t, int p) {
	
	color=c;
	
	name=n;
	
	type=t;
	
	price=p;
	
	}

}
public class Constructor01 {

	public static void main(String[] args) 
	{
		//Student student=new Student(); //Ŭ������ �����ڰ� ��� ����Ʈ �����ڸ� �޴´�.

		Data data=new Data();
		data.value=5;
		System.out.println(data.value);
		
		Data3 data3=new Data3(3);
		System.out.println(data3.value1);
		
		//Data3()//���ǰ� ���� �ʾҴ�.
		
		Car hyundai = new Car();
		hyundai.color="����";
		hyundai.name="�׷���";
		hyundai.price=5000;
		hyundai.type="auto";
		
		Car kia=new Car("����","���","auto",1000);
		
		System.out.println("���� ���� : "+hyundai.color+"�̸� : "+hyundai.name+"���� : "+hyundai.price+"Ÿ�� : "+hyundai.type);
		System.out.println("��� ���� : "+kia.color+"�̸� : "+kia.name+"���� : "+kia.price+"Ÿ�� : "+kia.type);
		
	}
}
