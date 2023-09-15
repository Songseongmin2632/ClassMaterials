package c230901;

import java.util.Random;

public class MathTest {
	public static void test() {
		System.out.println(Math.abs(-5)); //앱솔루트 절댓값
		System.out.println(Math.abs(-5.5));
		
		System.out.println(Math.ceil(5.1)); //올림
		System.out.println(Math.ceil(5.00000001)); //소수점이 존재하면 반드시 올림
		
		System.out.println(Math.floor(5.1)); //내림
		System.out.println(Math.floor(5.99999999999)); //소수점이 존재하면 반드시 내림
		
		System.out.println(Math.max(4, 7)); //최댓값
		System.out.println(Math.min(4, 7)); //최솟값
		
		System.out.println(Math.round(5.1)); //반올림
		System.out.println(Math.round(5.9));
		
		Random rd = new Random(2); //매개변수로 랜덤에 대한 참조값을 전달할 수 있다. 이런 참조값을 종자값(seed) 이라고 말한다.
		System.out.println(rd.nextInt(9)+1);
		System.out.println(rd.nextInt(9)+1);
		System.out.println(rd.nextInt(9)+1);
		Random rd1 = new Random(1);
		System.out.println(rd1.nextInt(9)+1);
		System.out.println(rd1.nextInt(9)+1);
		System.out.println(rd1.nextInt(9)+1);
		
		
	}
}