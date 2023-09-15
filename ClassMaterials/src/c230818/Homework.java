package c230818;

import java.util.Scanner;

class Calculation {
	int plus(int a, int b) 

	{ 

	int result=a+b;

	return result;

	}
	double plus(double a, double b) 

	{

	double result=a+b;

	return result;

	}
	int minus(int a, int b) 

	{

	int result=a-b;

	return result;

	}

	double minus(double a, double b) 

	{

	double result=a-b;

	return result;

	}

	int multiply(int a, int b) 

	{

	int result=a*b;

	return result;

	}

	double multiply(double a, double b) 

	{

	double result=a*b;

	return result;

	} 

	int division(int a, int b) 

	{

	int result=a/b;

	return result;

	}

	double division(double a, double b) 

	{

	double result=a/b;

	return result;

	}
}
public class Homework {
	public static void main(String[] args) {
		while (true) {

			Scanner sc=new Scanner(System.in);
			double input1 = 0;
			double input2 = 0;
			
			Calculation calculation=new Calculation();
			
			System.out.println("첫번째 숫자를 입력하세요");

			input1=sc.nextDouble(); 

			System.out.println("두번째 숫자를 입력하세요");

			input2=sc.nextDouble();

			calculation.plus(input1,input2);

			System.out.println("두 수의 덧셈 : "+calculation.plus(input1,input2));

			calculation.minus(input1, input2);

			System.out.println("두 수의 뺄셈 : "+calculation.minus(input1,input2));

			calculation.multiply(input1, input2);

			System.out.println("두 수의 곱셈 : "+calculation.multiply(input1,input2));

			calculation.division(input1, input2);

			System.out.println("두 수의 나눗셈 : "+calculation.division(input1,input2));

			if(input1==0&&input2==0) 

			{

			System.out.println("종료");

			break;

			}
		}
	}
}
