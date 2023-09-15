package c230817;

class Variables{
	
	int instanceVariable; //인스턴스

	static int classVariable; //클래스 변수
}
class Card{
	
	//인스턴스

	String kind;

	int number;
	
	
	//클래스변수

	static int width=100;  //폭

	static int height=200; //높이
	
	
	void Print() {

//		int num;
//
//		System.out.println(num); //강제초기화가 안되므로 초기화를 해줘야한다.

		}
}
public class Class02 {
	//변수의 종류         선언위치                       생성시기

	//인스턴스 변수        클래스영역    인스턴스가 생성되었을때

	//클래스 변수        클래스영역    클래스가 메모리에 올라갈때

	//지역변수            클래스 영역 이외 모두    변수 선언문이 실행되었을때

	//	              (메서드, 생성자, 블럭내부..)
	
	
	//인스턴스 변수

	//

	public static void main(String[] agrs) 

	{

	//멤버변수를 제외한 모든것은 지역변수
	// Variables.classVariable=20;
	// System.out.println(Variables.classVariable);
		
	System.out.println("card의 폭 : "+Card.width);
	System.out.println("card의 높이 : "+Card.height);
	
	Card c1=new Card();
	c1.kind="e";
	c1.number=7;
	
	Card c2=new Card();
	c2.kind="a";
	c2.number=5;
	
	System.out.println
	("c1은"+c1.kind+","+c1.number+"이고 사이즈는("+c1.width+","+c1.height+")");
	System.out.println
	("c2은"+c2.kind+","+c2.number+"이고 사이즈는("+c2.width+","+c2.height+")");
	
	System.out.println("c1의 width와 height를 변경해볼까");
	c1.width=20;
	c1.height=20;
	
	//클래스변수를 쓸때는 구분을 해줘야한다.

	System.out.println
	("c1은"+c1.kind+","+c1.number+"이고 사이즈는("+c1.width+","+c1.height+")");
	System.out.println
	("c2은"+c2.kind+","+c2.number+"이고 사이즈는("+c2.width+","+c2.height+")");
	System.out.println
	("c2은"+c2.kind+","+c2.number+"이고 사이즈는("+Card.width+","+Card.height+")");
	
	}	
}

class Example{
	void Print() {

	//void 이므로 리턴타입 없음
	System.out.println("print함수 호출");
	}
	
	int num() {

		return 3;
	}
	
	int sum(int a, int b) {

		return a+b;
	}
	
	void PrintMonth(int num) {

		if(num<0||num>12) {

		System.out.println("잘못된 입력");

		return; // 함수를 종료한다.

		}
		else {

			System.out.println(num+"임");

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
	//인스턴스 변수와 관계없이 매개변수로 처리

	static int add(int a,int b) //a,b는 local Variable

	{

	return a+b;

	}
}
