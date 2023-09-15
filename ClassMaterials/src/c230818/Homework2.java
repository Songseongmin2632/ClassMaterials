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
		
		System.out.println("가로값을 입력해라");
		rec.horizontal=sc.nextInt();

		System.out.println("세로값을 입력해라");
		rec.vertical=sc.nextInt();
		
		RecCalculation rec2=new RecCalculation(rec.horizontal,rec.vertical);
		
		System.out.println("사각형의 둘레값 : "+rec2.circumference);

		System.out.println("사각형의 면적값 : "+rec2.area);
			
	}
}
