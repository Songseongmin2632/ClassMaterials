package c230817;

	//�ٸ� ��Ű���� Ŭ������ ����ϰ��� �Ҷ� ����

	//import ReferenceType.ReferenceClass;
	
	//�ܺ�Ŭ����

	//public Ű����� �� �� ����.

class TV{
	String clor; //�ν��Ͻ� ����

	boolean power;

	int channel;
	
	void power()  //��ȯ���� ����

	{

	power = !power;

	}

	void ChannelUp() 

	{

	channel++;

	}

	void ChannelDown() 

	{

	channel--;

	}
}

//Ŭ������ �빮�ڷ� �����Ѵ�.

//public�� ���� Ŭ������ ���ϸ�� �����ؾ� �Ѵ�.

//��Ű��,import,�ܺ� Ŭ���� 3�������� public class�ۿ� ��ġ�Ҽ��ִ�.

public class Class01 {
	
	int a=3; //�ν��Ͻ� ����
	
	static int num=5; //Ŭ���� ����
	
	//�޼��� : Ŭ������ ���ϰ� �ִ� ���

	//����� ���õ� Ŭ������� ��Ա�, ��ϱ� ���

	//int sum(int a, int b)�޼���
	
	//Class(){ //������
	
	//Class(int a, int b) {
	
	//class Test{
	
	public static void main(String[] args) {
		
		TV tv1; //�ν��Ͻ��� �����ϱ� ���� ���� ����

		tv1=new TV();//�ν��Ͻ� ����

		tv1.channel=11;//tv�� �ν��Ͻ� ������ channel���� 11�� �Ѵ�.

		tv1.ChannelDown(); //tv �ν��Ͻ� �޼��� ChannelDown()ȣ��

		System.out.println("���� ���� ���� ä���� : "+tv1.channel+"��");

		
		TV tv2=new TV();

		tv2.channel=12;

		tv2.ChannelDown();

		System.out.println("���� ���� ���� ä���� : "+tv2.channel+"��");

		
		tv2=tv1;

		tv1.channel=7; //tv1�� ä�� ����

		System.out.println("tv1�� channel : "+tv1.channel);

		System.out.println("tv1�� channel : "+tv2.channel);
		
		
		//TV tv1,tv2,tv3;

		//TV[] tvArr=new TV[3]; //�������� �迭�� �����
		
		
		//��ü�� ����->�迭�� ����ҿ� ����

		//tvArr[0]=new TV();

		//tvArr[1]=new TV();

		//tvArr[2]=new TV();
		
		
		//TV[] tvArr= {new TV(),new TV(), new TV()};
		
		
		//TV[] tvArr=new TV[100];

		//for (int i=0; i<tvArr.length; i++) {

		// tvArr[i]=new TV();

		//}	
		
		
		TV[] tvArr=new TV[3];
		
		for (int i=0; i < tvArr.length; i++) {

			tvArr[i]=new TV();

			tvArr[i].channel=i+10;
			
			System.out.printf("tvArr[%d].channel=%d\n",i,tvArr[i].channel); 

		}
		for (int i=0; i < tvArr.length; i++) {

			tvArr[i].ChannelUp(); //tv[i]�� �޼��带 ȣ��. ä���� 1�� ����

			System.out.printf("tvArr[%d].channel=%d\n",i,tvArr[i].channel);

		}
		
		
	}
}