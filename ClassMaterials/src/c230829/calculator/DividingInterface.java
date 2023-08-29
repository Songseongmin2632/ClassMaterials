package c230829.calculator;

public interface DividingInterface {
	default double dividing(double num1, double num2) {
		return num1 / num2;
	}
}
