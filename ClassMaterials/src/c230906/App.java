package c230906;

public class App {

	public static void main(String[] args) {
		
		Player player= new Player("�α�",100,20);
		Monster monster= new Monster("����", 80,15);
		
		boolean isGame = true;
		
		System.out.println("�ο���");
		System.out.println(player.getName()+"(ü��: "+player.getHealth()+")"
		+monster.getName()+"(ü�� : "+monster.getHealth()+")");
		
		while (isGame) 
		{
			STATE playerSelect =player.selectAction();
			
			switch (playerSelect) {
			case ATTACK:
				
				//�÷��̾�
				System.out.println(player.getName()+"��"+monster.getName()+"����"
			    +player.attack()+"��ŭ�� �������� ����");
				monster.takeDamage(player.attack());
				
				//������ �ʾ�����
				if(!monster.isAlive()) {
					 System.out.println(monster.getName()+"óġ!!");
					 isGame=false;
				}
				else {
					System.out.println(monster.getName()+"(ü�� : "+monster.getHealth()+")");
				}
				//����
				System.out.println(monster.getName()+"��"+player.getName()+"����"
					    +monster.attack()+"��ŭ�� �������� ����");
				player.takeDamage(monster.attack());
				if(!player.isAlive()) {
					 System.out.println(player.getName()+"óġ!!");
					 isGame=false;
				}
				else {
					System.out.println(player.getName()+"(ü�� : "+player.getHealth()+")");
				}
				break;
			case USE_ITEM:
				player.useItem();break;
			case RUN:
				System.out.println(player.getName()+"ƢƢƢ~~~");
				isGame=false;
			default:
				System.out.println("�߸��� �����̿���./.....");
				break;
			}
		}
		System.out.println("���� ����");
	}
}
