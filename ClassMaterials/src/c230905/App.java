package c230905;

import java.util.Scanner;

enum SELECT{
	INVENTORY,
	EQUIP_ITEM,
	UNEQUIP_ITEM,
	EXIT,
	INVALID
	
}

public class App {

	public static void main(String[] args) {
		
		Player player = new Player(0,0);
		
		Item item1 = new Item("�����",0,10);
		Item item2 = new Item("������ ����",5,0);
		
		player.AddItem(item1);
		player.AddItem(item2);
		Scanner sc = new Scanner(System.in);		
		int choice;
		while (true) {
			System.out.println("1.�κ��丮 ����");
			System.out.println("2.������ ����");
			System.out.println("3.������ Ż��");
			System.out.println("4.����");
			System.out.println("�޴� ���� : ");
			
			choice = sc.nextInt();
			SELECT userSelect = select(choice);
			
			switch (userSelect) {
			case INVENTORY :
				player.listInventory();
				break;
			case EQUIP_ITEM :
				System.out.println("������ ������ ��ȣ �Է� : ");
				int idx = sc.nextInt();
				player.equipItem(idx);
				break;
			case UNEQUIP_ITEM :
				System.out.println("Ż���� ������ ��ȣ �Է� : ");
				int unidx = sc.nextInt();
				player.unequipItem(unidx);
				break;
			
			}
		}
	}
	private static SELECT select(int select) {
		switch (select) {
		case 1 : return SELECT.INVENTORY;
		case 2 : return SELECT.EQUIP_ITEM;
		case 3 : return SELECT.UNEQUIP_ITEM;
		case 4 : return SELECT.EXIT;
		default : return SELECT.INVALID;
		}
	}
}
