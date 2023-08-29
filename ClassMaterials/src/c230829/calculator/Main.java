package c230829.calculator;

public class Main {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.calculate('+', 1, 2.5, 9));
		System.out.println(calc.calculate('-', 10, 0.8, 1));
		System.out.println(calc.calculate('*', 10, 8.7, 5));
		System.out.println(calc.calculate('/', 10.5, 4));
		System.out.println(calc.calculate('%', 19, 9));
	}
}
