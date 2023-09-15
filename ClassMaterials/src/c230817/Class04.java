package c230817;

class Exam{
	//같은 패키지 내에서만 사용가능하다.

	void packagePrivateMethod() 

	{

	System.out.println("나는packagePrivateMethod!!");

	}

	//같은 패키지영역에서만 사용가능

	private void PrivateMethod() {

	System.out.println("나는PrivateMethod!!");

	}

	static void staticMethod() {

	System.out.println("나는staticMethod!!"); 

	}

	private static void staticPrivateMethod() {

	System.out.println("나는staticPrivateMethod!!"); 

	}

	public void publicMethod() {

	System.out.println("나는publicMethod!!"); 

	}
}
public class Class04 {
	public static void main(String[] agrs) {
		Exam exam=new Exam();

		exam.packagePrivateMethod();

//		exam.PrivateMethod();
		
		//1.packagePrivate(default) 같은 패키지 내에서만 사용가능

		//2.private 키워드가 명시될때는 자기 자신 클래스외에 접근 불가

		//3.public이 없고 static만 붙어 잇을 경우.packagePrivate와 동일

		//4.public이 붙은 메서드는 외부패키지 어디서든지 접근가능하다.
	}
}
