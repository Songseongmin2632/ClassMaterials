package c230818;

import java.util.Scanner;

class RecDefault {
	static int horizontal;
	static int vertical; 
}

class RecCalculation {
	int circumference; 
	int area;
	
	RecCalculation(int horizontal,int vertical) 

	{

	circumference=(horizontal+vertical)*2;

	area=(horizontal*vertical); 

	}
}

public class Homework2 {
	public static void main(String[] args) {
		RecDefault rec=new RecDefault();

		Scanner sc=new Scanner(System.in);
		
		System.out.println("���ΰ��� �Է��ض�");
		rec.horizontal=sc.nextInt();

		System.out.println("���ΰ��� �Է��ض�");
		rec.vertical=sc.nextInt();
		
		RecCalculation rec2=new RecCalculation(rec.horizontal,rec.vertical);
		
		System.out.println("�簢���� �ѷ��� : "+rec2.circumference);

		System.out.println("�簢���� ������ : "+rec2.area);
			
	}
}
