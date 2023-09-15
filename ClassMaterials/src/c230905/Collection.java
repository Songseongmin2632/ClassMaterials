package c230905;

import java.util.ArrayList;
import java.util.List;

public class Collection {

	public static void main(String[] args) {
				
		//컬렉션
		//동일한 데이터 타입을 묶어 관리하는 자료구조
		//데이터 저장 공간의 크기가 동적으로 변한다.
		//배열 -> 같은 자료구조지만 저장공간의 크기가 정적이다.
		
		//1.List
		//배열이랑 비슷함
		//인터페이스로 정의되어있다.	
		//ArrayList, Vector, LinkedList등과 같은 클래스가 List인터페이스를 구현한다.
		
		//1-1. ArrayList
		//List인터페이스를 구현한 클래스중 하나
		//동적배열로 구현되어 크기를 동적으로 조절가능
		//요소에 빠르게 접근가능(인덱스로 바로 접근), 데이터를 추가하거나 제거할 때 자동으로 크기를 조절한다.
		
		//List는 인터페이스로써 리스트 동작을 정의.
		
		//ArrayList랑 Array 차이 (중요!!)
		//데이터의 추가나 제거가 자주 일어나지않을때 배열을 사용
		//위가 자주 일어난다면 컬렉션 사용
		//적재적소에 사용해야한다!!
		
		String[] arrStrings = new String[] {"가","나","다","라","마"};
		
		arrStrings[1] = null;
		arrStrings[2] = null;
		for(int i=0; i < arrStrings.length; i++) {
			System.out.println(arrStrings[i]);			
		}
		
		List<String> arrList = new ArrayList<>();
		
		System.out.println(arrList.size());
		
		arrList.add("가");
		arrList.add("나");
		arrList.add("다");
		arrList.add("라");
		arrList.add("마");
		arrList.add("바");
		arrList.add("사");
		arrList.add("아");				
		System.out.println("데이터 추가후 : "+arrList.size());
		
		for(String string : arrList) {
			System.out.println(string);
		}
		arrList.remove("아"); //오브젝트로 접근해서 삭제
		arrList.remove(4); // 인덱스로 접근해서 삭제
		
		System.out.println("=====================");
		
		for(String string : arrList) {
			System.out.println(string);
		}
		System.out.println("데이터 삭제후 : "+arrList.size());
		
		arrList.add("경일");
		for(String string : arrList) {
			System.out.println(string);
		}
		
		int index = 2;
		
		String element = arrList.get(index); //get -> 데이터를 가져오는 내장메서드
		System.out.println("인덱스 : "+index+"요소 : "+element);
		
		String target = "경일";
		boolean contains = arrList.contains(target); //contains -> 내가 원하는 데이터의 존재 유무를 알려주는 내장메서드
		
		if(contains) {
			System.out.println(target+"을 찾았다");
		}
		else {
			System.out.println("없음");
		}
		
		//add : 요소추가 -> 뒤, 지정된 인덱스
		//remove : 삭제 -> 인덱스, Object
		//clear : 모든 데이터 삭제
		//get : 지정한 인덱스의 데이터를 리턴
		//indexOf : 첫번째 위치 리턴
		//lastIndexOf : 마지막 위치 리턴
		//contains : 데이터의 존재 유무
		//size : 길이 확인
		//isEmpty : 비어잇는가?
		//trimToSize : 데이터를 크기에 따라 최적화
		//sort : 정렬
		//reverse : 반전(코딩테스트 볼 때 자주사용)
		
		List<String> myList = new ArrayList<>(); //List 인터페이스가 정의한 메서드만 사용가능
		//유연하고 일반적인 방법
		//ArrayList<String> myList1 = new ArrayList<>();
		
	}
}
