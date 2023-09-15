package c230907;

import java.util.TreeSet;
import java.util.NavigableSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(6);
		treeSet.add(12);
		treeSet.add(7);
		treeSet.add(8);
		System.out.println(treeSet.size());
		System.out.println(treeSet);
		
		for(Integer i : treeSet) {
			System.out.println(i); //���ĵǾ��ִ�!! ������� ���
		}
		
		System.out.println("ó���� " + treeSet.first());
		System.out.println("�������� " + treeSet.last());
		
		System.out.println("7 �̸��� " + treeSet.lower(7)); //7���� ���� ���ڸ� �� �ϳ��� �����´�.(�ٷ� ���� ����)
		System.out.println("7 �ʰ��� " + treeSet.higher(7));
		
		System.out.println("7 ���ϴ� " + treeSet.floor(7));
		System.out.println("7 �̻��� " + treeSet.ceiling(7));
		
		NavigableSet<Integer> descendingTreeSet = treeSet.descendingSet(); //��������!
		for(Integer i : descendingTreeSet) {
			System.out.println(i);			
		}
		
		NavigableSet<Integer> rangeTreeSet = treeSet.tailSet(7, true);
	    for(Integer i : rangeTreeSet) {
			System.out.println(i);			
	    }
	    
	    NavigableSet<Integer> rangeTreeSet2 = treeSet.headSet(7, true);
	    for(Integer i : rangeTreeSet2) {
			System.out.println(i);			
	    }
	    
	    NavigableSet<Integer> rangeTreeSet3 = treeSet.subSet(7, false, 12, true);
	    for(Integer i : rangeTreeSet3) {
			System.out.println(i);			
	    }
	    
	}
}
