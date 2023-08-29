package c230829;

interface InterfaceTest {
	/* public static final */int NUMBER = 1; //상수는 반드시 대문자!!
	// 정적인 상수는 인터페이스에서 사용이 가능하다.
	// 얘는 왜 다중 상속이 가능할까? >> 클래스와 달리 내용이 없고 이름만 존재하기 때문에
	// 컴퓨터가 인식을 쉽게 할 수 있다.
	/* public abstract */void methodTest();
	
	static void staticMethodTest() {
		System.out.println("정적 메서드 가능");
		// private 메서드 호출 가능? 불가능?
		privateStaticMethodTest();
	}
	
	private static void privateStaticMethodTest() {
		System.out.println("private 정적 메서드 가능");
	}
	
	private void privateMethodTest() {
		System.out.println("private 메서드 가능");
	}
	// static은 타 클래스에 메서드를 사용하기위해서 쓰고
	// private는 타 클래스에서 직접 사용할 순 없지만 인터페이스 내에서
	// static에 포함해주기 위해서 사용한다.
	static int add(int ...args) {
		return 1;
	}
	
	default void defaultMethodTest() {
		privateMethodTest();
	}
}

class ClassTest implements InterfaceTest{
	@Override
	public void methodTest() {}
	
	@Override
	public void defaultMethodTest() {
		InterfaceTest.super.defaultMethodTest();
	}
}

public class Main {
	public static void main(String[] args) {
		InterfaceTest.staticMethodTest();
		
		YellowRace JKH = new YellowRace();
		JKH.move();
//		JKH.skinColor
		Person[] people = new Person[] {JKH, new WhiteRace()}; //업캐스팅!!
//		people[0].skin
		//위는 YellowRace클래스에서 직접 가져온거라서 가능하고
		//아래는 Person이라는 부모클래스 타입을 가졋기 때문에 Person에 스킨컬러가 없으므로 불가능
//		people[0].move -> 주석관련해서 찾아보기!!
	}
}

