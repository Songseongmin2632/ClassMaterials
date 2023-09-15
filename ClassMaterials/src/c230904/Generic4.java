package c230904;


//class Parent<T>{
//
//T t;
//public T getT(){
//	return t;
//}
//public void SetT(T t) {
//	this.t=t;
//}
//}
//class Child01<T> extends Parent<T>{
//
//}
//class Child02<T1, T2> extends Parent<T1>{
//
//}

class Shape<T>{

protected T name;

//������ "  ������ �̸��� �޾� �ʱ�ȭ
public Shape(T name) {
	this.name=name;
}
public double getArea() {
	return 0.0;
}
public void PrintInfo() {
	System.out.println("���� : "+name);
	System.out.println("Area : "+getArea());
}
}


class Circle<T> extends Shape<T>{
private double radius;

public Circle(T name, double radius) {
	super(name);
	this.radius=radius;
}
@Override
public double getArea() {
	return Math.PI*radius*radius;
}
}
class Rectangle<T> extends Shape<T>{
private double width;
private double height;

public Rectangle(T name, double width, double height) {
	
	super(name);
	this.width=width;
	this.height=height;
}
@Override
public double getArea() {
	return width* height;
}
}
public class Generic4 {
	public static void main(String[] args) 
	{
		
		Circle<String>circle=new Circle<>("��", 5.0);
		Rectangle<String>rectangle=new Rectangle<>("�簢��", 4.0,6.0);
		
		circle.PrintInfo();
		System.out.println();
		rectangle.PrintInfo();
		
	}
}

