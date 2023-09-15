package c230906;

import java.util.LinkedList;
import java.util.List;

//ArrayList -> �ε����� ���� �����ϱ� ������ ��Ī�� ������!
//�����͸� �߰��� �����ϸ� �����Ͱ� �߹и��� ������
//�߰����Լӵ��� ������.
//
//LinkedList -> ���� ����Ʈ
//�ε������ ������ ���⶧����
//��Ī�� ArrayList�� ���� ��������
//�߰����Լӵ��� ������.
//single -> �ܹ���(���ʿ��� ����������)
//double -> �����
//circuler
//
//Node
//
//single
//������ ��忡�� data�� ���� �����͸� ����Ű�� pointer�� ���մ�.
//head ------tail
//
//double
//������ ��忡�� �����Ϳ� ���� �����͸� ����Ű�� pointer�� �հ�
//������ �����͸� ����Ű�� �Ǵٸ� pointer�� �մ�.
//�����̿� �����͸� �����ϰ�ʹٸ�
//����Ǿ��մ� �����͸� ����� ����ϳ��� ���� ������ ��
//���� ������ ��忡 �� �� ����� �����͸� �������ָ� �ȴ�.
//
//���
//�������� ��ȭ�� ���� �Ͼ���ʰ� ������ ��Ī�� �ϰ� �ʹٸ�
//ArrayList
//�������� ��ȭ�� ���� �Ͼ���� ��Ī�� ��������� ��������
//LinkedList

public class ListCollection {

	public static void main(String[] args) {
		
		//LinkedList
		//��峢���� �ּ� �����͸� ���θ� ����Ű�� ����.
		//�ϳ��� ��忡�� �����Ϳ� ���� ��带 ����Ű�� �����Ͱ� �ִ�.
		//�߰��� �����͸� insert,delete�ϱ⿡ �����ϴ�.
		//������ Ư�� ��ġ�� ������ �������� �Ϸ��� ���������� Ž���ؾ��ϴ� ������ �ִ�.
		//�ڹٴ� double LinkedList�� �Ǿ��ִ�.
		//�޸� double > single -> ������ �����Ͱ� �ϳ� �� ���� ������ ��������� �޸𸮸� ���� ���� �Դ´�.
		
		List<String> linkedList = new LinkedList<>();
		
		linkedList.add("���");
		linkedList.add("�ٳ���");
		linkedList.add("ü��");
		
		System.out.println("LinkedList ��ȸ�ϱ�");
		
		for(String fruit : linkedList) {
			System.out.println(fruit);
		}
		linkedList.add(1,"������"); //Ư����ġ�� �־��ֱ�
		linkedList.remove("�ٳ���"); //����
		
		String elem = linkedList.get(2);
		System.out.println(elem);
		
		System.out.println("������ : "+linkedList.size());
		
		boolean isApple = linkedList.contains("���");
		System.out.println(isApple);
		
		Object[] array = linkedList.toArray();
		
		for(Object object : array) {
			System.out.println(object.toString());
		}
		
		linkedList.clear(); //���� ����������
		System.out.println("����ճ���? : "+linkedList.isEmpty());
		
		
	}
}