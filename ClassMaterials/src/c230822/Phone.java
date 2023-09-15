package c230822;

//public private protected static final



interface InterfacePhone{

String SiMNUMBER = "dd";

//public static final만 가능하다.

public void installApp(String appName); //앱설치 메서드

void call(String otherOwner); //전화한다.

}

public abstract class Phone implements InterfacePhone {

	// abstract 은 추상

	public String number;

	//퍼블릭 변수는 잘 사용하지 않는다.

	//객체 지향적으로 코딩해야한다.

	//캡슐화, 추상화, 다형성, 상속

	//캡슐화 특징이 있기때문에 퍼블릭 변수는 잘 쓰지 않는다.

	private String owner;

	protected String operator = "SKT";//상속할때 넘겨주기 위해 사용,패키지가 달라지면 가져올수없다.

	// public static String model = "갤럭시 폴드3";//클래스 자체가 가지는 변수,인스턴스로

	//사용해도 되지만 클래스로 사용한다.

	// public final String MANUFACTURER = "삼성"; //수학으로 따지면 상수 취급(변하지 않는다)

	// public static final double PI = 3.14;//사회적으로 정의된 값

	public Phone(String owner) {

		this.owner = owner;

	}
	public void setOwner(String owner) {

		// setter

		this.owner = owner;

	}

	public String getOwner() {

		// getter

		return owner;

		//super 부모클래스 참조변수,참조 : 주소값을 찾아가서 데이터를 가져온다.

	}
	
	public void takeAPicture() {

		System.out.println("사진을 찍었습니다.");

	}
	@Override

	public void call(String otherOwner) {

		System.out.println(owner + "가" + otherOwner +"에게 전화를 건다.");

	}
}

