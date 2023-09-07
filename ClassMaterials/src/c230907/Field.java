package c230907;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Field {

	public int[] priority = new int[5]; //우선순위
	public String[] title = new String[5]; //제목
	public String[] content = new String[5]; //내용
	List<String> list = new ArrayList<>();
			
	void informationStoring() { //정보 저장
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i < 5; i++) {			
			System.out.println("제목을 입력하세요");
			title[i] = sc.nextLine();
				
			while (true) {
				System.out.println("우선순위를 입력하세요(1~5)");
				priority[i] = sc.nextInt();			
				
				if(priority[i] <= 0 || priority[i] > 5) {
					System.out.println("잘못된 입력입니다");
					continue;
				}
				else {
					break;
				}				
			}
			sc.nextLine();
			System.out.println("내용을 입력하세요");
			content[i] = sc.nextLine();			
			System.out.println("=============================");			
		}
	}
				
	void list() { //입력
		
		Scanner sc = new Scanner(System.in);
						
		for(int i=0; i < 5; i++) {
			list.add(title[i]);
		}
		while (true) {
			System.out.println(list);
						
			System.out.println("우선순위를 입력하세요");
			int input;
			input = sc.nextInt();		
			
			for(int i=0; i < 5; i++) {
				if(input==i+1) {
					System.out.println("제목 : "+title[i]);
					System.out.println("우선순위 : "+priority[i]);
					System.out.println("내용 : "+content[i]);
				}
			}
						
			System.out.println();
			System.out.println();
		}
	}
}
