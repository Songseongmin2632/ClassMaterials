package c230829;

interface Human { 
	// 추상화를 극한으로 다룬것!!,클래스와 클래스를 연결해주는 것
	// API =>  Application Programming Interface
	// 프로그램과 프로그램 사이에 데이터를 전달해주는 녀석
	// Web API / API 문서(프론트앤드와 백앤드 사이에서 처리하는 데이터의 규칙을 적어놓은 것)
	// UI => User Interface => 화면에 보여지는 것
	// Interface 는 어떠한 무언가와 어떠한 무언가를 연결하여 중간 과정에서 통신을 처리한다.
	// 간단히 말하면 서로 간에 대화를 가능하게 해준다.(통역사)
	// TMI(자바는 컴파일언어이자 인터프리터 언어이다!!)
	// 인터프리터란 절차적으로 코드를 읽은 후에 오류가 잇으면 오류를 띄우는 것!!
	// 앞에 .이 붙은 것은 자바 그자체
	// src는 소스코드
	// bin은 바이너리 즉 2진수 형태로 저장되잇는 자바
	// 인터페이스 찾아보기!!
	// 부모의 생성자는 자식 생성자에 포함되어야 한다!! -> super();
	// 내 게임
	// 스킬 클래스를 만들고
	// 스킬의 타입에 따라서 인터페이스를 만들어주고 그것을 상속받는다!!
	// 오버라이드에 대해서 제대로 이해하기
	// 각각의 인터페이스에 수치에따른 메서드를 만들어준다!!
	// 클래스가 저장이 될 때 같이 저장되는것이 static이다.(인스턴스에는 존재하지않음)
	// static은 인스턴스(객체)와 관련이 없기 때문에 내용이 없는 인터페이스에 쓸수있다.
	
	/*
	 * 이동하는 메서드
	 */
	void move(); //추상화 밖에 안된다!
}

interface Animal {
	// interface == abstract class 비슷하다~
	void eat();
}

public sealed abstract class Person
implements Human, Animal 
permits YellowRace, WhiteRace 
{
//sealed -> 상속에 대한 봉인!!, permits 봉인해제!!
String species; //추상화를 쓰는 이유는 상속하기 위해서!!	
public static final int number = 1;

Person() {
	species = "human";
}

@Override //확실하게 알려주기 위해 public을 사용해야한다!!
public void move() {
	System.out.println("사람이 이동한다");
}

@Override
public void eat() {
	
}
}
