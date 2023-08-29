package c230829.calculator;

public interface CalcInterface extends AddInterface, MinusInterface, MultiplyInterface, DividingInterface, RemainderInterface {
	public default double add(double ...nums) {
		double temp = 0;
		for(double num : nums) {
			temp = AddInterface.super.add(temp, num);
		}
		return temp;
	}
		
	public default double minus(double ...nums) {
		double temp = nums[0];
		for(int i=1; i < nums.length; i++) {
			temp = MinusInterface.super.minus(temp, nums[i]);
		}
		return temp;
	}
	
	public default double multiply(double ...nums) {
		double temp = nums[0];
		for(int i=1; i < nums.length; i++) {
			temp = MultiplyInterface.super.multiply(temp, nums[i]);
		}
		return temp;
	}
	
	public default double dividing(double ...nums) {
		double temp = nums[0];
		for(int i=1; i < nums.length; i++) {
			temp = DividingInterface.super.dividing(temp, nums[i]);
		}
		return temp;
	}
	
	public default double remainder(double ...nums) {
		double temp = nums[0];
		for(int i=1; i < nums.length; i++) {
			temp = RemainderInterface.super.remainder(temp, nums[i]);
		}
		return temp;
	}

}
