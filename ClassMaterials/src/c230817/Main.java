package c230817;

class Homework{
	
	int plus(int a,int b) 

	{

	return a+b;

	}

	int minus(int a,int b) 

	{

	return a-b;

	}

	int multiply(int a,int b) 

	{

	return a*b;

	}

	int breaks(int a,int b) 

	{

	return a/b;

	}
}
public class Main {

	public static void main(String[] args) {
		Homework homework=new Homework();
		
		int result1=homework.plus(5,6);

		int result2=homework.minus(9,6);

		int result3=homework.multiply(2,8);

		int result4=homework.breaks(10,5);

		System.out.println(result1);

		System.out.println(result2);

		System.out.println(result3);

		System.out.println(result4);
	}
}
