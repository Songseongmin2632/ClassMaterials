package c230906;

import java.util.LinkedList;
import java.util.List;

//ArrayList -> 인덱스에 직접 접근하기 때문에 서칭이 빠르다!
//데이터를 중간에 삽입하면 데이터가 쭉밀리기 때문에
//중간삽입속도가 느리다.
//
//LinkedList -> 연결 리스트
//인덱스라는 개념이 없기때문에
//서칭이 ArrayList에 비해 느리지만
//중간삽입속도가 빠르다.
//single -> 단방향(왼쪽에서 오른쪽으로)
//double -> 양방향
//circuler
//
//Node
//
//single
//각각의 노드에는 data와 다음 데이터를 가리키는 pointer가 들어가잇다.
//head ------tail
//
//double
//각각의 노드에는 데이터와 다음 데이터를 가리키는 pointer가 잇고
//역순의 데이터를 가리키는 또다른 pointer가 잇다.
//노드사이에 데이터를 삽입하고싶다면
//연결되어잇는 포인터를 지우고 노드하나를 새로 생성한 후
//새로 생성한 노드에 앞 뒤 노드의 포인터를 연결해주면 된다.
//
//결론
//데이터의 변화가 자주 일어나지않고 빠르게 서칭을 하고 싶다면
//ArrayList
//데이터의 변화가 자주 일어나지만 서칭은 상대적으로 느린것은
//LinkedList

public class ListCollection {

	public static void main(String[] args) {
		
		//LinkedList
		//노드끼리의 주소 포인터를 서로를 가리키고 있음.
		//하나의 노드에는 데이터와 다음 노드를 가리키는 포인터가 있다.
		//중간에 데이터를 insert,delete하기에 유용하다.
		//하지만 특정 위치에 빠르게 엑세스를 하려면 순차적으로 탐색해야하는 단점이 있다.
		//자바는 double LinkedList로 되어있다.
		//메모리 double > single -> 더블은 포인터가 하나 더 들어가기 때문에 상대적으로 메모리를 좀더 많이 먹는다.
		
		List<String> linkedList = new LinkedList<>();
		
		linkedList.add("사과");
		linkedList.add("바나나");
		linkedList.add("체리");
		
		System.out.println("LinkedList 순회하기");
		
		for(String fruit : linkedList) {
			System.out.println(fruit);
		}
		linkedList.add(1,"오렌지"); //특정위치에 넣어주기
		linkedList.remove("바나나"); //삭제
		
		String elem = linkedList.get(2);
		System.out.println(elem);
		
		System.out.println("사이즈 : "+linkedList.size());
		
		boolean isApple = linkedList.contains("사과");
		System.out.println(isApple);
		
		Object[] array = linkedList.toArray();
		
		for(Object object : array) {
			System.out.println(object.toString());
		}
		
		linkedList.clear(); //전부 날려버리기
		System.out.println("비어잇나요? : "+linkedList.isEmpty());
		
		
	}
}