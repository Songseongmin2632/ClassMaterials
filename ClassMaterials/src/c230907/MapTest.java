package c230907;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>(); //set과의 차이점은 중복체크하는 기준이 다르다
		
		map.put("권원준", 7);
		map.put("김남균", 8);
		map.put("임현규", 23);
		map.put("김동선", 3);
		map.put("정경훈", 7);
		System.out.println(map.size()); //앞의 key를 기준으로 체크한다
		System.out.println(map);
		
		
		
		System.out.println(map.get("정경훈")); //key에 속한 값을 가져온다.
		map.put("정경훈", 13);
		System.out.println(map.size());
		System.out.println(map.get("정경훈"));
		
		Set<String> keySet = map.keySet(); //순서가 존재하지 않기 때문에 랜덤으로 튀어나온다
		System.out.println(keySet);
		
		Iterator<String> iterator = keySet.iterator();//주소
		System.out.println(iterator.next());//넣는 순서가 랜덤이다
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
	}
}
