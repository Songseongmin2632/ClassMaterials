package c230905;

//ArrayList�� �̿��ؼ� stack����
//stack�� ����
//First in Last out -> ���� ���� ������ ���� ���߿� ���´�!
//FILO
//Queue -> ���� ���� ������ ���� ���� ���´�!
//����ó�� -> if(������ ����ִٸ� ���� x)
//�迭�� ����Եȴٸ�
//����ó���߰� -> if(���� ������ �ϴ� ��ġ�� ������� ���� ��)
//stack�� ���� ������ �𸣱� ������ Generic�� ����ؾ� �Ѵ�.
//add �߰��Ѵ�.
//remove ����.
//
//stack<Ÿ��> �Ű����� = new stack <> (); 
//
//public boolean isEmpty

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stack1<T> {
	
	private T t;
	
	public T Get() {
		return t;
	}
	
	public void Set(T t) {
		this.t = t;
	}
}

class Stack2 {
	private List<Stack1> arrList;
	private boolean empty;
	
	public Stack2() {
		arrList = new ArrayList<>();
	}
	
	public void addStack(Stack1 stack) {
		arrList.add(stack);
	}
	
	public void filo() {
		Collections.reverse(arrList);
	}
	
	public boolean isEmpty() {
		
		return empty;
	}
	
	public void empty() {
		if(arrList.size()==0) {
			empty = true;
		}
		else {
			empty = false;
		}
	}

public class Stack {
	
	public static void main(String[] args) {
		
		Stack1 stack1 = new Stack1();
		Stack2 stack2 = new Stack2();
				
		stack2.addStack(stack1);
		
		stack2.filo();
		System.out.println(stack2.arrList);
		
		
	}
}
}
	
