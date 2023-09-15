package c230814;

import java.util.Scanner;

public class ReferenceClass {
	
	public static void main(String[] args) {
		//String
		//String 참조변수 = "~~";
		//String 참조변수 = new String("~~~~~~"); 소괄호는 생성자
		
		/*String str = new String("안녕"); 결과는 같다
		  String str1 = "안녕";
		  System.out.println(str);
		  System.out.println(str1);
		  
		  String str1=new String("안녕");
		  String str2=str1;

		  str1="안녕하세요";

 		  System.out.println(str1);
		  System.out.println(str2);		  
		*/
		
		String str1=new String("안녕"); //new는 완전히 새로운것
		String str2="안녕"; //같은 문자 리터럴은 공유를한다.(메모리의 효율성)
		String str3="안녕";

		String str4=new String("안녕");
		
		System.out.println(str1==str2); //false

		System.out.println(str2==str3); //true

		System.out.println(str3==str4); //false

		System.out.println(str1==str4); //false
		
		//new로 생성하면 무조건 새롭게 객체를 생성

		//문자열 리터럴로 생성하면 힙 메모리에 리터럴로 생성된 동일한

		//문자열을 포함하고 있는 객체가 있으면 그 객체를 공유한다.
		
		//String 메서드를..

		//length() 문자열의 길이, 리턴타입은 int

		//charAt() : 문자열에서의 특정 index에 위치해있는 문자를 확인할때

		//indexOh() : 문자열에서 특정 문자나 특정 문자열을 앞에서 부터 찾아서 위치 값을 알아낸다.int
		
		//charAt()

		//01234567

//		String text="Hello, world";
//
//		int idx=7;
//
//		char character=text.charAt(idx);
//		
//		System.out.println("character의 idx : "+idx+":"+character);
//		
		//문자열 역순으로 출력하기

		String word="Java";

		String reverseString="";
		
		//문자열의 인덱스는 0부터 시작하니까 길이가 n이라면 당연히 인덱스의 범위는 n-1임
		for(int i=word.length()-1; i>=0; i--) 

		{

		reverseString+=word.charAt(i);

		}

		System.out.println(reverseString);
		
		//subString

		//주어진 시작 인덱스부터 문자열의 끝까지 부분 문자열을 반환

//		String text="Hello, World";
//
//		int idx=7;
		
//		String subText=text.substring(idx);
//
//		System.out.println(subText);
//		
//		String number="941023-1234567";
//
//		//substring(0,6) -> startIndex, endInden, endInex 
//
//		String birth=number.substring(0,6);
//
//		System.out.println(birth);
		
		//indexOf//문자열에서 특정 문자나 문자열이 처음으로 등장하는 인덱스를 반환
		
		String text="Hello, wordl";
		char target='W';
		int index=text.indexOf(target);
		if(index !=1) //찾았다면 

		{

		    System.out.println("찾았다!!"+index);
		         
		}
		else {

			System.out.println("없다!!");

			}

			//문자열로 찾기

			String text1="Java programming";

			String target1 ="programming";
		
			//isEmpty : 문자열이 비어있냐?(길이가 0이냐)
			//비어 있으면 true, 아니면 false
			
			Scanner scanner=new Scanner(System.in);
			System.out.println("문자열 입력해라");
			String input = scanner.nextLine();
			
			if(input.isEmpty()) 

			{

			System.out.println("비어있다");

			}

			else 

			{

			System.out.println(input);

			}
			
			//문자열 배열에서 빈 문자열은 몇개냐?
			String[] strArr= {"Hello","","Java","","World",""};
			
			int count=0;

			for(String string : strArr) 

			{

			if(string.isEmpty()) 

			{

			count++;

			}

			}

			System.out.println(count);
			
			//split
			//문자열을 특정 구분자를 기준으로 분리한다음 문자열 배열로 반환
			
			String text2="Hello, World! Java Programming";

			String[] words=text2.split(" "); //공백을 구분자로 사용하여 분리
			
			for(String word1 : words) 

			{

			System.out.println(word1);

			}
			String data="apple,banana;mango|test";
			String[]items=data.split("[,;|]"); //대괄호안에 구분자로 사용할것을 넣는다.
		
			for(String item : items) 

			{

			System.out.println(item);

			}
			
	}
}
