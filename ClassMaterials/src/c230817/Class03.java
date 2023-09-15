package c230817;

public class Class03 {
	//method
	//반환타입 메서드이름(매개변수->경우에따라 o,x) //선언부
	//{
	//호출되면 실행할 코드 => 구현부
	//}
	int add(int a, int b) 

	{

	int result =a+b;

	return result;

	//return a+b;

	}
	
	void Print(int a) 

	{

	System.out.println(a);

	}
	public static void main(String[] agrs) 

	{
		Example example=new Example();
		
		example.Print();
		example.PrintMonth(10);
		example.PrintMonth(20);
		int number=example.num();
		System.out.println(number);
		int result=example.sum(3,4);
		System.out.println(result);
		
	}
}
