package c230818;

//생성자에서 다른 생성자 호출

//같은 클래스의 멤버들 간에 서로 호출할수 있는 것처럼 

//생성자 간에도 서로 호출이 가능하다.

//1.생성자의 이름으로 클래스 이름 대신 this를 호출

//2.한 생성자에서 다른 생성자를 호출할 때는 반드시 첫줄에서만

//호출 가능

class Car01{

	String color;	
	String name;	
	int price;
	
//	Car01() {	
//		this("하양이","모닝",5);
//	}
	
//	Car01(String color) {
//
//		//다른 생성자를 호출할때 첫번째 에서만 가능한 이유
//
//		//Car01(String color, String name, int pirce)를 호출
//
//		this(color,"a",5);
//	}
	Car01(String color, String name, int price) 

	{

	this.color=color;

	this.name=name;

	this.price=price;

	}
	//생성자를 이용한 인스턴스 복사

	//참고 : Object 클래스가 있는데 clone

	//인스턴스 복사를 위한 생성자
	
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
		// Car01 c2=new Car01("파랑이");
		// 
		// System.out.println(c1.color+" , "+c1.name+" , "+c1.price);
		// System.out.println(c2.color+" , "+c2.name+" , "+c2.price);
		
		Car01 c1=new Car01("하얀색","모닝",5);
		//Car01의 복사본 Car02 생성한다.
		Car01 c2=new Car01(c1);
		System.out.println(c1.color+" , "+c1.name+" , "+c1.price);
		System.out.println(c2.color+" , "+c2.name+" , "+c2.price);
		
		c1.price=599;

		System.out.println(c1.color+" , "+c1.name+" , "+c1.price);
		System.out.println(c2.color+" , "+c2.name+" , "+c2.price);
	
	}
}
