package c230907;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class SetTest {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>(); //�ߺ�üũ!! �ߺ��� ������ ���� ������ �ϳ��� ����Ѵ�.
		set.add(1);
		System.out.println(set.size());
		set.add(1);
		set.add(1);
		set.add(3);
		set.add(1);
		set.add(1);
		set.add(2);
		set.add(2);
		System.out.println(set.size());
		
		Iterator<Integer> iterator = set.iterator(); //iterator(�ּ�,������)
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.hasNext());
		set.clear();
		System.out.println(set.size());
								
	}
}
