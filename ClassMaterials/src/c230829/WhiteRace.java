package c230829;

public final class WhiteRace extends Person {
	int[] skinColor;
	
	WhiteRace() {
		super();
		skinColor = new int[] {255, 255, 255}; //��ǻ�Ͱ� ����ϴ� ����(i,g,b,����)
		String tempColor = "ffffff";
//		0 || 1
//		11 => 3 / 111 => 7 / 1111 => 15 / 0 ~ 1111 16 2����,16���� �����ϱ�!!
		
	}
}
