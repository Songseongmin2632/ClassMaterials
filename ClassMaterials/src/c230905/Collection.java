package c230905;

import java.util.ArrayList;
import java.util.List;

public class Collection {

	public static void main(String[] args) {
				
		//�÷���
		//������ ������ Ÿ���� ���� �����ϴ� �ڷᱸ��
		//������ ���� ������ ũ�Ⱑ �������� ���Ѵ�.
		//�迭 -> ���� �ڷᱸ������ ��������� ũ�Ⱑ �����̴�.
		
		//1.List
		//�迭�̶� �����
		//�������̽��� ���ǵǾ��ִ�.	
		//ArrayList, Vector, LinkedList��� ���� Ŭ������ List�������̽��� �����Ѵ�.
		
		//1-1. ArrayList
		//List�������̽��� ������ Ŭ������ �ϳ�
		//�����迭�� �����Ǿ� ũ�⸦ �������� ��������
		//��ҿ� ������ ���ٰ���(�ε����� �ٷ� ����), �����͸� �߰��ϰų� ������ �� �ڵ����� ũ�⸦ �����Ѵ�.
		
		//List�� �������̽��ν� ����Ʈ ������ ����.
		
		//ArrayList�� Array ���� (�߿�!!)
		//�������� �߰��� ���Ű� ���� �Ͼ�������� �迭�� ���
		//���� ���� �Ͼ�ٸ� �÷��� ���
		//�������ҿ� ����ؾ��Ѵ�!!
		
		String[] arrStrings = new String[] {"��","��","��","��","��"};
		
		arrStrings[1] = null;
		arrStrings[2] = null;
		for(int i=0; i < arrStrings.length; i++) {
			System.out.println(arrStrings[i]);			
		}
		
		List<String> arrList = new ArrayList<>();
		
		System.out.println(arrList.size());
		
		arrList.add("��");
		arrList.add("��");
		arrList.add("��");
		arrList.add("��");
		arrList.add("��");
		arrList.add("��");
		arrList.add("��");
		arrList.add("��");				
		System.out.println("������ �߰��� : "+arrList.size());
		
		for(String string : arrList) {
			System.out.println(string);
		}
		arrList.remove("��"); //������Ʈ�� �����ؼ� ����
		arrList.remove(4); // �ε����� �����ؼ� ����
		
		System.out.println("=====================");
		
		for(String string : arrList) {
			System.out.println(string);
		}
		System.out.println("������ ������ : "+arrList.size());
		
		arrList.add("����");
		for(String string : arrList) {
			System.out.println(string);
		}
		
		int index = 2;
		
		String element = arrList.get(index); //get -> �����͸� �������� ����޼���
		System.out.println("�ε��� : "+index+"��� : "+element);
		
		String target = "����";
		boolean contains = arrList.contains(target); //contains -> ���� ���ϴ� �������� ���� ������ �˷��ִ� ����޼���
		
		if(contains) {
			System.out.println(target+"�� ã�Ҵ�");
		}
		else {
			System.out.println("����");
		}
		
		//add : ����߰� -> ��, ������ �ε���
		//remove : ���� -> �ε���, Object
		//clear : ��� ������ ����
		//get : ������ �ε����� �����͸� ����
		//indexOf : ù��° ��ġ ����
		//lastIndexOf : ������ ��ġ ����
		//contains : �������� ���� ����
		//size : ���� Ȯ��
		//isEmpty : ����մ°�?
		//trimToSize : �����͸� ũ�⿡ ���� ����ȭ
		//sort : ����
		//reverse : ����(�ڵ��׽�Ʈ �� �� ���ֻ��)
		
		List<String> myList = new ArrayList<>(); //List �������̽��� ������ �޼��常 ��밡��
		//�����ϰ� �Ϲ����� ���
		//ArrayList<String> myList1 = new ArrayList<>();
		
	}
}
