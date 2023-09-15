package c230907;

import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class FIFOFILO {
	// First In First Out => Queue 
	// First In Last Out => Stack �޼��带 ��𿡼� ȣ���޴°� �Ǵ�
	// ����Լ� => �ڱ� �����θ� ȣ���Ѵ�
	
	public static void main(String[] args) {
			
		Queue<Integer> q = new LinkedList<>(); // Array, LinkedList, ArrayList
		
		System.out.println(q.isEmpty());
		
		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.offer(4);
		q.offer(5);
		
		System.out.println(q.isEmpty());
		System.out.println(q.size());
		System.out.println(q.poll()); //����! ���� ù��°��
		System.out.println(q);
		
		Stack<Integer> s = new Stack<>(); // Array, LinkedList, ArrayList
		
		System.out.println(s.isEmpty());
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		
		System.out.println(s.isEmpty());
		System.out.println(s.size());
		System.out.println(s.pop()); //����! ���� ��������
		System.out.println(s);
	}	
}
