package c230907;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Field {

	public int[] priority = new int[5]; //�켱����
	public String[] title = new String[5]; //����
	public String[] content = new String[5]; //����
	List<String> list = new ArrayList<>();
			
	void informationStoring() { //���� ����
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i < 5; i++) {			
			System.out.println("������ �Է��ϼ���");
			title[i] = sc.nextLine();
				
			while (true) {
				System.out.println("�켱������ �Է��ϼ���(1~5)");
				priority[i] = sc.nextInt();			
				
				if(priority[i] <= 0 || priority[i] > 5) {
					System.out.println("�߸��� �Է��Դϴ�");
					continue;
				}
				else {
					break;
				}				
			}
			sc.nextLine();
			System.out.println("������ �Է��ϼ���");
			content[i] = sc.nextLine();			
			System.out.println("=============================");			
		}
	}
				
	void list() { //�Է�
		
		Scanner sc = new Scanner(System.in);
						
		for(int i=0; i < 5; i++) {
			list.add(title[i]);
		}
		while (true) {
			System.out.println(list);
						
			System.out.println("�켱������ �Է��ϼ���");
			int input;
			input = sc.nextInt();		
			
			for(int i=0; i < 5; i++) {
				if(input==i+1) {
					System.out.println("���� : "+title[i]);
					System.out.println("�켱���� : "+priority[i]);
					System.out.println("���� : "+content[i]);
				}
			}
						
			System.out.println();
			System.out.println();
		}
	}
}
