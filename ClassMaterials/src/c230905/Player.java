package c230905;

import java.util.ArrayList;
import java.util.List;

class Player {

	private List<Item> inventory;
	private int defense;
	private int attack;
	
	public Player(int defense, int attack) {
		inventory = new ArrayList<>();
		this.defense = defense;
		this.attack = attack;
	}
	
	public void AddItem(Item item) {
		inventory.add(item);
	}
	
	public void listInventory() {
		System.out.println("�κ��丮 ������ ��� : ");
		for(Item item : inventory) {
			System.out.println(item.getName()+"���� ���� : "+(item.isEquipped() ?"����":"Ż��"+")"));
		}
	}
	
	public void equipItem(int index) {
		//���� �����Ϸ��� �ε����� 0�̻�, �κ��丮 ũ�⺸�� ������
		if(index >= 0 && index < inventory.size()) { 
			
			Item item=inventory.get(index);
			//�����Ǿ� ���� �ʴٸ�?
			if(!item.isEquipped()) {
				item.equip(); //����!
				
				defense += item.getDefense();
				attack += item.getAttack();
				
				System.out.println("������ "+defense+"����");
				System.out.println("���ݷ��� "+attack+"����");
			}
			else {
				System.out.println(item.getName()+"�� �̹� ����");
				
			}
			
		}
		else {
			System.out.println("���");
		}
	}
	
	public void unequipItem(int index) {
		
		if(index >= 0 && index < inventory.size()) {
			Item item = inventory.get(index);
			
			if((item.isEquipped())) {
				item.unequip();
			}
			else {
				System.out.println();
			}
		}
	}
}