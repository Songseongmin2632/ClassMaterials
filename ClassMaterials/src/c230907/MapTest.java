package c230907;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>(); //set���� �������� �ߺ�üũ�ϴ� ������ �ٸ���
		
		map.put("�ǿ���", 7);
		map.put("�賲��", 8);
		map.put("������", 23);
		map.put("�赿��", 3);
		map.put("������", 7);
		System.out.println(map.size()); //���� key�� �������� üũ�Ѵ�
		System.out.println(map);
		
		
		
		System.out.println(map.get("������")); //key�� ���� ���� �����´�.
		map.put("������", 13);
		System.out.println(map.size());
		System.out.println(map.get("������"));
		
		Set<String> keySet = map.keySet(); //������ �������� �ʱ� ������ �������� Ƣ��´�
		System.out.println(keySet);
		
		Iterator<String> iterator = keySet.iterator();//�ּ�
		System.out.println(iterator.next());//�ִ� ������ �����̴�
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
	}
}
