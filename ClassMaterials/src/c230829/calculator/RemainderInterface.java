package c230829.calculator;

public interface RemainderInterface {
	default double remainder(double num1, double num2) {
		return num1 % num2;
	}
}
