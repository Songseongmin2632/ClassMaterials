package c230905;

//ArrayList를 이용해서 stack구현
//stack의 구조
//First in Last out -> 가장 먼저 들어간것이 가장 나중에 나온다!
//FILO
//Queue -> 가장 먼저 들어간것이 가장 먼저 나온다!
//예외처리 -> if(스택이 비어있다면 빼기 x)
//배열로 만들게된다면
//예외처리추가 -> if(현재 빼려고 하는 위치가 어디인지 비교할 것)
//stack에 뭐가 들어올지 모르기 때문에 Generic을 사용해야 한다.
//add 추가한다.
//remove 뺀다.
//
//stack<타입> 매개변수 = new stack <> (); 
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
	
