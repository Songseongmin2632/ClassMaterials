package c230904;


//class Apple{}
//class Pencil{}
//
//class Goods<T extends Fruit>{
//	
//}

//class A{}
//class B extends A{}
//class C extends B{}
//class D <T extends B>{
//	
//	private T t;
//	
//	public T get() {
//		return t;
//	}
//	public void Set(T t) {
//		this.t =t;
//	}
//}



//���׸� Ŭ������ Ÿ������
//���� ������ class Ŭ������<T extends �ֻ���Ŭ���� / �������̽���>{}
//���⼭�� extends�� ����Ѵٴ� ������ �ƴ϶� �ֻ���Ŭ���� Ȥ�� �������̽��� ����Ѵٴ� �����̴�.

//���׸� �޼��� Ÿ������
//���� ������<T extends �ֻ��� Ŭ����/�������̽�> T �޼���(T t){}

//class GenericMethod01{
//	public <T> void test(T t) {
//		char c=t.charAt(0);
//	}
//	public <T extends String>void method2(T t) {
//		char c=t.charAt(0);
//	}
//}

class GenericMethod01{
	public <T extends Number> void Method1(T t) {
		System.out.println(t.intValue());
	}
}
interface MyInterface{
	public abstract void print();
}
class B{
	public <T extends MyInterface> void Method01(T t) {
		t.print();
	}
}
public class Generic3 {
public static void main(String[] args) {
		
		//D<A> d1= new D<>();
//		D<B> d2=new D<>();
//		D<C> d3=new D<>();
		
		GenericMethod01 g=new GenericMethod01();
		g.Method1(5.5);
		
		B b=new B();
		b.Method01(new MyInterface() {
			
			@Override
			public void print() {
				System.out.println("Print()����");
			}
		});
	}
}
