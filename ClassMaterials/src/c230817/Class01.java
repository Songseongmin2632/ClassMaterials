package c230817;

	//다른 패키지의 클래스를 사용하고자 할때 포함

	//import ReferenceType.ReferenceClass;
	
	//외부클래스

	//public 키워드는 쓸 수 없다.

class TV{
	String clor; //인스턴스 변수

	boolean power;

	int channel;
	
	void power()  //반환값이 없다

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

//클래스는 대문자로 시작한다.

//public이 붙은 클래스는 파일명과 동일해야 한다.

//패키지,import,외부 클래스 3가지만이 public class밖에 위치할수있다.

public class Class01 {
	
	int a=3; //인스턴스 변수
	
	static int num=5; //클래스 변수
	
	//메서드 : 클래스가 지니고 있는 기능

	//사람과 관련된 클래스라면 밥먹기, 운동하기 등등

	//int sum(int a, int b)메서드
	
	//Class(){ //생성자
	
	//Class(int a, int b) {
	
	//class Test{
	
	public static void main(String[] args) {
		
		TV tv1; //인스턴스를 참조하기 위한 변수 선언

		tv1=new TV();//인스턴스 생성

		tv1.channel=11;//tv의 인스턴스 변수인 channel값을 11로 한다.

		tv1.ChannelDown(); //tv 인스턴스 메서드 ChannelDown()호출

		System.out.println("현재 내가 누른 채널은 : "+tv1.channel+"임");

		
		TV tv2=new TV();

		tv2.channel=12;

		tv2.ChannelDown();

		System.out.println("현재 내가 누른 채널은 : "+tv2.channel+"임");

		
		tv2=tv1;

		tv1.channel=7; //tv1의 채널 변경

		System.out.println("tv1의 channel : "+tv1.channel);

		System.out.println("tv1의 channel : "+tv2.channel);
		
		
		//TV tv1,tv2,tv3;

		//TV[] tvArr=new TV[3]; //참조변수 배열을 만들고
		
		
		//객체를 생성->배열의 각요소에 저장

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

			tvArr[i].ChannelUp(); //tv[i]의 메서드를 호출. 채널이 1씩 증가

			System.out.printf("tvArr[%d].channel=%d\n",i,tvArr[i].channel);

		}
		
		
	}
}