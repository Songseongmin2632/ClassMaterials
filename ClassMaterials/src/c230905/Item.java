package c230905;

public class Item {
	private String name;
	private boolean equipped;
	private int defense;
	private int attack;
	
	public Item(String name, int defense, int attack) { //ÃÊ±âÈ­
		this.name = name;
		this.equipped = false;
		this.defense = defense;
		this.attack = attack;
	}
	
	public String getName() { //°¡Á®¿À±â
		return name;
	}
	
	public boolean isEquipped() {
		return equipped;
	}
	
	public void equip() { //ÀåÂø ¸Ş¼­µå
		equipped = true;
		System.out.println(name + "À» ÀåÂøÇÔ");
		
	}
	
	public void unequip() { //Å»Âø ¸Ş¼­µå
		equipped = false;
		System.out.println(name + "À» Å»ÂøÇÔ");
		
	}
	
	public int getDefense() {
		return defense;
	}
	
	public int getAttack() {
		return attack;
	}
}
