package c230901;

public class StrBuilderTest {
	public static void strBuilderTest() {
		String str1 = "abc";
		str1 = str1 + "defg";
		
		StringBuilder sb = new StringBuilder();
		str1 = str1.replace("b", "z");
		String str2 = sb.append("글자를 추가한다.").toString();
		System.out.println(str2);
		System.out.println(sb.delete(4, 6).toString());
		System.out.println(sb.replace(4, 4, "수정").toString());
		System.out.println(sb.replace(4, 6, "치환").toString());
		System.out.println(sb.append("글자 추가").toString());
		str1.substring(5);
		
				
	}
}

