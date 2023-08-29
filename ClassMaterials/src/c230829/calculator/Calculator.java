package c230829.calculator;

public class Calculator implements CalcInterface {
	public double calculate(char operator, double ...nums) {
		switch(operator) {
		case '+':
			return CalcInterface.super.add(nums);
		case '-':
			return CalcInterface.super.minus(nums);
		case '*':
			return CalcInterface.super.multiply(nums);
		case '/':
			return CalcInterface.super.dividing(nums);
		case '%':
			return CalcInterface.super.remainder(nums);
		default:
			return 0;
		}
	}
//	public int calculate(String formula) {
//		return 0;
//	}
}
