package c230906;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

enum STATE{
	ATTACK,
	USE_ITEM,
	RUN
}
class Player extends Unit{
	 
	 
	 public Player(String name, int health, int attackPower) {
		 super(name, health, attackPower);
		 
		 randomItems();
	 }
	 
	 private LinkedList<Item> inventory= new LinkedList<>();
	 private int attackPowerModifier=0;
	 private String[] itemNames= {
			 "��","����","����","��� ������","�������"
	 };
	private Scanner scanner=new Scanner(System.in);
	 //������ ��������
 	 private void randomItems() {
		 Random random=new Random();
		 
		 //1~3
		 int numItem=random.nextInt(3)+1;
		 
		 //������ ������ �̸��̶� ���ݷ�
		 for (int i = 0; i < numItem; i++) 
		 {
			 //�̸� ������ ������ �̸��߿� �ϳ�
			String itemName=itemNames[random.nextInt(itemNames.length)];
			int itemPower= random.nextInt(10)+1;//������ ���ݷ�
			
			Item item=new Item(itemName, itemPower);//�����ϰ�
			inventory.add(item);//�κ��丮�� �߰�
		 }
	 }
	 public STATE selectAction() {
		 
		 System.out.println("1.����");
		 System.out.println("2.������ ���");
		 System.out.println("3.Ƣ���");
		 System.out.print("�����ض� : ");
		 
		 int select= scanner.nextInt();
		 switch (select) {
		case 1:
			return STATE.ATTACK;
		case 2:
			return STATE.USE_ITEM;
		case 3:
			return STATE.RUN;
		default:
			return null;
		}
	 }
	 public void addItem(Item item) {
		 inventory.add(item);
		 
		 System.out.println(getName()+"��"+item.getName()+"�� ȹ����");
		  
	 }
	 public void useItem()
	 {
		 System.out.println("����� �������� �����ض�!");
		 int index=1;
		 for(Item item:inventory) {
			 System.out.println(index+". "+item.getName());
			 index++;
		 }
		 int choice=scanner.nextInt();
		 if(choice>=1 &&choice<=inventory.size()) {
			 Item selected= inventory.get(choice-1);
			 
			 
			 System.out.println(getName()+"��"+
			 selected.getName()+"�� �����!. ���ݷ���"+
					 selected.getPower()+"����!!!");
			 //���ݷ� ����
			 increaseAttackPower(selected.getPower());
			 inventory.remove(selected);
		 }else {
			 System.out.println("�߸��� �����̿���...");
		 }
	 }
	 public void increaseAttackPower(int power) {
		 attackPowerModifier+=power;
	 }
	 @Override
	public int attack() {
		return super.attack()+attackPowerModifier;
	}
	 
}