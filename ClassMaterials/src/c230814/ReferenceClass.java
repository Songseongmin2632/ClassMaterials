package c230814;

import java.util.Scanner;

public class ReferenceClass {
	
	public static void main(String[] args) {
		//String
		//String �������� = "~~";
		//String �������� = new String("~~~~~~"); �Ұ�ȣ�� ������
		
		/*String str = new String("�ȳ�"); ����� ����
		  String str1 = "�ȳ�";
		  System.out.println(str);
		  System.out.println(str1);
		  
		  String str1=new String("�ȳ�");
		  String str2=str1;

		  str1="�ȳ��ϼ���";

 		  System.out.println(str1);
		  System.out.println(str2);		  
		*/
		
		String str1=new String("�ȳ�"); //new�� ������ ���ο��
		String str2="�ȳ�"; //���� ���� ���ͷ��� �������Ѵ�.(�޸��� ȿ����)
		String str3="�ȳ�";

		String str4=new String("�ȳ�");
		
		System.out.println(str1==str2); //false

		System.out.println(str2==str3); //true

		System.out.println(str3==str4); //false

		System.out.println(str1==str4); //false
		
		//new�� �����ϸ� ������ ���Ӱ� ��ü�� ����

		//���ڿ� ���ͷ��� �����ϸ� �� �޸𸮿� ���ͷ��� ������ ������

		//���ڿ��� �����ϰ� �ִ� ��ü�� ������ �� ��ü�� �����Ѵ�.
		
		//String �޼��带..

		//length() ���ڿ��� ����, ����Ÿ���� int

		//charAt() : ���ڿ������� Ư�� index�� ��ġ���ִ� ���ڸ� Ȯ���Ҷ�

		//indexOh() : ���ڿ����� Ư�� ���ڳ� Ư�� ���ڿ��� �տ��� ���� ã�Ƽ� ��ġ ���� �˾Ƴ���.int
		
		//charAt()

		//01234567

//		String text="Hello, world";
//
//		int idx=7;
//
//		char character=text.charAt(idx);
//		
//		System.out.println("character�� idx : "+idx+":"+character);
//		
		//���ڿ� �������� ����ϱ�

		String word="Java";

		String reverseString="";
		
		//���ڿ��� �ε����� 0���� �����ϴϱ� ���̰� n�̶�� �翬�� �ε����� ������ n-1��
		for(int i=word.length()-1; i>=0; i--) 

		{

		reverseString+=word.charAt(i);

		}

		System.out.println(reverseString);
		
		//subString

		//�־��� ���� �ε������� ���ڿ��� ������ �κ� ���ڿ��� ��ȯ

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
		
		//indexOf//���ڿ����� Ư�� ���ڳ� ���ڿ��� ó������ �����ϴ� �ε����� ��ȯ
		
		String text="Hello, wordl";
		char target='W';
		int index=text.indexOf(target);
		if(index !=1) //ã�Ҵٸ� 

		{

		    System.out.println("ã�Ҵ�!!"+index);
		         
		}
		else {

			System.out.println("����!!");

			}

			//���ڿ��� ã��

			String text1="Java programming";

			String target1 ="programming";
		
			//isEmpty : ���ڿ��� ����ֳ�?(���̰� 0�̳�)
			//��� ������ true, �ƴϸ� false
			
			Scanner scanner=new Scanner(System.in);
			System.out.println("���ڿ� �Է��ض�");
			String input = scanner.nextLine();
			
			if(input.isEmpty()) 

			{

			System.out.println("����ִ�");

			}

			else 

			{

			System.out.println(input);

			}
			
			//���ڿ� �迭���� �� ���ڿ��� ���?
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
			//���ڿ��� Ư�� �����ڸ� �������� �и��Ѵ��� ���ڿ� �迭�� ��ȯ
			
			String text2="Hello, World! Java Programming";

			String[] words=text2.split(" "); //������ �����ڷ� ����Ͽ� �и�
			
			for(String word1 : words) 

			{

			System.out.println(word1);

			}
			String data="apple,banana;mango|test";
			String[]items=data.split("[,;|]"); //���ȣ�ȿ� �����ڷ� ����Ұ��� �ִ´�.
		
			for(String item : items) 

			{

			System.out.println(item);

			}
			
	}
}
