package c230814;

import java.util.Scanner;

public class Puzzle {	

	public static void main(String[] args) {
		
		int[] number = new int[25];
		
		//셔플용 변수
		int dest,sour,temp;
		int key=0;
		int save=24; //0의 위치
		int move; //0의 움직임
		
		for(int i=24; i>=0; i--) 

		{

		number[save-i]=i; 

		}
		//셔플

		for (int i=0; i < 200; i++) 

		{

		dest=(int)(Math.random()*24);

		sour=(int)(Math.random()*24);
		
		temp=number[dest];

		number[dest]=number[sour];

		number[sour]=temp;
		}
		Scanner scanner=new Scanner(System.in);
		while (true) {
			for(int i=0; i < number.length; i++) {
				System.out.print(number[i]+"\t");
				
				if((i+1)%5==0) {
					System.out.print("\n\n\n");
				}
			}
			String inputStr = scanner.nextLine();
			key = Integer.parseInt(inputStr);
			
			
			switch (key) {
			
			case 4:
				if(save%5==0) {
					break;
				}
				move = number[save];
				number[save]=number[save-1];
				number[save-1]=move;
				save--;
				break;
				
			case 6:
				if((save+1)%5==0) {
					break;
				}
				move = number[save];
				number[save]=number[save+1];
				number[save+1]=move;
				save++;
				break;
				
			case 8:
				if(save<5) {
					break;
				}
				move = number[save];
				number[save]=number[save-5];
				number[save-5]=move;
				save-=5;
				break;
				
			case 2:
				if(save>=20) {
					break;
				}
				move = number[save];
				number[save]=number[save+5];
				number[save+5]=move;
				save-=5;
				break;
			}						
		}
	}
}	