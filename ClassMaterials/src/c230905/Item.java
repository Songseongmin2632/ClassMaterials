package c230905;

public class Item {
	private String name;
	private boolean equipped;
	private int defense;
	private int attack;
	
	public Item(String name, int defense, int attack) { //�ʱ�ȭ
		this.name = name;
		this.equipped = false;
		this.defense = defense;
		this.attack = attack;
	}
	
	public String getName() { //��������
		return name;
	}
	
	public boolean isEquipped() {
		return equipped;
	}
	
	public void equip() { //���� �޼���
		equipped = true;
		System.out.println(name + "�� ������");
		
	}
	
	public void unequip() { //Ż�� �޼���
		equipped = false;
		System.out.println(name + "�� Ż����");
		
	}
	
	public int getDefense() {
		return defense;
	}
	
	public int getAttack() {
		return attack;
	}
}
